package typings.minio.minioMod

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
    val __obj = js.Dynamic.literal(formData = formData, postURL = postURL)
  
    __obj.asInstanceOf[PostPolicyResult]
  }
}

