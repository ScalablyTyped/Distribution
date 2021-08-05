package typings.naverWhale.whale

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.chrome.anon.Acceptstlschannelid
import typings.chrome.anon.Actions
import typings.chrome.anon.Allframes
import typings.chrome.anon.Bookmarks
import typings.chrome.anon.Bookmarksui
import typings.chrome.anon.Chromestyle
import typings.chrome.anon.Clientid
import typings.chrome.anon.Configurable
import typings.chrome.anon.Contentsecuritypolicy
import typings.chrome.anon.Defaulttitle
import typings.chrome.anon.Description
import typings.chrome.anon.Dictionaryformat
import typings.chrome.anon.Homepage
import typings.chrome.anon.Id
import typings.chrome.anon.Keyword
import typings.chrome.anon.Language
import typings.chrome.anon.Managedschema
import typings.chrome.anon.Matches
import typings.chrome.anon.Mimetype
import typings.chrome.anon.Naclarch
import typings.chrome.anon.Page
import typings.chrome.anon.Path
import typings.chrome.anon.Voices
import typings.chrome.anon.Whitelist
import typings.chrome.anon.`3D`
import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Runtime
////////////////////
/**
  * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  * @since Chrome 22
  */
object runtime {
  
  trait ConnectInfo extends StObject {
    
    var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ConnectInfo {
    
    inline def apply(): ConnectInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectInfo]
    }
    
    extension [Self <: ConnectInfo](x: Self) {
      
      inline def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
      
