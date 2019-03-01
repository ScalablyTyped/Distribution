package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides specific information about an error that occurred during an asynchronous data operation.
  *
  * @remarks
  * The Error object is accessed from the AsyncResult object that is returned in the function passed as the callback argument of an asynchronous 
  * data operation, such as the setSelectedDataAsync method of the Document object.
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this interface is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this interface.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
  *  </table>
  */
trait Error extends js.Object {
  /**
    * Gets the numeric code of the error.
    */
  var code: scala.Double
  /**
    * Gets the name of the error.
    */
  var message: java.lang.String
  /**
    * Gets a detailed description of the error.
    */
  var name: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, name: java.lang.String): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Error]
  }
}

