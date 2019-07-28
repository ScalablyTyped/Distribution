package typings.mongodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends /* index */ StringDictionary[Double] {
  var _id_ : Double
}

object Anon_Id {
  @scala.inline
  def apply(_id_ : Double, StringDictionary: /* index */ StringDictionary[Double] = null): Anon_Id = {
    val __obj = js.Dynamic.literal(_id_ = _id_)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Id]
  }
}

