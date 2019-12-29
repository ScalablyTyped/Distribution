package typings.openlayers.openlayersMod.format

import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.olx.format.MVTOptions
import typings.openlayers.openlayersMod.olx.format.ReadOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.std.ArrayBuffer
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for reading data in the Mapbox MVT format.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.MVT")
@js.native
/**
  * @classdesc
  * Feature format for reading data in the Mapbox MVT format.
  *
  * @param opt_options Options.
  * @api
  */
class MVT () extends Feature {
  def this(opt_options: MVTOptions) = this()
  def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: ArrayBuffer): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  /**
    * @inheritDoc
    * @api
    */
  def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * @inheritDoc
    * @api
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  /**
    * Sets the layers that features will be read from.
    * @param layers Layers.
    * @api
    */
  def setLayers(layers: js.Array[String]): Unit = js.native
}

