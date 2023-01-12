package typings.parseMultipart

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-multipart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DemoData(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DemoData")().asInstanceOf[Buffer]
  
  inline def Parse(multipartBodyBuffer: Buffer, boundary: String): js.Array[ParsedFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(multipartBodyBuffer.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedFile]]
  
  inline def getBoundary(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(header.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ParsedFile extends StObject {
    
    var data: Buffer
    
    var filename: String
    
    var `type`: String
  }
  object ParsedFile {
    
    inline def apply(data: Buffer, filename: String, `type`: String): ParsedFile = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedFile] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
