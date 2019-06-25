package typings
package olLib.formatWFSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFS
  extends olLib.formatXMLFeatureMod.default {
  def getFeatureType(): js.Array[java.lang.String] | java.lang.String = js.native
  def readFeatureCollectionMetadata(source: java.lang.String): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: js.Object): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: stdLib.Document): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: stdLib.Element): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadataFromDocument(doc: stdLib.Document): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadataFromNode(node: stdLib.Element): FeatureCollectionMetadata = js.native
  def readTransactionResponse(source: java.lang.String): TransactionResponse = js.native
  def readTransactionResponse(source: js.Object): TransactionResponse = js.native
  def readTransactionResponse(source: stdLib.Document): TransactionResponse = js.native
  def readTransactionResponse(source: stdLib.Element): TransactionResponse = js.native
  def readTransactionResponseFromDocument(doc: stdLib.Document): TransactionResponse = js.native
  def readTransactionResponseFromNode(node: stdLib.Element): TransactionResponse = js.native
  def setFeatureType(featureType: java.lang.String): scala.Unit = js.native
  def setFeatureType(featureType: js.Array[java.lang.String]): scala.Unit = js.native
  def writeGetFeature(options: WriteGetFeatureOptions): stdLib.Node = js.native
  def writeTransaction(
    inserts: js.Array[olLib.featureMod.default],
    updates: js.Array[olLib.featureMod.default],
    deletes: js.Array[olLib.featureMod.default],
    options: WriteTransactionOptions
  ): stdLib.Node = js.native
}

