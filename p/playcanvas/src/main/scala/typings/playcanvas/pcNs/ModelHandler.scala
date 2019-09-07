package typings.playcanvas.pcNs

import typings.playcanvas.pcNs.callbacksNs.AddParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ModelHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Model} resources
  * @param {pc.GraphicsDevice} device The graphics device that will be rendering
  * @param {pc.StandardMaterial} defaultMaterial The shared default material that is used in any place that a material is not specified
  */
@JSGlobal("pc.ModelHandler")
@js.native
class ModelHandler protected () extends ResourceHandler {
  def this(device: GraphicsDevice, defaultMaterial: StandardMaterial) = this()
  /**
    * @function
    * @name pc.ModelHandler#addParser
    * @description Add a parser that converts raw data into a {@link pc.Model}
    * Default parser is for JSON models
    * @param {Object} parser See JsonModelParser for example
    * @param {pc.callbacks.AddParser} decider Function that decides on which parser to use.
    * Function should take (url, data) arguments and return true if this parser should be used to parse the data into a {@link pc.Model}.
    * The first parser to return true is used.
    */
  def addParser(parser: js.Any, decider: AddParser): Unit = js.native
}

