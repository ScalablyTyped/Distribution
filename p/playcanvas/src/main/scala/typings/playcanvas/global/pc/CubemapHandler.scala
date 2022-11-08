package typings.playcanvas.global.pc

import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/** @typedef {import('../../framework/app-base.js').AppBase} AppBase */
/**
  * Resource handler used for loading cubemap {@link Texture} resources.
  *
  * @implements {ResourceHandler}
  */
@JSGlobal("pc.CubemapHandler")
@js.native
open class CubemapHandler protected ()
  extends typings.playcanvas.mod.CubemapHandler {
  /**
    * Create a new CubemapHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
}
