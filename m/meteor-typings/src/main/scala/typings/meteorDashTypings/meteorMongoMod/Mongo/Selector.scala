package typings.meteorDashTypings.meteorMongoMod.Mongo

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selector
  extends Object
     with /* key */ StringDictionary[js.Any]

object Selector {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Selector = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Selector]
  }
}

