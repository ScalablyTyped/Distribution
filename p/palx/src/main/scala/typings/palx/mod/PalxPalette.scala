package typings.palx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PalxPalette
  extends /* name */ StringDictionary[String | js.Array[String]] {
  var base: String
  var black: String
  var blue: js.Array[String]
  var cyan: js.Array[String]
  var fuschia: js.Array[String]
  var gray: js.Array[String]
  var green: js.Array[String]
  var indigo: js.Array[String]
  var lime: js.Array[String]
  var orange: js.Array[String]
  var pink: js.Array[String]
  var red: js.Array[String]
  var teal: js.Array[String]
  var violet: js.Array[String]
  var yellow: js.Array[String]
}

object PalxPalette {
  @scala.inline
  def apply(
    base: String,
    black: String,
    blue: js.Array[String],
    cyan: js.Array[String],
    fuschia: js.Array[String],
    gray: js.Array[String],
    green: js.Array[String],
    indigo: js.Array[String],
    lime: js.Array[String],
    orange: js.Array[String],
    pink: js.Array[String],
    red: js.Array[String],
    teal: js.Array[String],
    violet: js.Array[String],
    yellow: js.Array[String],
    StringDictionary: /* p */ StringDictionary[String | js.Array[String]] = null
  ): PalxPalette = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], fuschia = fuschia.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], violet = violet.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PalxPalette]
  }
}

