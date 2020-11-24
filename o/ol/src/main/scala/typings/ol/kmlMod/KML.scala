package typings.ol.kmlMod

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KML
  extends typings.ol.xmlfeatureMod.default {
  
  def readName(source: String): js.UndefOr[String] = js.native
  /**
    * Read the name of the KML.
    */
  def readName(source: Document): js.UndefOr[String] = js.native
  def readName(source: Element): js.UndefOr[String] = js.native
  
  def readNameFromDocument(doc: Document): js.UndefOr[String] = js.native
  
  def readNameFromNode(node: Element): js.UndefOr[String] = js.native
  
  def readNetworkLinks(source: String): js.Array[js.Object] = js.native
  /**
    * Read the network links of the KML.
    */
  def readNetworkLinks(source: Document): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Element): js.Array[js.Object] = js.native
  
  def readNetworkLinksFromDocument(doc: Document): js.Array[js.Object] = js.native
  
  def readNetworkLinksFromNode(node: Element): js.Array[js.Object] = js.native
  
  def readRegion(source: String): js.Array[js.Object] = js.native
  /**
    * Read the regions of the KML.
    */
  def readRegion(source: Document): js.Array[js.Object] = js.native
  def readRegion(source: Element): js.Array[js.Object] = js.native
  
  def readRegionFromDocument(doc: Document): js.Array[js.Object] = js.native
  
  def readRegionFromNode(node: Element): js.Array[js.Object] = js.native
}
