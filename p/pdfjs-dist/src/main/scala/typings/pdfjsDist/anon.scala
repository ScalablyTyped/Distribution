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
    
    inline def apply(baseUrl: String, isCompressed: Boolean): BaseUrl = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrl]
    }
    
    extension [Self <: BaseUrl](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
    }
  }
  
  trait CMapData extends StObject {
    
    var cMapData: js.Any
    
    var compressionType: CMapCompressionType
  }
  object CMapData {
    
    inline def apply(cMapData: js.Any, compressionType: CMapCompressionType): CMapData = {
      val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMapData]
    }
    
    extension [Self <: CMapData](x: Self) {
      
      inline def setCMapData(value: js.Any): Self = StObject.set(x, "cMapData", value.asInstanceOf[js.Any])
      
      inline def setCompressionType(value: CMapCompressionType): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Info extends StObject {
    
    var info: PDFInfo
    
    var metadata: PDFMetadata
  }
  object Info {
    
    inline def apply(info: PDFInfo, metadata: PDFMetadata): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setInfo(value: PDFInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: PDFMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
