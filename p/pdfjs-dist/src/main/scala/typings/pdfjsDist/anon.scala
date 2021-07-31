package typings.pdfjsDist

import typings.pdfjsDist.mod.CMapCompressionType
import typings.pdfjsDist.mod.PDFInfo
import typings.pdfjsDist.mod.PDFMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseUrl extends StObject {
    
    var baseUrl: String
    
    var isCompressed: Boolean
  }
  object BaseUrl {
    
    @scala.inline
    def apply(baseUrl: String, isCompressed: Boolean): BaseUrl = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
    }
  }
  
  trait CMapData extends StObject {
    
    var cMapData: js.Any
    
    var compressionType: CMapCompressionType
  }
  object CMapData {
    
    @scala.inline
    def apply(cMapData: js.Any, compressionType: CMapCompressionType): CMapData = {
      val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMapData]
    }
    
    @scala.inline
    implicit class CMapDataMutableBuilder[Self <: CMapData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCMapData(value: js.Any): Self = StObject.set(x, "cMapData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionType(value: CMapCompressionType): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Info extends StObject {
    
    var info: PDFInfo
    
    var metadata: PDFMetadata
  }
  object Info {
    
    @scala.inline
    def apply(info: PDFInfo, metadata: PDFMetadata): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: PDFInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: PDFMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
