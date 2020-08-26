package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the runtime environment of the add-in and provides access to key objects of the API. 
  * The current context exists as a property of Office. It is accessed using `Office.context`.
  *
  * @remarks
  * 
  * **Hosts**: Excel, Outlook, PowerPoint, Project, Word
  */     
@js.native
trait Context extends js.Object {
  /**
    * True, if the current platform allows the add-in to display a UI for selling or upgrading; otherwise returns False.
    * 
    * @remarks
    * 
    * **Hosts**: Excel, Word
    * 
    * `commerceAllowed` is only supported in Office on iPad.
    * 
    * The iOS App Store doesn't support apps with add-ins that provide links to additional payment systems. However, Office Add-ins running in 
    * Office on the Windows desktop or in the browser do allow such links. If you want the UI of your add-in to provide a link to an 
    * external payment system on platforms other than iOS, you can use the commerceAllowed property to control when that link is displayed.
    */
  var commerceAllowed: Boolean = js.native
  /**
    * Gets the locale (language) specified by the user for editing the document or item.
    * 
    * @remarks
    * 
    * The `contentLanguage` value reflects the **Editing Language** setting specified with **File \> Options \> Language** in the Office host 
    * application.
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
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *  </table>
    */
  var contentLanguage: String = js.native
  /**
    * Gets information about the environment in which the add-in is running.
    */
  var diagnostics: ContextInformation = js.native
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
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td>                       </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *  </table>
    */
  var displayLanguage: String = js.native
  /**
    * Gets an object that represents the document the content or task pane add-in is interacting with.
    */
  var document: Document = js.native
  /**
    * Contains the Office application host in which the add-in is running.
    */
  var host: HostType = js.native
  /**
    * Gets the license information for the user's Office installation.
    */
  var license: String = js.native
  /**
    * Provides access to the Microsoft Outlook Add-in object model.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * **Key properties**:
    *
    * - `diagnostics`: Provides diagnostic information to an Outlook add-in.
    *
    * - `item`: Provides methods and properties for accessing a message or appointment in an Outlook add-in.
    *
    * - `userProfile`: Provides information about the user in an Outlook add-in.
    */
  var mailbox: Mailbox = js.native
  /**
    * Provides access to the properties for Office theme colors.
    */
  var officeTheme: OfficeTheme = js.native
  /**
    * Provides the platform on which the add-in is running.
    */
  var platform: PlatformType = js.native
  /**
    * Provides a method for determining what requirement sets are supported on the current host and platform.
    */
  var requirements: RequirementSetSupport = js.native
  /**
    * Gets an object that represents the custom settings or state of a mail add-in saved to a user's mailbox.
    *
    * The `RoamingSettings` object lets you store and access data for a mail add-in that is stored in a user's mailbox, so it's available to 
    * that add-in when it is running from any host client application used to access that mailbox.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var roamingSettings: RoamingSettings = js.native
  /**
    * Specifies whether the platform and device allows touch interaction. 
    * True if the add-in is running on a touch device, such as an iPad; false otherwise.
    * 
    * @remarks
    * 
    * **Hosts**: Excel, PowerPoint, Word
    * 
    * `touchEnabled` is only supported in Office on iPad.
    * 
    * Use the touchEnabled property to determine when your add-in is running on a touch device and if necessary, adjust the kind of controls, and 
    * size and spacing of elements in your add-in's UI to accommodate touch interactions.
    */
  var touchEnabled: Boolean = js.native
  /**
    * Provides objects and methods that you can use to create and manipulate UI components, such as dialog boxes.
    */
  var ui: UI = js.native
}

object Context {
  @scala.inline
  def apply(
    commerceAllowed: Boolean,
    contentLanguage: String,
    diagnostics: ContextInformation,
    displayLanguage: String,
    document: Document,
    host: HostType,
    license: String,
    mailbox: Mailbox,
    officeTheme: OfficeTheme,
    platform: PlatformType,
    requirements: RequirementSetSupport,
    roamingSettings: RoamingSettings,
    touchEnabled: Boolean,
    ui: UI
  ): Context = {
    val __obj = js.Dynamic.literal(commerceAllowed = commerceAllowed.asInstanceOf[js.Any], contentLanguage = contentLanguage.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], displayLanguage = displayLanguage.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], mailbox = mailbox.asInstanceOf[js.Any], officeTheme = officeTheme.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], roamingSettings = roamingSettings.asInstanceOf[js.Any], touchEnabled = touchEnabled.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommerceAllowed(value: Boolean): Self = this.set("commerceAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagnostics(value: ContextInformation): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayLanguage(value: String): Self = this.set("displayLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: HostType): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def setMailbox(value: Mailbox): Self = this.set("mailbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeTheme(value: OfficeTheme): Self = this.set("officeTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: PlatformType): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequirements(value: RequirementSetSupport): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoamingSettings(value: RoamingSettings): Self = this.set("roamingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = this.set("touchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setUi(value: UI): Self = this.set("ui", value.asInstanceOf[js.Any])
  }
  
}

