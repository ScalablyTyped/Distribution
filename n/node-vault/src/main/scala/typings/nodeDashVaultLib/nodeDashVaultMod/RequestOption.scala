package typings
package nodeDashVaultLib.nodeDashVaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOption extends Option {
  var method: java.lang.String
  var path: java.lang.String
}

object RequestOption {
  @scala.inline
  def apply(
    method: java.lang.String,
    path: java.lang.String,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RequestOption = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequestOption]
  }
}

