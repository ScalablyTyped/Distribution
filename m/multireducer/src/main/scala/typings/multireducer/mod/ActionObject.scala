package typings.multireducer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject
  extends /* rest */ StringDictionary[js.Any] {
  var meta: MetaObject
}

object ActionObject {
  @scala.inline
  def apply(meta: MetaObject, StringDictionary: /* name */ StringDictionary[js.Any] = null): ActionObject = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ActionObject]
  }
}

