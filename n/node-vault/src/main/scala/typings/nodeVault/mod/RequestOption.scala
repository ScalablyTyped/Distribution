package typings.nodeVault.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOption extends Option {
  var method: String
  var path: String
}

object RequestOption {
  @scala.inline
  def apply(method: String, path: String, StringDictionary: StringDictionary[js.Any] = null): RequestOption = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequestOption]
  }
}

