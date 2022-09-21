package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Callback used by {@link ModelHandler#addParser} to decide on which parser to use.
  *
  * @callback AddParserCallback
  * @param {string} url - The resource url.
  * @param {object} data - The raw model data.
  * @returns {boolean} Return true if this parser should be used to parse the data into a
  * {@link Model}.
  */
/**
  * Resource handler used for loading {@link Model} resources.
  *
  * @implements {ResourceHandler}
  */
@JSGlobal("pc.ModelHandler")
@js.native
open class ModelHandler protected ()
  extends typings.playcanvas.mod.ModelHandler {
  /**
    * Create a new ModelHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
