package typings.meteor.MeteorNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global props **/
/** Settings **/
trait Settings
  extends /* id */ StringDictionary[js.Any] {
  var public: StringDictionary[js.Any]
}

object Settings {
  @scala.inline
  def apply(public: StringDictionary[js.Any], StringDictionary: /* id */ StringDictionary[js.Any] = null): Settings = {
    val __obj = js.Dynamic.literal(public = public)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Settings]
  }
}

