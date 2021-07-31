package typings.ol

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xsdMod {
  
  @JSImport("ol/format/xsd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readBoolean(node: Node): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBoolean")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  @scala.inline
  def readBooleanString(string: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBooleanString")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  @scala.inline
  def readDateTime(node: Node): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDateTime")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def readDecimal(node: Node): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDecimal")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def readDecimalString(string: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDecimalString")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def readNonNegativeInteger(node: Node): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readNonNegativeInteger")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def readNonNegativeIntegerString(string: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readNonNegativeIntegerString")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def readString(node: Node): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readString")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def writeBooleanTextNode(node: Node, bool: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBooleanTextNode")(node.asInstanceOf[js.Any], bool.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeCDATASection(node: Node, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCDATASection")(node.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeDateTimeTextNode(node: Node, dateTime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDateTimeTextNode")(node.asInstanceOf[js.Any], dateTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeDecimalTextNode(node: Node, decimal: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDecimalTextNode")(node.asInstanceOf[js.Any], decimal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeNonNegativeIntegerTextNode(node: Node, nonNegativeInteger: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNonNegativeIntegerTextNode")(node.asInstanceOf[js.Any], nonNegativeInteger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeStringTextNode(node: Node, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStringTextNode")(node.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
