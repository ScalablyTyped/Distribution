package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ScriptRegistry.
  * Note: PlayCanvas scripts can access the Script Registry from inside the application with {@link pc.Application#scripts} {@link pc.ADDRESS_REPEAT}.
  * @param app - Application to attach registry to.
  */
@JSImport("playcanvas", "ScriptRegistry")
@js.native
class ScriptRegistry protected ()
  extends typings.playcanvas.pc.ScriptRegistry {
  def this(app: typings.playcanvas.pc.Application) = this()
}
