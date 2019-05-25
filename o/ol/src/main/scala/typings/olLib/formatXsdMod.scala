package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/xsd", JSImport.Namespace)
@js.native
object formatXsdMod extends js.Object {
  def readBoolean(node: stdLib.Node): scala.Boolean = js.native
  def readBooleanString(string: java.lang.String): scala.Boolean = js.native
  def readDateTime(node: stdLib.Node): scala.Double = js.native
  def readDecimal(node: stdLib.Node): scala.Double = js.native
  def readDecimalString(string: java.lang.String): scala.Double = js.native
  def readNonNegativeInteger(node: stdLib.Node): scala.Double = js.native
  def readNonNegativeIntegerString(string: java.lang.String): scala.Double = js.native
  def readString(node: stdLib.Node): java.lang.String = js.native
  def writeBooleanTextNode(node: stdLib.Node, bool: scala.Boolean): scala.Unit = js.native
  def writeCDATASection(node: stdLib.Node, string: java.lang.String): scala.Unit = js.native
  def writeDateTimeTextNode(node: stdLib.Node, dateTime: scala.Double): scala.Unit = js.native
  def writeDecimalTextNode(node: stdLib.Node, decimal: scala.Double): scala.Unit = js.native
  def writeNonNegativeIntegerTextNode(node: stdLib.Node, nonNegativeInteger: scala.Double): scala.Unit = js.native
  def writeStringTextNode(node: stdLib.Node, string: java.lang.String): scala.Unit = js.native
}

