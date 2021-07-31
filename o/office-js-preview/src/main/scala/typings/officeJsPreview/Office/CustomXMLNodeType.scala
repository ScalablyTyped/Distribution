package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomXMLNodeType extends StObject
/**
  * Specifies the type of the XML node.
  */
@JSGlobal("Office.CustomXMLNodeType")
@js.native
object CustomXMLNodeType extends StObject {
  
  /**
    * The node is an attribute.
    */
  @js.native
  sealed trait Attribute
    extends StObject
       with CustomXMLNodeType
  
  /**
    * The node is CData.
    */
  @js.native
  sealed trait CData
    extends StObject
       with CustomXMLNodeType
  
  /**
    * The node is an element.
    */
  @js.native
  sealed trait Element
    extends StObject
       with CustomXMLNodeType
  
  /**
    * The node is a comment.
    */
  @js.native
  sealed trait NodeComment
    extends StObject
       with CustomXMLNodeType
  
  /**
    * The node is a Document element.
    */
  @js.native
  sealed trait NodeDocument
    extends StObject
       with CustomXMLNodeType
  
  /**
    * The node is a processing instruction.
    */
  @js.native
  sealed trait ProcessingInstruction
    extends StObject
       with CustomXMLNodeType
  
  /**
    * The node is text.
    */
  @js.native
  sealed trait Text
    extends StObject
       with CustomXMLNodeType
}
