package typings.minio.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostPolicyResult extends js.Object {
  var formData: StringDictionary[js.Any]
  var postURL: String
}

object PostPolicyResult {
  @scala.inline
  def apply(formData: StringDictionary[js.Any], postURL: String): PostPolicyResult = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], postURL = postURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPolicyResult]
  }
}

