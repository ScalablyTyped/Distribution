package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictindex extends /* index */ StringDictionary[Double] {
  var _id_ : Double
}

object Dictindex {
  @scala.inline
  def apply(_id_ : Double, StringDictionary: /* index */ StringDictionary[Double] = null): Dictindex = {
    val __obj = js.Dynamic.literal(_id_ = _id_.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictindex]
  }
}

