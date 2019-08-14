package typings.ol.formatWFSMod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFS
  extends typings.ol.formatXMLFeatureMod.default {
  def getFeatureType(): js.UndefOr[js.Array[String] | String] = js.native
  def readFeatureCollectionMetadata(source: String): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: js.Object): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadataFromDocument(doc: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadataFromNode(node: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readTransactionResponse(source: String): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: js.Object): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: Document): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: Element): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponseFromDocument(doc: Document): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponseFromNode(node: Element): js.UndefOr[TransactionResponse] = js.native
  def setFeatureType(): Unit = js.native
  def setFeatureType(featureType: String): Unit = js.native
  def setFeatureType(featureType: js.Array[String]): Unit = js.native
  def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
  def writeTransaction(
    inserts: js.Array[typings.ol.featureMod.default],
    updates: js.Array[typings.ol.featureMod.default],
    deletes: js.Array[typings.ol.featureMod.default],
    options: WriteTransactionOptions
  ): Node = js.native
}

