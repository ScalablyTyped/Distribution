package typings
package atNivoPieLib.atNivoPieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieDatum
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] {
  var id: java.lang.String | scala.Double
  var value: scala.Double
}

object PieDatum {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    value: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = null
  ): PieDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PieDatum]
  }
}

