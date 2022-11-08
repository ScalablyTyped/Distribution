package typings.playcanvas.global.pc

import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Loads Bundle Assets.
  *
  * @implements {ResourceHandler}
  * @ignore
  */
@JSGlobal("pc.BundleHandler")
@js.native
open class BundleHandler protected ()
  extends typings.playcanvas.mod.BundleHandler {
  /**
    * Create a new BundleHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
}
