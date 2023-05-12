package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link Sound} resources.
  *
  * @implements {ResourceHandler}
  */
@JSGlobal("pc.AudioHandler")
@js.native
open class AudioHandler protected ()
  extends typings.playcanvas.mod.AudioHandler {
  /**
    * Create a new AudioHandler instance.
    *
    * @param {import('../app-base.js').AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
