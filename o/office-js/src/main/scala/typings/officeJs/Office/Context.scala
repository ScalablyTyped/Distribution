package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the runtime environment of the add-in and provides access to key objects of the API.
  * The current context exists as a property of Office. It is accessed using `Office.context`.
  *
  * @remarks
  *
  * **Applications**: Excel, Outlook, PowerPoint, Project, Word
  */
trait Context extends StObject {
  
  /**
    * True, if the current platform allows the add-in to display a UI for selling or upgrading; otherwise returns False.
    *
    * @remarks
    *
    * **Applications**: Excel, Word
    *
    * `commerceAllowed` is only supported in Office on iPad.
    *
    * The iOS App Store doesn't support apps with add-ins that provide links to additional payment systems. However, Office Add-ins running in
    * Office on the Windows desktop or in the browser do allow such links. If you want the UI of your add-in to provide a link to an
    * external payment system on platforms other than iOS, you can use the commerceAllowed property to control when that link is displayed.
    */
  var commerceAllowed: Boolean
  
  /**
    * Gets the locale (language) specified by the user for editing the document or item.
    *
    * @remarks
    *
    * The `contentLanguage` value reflects the **Editing Language** setting specified with **File** \> **Options** \> **Language** in the Office
    * application.
    *
    * **Support details**
    *
    * For more information about Office application and server requirements, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    *
    * *Supported applications, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Supported         </td><td> Supported             </td><td>                </td><td> Supported                 </td><td> Supported     </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Supported         </td><td>                       </td><td>                </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td>               </td></tr>
    *  </table>
    */
  var contentLanguage: String
  
  /**
    * Gets information about the environment in which the add-in is running.
    * 
    * @remarks
    * **Important**: In Outlook, this property is available from Mailbox requirement set 1.5.
    * For all Mailbox requirement sets, you can use the 
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.mailbox?view=outlook-js-1.1&preserve-view=true#outlook-office-mailbox-diagnostics-member | Office.context.mailbox.diagnostics} 
    * property to get similar information.
    */
  var diagnostics: ContextInformation
  
  /**
    * Gets the locale (language) specified by the user for the UI of the Office application.
    *
    * @remarks
    *
    * The returned value is a string in the RFC 1766 Language tag format, such as en-US.
    *
    * The `displayLanguage` value reflects the current **Display Language** setting specified with **File** \> **Options** \> **Language** in the Office
    * application.
    *
    * When using in Outlook, the applicable modes are Compose or Read.
    *
    * **Support details**
    *
    * For more information about Office application and server requirements, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    *
    * *Supported applications, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Supported         </td><td> Supported             </td><td>                </td><td> Supported                 </td><td> Supported     </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Supported         </td><td>                       </td><td>                </td><td>                           </td><td> Supported     </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Supported         </td><td>                       </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
    *  </table>
    */
  var displayLanguage: String
  
  /**
    * Gets an object that represents the document the content or task pane add-in is interacting with.
    */
  var document: Document
  
  /**
    * Contains the Office application in which the add-in is running.
    *
    * @remarks
    * **Important**: In Outlook, this property is available from Mailbox requirement set 1.5. You can also use the
    * `Office.context.diagnostics` property to get the application starting with requirement set 1.5. For all
    * Mailbox requirement sets, you can use the 
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.mailbox?view=outlook-js-1.1&preserve-view=true#outlook-office-mailbox-diagnostics-member | Office.context.mailbox.diagnostics} 
    * property to get similar information.
    */
  var host: HostType
  
  /**
    * Gets the license information for the user's Office installation.
    */
  var license: String
  
  /**
    Provides access to the Microsoft Outlook add-in object model.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **restricted**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * **Key properties**:
    *
    * - `diagnostics`: Provides diagnostic information to an Outlook add-in.
    *
    * - `item`: Provides methods and properties for accessing a message or appointment in an Outlook add-in.
    *
    * - `userProfile`: Provides information about the user in an Outlook add-in.
    */
  var mailbox: Mailbox
  
  /**
    * Provides access to the properties for Office theme colors.
    */
  var officeTheme: OfficeTheme
  
  /**
    * Provides the platform on which the add-in is running.
    *
    * @remarks
    * **Important**: In Outlook, this property is available from Mailbox requirement set 1.5. You can also use the
    * `Office.context.diagnostics` property to get the platform starting with requirement set 1.5. For all
    * Mailbox requirement sets, you can use the 
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.mailbox?view=outlook-js-1.1&preserve-view=true#outlook-office-mailbox-diagnostics-member | Office.context.mailbox.diagnostics} 
    * property to get similar information.
    */
  var platform: PlatformType
  
  /**
    * Provides a method for determining what requirement sets are supported on the current Office application and platform.
    */
  var requirements: RequirementSetSupport
  
  /**
    * Gets an object that represents the custom settings or state of a mail add-in saved to a user's mailbox.
    *
    * The `RoamingSettings` object lets you store and access data for a mail add-in that is stored in a user's mailbox, so it's available to
    * that add-in when it is running from any client application used to access that mailbox.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **restricted**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var roamingSettings: RoamingSettings
  
  /**
    * Specifies whether the platform and device allows touch interaction.
    * True if the add-in is running on a touch device, such as an iPad; false otherwise.
    *
    * @remarks
    *
    * **Applications**: Excel, PowerPoint, Word
    *
    * `touchEnabled` is only supported in Office on iPad.
    *
    * Use the touchEnabled property to determine when your add-in is running on a touch device and if necessary, adjust the kind of controls, and
    * size and spacing of elements in your add-in's UI to accommodate touch interactions.
    */
  var touchEnabled: Boolean
  
  /**
    * Provides objects and methods that you can use to create and manipulate UI components, such as dialog boxes.
    */
  var ui: UI
}
object Context {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setCommerceAllowed(value: Boolean): Self = StObject.set(x, "commerceAllowed", value.asInstanceOf[js.Any])
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: ContextInformation): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDisplayLanguage(value: String): Self = StObject.set(x, "displayLanguage", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setHost(value: HostType): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setMailbox(value: Mailbox): Self = StObject.set(x, "mailbox", value.asInstanceOf[js.Any])
    
    inline def setOfficeTheme(value: OfficeTheme): Self = StObject.set(x, "officeTheme", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: PlatformType): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: RequirementSetSupport): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRoamingSettings(value: RoamingSettings): Self = StObject.set(x, "roamingSettings", value.asInstanceOf[js.Any])
    
    inline def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    inline def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
  }
}
