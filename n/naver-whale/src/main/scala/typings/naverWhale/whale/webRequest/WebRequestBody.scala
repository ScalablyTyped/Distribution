package typings.naverWhale.whale.webRequest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestBody extends js.Object {
  
  /** Optional. Errors when obtaining request body data. */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * If the request method is POST and the body is a sequence of key-value pairs encoded in UTF8, encoded as either multipart/form-data, or application/x-www-form-urlencoded, this dictionary is present and for each key contains the list of all values for that key. If the data is of another media type, or if it is malformed, the dictionary is not present. An example value of this dictionary is {'key': ['value1', 'value2']}.
    */
  var formData: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  /**
    * Optional.
    * If the request method is PUT or POST, and the body is not already parsed in formData, then the unparsed request body elements are contained in this array.
    */
  var raw: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.UploadData]] = js.native
}
object WebRequestBody {
  
  @scala.inline
  def apply(): WebRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebRequestBody]
  }
  
  @scala.inline
  implicit class WebRequestBodyOps[Self <: WebRequestBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFormData(value: StringDictionary[js.Array[String]]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setRawVarargs(value: typings.chrome.chrome.webRequest.UploadData*): Self = this.set("raw", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Array[typings.chrome.chrome.webRequest.UploadData]): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
