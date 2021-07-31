package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.AddParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.Model} resources.
  * @param device - The graphics device that will be rendering.
  * @param defaultMaterial - The shared default material that is used in any place that a material is not specified.
  */
@js.native
trait ModelHandler
  extends StObject
     with ResourceHandler {
  
  /**
    * Add a parser that converts raw data into a {@link pc.Model}
    * Default parser is for JSON models.
    * @param parser - See JsonModelParser for example.
    * @param decider - Function that decides on which parser to use.
    * Function should take (url, data) arguments and return true if this parser should be used to parse the data into a {@link pc.Model}.
    * The first parser to return true is used.
    */
  def addParser(parser: js.Any, decider: AddParser): Unit = js.native
}
