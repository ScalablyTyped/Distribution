package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostPolicyResult extends js.Object {
  var formData: org.scalablytyped.runtime.StringDictionary[js.Any]
  var postURL: java.lang.String
}

object PostPolicyResult {
  @scala.inline
  def apply(formData: org.scalablytyped.runtime.StringDictionary[js.Any], postURL: java.lang.String): PostPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formData")(formData)
    __obj.updateDynamic("postURL")(postURL)
    __obj.asInstanceOf[PostPolicyResult]
  }
}

