package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomXMLNodeType extends js.Object

/**
  * Specifies the type of the XML node.
  *
  * @remarks
  * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this enumeration is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this enumeration.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                       </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Word </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
  *  </table>
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
  
  val Attribute: Attribute with java.lang.String = js.native
  val CData: CData with java.lang.String = js.native
  val Element: Element with java.lang.String = js.native
  val NodeComment: NodeComment with java.lang.String = js.native
  val NodeDocument: NodeDocument with java.lang.String = js.native
  val ProcessingInstruction: ProcessingInstruction with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.CustomXMLNodeType with java.lang.String] = js.native
}

