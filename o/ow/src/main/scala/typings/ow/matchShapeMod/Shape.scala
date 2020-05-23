package typings.ow.matchShapeMod

import org.scalablytyped.runtime.StringDictionary
import typings.ow.basePredicateMod.BasePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends /* key */ StringDictionary[BasePredicate[_] | Shape]

object Shape {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[BasePredicate[_] | Shape] = null): Shape = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Shape]
  }
}

