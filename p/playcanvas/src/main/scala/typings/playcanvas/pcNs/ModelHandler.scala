package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ModelHandler
  * @class Resource Handler for creating pc.Model resources
  * @description {@link pc.ResourceHandler} use to load 3D model resources
  * @param {pc.GraphicsDevice} device The graphics device that will be rendering
  */
@JSGlobal("pc.ModelHandler")
@js.native
class ModelHandler protected () extends js.Object {
  def this(device: GraphicsDevice) = this()
  /**
    * @function
    * @name pc.ModelHandler#addParser
    * @description Add a parser that converts raw data into a {@link pc.Model}
    * Default parser is for JSON models
    * @param {Object} parser See JsonModelParser for example
    * @param {Function} decider Function that decides on which parser to use. 
    * Function should take (url, data) arguments and return true if this parser should be used to parse the data into a {@link pc.Model}.
    * The first parser to return true is used.
    */
  def addParser(parser: js.Object, decider: js.Function): Unit = js.native
  /**
    * @function
    * @name pc.ModelHandler#load
    * @description Fetch model data from a remote url
    */
  def load(url: String, callback: js.Function): Unit = js.native
  /**
    * @function
    * @name pc.ModelHandler#open
    * @description Process data in deserialized format into a pc.Model object
    * @param {Object} data The data from model file deserialized into a JavaScript Object
    */
  def open(url: String, data: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("pc.ModelHandler")
@js.native
object ModelHandler extends js.Object {
  var DEFAULT_MATERIAL: StandardMaterial = js.native
}

