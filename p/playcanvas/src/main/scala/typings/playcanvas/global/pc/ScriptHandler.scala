package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Resource handler for loading JavaScript files dynamically.  Two types of JavaScript files can be
  * loaded, PlayCanvas scripts which contain calls to {@link createScript}, or regular JavaScript
  * files, such as third-party libraries.
  *
  * @implements {ResourceHandler}
  */
@JSGlobal("pc.ScriptHandler")
@js.native
open class ScriptHandler protected ()
  extends typings.playcanvas.mod.ScriptHandler {
  /**
    * Create a new ScriptHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
