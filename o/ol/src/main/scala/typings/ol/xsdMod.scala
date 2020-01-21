package typings.ol

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/xsd", JSImport.Namespace)
@js.native
object xsdMod extends js.Object {
  def readBoolean(node: Node): Boolean = js.native
  def readBooleanString(string: String): Boolean = js.native
  def readDateTime(node: Node): Double = js.native
  def readDecimal(node: Node): Double = js.native
  def readDecimalString(string: String): Double = js.native
  def readNonNegativeInteger(node: Node): Double = js.native
  def readNonNegativeIntegerString(string: String): Double = js.native
  def readString(node: Node): String = js.native
  def writeBooleanTextNode(node: Node, bool: Boolean): Unit = js.native
  def writeCDATASection(node: Node, string: String): Unit = js.native
  def writeDateTimeTextNode(node: Node, dateTime: Double): Unit = js.native
  def writeDecimalTextNode(node: Node, decimal: Double): Unit = js.native
  def writeNonNegativeIntegerTextNode(node: Node, nonNegativeInteger: Double): Unit = js.native
  def writeStringTextNode(node: Node, string: String): Unit = js.native
}

