package typings.multireducer.multireducerMod

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
  def apply(meta: MetaObject, StringDictionary: /* rest */ StringDictionary[js.Any] = null): ActionObject = {
    val __obj = js.Dynamic.literal(meta = meta)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ActionObject]
  }
}

