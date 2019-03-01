package typings
package onoLib.onoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPOJO
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorPOJO {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    message: java.lang.String = null,
    name: java.lang.String = null,
    stack: java.lang.String = null
  ): ErrorPOJO = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ErrorPOJO]
  }
}

