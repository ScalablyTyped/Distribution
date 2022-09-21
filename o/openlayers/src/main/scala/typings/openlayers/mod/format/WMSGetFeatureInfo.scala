package typings.openlayers.mod.format

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.olx.format.ReadOptions
import typings.openlayers.mod.olx.format.WMSGetFeatureInfoOptions
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Format for reading WMSGetFeatureInfo format. It uses
  * {@link ol.format.GML2} to read features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.WMSGetFeatureInfo")
@js.native
/**
  * @classdesc
  * Format for reading WMSGetFeatureInfo format. It uses
  * {@link ol.format.GML2} to read features.
  *
  * @param opt_options Options.
  * @api
  */
open class WMSGetFeatureInfo () extends XMLFeature {
  def this(opt_options: WMSGetFeatureInfoOptions) = this()
  
  def readFeatures(source: String): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a WMSGetFeatureInfo response.
    *
    * @param source Source.
    * @param opt_options Options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
}
