package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Resource handler used for loading {@link Scene} resources.
  *
  * @implements {ResourceHandler}
  */
@JSGlobal("pc.SceneHandler")
@js.native
open class SceneHandler protected ()
  extends typings.playcanvas.mod.SceneHandler {
  /**
    * Create a new SceneHandler instance.
    *
    * @param {import('../app-base.js').AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
