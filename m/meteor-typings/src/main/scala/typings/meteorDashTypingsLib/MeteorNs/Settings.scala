package typings
package meteorDashTypingsLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global props **/
/** Settings **/
trait Settings
  extends /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var public: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Settings {
  @scala.inline
  def apply(
    public: org.scalablytyped.runtime.StringDictionary[js.Any],
    StringDictionary: /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Settings = {
    val __obj = js.Dynamic.literal(public = public)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Settings]
  }
}

