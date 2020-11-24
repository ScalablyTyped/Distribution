package typings.minio.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostPolicyResult extends js.Object {
  
  var formData: StringDictionary[js.Any] = js.native
  
  var postURL: String = js.native
}
object PostPolicyResult {
  
  @scala.inline
  def apply(formData: StringDictionary[js.Any], postURL: String): PostPolicyResult = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], postURL = postURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPolicyResult]
  }
  
  @scala.inline
  implicit class PostPolicyResultOps[Self <: PostPolicyResult] (val x: Self) extends AnyVal {
    
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
    def setFormData(value: StringDictionary[js.Any]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostURL(value: String): Self = this.set("postURL", value.asInstanceOf[js.Any])
  }
}