      inline def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ExtensionConnectEvent = Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, Unit]]
  
  type ExtensionMessageEvent = Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typings.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ]
  
  trait InstalledDetails extends StObject {
    
    /**
      * Optional.
      * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
      * @since Chrome 29.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
      */
    var previousVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The reason that this event is being dispatched.
      * One of: "install", "update", "chrome_update", or "shared_module_update"
      */
    var reason: String
  }
  object InstalledDetails {
    
    inline def apply(reason: String): InstalledDetails = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledDetails]
    }
    
    extension [Self <: InstalledDetails](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
      
      inline def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait LastError extends StObject {
    
    /** Optional. Details about the error which occurred.  */
    var message: js.UndefOr[String] = js.undefined
  }
  object LastError {
    
    inline def apply(): LastError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LastError]
    }
    
    extension [Self <: LastError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait Manifest
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    // Optional
    var author: js.UndefOr[js.Any] = js.undefined
    
    var automation: js.UndefOr[js.Any] = js.undefined
    
    var background: js.UndefOr[Page] = js.undefined
    
    var background_page: js.UndefOr[String] = js.undefined
    
    // Pick one (or none)
    var browser_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.undefined
    
    var chrome_settings_overrides: js.UndefOr[Homepage] = js.undefined
    
    var chrome_ui_overrides: js.UndefOr[Bookmarksui] = js.undefined
    
    var chrome_url_overrides: js.UndefOr[Bookmarks] = js.undefined
    
    var commands: js.UndefOr[StringDictionary[Description]] = js.undefined
    
    var content_capabilities: js.UndefOr[Matches] = js.undefined
    
    var content_scripts: js.UndefOr[js.Array[Allframes]] = js.undefined
    
    var content_security_policy: js.UndefOr[String] = js.undefined
    
    var converted_from_user_script: js.UndefOr[Boolean] = js.undefined
    
    var copresence: js.UndefOr[js.Any] = js.undefined
    
    var current_locale: js.UndefOr[String] = js.undefined
    
    // Recommended
    var default_locale: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var devtools_page: js.UndefOr[String] = js.undefined
    
    var event_rules: js.UndefOr[js.Array[Actions]] = js.undefined
    
    var `export`: js.UndefOr[Whitelist] = js.undefined
    
    var externally_connectable: js.UndefOr[Acceptstlschannelid] = js.undefined
    
    var file_browser_handlers: js.UndefOr[js.Array[Defaulttitle]] = js.undefined
    
    var file_system_provider_capabilities: js.UndefOr[Configurable] = js.undefined
    
    var homepage_url: js.UndefOr[String] = js.undefined
    
    var icons: js.UndefOr[typings.chrome.chrome.runtime.ManifestIcons] = js.undefined
    
    var `import`: js.UndefOr[js.Array[Id]] = js.undefined
    
    var incognito: js.UndefOr[String] = js.undefined
    
    var input_components: js.UndefOr[js.Array[Language]] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    // Required
    var manifest_version: Double
    
    var minimum_chrome_version: js.UndefOr[String] = js.undefined
    
    var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.undefined
    
    var name: String
    
    var oauth2: js.UndefOr[Clientid] = js.undefined
    
    var offline_enabled: js.UndefOr[Boolean] = js.undefined
    
    var omnibox: js.UndefOr[Keyword] = js.undefined
    
    var optional_permissions: js.UndefOr[js.Array[String]] = js.undefined
    
    var options_page: js.UndefOr[String] = js.undefined
    
    var options_ui: js.UndefOr[Chromestyle] = js.undefined
    
    var page_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.undefined
    
    var permissions: js.UndefOr[js.Array[String]] = js.undefined
    
    var platforms: js.UndefOr[js.Array[Naclarch]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Path]] = js.undefined
    
    var requirements: js.UndefOr[`3D`] = js.undefined
    
    var sandbox: js.UndefOr[Contentsecuritypolicy] = js.undefined
    
    var short_name: js.UndefOr[String] = js.undefined
    
    var signature: js.UndefOr[js.Any] = js.undefined
    
    var spellcheck: js.UndefOr[Dictionaryformat] = js.undefined
    
    var storage: js.UndefOr[Managedschema] = js.undefined
    
    var system_indicator: js.UndefOr[js.Any] = js.undefined
    
    var tts_engine: js.UndefOr[Voices] = js.undefined
    
    var update_url: js.UndefOr[String] = js.undefined
    
    var version: String
    
    var version_name: js.UndefOr[String] = js.undefined
    
    var web_accessible_resources: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Manifest {
    
    inline def apply(manifest_version: Double, name: String, version: String): Manifest = {
      val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    extension [Self <: Manifest](x: Self) {
      
      inline def setAuthor(value: js.Any): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setAutomation(value: js.Any): Self = StObject.set(x, "automation", value.asInstanceOf[js.Any])
      
      inline def setAutomationUndefined: Self = StObject.set(x, "automation", js.undefined)
      
      inline def setBackground(value: Page): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBackground_page(value: String): Self = StObject.set(x, "background_page", value.asInstanceOf[js.Any])
      
      inline def setBackground_pageUndefined: Self = StObject.set(x, "background_page", js.undefined)
      
      inline def setBrowser_action(value: typings.chrome.chrome.runtime.ManifestAction): Self = StObject.set(x, "browser_action", value.asInstanceOf[js.Any])
      
      inline def setBrowser_actionUndefined: Self = StObject.set(x, "browser_action", js.undefined)
      
      inline def setChrome_settings_overrides(value: Homepage): Self = StObject.set(x, "chrome_settings_overrides", value.asInstanceOf[js.Any])
      
      inline def setChrome_settings_overridesUndefined: Self = StObject.set(x, "chrome_settings_overrides", js.undefined)
      
      inline def setChrome_ui_overrides(value: Bookmarksui): Self = StObject.set(x, "chrome_ui_overrides", value.asInstanceOf[js.Any])
      
      inline def setChrome_ui_overridesUndefined: Self = StObject.set(x, "chrome_ui_overrides", js.undefined)
      
      inline def setChrome_url_overrides(value: Bookmarks): Self = StObject.set(x, "chrome_url_overrides", value.asInstanceOf[js.Any])
      
      inline def setChrome_url_overridesUndefined: Self = StObject.set(x, "chrome_url_overrides", js.undefined)
      
      inline def setCommands(value: StringDictionary[Description]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setContent_capabilities(value: Matches): Self = StObject.set(x, "content_capabilities", value.asInstanceOf[js.Any])
      
      inline def setContent_capabilitiesUndefined: Self = StObject.set(x, "content_capabilities", js.undefined)
      
      inline def setContent_scripts(value: js.Array[Allframes]): Self = StObject.set(x, "content_scripts", value.asInstanceOf[js.Any])
      
      inline def setContent_scriptsUndefined: Self = StObject.set(x, "content_scripts", js.undefined)
      
      inline def setContent_scriptsVarargs(value: Allframes*): Self = StObject.set(x, "content_scripts", js.Array(value :_*))
      
      inline def setContent_security_policy(value: String): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
      
      inline def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
      
      inline def setConverted_from_user_script(value: Boolean): Self = StObject.set(x, "converted_from_user_script", value.asInstanceOf[js.Any])
      
      inline def setConverted_from_user_scriptUndefined: Self = StObject.set(x, "converted_from_user_script", js.undefined)
      
      inline def setCopresence(value: js.Any): Self = StObject.set(x, "copresence", value.asInstanceOf[js.Any])
      
      inline def setCopresenceUndefined: Self = StObject.set(x, "copresence", js.undefined)
      
      inline def setCurrent_locale(value: String): Self = StObject.set(x, "current_locale", value.asInstanceOf[js.Any])
      
      inline def setCurrent_localeUndefined: Self = StObject.set(x, "current_locale", js.undefined)
      
      inline def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
      
      inline def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevtools_page(value: String): Self = StObject.set(x, "devtools_page", value.asInstanceOf[js.Any])
      
      inline def setDevtools_pageUndefined: Self = StObject.set(x, "devtools_page", js.undefined)
      
      inline def setEvent_rules(value: js.Array[Actions]): Self = StObject.set(x, "event_rules", value.asInstanceOf[js.Any])
      
      inline def setEvent_rulesUndefined: Self = StObject.set(x, "event_rules", js.undefined)
      
      inline def setEvent_rulesVarargs(value: Actions*): Self = StObject.set(x, "event_rules", js.Array(value :_*))
      
      inline def setExport(value: Whitelist): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setExternally_connectable(value: Acceptstlschannelid): Self = StObject.set(x, "externally_connectable", value.asInstanceOf[js.Any])
      
      inline def setExternally_connectableUndefined: Self = StObject.set(x, "externally_connectable", js.undefined)
      
      inline def setFile_browser_handlers(value: js.Array[Defaulttitle]): Self = StObject.set(x, "file_browser_handlers", value.asInstanceOf[js.Any])
      
      inline def setFile_browser_handlersUndefined: Self = StObject.set(x, "file_browser_handlers", js.undefined)
      
      inline def setFile_browser_handlersVarargs(value: Defaulttitle*): Self = StObject.set(x, "file_browser_handlers", js.Array(value :_*))
      
      inline def setFile_system_provider_capabilities(value: Configurable): Self = StObject.set(x, "file_system_provider_capabilities", value.asInstanceOf[js.Any])
      
      inline def setFile_system_provider_capabilitiesUndefined: Self = StObject.set(x, "file_system_provider_capabilities", js.undefined)
      
      inline def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
      
      inline def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
      
      inline def setIcons(value: typings.chrome.chrome.runtime.ManifestIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setImport(value: js.Array[Id]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      inline def setImportVarargs(value: Id*): Self = StObject.set(x, "import", js.Array(value :_*))
      
      inline def setIncognito(value: String): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      inline def setInput_components(value: js.Array[Language]): Self = StObject.set(x, "input_components", value.asInstanceOf[js.Any])
      
      inline def setInput_componentsUndefined: Self = StObject.set(x, "input_components", js.undefined)
      
      inline def setInput_componentsVarargs(value: Language*): Self = StObject.set(x, "input_components", js.Array(value :_*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
      
      inline def setMinimum_chrome_version(value: String): Self = StObject.set(x, "minimum_chrome_version", value.asInstanceOf[js.Any])
      
      inline def setMinimum_chrome_versionUndefined: Self = StObject.set(x, "minimum_chrome_version", js.undefined)
      
      inline def setNacl_modules(value: js.Array[Mimetype]): Self = StObject.set(x, "nacl_modules", value.asInstanceOf[js.Any])
      
      inline def setNacl_modulesUndefined: Self = StObject.set(x, "nacl_modules", js.undefined)
      
      inline def setNacl_modulesVarargs(value: Mimetype*): Self = StObject.set(x, "nacl_modules", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOauth2(value: Clientid): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      inline def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
      
      inline def setOffline_enabled(value: Boolean): Self = StObject.set(x, "offline_enabled", value.asInstanceOf[js.Any])
      
      inline def setOffline_enabledUndefined: Self = StObject.set(x, "offline_enabled", js.undefined)
      
      inline def setOmnibox(value: Keyword): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
      
      inline def setOmniboxUndefined: Self = StObject.set(x, "omnibox", js.undefined)
      
      inline def setOptional_permissions(value: js.Array[String]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
      
      inline def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
      
      inline def setOptional_permissionsVarargs(value: String*): Self = StObject.set(x, "optional_permissions", js.Array(value :_*))
      
      inline def setOptions_page(value: String): Self = StObject.set(x, "options_page", value.asInstanceOf[js.Any])
      
      inline def setOptions_pageUndefined: Self = StObject.set(x, "options_page", js.undefined)
      
      inline def setOptions_ui(value: Chromestyle): Self = StObject.set(x, "options_ui", value.asInstanceOf[js.Any])
      
      inline def setOptions_uiUndefined: Self = StObject.set(x, "options_ui", js.undefined)
      
      inline def setPage_action(value: typings.chrome.chrome.runtime.ManifestAction): Self = StObject.set(x, "page_action", value.asInstanceOf[js.Any])
      
      inline def setPage_actionUndefined: Self = StObject.set(x, "page_action", js.undefined)
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      inline def setPlatforms(value: js.Array[Naclarch]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: Naclarch*): Self = StObject.set(x, "platforms", js.Array(value :_*))
      
      inline def setPlugins(value: js.Array[Path]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Path*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setRequirements(value: `3D`): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      inline def setSandbox(value: Contentsecuritypolicy): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
      
      inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
      
      inline def setSignature(value: js.Any): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setSpellcheck(value: Dictionaryformat): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setStorage(value: Managedschema): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setSystem_indicator(value: js.Any): Self = StObject.set(x, "system_indicator", value.asInstanceOf[js.Any])
      
      inline def setSystem_indicatorUndefined: Self = StObject.set(x, "system_indicator", js.undefined)
      
      inline def setTts_engine(value: Voices): Self = StObject.set(x, "tts_engine", value.asInstanceOf[js.Any])
      
      inline def setTts_engineUndefined: Self = StObject.set(x, "tts_engine", js.undefined)
      
      inline def setUpdate_url(value: String): Self = StObject.set(x, "update_url", value.asInstanceOf[js.Any])
      
      inline def setUpdate_urlUndefined: Self = StObject.set(x, "update_url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersion_name(value: String): Self = StObject.set(x, "version_name", value.asInstanceOf[js.Any])
      
      inline def setVersion_nameUndefined: Self = StObject.set(x, "version_name", js.undefined)
      
      inline def setWeb_accessible_resources(value: js.Array[String]): Self = StObject.set(x, "web_accessible_resources", value.asInstanceOf[js.Any])
      
      inline def setWeb_accessible_resourcesUndefined: Self = StObject.set(x, "web_accessible_resources", js.undefined)
      
      inline def setWeb_accessible_resourcesVarargs(value: String*): Self = StObject.set(x, "web_accessible_resources", js.Array(value :_*))
    }
  }
  
  trait ManifestAction extends StObject {
    
    var default_icon: js.UndefOr[typings.chrome.chrome.runtime.ManifestIcons] = js.undefined
    
    var default_popup: js.UndefOr[String] = js.undefined
    
    var default_title: js.UndefOr[String] = js.undefined
  }
  object ManifestAction {
    
    inline def apply(): ManifestAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManifestAction]
    }
    
    extension [Self <: ManifestAction](x: Self) {
      
      inline def setDefault_icon(value: typings.chrome.chrome.runtime.ManifestIcons): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
      
      inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
      
      inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
      
      inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
      
      inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
      
      inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    }
  }
  
  type ManifestIcons = NumberDictionary[String]
  
  trait MessageOptions extends StObject {
    
    /** Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the connection event. */
    var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
      
      inline def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
    }
  }
  
  trait MessageSender extends StObject {
    
    /**
      * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be set when tab is set.
      * @since Chrome 41.
      */
    var frameId: js.UndefOr[Double] = js.undefined
    
    /** The ID of the extension or app that opened the connection, if any. */
    var id: js.UndefOr[String] = js.undefined
    
    /** The name of the native application that opened the connection, if any.
      * @since Chrome 74
      */
    var nativeApplication: js.UndefOr[String] = js.undefined
    
    /**
      * The origin of the page or frame that opened the connection. It can vary from the url property (e.g., about:blank) or can be opaque (e.g., sandboxed iframes). This is useful for identifying if the origin can be trusted if we can't immediately tell from the URL.
      * @since Chrome 80.
      */
    var origin: js.UndefOr[String] = js.undefined
    
    /** The tabs.Tab which opened the connection, if any. This property will only be present when the connection was opened from a tab (including content scripts), and only if the receiver is an extension, not an app. */
    var tab: js.UndefOr[Tab] = js.undefined
    
    /**
      * The TLS channel ID of the page or frame that opened the connection, if requested by the extension or app, and if available.
      * @since Chrome 32.
      */
    var tlsChannelId: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
      * @since Chrome 28.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object MessageSender {
    
    inline def apply(): MessageSender = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageSender]
    }
    
    extension [Self <: MessageSender](x: Self) {
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNativeApplication(value: String): Self = StObject.set(x, "nativeApplication", value.asInstanceOf[js.Any])
      
      inline def setNativeApplicationUndefined: Self = StObject.set(x, "nativeApplication", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      inline def setTlsChannelId(value: String): Self = StObject.set(x, "tlsChannelId", value.asInstanceOf[js.Any])
      
      inline def setTlsChannelIdUndefined: Self = StObject.set(x, "tlsChannelId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait PlatformInfo extends StObject {
    
    /**
      * The machine's processor architecture.
      * One of: "arm", "x86-32", or "x86-64"
      */
    var arch: String
    
    /**
      * The native client architecture. This may be different from arch on some platforms.
      * One of: "arm", "x86-32", or "x86-64"
      */
    var nacl_arch: String
    
    /**
      * The operating system chrome is running on.
      * One of: "mac", "win", "android", "cros", "linux", or "openbsd"
      */
    var os: String
  }
  object PlatformInfo {
    
    inline def apply(arch: String, nacl_arch: String, os: String): PlatformInfo = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformInfo]
    }
    
    extension [Self <: PlatformInfo](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setNacl_arch(value: String): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
  
  trait Port extends StObject {
    
    def disconnect(): Unit
    
    var name: String
    
    /** An object which allows the addition and removal of listeners for a Chrome event. */
    var onDisconnect: typings.chrome.chrome.runtime.PortDisconnectEvent
    
    /** An object which allows the addition and removal of listeners for a Chrome event. */
    var onMessage: typings.chrome.chrome.runtime.PortMessageEvent
    
    def postMessage(message: js.Any): Unit
    
    /**
      * Optional.
      * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
      */
    var sender: js.UndefOr[typings.chrome.chrome.runtime.MessageSender] = js.undefined
  }
  object Port {
    
    inline def apply(
      disconnect: () => Unit,
      name: String,
      onDisconnect: typings.chrome.chrome.runtime.PortDisconnectEvent,
      onMessage: typings.chrome.chrome.runtime.PortMessageEvent,
      postMessage: js.Any => Unit
    ): Port = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
      __obj.asInstanceOf[Port]
    }
    
    extension [Self <: Port](x: Self) {
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDisconnect(value: typings.chrome.chrome.runtime.PortDisconnectEvent): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
      
      inline def setOnMessage(value: typings.chrome.chrome.runtime.PortMessageEvent): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
      
      inline def setPostMessage(value: js.Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
      
      inline def setSender(value: typings.chrome.chrome.runtime.MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    }
  }
  
  type PortDisconnectEvent = Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, Unit]]
  
  type PortMessageEvent = Event[
    js.Function2[/* message */ js.Any, /* port */ typings.chrome.chrome.runtime.Port, Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.naverWhale.naverWhaleStrings.throttled
    - typings.naverWhale.naverWhaleStrings.no_update
    - typings.naverWhale.naverWhaleStrings.update_available
  */
  trait RequestUpdateCheckStatus extends StObject
  object RequestUpdateCheckStatus {
    
    inline def no_update: typings.naverWhale.naverWhaleStrings.no_update = "no_update".asInstanceOf[typings.naverWhale.naverWhaleStrings.no_update]
    
    inline def throttled: typings.naverWhale.naverWhaleStrings.throttled = "throttled".asInstanceOf[typings.naverWhale.naverWhaleStrings.throttled]
    
    inline def update_available: typings.naverWhale.naverWhaleStrings.update_available = "update_available".asInstanceOf[typings.naverWhale.naverWhaleStrings.update_available]
  }
  
  type RuntimeEvent = Event[js.Function0[Unit]]
  
  type RuntimeInstalledEvent = Event[js.Function1[/* details */ typings.chrome.chrome.runtime.InstalledDetails, Unit]]
  
  type RuntimeRestartRequiredEvent = Event[js.Function1[/* reason */ String, Unit]]
  
  type RuntimeUpdateAvailableEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.runtime.UpdateAvailableDetails, Unit]
  ]
  
  trait SearchProvider extends StObject {
    
    var alternate_urls: js.UndefOr[js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var favicon_url: js.UndefOr[String] = js.undefined
    
    var image_url: js.UndefOr[String] = js.undefined
    
    var image_url_post_params: js.UndefOr[String] = js.undefined
    
    var instant_url: js.UndefOr[String] = js.undefined
    
    var instant_url_post_params: js.UndefOr[String] = js.undefined
    
    var is_default: js.UndefOr[Boolean] = js.undefined
    
    var keyword: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var prepopulated_id: js.UndefOr[Double] = js.undefined
    
    var search_url: String
    
    var search_url_post_params: js.UndefOr[String] = js.undefined
    
    var suggest_url: js.UndefOr[String] = js.undefined
    
    var suggest_url_post_params: js.UndefOr[String] = js.undefined
  }
  object SearchProvider {
    
    inline def apply(search_url: String): SearchProvider = {
      val __obj = js.Dynamic.literal(search_url = search_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchProvider]
    }
    
    extension [Self <: SearchProvider](x: Self) {
      
      inline def setAlternate_urls(value: js.Array[String]): Self = StObject.set(x, "alternate_urls", value.asInstanceOf[js.Any])
      
      inline def setAlternate_urlsUndefined: Self = StObject.set(x, "alternate_urls", js.undefined)
      
      inline def setAlternate_urlsVarargs(value: String*): Self = StObject.set(x, "alternate_urls", js.Array(value :_*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFavicon_url(value: String): Self = StObject.set(x, "favicon_url", value.asInstanceOf[js.Any])
      
      inline def setFavicon_urlUndefined: Self = StObject.set(x, "favicon_url", js.undefined)
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
      
      inline def setImage_url_post_params(value: String): Self = StObject.set(x, "image_url_post_params", value.asInstanceOf[js.Any])
      
      inline def setImage_url_post_paramsUndefined: Self = StObject.set(x, "image_url_post_params", js.undefined)
      
      inline def setInstant_url(value: String): Self = StObject.set(x, "instant_url", value.asInstanceOf[js.Any])
      
      inline def setInstant_urlUndefined: Self = StObject.set(x, "instant_url", js.undefined)
      
      inline def setInstant_url_post_params(value: String): Self = StObject.set(x, "instant_url_post_params", value.asInstanceOf[js.Any])
      
      inline def setInstant_url_post_paramsUndefined: Self = StObject.set(x, "instant_url_post_params", js.undefined)
      
      inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
      
      inline def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrepopulated_id(value: Double): Self = StObject.set(x, "prepopulated_id", value.asInstanceOf[js.Any])
      
      inline def setPrepopulated_idUndefined: Self = StObject.set(x, "prepopulated_id", js.undefined)
      
      inline def setSearch_url(value: String): Self = StObject.set(x, "search_url", value.asInstanceOf[js.Any])
      
      inline def setSearch_url_post_params(value: String): Self = StObject.set(x, "search_url_post_params", value.asInstanceOf[js.Any])
      
      inline def setSearch_url_post_paramsUndefined: Self = StObject.set(x, "search_url_post_params", js.undefined)
      
      inline def setSuggest_url(value: String): Self = StObject.set(x, "suggest_url", value.asInstanceOf[js.Any])
      
      inline def setSuggest_urlUndefined: Self = StObject.set(x, "suggest_url", js.undefined)
      
      inline def setSuggest_url_post_params(value: String): Self = StObject.set(x, "suggest_url_post_params", value.asInstanceOf[js.Any])
      
      inline def setSuggest_url_post_paramsUndefined: Self = StObject.set(x, "suggest_url_post_params", js.undefined)
    }
  }
  
  trait UpdateAvailableDetails extends StObject {
    
    /** The version number of the available update. */
    var version: String
  }
  object UpdateAvailableDetails {
    
    inline def apply(version: String): UpdateAvailableDetails = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAvailableDetails]
    }
    
    extension [Self <: UpdateAvailableDetails](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateCheckDetails extends StObject {
    
    /** The version of the available update. */
    var version: String
  }
  object UpdateCheckDetails {
    
    inline def apply(version: String): UpdateCheckDetails = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCheckDetails]
    }
    
    extension [Self <: UpdateCheckDetails](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
