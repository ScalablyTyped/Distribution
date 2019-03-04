package typings
package palxLib.palxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PalxPalette
  extends /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] {
  var base: java.lang.String
  var black: java.lang.String
  var blue: js.Array[java.lang.String]
  var cyan: js.Array[java.lang.String]
  var fuschia: js.Array[java.lang.String]
  var gray: js.Array[java.lang.String]
  var green: js.Array[java.lang.String]
  var indigo: js.Array[java.lang.String]
  var lime: js.Array[java.lang.String]
  var orange: js.Array[java.lang.String]
  var pink: js.Array[java.lang.String]
  var red: js.Array[java.lang.String]
  var teal: js.Array[java.lang.String]
  var violet: js.Array[java.lang.String]
  var yellow: js.Array[java.lang.String]
}

object PalxPalette {
  @scala.inline
  def apply(
    base: java.lang.String,
    black: java.lang.String,
    blue: js.Array[java.lang.String],
    cyan: js.Array[java.lang.String],
    fuschia: js.Array[java.lang.String],
    gray: js.Array[java.lang.String],
    green: js.Array[java.lang.String],
    indigo: js.Array[java.lang.String],
    lime: js.Array[java.lang.String],
    orange: js.Array[java.lang.String],
    pink: js.Array[java.lang.String],
    red: js.Array[java.lang.String],
    teal: js.Array[java.lang.String],
    violet: js.Array[java.lang.String],
    yellow: js.Array[java.lang.String],
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null
  ): PalxPalette = {
    val __obj = js.Dynamic.literal(base = base, black = black, blue = blue, cyan = cyan, fuschia = fuschia, gray = gray, green = green, indigo = indigo, lime = lime, orange = orange, pink = pink, red = red, teal = teal, violet = violet, yellow = yellow)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PalxPalette]
  }
}

