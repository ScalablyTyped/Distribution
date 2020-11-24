package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
