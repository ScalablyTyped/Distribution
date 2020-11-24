package typings.ol.wfsMod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WFS
  extends typings.ol.xmlfeatureMod.default {
  
  def getFeatureType(): js.UndefOr[js.Array[String] | String] = js.native
  
  def readFeatureCollectionMetadata(source: String): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: js.Object): js.UndefOr[FeatureCollectionMetadata] = js.native
  /**
    * Read feature collection metadata of the source.
    */
  def readFeatureCollectionMetadata(source: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
  
  def readFeatureCollectionMetadataFromDocument(doc: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
  
  def readFeatureCollectionMetadataFromNode(node: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
  
  def readTransactionResponse(source: String): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: js.Object): js.UndefOr[TransactionResponse] = js.native
  /**
    * Read transaction response of the source.
    */
  def readTransactionResponse(source: Document): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: Element): js.UndefOr[TransactionResponse] = js.native
  
  def readTransactionResponseFromDocument(doc: Document): js.UndefOr[TransactionResponse] = js.native
  
  def readTransactionResponseFromNode(node: Element): js.UndefOr[TransactionResponse] = js.native
  
  def setFeatureType(): Unit = js.native
  def setFeatureType(featureType: String): Unit = js.native
  def setFeatureType(featureType: js.Array[String]): Unit = js.native
  
  /**
    * Encode format as WFS GetFeature and return the Node.
    */
  def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
  
  /**
    * Encode format as WFS Transaction and return the Node.
    */
  def writeTransaction(
    inserts: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    updates: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    deletes: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    options: WriteTransactionOptions
  ): Node = js.native
}
