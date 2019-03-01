package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Antialias extends js.Object {
  var antialias: scala.Boolean
  var autoResize: scala.Boolean
  var backgroundColor: scala.Double
  var clearBeforeRender: scala.Boolean
  var forceFXAA: scala.Boolean
  var height: scala.Double
  var legacy: scala.Boolean
  var preserveDrawingBuffer: scala.Boolean
  var roundPixels: scala.Boolean
  var transparent: scala.Boolean
  var view: stdLib.HTMLCanvasElement | scala.Null
  var width: scala.Double
}

object Anon_Antialias {
  @scala.inline
  def apply(
    antialias: scala.Boolean,
    autoResize: scala.Boolean,
    backgroundColor: scala.Double,
    clearBeforeRender: scala.Boolean,
    forceFXAA: scala.Boolean,
    height: scala.Double,
    legacy: scala.Boolean,
    preserveDrawingBuffer: scala.Boolean,
    roundPixels: scala.Boolean,
    transparent: scala.Boolean,
    width: scala.Double,
    view: stdLib.HTMLCanvasElement = null
  ): Anon_Antialias = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("antialias")(antialias)
    __obj.updateDynamic("autoResize")(autoResize)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("clearBeforeRender")(clearBeforeRender)
    __obj.updateDynamic("forceFXAA")(forceFXAA)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("legacy")(legacy)
    __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    __obj.updateDynamic("roundPixels")(roundPixels)
    __obj.updateDynamic("transparent")(transparent)
    __obj.updateDynamic("width")(width)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_Antialias]
  }
}

