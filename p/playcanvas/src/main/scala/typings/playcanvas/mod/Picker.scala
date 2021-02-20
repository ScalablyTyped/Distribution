package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new instance of a Picker object.
  * @property width - Width of the pick buffer in pixels (read-only).
  * @property height - Height of the pick buffer in pixels (read-only).
  * @property renderTarget - The render target used by the picker internally (read-only).
  * @param app - The application managing this picker instance.
  * @param width - The width of the pick buffer in pixels.
  * @param height - The height of the pick buffer in pixels.
  */
@JSImport("playcanvas", "Picker")
@js.native
class Picker protected ()
  extends typings.playcanvas.pc.Picker {
  def this(app: typings.playcanvas.pc.Application, width: Double, height: Double) = this()
}
