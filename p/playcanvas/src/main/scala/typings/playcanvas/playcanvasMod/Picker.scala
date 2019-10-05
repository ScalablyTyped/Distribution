package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Picker
  * @classdesc Picker object used to select mesh instances from screen coordinates.
  * @description Create a new instance of a Picker object
  * @param {pc.Application} app The application managing this picker instance.
  * @param {Number} width The width of the pick buffer in pixels.
  * @param {Number} height The height of the pick buffer in pixels.
  * @property {Number} width Width of the pick buffer in pixels (read-only).
  * @property {Number} height Height of the pick buffer in pixels (read-only).
  * @property {pc.RenderTarget} renderTarget The render target used by the picker internally (read-only).
  */
@JSImport("playcanvas", "Picker")
@js.native
class Picker protected ()
  extends typings.playcanvas.pc.Picker {
  def this(app: typings.playcanvas.pc.Application, width: Double, height: Double) = this()
}

