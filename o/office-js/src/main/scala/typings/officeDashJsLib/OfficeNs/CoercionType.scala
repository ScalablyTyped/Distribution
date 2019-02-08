package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoercionType extends js.Object

/**
  * Specifies how to coerce data returned or set by the invoked method.
  *
  * @remarks
  * PowerPoint supports only `Office.CoercionType.Text`, `Office.CoercionType.Image`, `Office.CoercionType.SlideRange`, and `Office.CoercionType.XmlSvg`.
  * 
  * Project supports only `Office.CoercionType.Text`.
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
  *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Access     </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *  </table>
  */
@JSGlobal("Office.CoercionType")
@js.native
object CoercionType extends js.Object {
  /**
    * Return or set data as HTML.
    * 
    * **Note**: Only applies to data in add-ins for Word and Outlook add-ins for Outlook (compose mode).
    */
  @js.native
  sealed trait Html
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Data is returned or set as an image stream.
    * **Note**: Only applies to data in Excel, Word, and PowerPoint.
    */
  @js.native
  sealed trait Image
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Return or set data as tabular data with no headers. Data is returned or set as an array of arrays containing one-dimensional runs of 
    * characters. For example, three rows of  string values in two columns would be: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]].
    *
    * **Note**: Only applies to data in Excel and Word.
    */
  @js.native
  sealed trait Matrix
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Return or set data as Office Open XML.
    * 
    * **Note**: Only applies to data in Word.
    */
  @js.native
  sealed trait Ooxml
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Return a JSON object that contains an array of the ids, titles, and indexes of the selected slides. For example, 
    * `{"slides":[{"id":257,"title":"Slide 2","index":2},{"id":256,"title":"Slide 1","index":1}]}` for a selection of two slides.
    * 
    * **Note**: Only applies to data in PowerPoint when calling the {@link Office.Document | Document}.getSelectedData method to get the current 
    * slide or selected range of slides.
    */
  @js.native
  sealed trait SlideRange
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Return or set data as tabular data with optional headers. Data is returned or set as an array of arrays with optional headers.
    * 
    * **Note**: Only applies to data in Access, Excel, and Word.
    */
  @js.native
  sealed trait Table
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Return or set data as text (string). Data is returned or set as a one-dimensional run of characters.
    */
  @js.native
  sealed trait Text
    extends officeDashJsLib.OfficeNs.CoercionType
  
  /**
    * Data is returned or set as XML data containing an SVG image.
    * **Note**: Only applies to data in Excel, Word, and PowerPoint.
    */
  @js.native
  sealed trait XmlSvg
    extends officeDashJsLib.OfficeNs.CoercionType
  
  val Html: Html with java.lang.String = js.native
  val Image: Image with java.lang.String = js.native
  val Matrix: Matrix with java.lang.String = js.native
  val Ooxml: Ooxml with java.lang.String = js.native
  val SlideRange: SlideRange with java.lang.String = js.native
  val Table: Table with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  val XmlSvg: XmlSvg with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.CoercionType with java.lang.String] = js.native
}

