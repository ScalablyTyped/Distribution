package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the runtime environment of the add-in and provides access to key objects of the API. 
  * The current context exists as a property of Office. It is accessed using `Office.context`.
  *
  * @remarks 
  * **Hosts**: Access, Excel, Outlook, PowerPoint, Project, Word
  */     
trait Context extends js.Object {
  /**
    * Provides information and access to the signed-in user.
    * 
    * @beta
    */
  var auth: Auth
  /**
    * True, if the current platform allows the add-in to display a UI for selling or upgrading; otherwise returns False.
    * 
    * @remarks
    * **Hosts**: Excel, Word
    * 
    * `commerceAllowed` is only supported on Office for iPad.
    * 
    * The iOS App Store doesn't support apps with add-ins that provide links to additional payment systems. However, Office Add-ins running on 
    * the Windows desktop or for Office Online in the browser do allow such links. If you want the UI of your add-in to provide a link to an 
    * external payment system on platforms other than iOS, you can use the commerceAllowed property to control when that link is displayed.
    */
  var commerceAllowed: scala.Boolean
  /**
    * Gets the locale (language) specified by the user for editing the document or item.
    * 
    * @remarks
    * The `contentLanguage` value reflects the **Editing Language** setting specified with **File \> Options \> Language** in the Office host 
    * application.
    * 
    * In content add-ins for Access web apps, the `contentLanguage` property gets the add-in culture (e.g., "en-GB").
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this enumeration.
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
  var contentLanguage: java.lang.String
  /**
    * Gets information about the environment in which the add-in is running.
    */
  var diagnostics: ContextInformation
  /**
    * Gets the locale (language) specified by the user for the UI of the Office host application.
    * 
    * @remarks
    * 
    * The returned value is a string in the RFC 1766 Language tag format, such as en-US.
    * 
    * The `displayLanguage` value reflects the current **Display Language** setting specified with **File \> Options \> Language** in the Office 
    * host application.
    * 
    * In content add-ins for Access web apps, the `displayLanguage property` gets the add-in language (e.g., "en-US").
    * 
    * When using in Outlook, the applicable modes are Compose or Read.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
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
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *  </table>
    */
  var displayLanguage: java.lang.String
  /**
    * Gets an object that represents the document the content or task pane add-in is interacting with.
    */
  var document: Document
  /**
    * Contains the Office application host in which the add-in is running.
    */
  var host: HostType
  /**
    * Gets the license information for the user's Office installation.
    */
  var license: java.lang.String
  /**
    * Provides access to the Outlook Add-in object model for Microsoft Outlook and Microsoft Outlook on the web.
    *
    * Namespaces:
    *
    * - diagnostics: Provides diagnostic information to an Outlook add-in.
    *
    * - item: Provides methods and properties for accessing a message or appointment in an Outlook add-in.
    *
    * - userProfile: Provides information about the user in an Outlook add-in.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var mailbox: Mailbox
  /**
    * Provides access to the properties for Office theme colors.
    */
  var officeTheme: OfficeTheme
  /**
    * Provides the platform on which the add-in is running.
    */
  var platform: PlatformType
  /**
    * Provides a method for determining what requirement sets are supported on the current host and platform.
    */
  var requirements: RequirementSetSupport
  /**
    * Gets an object that represents the custom settings or state of a mail add-in saved to a user's mailbox.
    *
    * The RoamingSettings object lets you store and access data for a mail add-in that is stored in a user's mailbox, so that is available to 
    * that add-in when it is running from any host client application used to access that mailbox.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var roamingSettings: RoamingSettings
  /**
    * Specifies whether the platform and device allows touch interaction. 
    * True if the add-in is running on a touch device, such as an iPad; false otherwise.
    * 
    * @remarks
    * **Hosts**: Excel, PowerPoint, Word
    * 
    * `touchEnabled` is only supported on Office for iPad.
    * 
    * Use the touchEnabled property to determine when your add-in is running on a touch device and if necessary, adjust the kind of controls, and 
    * size and spacing of elements in your add-in's UI to accommodate touch interactions.
    */
  var touchEnabled: scala.Boolean
  /**
    * Provides objects and methods that you can use to create and manipulate UI components, such as dialog boxes.
    */
  var ui: UI
}

object Context {
  @scala.inline
  def apply(
    auth: Auth,
    commerceAllowed: scala.Boolean,
    contentLanguage: java.lang.String,
    diagnostics: ContextInformation,
    displayLanguage: java.lang.String,
    document: Document,
    host: HostType,
    license: java.lang.String,
    mailbox: Mailbox,
    officeTheme: OfficeTheme,
    platform: PlatformType,
    requirements: RequirementSetSupport,
    roamingSettings: RoamingSettings,
    touchEnabled: scala.Boolean,
    ui: UI
  ): Context = {
    val __obj = js.Dynamic.literal(auth = auth, commerceAllowed = commerceAllowed, contentLanguage = contentLanguage, diagnostics = diagnostics, displayLanguage = displayLanguage, document = document, host = host, license = license, mailbox = mailbox, officeTheme = officeTheme, platform = platform, requirements = requirements, roamingSettings = roamingSettings, touchEnabled = touchEnabled, ui = ui)
  
    __obj.asInstanceOf[Context]
  }
}

