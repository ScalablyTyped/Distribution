package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Picker object used to select mesh instances from screen coordinates.
  *
  * @property {number} width Width of the pick buffer in pixels (read-only).
  * @property {number} height Height of the pick buffer in pixels (read-only).
  * @property {RenderTarget} renderTarget The render target used by the picker internally
  * (read-only).
  */
@JSGlobal("pc.Picker")
@js.native
open class Picker protected ()
  extends typings.playcanvas.mod.Picker {
  /**
    * Create a new Picker instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this picker
    * instance.
    * @param {number} width - The width of the pick buffer in pixels.
    * @param {number} height - The height of the pick buffer in pixels.
    */
  def this(app: typings.playcanvas.mod.AppBase, width: Double, height: Double) = this()
}
