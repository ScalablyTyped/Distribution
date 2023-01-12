package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: String
  
  var formdata: String
  
  var raw: String
  
  var urlencoded: String
}
object File {
  
  inline def apply(file: String, formdata: String, raw: String, urlencoded: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], urlencoded = urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFormdata(value: String): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setUrlencoded(value: String): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
  }
}
