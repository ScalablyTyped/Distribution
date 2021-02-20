package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var file: String = js.native
  
  var formdata: String = js.native
  
  var raw: String = js.native
  
  var urlencoded: String = js.native
}
object File {
  
  @scala.inline
  def apply(file: String, formdata: String, raw: String, urlencoded: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], urlencoded = urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormdata(value: String): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlencoded(value: String): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
  }
}
