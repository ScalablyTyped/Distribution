package typings.officeDashJsDashPreview.Office

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
  sealed trait Attribute extends CustomXMLNodeType
  
  /**
    * The node is CData.
    */
  @js.native
  sealed trait CData extends CustomXMLNodeType
  
  /**
    * The node is an element.
    */
  @js.native
  sealed trait Element extends CustomXMLNodeType
  
  /**
    * The node is a comment.
    */
  @js.native
  sealed trait NodeComment extends CustomXMLNodeType
  
  /**
    * The node is a Document element.
    */
  @js.native
  sealed trait NodeDocument extends CustomXMLNodeType
  
  /**
    * The node is a processing instruction.
    */
  @js.native
  sealed trait ProcessingInstruction extends CustomXMLNodeType
  
  /**
    * The node is text.
    */
  @js.native
  sealed trait Text extends CustomXMLNodeType
  
  /* 0 */ val Attribute: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.Attribute with Double = js.native
  /* 1 */ val CData: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.CData with Double = js.native
  /* 3 */ val Element: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.Element with Double = js.native
  /* 2 */ val NodeComment: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.NodeComment with Double = js.native
  /* 4 */ val NodeDocument: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.NodeDocument with Double = js.native
  /* 5 */ val ProcessingInstruction: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.ProcessingInstruction with Double = js.native
  /* 6 */ val Text: typings.officeDashJsDashPreview.Office.CustomXMLNodeType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomXMLNodeType with Double] = js.native
}

