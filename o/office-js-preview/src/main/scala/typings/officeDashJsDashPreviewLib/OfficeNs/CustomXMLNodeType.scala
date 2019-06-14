package typings
package officeDashJsDashPreviewLib.OfficeNs

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
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is CData.
    */
  @js.native
  sealed trait CData
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is an element.
    */
  @js.native
  sealed trait Element
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is a comment.
    */
  @js.native
  sealed trait NodeComment
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is a Document element.
    */
  @js.native
  sealed trait NodeDocument
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is a processing instruction.
    */
  @js.native
  sealed trait ProcessingInstruction
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /**
    * The node is text.
    */
  @js.native
  sealed trait Text
    extends officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType
  
  /* 0 */ val Attribute: Attribute with scala.Double = js.native
  /* 1 */ val CData: CData with scala.Double = js.native
  /* 3 */ val Element: Element with scala.Double = js.native
  /* 2 */ val NodeComment: NodeComment with scala.Double = js.native
  /* 4 */ val NodeDocument: NodeDocument with scala.Double = js.native
  /* 5 */ val ProcessingInstruction: ProcessingInstruction with scala.Double = js.native
  /* 6 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType with scala.Double] = js.native
}

