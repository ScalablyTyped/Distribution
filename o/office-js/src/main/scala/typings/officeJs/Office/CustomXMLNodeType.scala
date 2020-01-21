package typings.officeJs.Office

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomXMLNodeType with Double] = js.native
  /* 0 */ @js.native
  object Attribute extends TopLevel[Attribute with Double]
  
  /* 1 */ @js.native
  object CData extends TopLevel[CData with Double]
  
  /* 3 */ @js.native
  object Element extends TopLevel[Element with Double]
  
  /* 2 */ @js.native
  object NodeComment extends TopLevel[NodeComment with Double]
  
  /* 4 */ @js.native
  object NodeDocument extends TopLevel[NodeDocument with Double]
  
  /* 5 */ @js.native
  object ProcessingInstruction extends TopLevel[ProcessingInstruction with Double]
  
  /* 6 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

