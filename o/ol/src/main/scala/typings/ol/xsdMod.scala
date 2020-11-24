package typings.ol

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/xsd", JSImport.Namespace)
@js.native
object xsdMod extends js.Object {
  
  def readBoolean(node: Node): js.UndefOr[Boolean] = js.native
  
  def readBooleanString(string: String): js.UndefOr[Boolean] = js.native
  
  def readDateTime(node: Node): js.UndefOr[Double] = js.native
  
  def readDecimal(node: Node): js.UndefOr[Double] = js.native
  
  def readDecimalString(string: String): js.UndefOr[Double] = js.native
  
  def readNonNegativeInteger(node: Node): js.UndefOr[Double] = js.native
  
  def readNonNegativeIntegerString(string: String): js.UndefOr[Double] = js.native
  
  def readString(node: Node): js.UndefOr[String] = js.native
  
  def writeBooleanTextNode(node: Node, bool: Boolean): Unit = js.native
  
  def writeCDATASection(node: Node, string: String): Unit = js.native
  
  def writeDateTimeTextNode(node: Node, dateTime: Double): Unit = js.native
  
  def writeDecimalTextNode(node: Node, decimal: Double): Unit = js.native
  
  def writeNonNegativeIntegerTextNode(node: Node, nonNegativeInteger: Double): Unit = js.native
  
  def writeStringTextNode(node: Node, string: String): Unit = js.native
}
