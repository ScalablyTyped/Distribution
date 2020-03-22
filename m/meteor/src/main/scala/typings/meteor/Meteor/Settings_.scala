package typings.meteor.Meteor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global props **/
/** Settings **/
trait Settings_
  extends /* id */ StringDictionary[js.Any] {
  var public: StringDictionary[js.Any]
}

object Settings_ {
  @scala.inline
  def apply(public: StringDictionary[js.Any], StringDictionary: /* id */ StringDictionary[js.Any] = null): Settings_ = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Settings_]
  }
}

