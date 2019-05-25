package typings
package olLib.formatKMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KML
  extends olLib.formatXMLFeatureMod.default {
  def readName(source: java.lang.String): java.lang.String = js.native
  def readName(source: stdLib.Document): java.lang.String = js.native
  def readName(source: stdLib.Element): java.lang.String = js.native
  def readNameFromDocument(doc: stdLib.Document): java.lang.String = js.native
  def readNameFromNode(node: stdLib.Element): java.lang.String = js.native
  def readNetworkLinks(source: java.lang.String): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readNetworkLinks(source: stdLib.Document): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readNetworkLinks(source: stdLib.Element): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readNetworkLinksFromDocument(doc: stdLib.Document): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readNetworkLinksFromNode(node: stdLib.Element): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readRegion(source: java.lang.String): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readRegion(source: stdLib.Document): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readRegion(source: stdLib.Element): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readRegionFromDocument(doc: stdLib.Document): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readRegionFromNode(node: stdLib.Element): js.Array[org.scalablytyped.runtime.StringDictionary[_]] = js.native
}

