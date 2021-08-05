package typings.pageIcon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageIcon {
  
  trait FetchOptions extends StObject {
    
    var ext: js.UndefOr[String] = js.undefined
  }
  object FetchOptions {
    
    inline def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    extension [Self <: FetchOptions](x: Self) {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    }
  }
  
  trait Icon extends StObject {
    
    var data: Buffer
    
    var ext: String
    
    var mime: String
    
    var name: String
    
    var size: Double
    
    var source: String
  }
  object Icon {
    
    inline def apply(data: Buffer, ext: String, mime: String, name: String, size: Double, source: String): Icon = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
