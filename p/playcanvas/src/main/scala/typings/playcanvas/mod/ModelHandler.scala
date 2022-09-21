package typings.playcanvas.mod

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
@JSImport("playcanvas", "ModelHandler")
@js.native
open class ModelHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new ModelHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _defaultMaterial: StandardMaterial = js.native
  
  var _device: GraphicsDevice = js.native
  
  var _parsers: js.Array[Any] = js.native
  
  /**
    * Add a parser that converts raw data into a {@link Model}. Default parser is for JSON models.
    *
    * @param {object} parser - See JsonModelParser for example.
    * @param {AddParserCallback} decider - Function that decides on which parser to use. Function
    * should take (url, data) arguments and return true if this parser should be used to parse the
    * data into a {@link Model}. The first parser to return true is used.
    */
  def addParser(parser: js.Object, decider: AddParserCallback): Unit = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): Any = js.native
  
  @JSName("patch")
  def patch_MModelHandler(asset: Any, assets: Any): Unit = js.native
}
