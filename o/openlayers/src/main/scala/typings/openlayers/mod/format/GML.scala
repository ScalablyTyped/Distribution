package typings.openlayers.mod.format

import typings.openlayers.mod.olx.format.GMLOptions
import typings.openlayers.mod.olx.format.WriteOptions
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the GML format
  * version 3.1.1.
  * Currently only supports GML 3.1.1 Simple Features profile.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
@JSImport("openlayers", "format.GML")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the GML format
  * version 3.1.1.
  * Currently only supports GML 3.1.1 Simple Features profile.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
open class GML () extends GMLBase {
  def this(opt_options: GMLOptions) = this()
  
  /**
    * Encode an array of features in GML 3.1.1 Simple Features.
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Result.
    * @api stable
    */
  def writeFeatures(features: js.Array[typings.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typings.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features in the GML 3.1.1 format as an XML node.
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Node.
    * @api
    */
  def writeFeaturesNode(features: js.Array[typings.openlayers.mod.Feature]): Node = js.native
  def writeFeaturesNode(features: js.Array[typings.openlayers.mod.Feature], opt_options: WriteOptions): Node = js.native
}
