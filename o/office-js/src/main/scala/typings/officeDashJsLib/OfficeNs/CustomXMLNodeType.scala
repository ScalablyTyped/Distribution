package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomXMLNodeType extends js.Object

/**
  * Specifies the type of the XML node.
  */
@JSGlobal("Office.CustomXMLNodeType")
@js.native
object CustomXMLNodeType extends js.Object {
  /**
    * The node is an attribute.
    */
  @js.native
  sealed trait Attribute
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is CData.
    */
  @js.native
  sealed trait CData
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is an element.
    */
  @js.native
  sealed trait Element
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is a comment.
    */
  @js.native
  sealed trait NodeComment
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is a Document element.
    */
  @js.native
  sealed trait NodeDocument
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is a processing instruction.
    */
  @js.native
  sealed trait ProcessingInstruction
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is text.
    */
  @js.native
  sealed trait Text
    extends officeDashJsLib.OfficeNs.CustomXMLNodeType
  
  val Attribute: Attribute with java.lang.String = js.native
  val CData: CData with java.lang.String = js.native
  val Element: Element with java.lang.String = js.native
  val NodeComment: NodeComment with java.lang.String = js.native
  val NodeDocument: NodeDocument with java.lang.String = js.native
  val ProcessingInstruction: ProcessingInstruction with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.CustomXMLNodeType with java.lang.String] = js.native
}

