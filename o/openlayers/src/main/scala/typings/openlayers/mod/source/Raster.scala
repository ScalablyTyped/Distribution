package typings.openlayers.mod.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.RasterOperation
import typings.openlayers.mod.olx.source.RasterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * A source that transforms data from any number of input sources using an array
  * of {@link ol.RasterOperation} functions to transform input pixel values into
  * output pixel values.
  *
  * @fires ol.source.RasterEvent
  * @param options Options.
  * @api
  */
@JSImport("openlayers", "source.Raster")
@js.native
class Raster protected () extends Image {
  /**
    * @classdesc
    * A source that transforms data from any number of input sources using an array
    * of {@link ol.RasterOperation} functions to transform input pixel values into
    * output pixel values.
    *
    * @fires ol.source.RasterEvent
    * @param options Options.
    * @api
    */
  def this(options: RasterOptions) = this()
  
  /**
    * Set the operation.
    * @param operation New operation.
    * @param opt_lib Functions that will be available to operations run
    *     in a worker.
    * @api
    */
  def setOperation(operation: RasterOperation): Unit = js.native
  def setOperation(operation: RasterOperation, opt_lib: GlobalObject): Unit = js.native
}
