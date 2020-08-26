package typings.palx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PalxPalette
  extends /* name */ StringDictionary[String | js.Array[String]] {
  var base: String = js.native
  var black: String = js.native
  var blue: js.Array[String] = js.native
  var cyan: js.Array[String] = js.native
  var fuschia: js.Array[String] = js.native
  var gray: js.Array[String] = js.native
  var green: js.Array[String] = js.native
  var indigo: js.Array[String] = js.native
  var lime: js.Array[String] = js.native
  var orange: js.Array[String] = js.native
  var pink: js.Array[String] = js.native
  var red: js.Array[String] = js.native
  var teal: js.Array[String] = js.native
  var violet: js.Array[String] = js.native
  var yellow: js.Array[String] = js.native
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
    yellow: js.Array[String]
  ): PalxPalette = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], fuschia = fuschia.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], violet = violet.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PalxPalette]
  }
  @scala.inline
  implicit class PalxPaletteOps[Self <: PalxPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlack(value: String): Self = this.set("black", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlueVarargs(value: String*): Self = this.set("blue", js.Array(value :_*))
    @scala.inline
    def setBlue(value: js.Array[String]): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCyanVarargs(value: String*): Self = this.set("cyan", js.Array(value :_*))
    @scala.inline
    def setCyan(value: js.Array[String]): Self = this.set("cyan", value.asInstanceOf[js.Any])
    @scala.inline
    def setFuschiaVarargs(value: String*): Self = this.set("fuschia", js.Array(value :_*))
    @scala.inline
    def setFuschia(value: js.Array[String]): Self = this.set("fuschia", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrayVarargs(value: String*): Self = this.set("gray", js.Array(value :_*))
    @scala.inline
    def setGray(value: js.Array[String]): Self = this.set("gray", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreenVarargs(value: String*): Self = this.set("green", js.Array(value :_*))
    @scala.inline
    def setGreen(value: js.Array[String]): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndigoVarargs(value: String*): Self = this.set("indigo", js.Array(value :_*))
    @scala.inline
    def setIndigo(value: js.Array[String]): Self = this.set("indigo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimeVarargs(value: String*): Self = this.set("lime", js.Array(value :_*))
    @scala.inline
    def setLime(value: js.Array[String]): Self = this.set("lime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrangeVarargs(value: String*): Self = this.set("orange", js.Array(value :_*))
    @scala.inline
    def setOrange(value: js.Array[String]): Self = this.set("orange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinkVarargs(value: String*): Self = this.set("pink", js.Array(value :_*))
    @scala.inline
    def setPink(value: js.Array[String]): Self = this.set("pink", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedVarargs(value: String*): Self = this.set("red", js.Array(value :_*))
    @scala.inline
    def setRed(value: js.Array[String]): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def setTealVarargs(value: String*): Self = this.set("teal", js.Array(value :_*))
    @scala.inline
    def setTeal(value: js.Array[String]): Self = this.set("teal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVioletVarargs(value: String*): Self = this.set("violet", js.Array(value :_*))
    @scala.inline
    def setViolet(value: js.Array[String]): Self = this.set("violet", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowVarargs(value: String*): Self = this.set("yellow", js.Array(value :_*))
    @scala.inline
    def setYellow(value: js.Array[String]): Self = this.set("yellow", value.asInstanceOf[js.Any])
  }
  
}

