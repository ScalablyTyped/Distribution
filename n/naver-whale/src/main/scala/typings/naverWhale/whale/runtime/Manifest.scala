package typings.naverWhale.whale.runtime

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest
  extends /* key */ StringDictionary[js.Any] {
  
  // Optional
  var author: js.UndefOr[js.Any] = js.native
  
  var automation: js.UndefOr[js.Any] = js.native
  
  var background: js.UndefOr[Page] = js.native
  
  var background_page: js.UndefOr[String] = js.native
  
  // Pick one (or none)
  var browser_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.native
  
  var chrome_settings_overrides: js.UndefOr[Homepage] = js.native
  
  var chrome_ui_overrides: js.UndefOr[Bookmarksui] = js.native
  
  var chrome_url_overrides: js.UndefOr[Bookmarks] = js.native
  
  var commands: js.UndefOr[StringDictionary[Description]] = js.native
  
  var content_capabilities: js.UndefOr[Matches] = js.native
  
  var content_scripts: js.UndefOr[js.Array[Allframes]] = js.native
  
  var content_security_policy: js.UndefOr[String] = js.native
  
  var converted_from_user_script: js.UndefOr[Boolean] = js.native
  
  var copresence: js.UndefOr[js.Any] = js.native
  
  var current_locale: js.UndefOr[String] = js.native
  
  // Recommended
  var default_locale: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var devtools_page: js.UndefOr[String] = js.native
  
  var event_rules: js.UndefOr[js.Array[Actions]] = js.native
  
  var export: js.UndefOr[Whitelist] = js.native
  
  var externally_connectable: js.UndefOr[Acceptstlschannelid] = js.native
  
  var file_browser_handlers: js.UndefOr[js.Array[Defaulttitle]] = js.native
  
  var file_system_provider_capabilities: js.UndefOr[Configurable] = js.native
  
  var homepage_url: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[typings.chrome.chrome.runtime.ManifestIcons] = js.native
  
  var `import`: js.UndefOr[js.Array[Id]] = js.native
  
  var incognito: js.UndefOr[String] = js.native
  
  var input_components: js.UndefOr[js.Array[Language]] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  // Required
  var manifest_version: Double = js.native
  
  var minimum_chrome_version: js.UndefOr[String] = js.native
  
  var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.native
  
  var name: String = js.native
  
  var oauth2: js.UndefOr[Clientid] = js.native
  
  var offline_enabled: js.UndefOr[Boolean] = js.native
  
  var omnibox: js.UndefOr[Keyword] = js.native
  
  var optional_permissions: js.UndefOr[js.Array[String]] = js.native
  
  var options_page: js.UndefOr[String] = js.native
  
  var options_ui: js.UndefOr[Chromestyle] = js.native
  
  var page_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.native
  
  var permissions: js.UndefOr[js.Array[String]] = js.native
  
  var platforms: js.UndefOr[js.Array[Naclarch]] = js.native
  
  var plugins: js.UndefOr[js.Array[Path]] = js.native
  
  var requirements: js.UndefOr[`3D`] = js.native
  
  var sandbox: js.UndefOr[Contentsecuritypolicy] = js.native
  
  var short_name: js.UndefOr[String] = js.native
  
  var signature: js.UndefOr[js.Any] = js.native
  
  var spellcheck: js.UndefOr[Dictionaryformat] = js.native
  
  var storage: js.UndefOr[Managedschema] = js.native
  
  var system_indicator: js.UndefOr[js.Any] = js.native
  
  var tts_engine: js.UndefOr[Voices] = js.native
  
  var update_url: js.UndefOr[String] = js.native
  
  var version: String = js.native
  
  var version_name: js.UndefOr[String] = js.native
  
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.native
}
object Manifest {
  
  @scala.inline
  def apply(manifest_version: Double, name: String, version: String): Manifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    
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
    def setManifest_version(value: Double): Self = this.set("manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: js.Any): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setAutomation(value: js.Any): Self = this.set("automation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomation: Self = this.set("automation", js.undefined)
    
    @scala.inline
    def setBackground(value: Page): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackground_page(value: String): Self = this.set("background_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground_page: Self = this.set("background_page", js.undefined)
    
    @scala.inline
    def setBrowser_action(value: typings.chrome.chrome.runtime.ManifestAction): Self = this.set("browser_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_action: Self = this.set("browser_action", js.undefined)
    
    @scala.inline
    def setChrome_settings_overrides(value: Homepage): Self = this.set("chrome_settings_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome_settings_overrides: Self = this.set("chrome_settings_overrides", js.undefined)
    
    @scala.inline
    def setChrome_ui_overrides(value: Bookmarksui): Self = this.set("chrome_ui_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome_ui_overrides: Self = this.set("chrome_ui_overrides", js.undefined)
    
    @scala.inline
    def setChrome_url_overrides(value: Bookmarks): Self = this.set("chrome_url_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome_url_overrides: Self = this.set("chrome_url_overrides", js.undefined)
    
    @scala.inline
    def setCommands(value: StringDictionary[Description]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setContent_capabilities(value: Matches): Self = this.set("content_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_capabilities: Self = this.set("content_capabilities", js.undefined)
    
    @scala.inline
    def setContent_scriptsVarargs(value: Allframes*): Self = this.set("content_scripts", js.Array(value :_*))
    
    @scala.inline
    def setContent_scripts(value: js.Array[Allframes]): Self = this.set("content_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_scripts: Self = this.set("content_scripts", js.undefined)
    
    @scala.inline
    def setContent_security_policy(value: String): Self = this.set("content_security_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_security_policy: Self = this.set("content_security_policy", js.undefined)
    
    @scala.inline
    def setConverted_from_user_script(value: Boolean): Self = this.set("converted_from_user_script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConverted_from_user_script: Self = this.set("converted_from_user_script", js.undefined)
    
    @scala.inline
    def setCopresence(value: js.Any): Self = this.set("copresence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopresence: Self = this.set("copresence", js.undefined)
    
    @scala.inline
    def setCurrent_locale(value: String): Self = this.set("current_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent_locale: Self = this.set("current_locale", js.undefined)
    
    @scala.inline
    def setDefault_locale(value: String): Self = this.set("default_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_locale: Self = this.set("default_locale", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDevtools_page(value: String): Self = this.set("devtools_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtools_page: Self = this.set("devtools_page", js.undefined)
    
    @scala.inline
    def setEvent_rulesVarargs(value: Actions*): Self = this.set("event_rules", js.Array(value :_*))
    
    @scala.inline
    def setEvent_rules(value: js.Array[Actions]): Self = this.set("event_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_rules: Self = this.set("event_rules", js.undefined)
    
    @scala.inline
    def setExport(value: Whitelist): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    
    @scala.inline
    def setExternally_connectable(value: Acceptstlschannelid): Self = this.set("externally_connectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternally_connectable: Self = this.set("externally_connectable", js.undefined)
    
    @scala.inline
    def setFile_browser_handlersVarargs(value: Defaulttitle*): Self = this.set("file_browser_handlers", js.Array(value :_*))
    
    @scala.inline
    def setFile_browser_handlers(value: js.Array[Defaulttitle]): Self = this.set("file_browser_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_browser_handlers: Self = this.set("file_browser_handlers", js.undefined)
    
    @scala.inline
    def setFile_system_provider_capabilities(value: Configurable): Self = this.set("file_system_provider_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_system_provider_capabilities: Self = this.set("file_system_provider_capabilities", js.undefined)
    
    @scala.inline
    def setHomepage_url(value: String): Self = this.set("homepage_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage_url: Self = this.set("homepage_url", js.undefined)
    
    @scala.inline
    def setIcons(value: typings.chrome.chrome.runtime.ManifestIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setImportVarargs(value: Id*): Self = this.set("import", js.Array(value :_*))
    
    @scala.inline
    def setImport(value: js.Array[Id]): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
    
    @scala.inline
    def setIncognito(value: String): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    
    @scala.inline
    def setInput_componentsVarargs(value: Language*): Self = this.set("input_components", js.Array(value :_*))
    
    @scala.inline
    def setInput_components(value: js.Array[Language]): Self = this.set("input_components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_components: Self = this.set("input_components", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMinimum_chrome_version(value: String): Self = this.set("minimum_chrome_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum_chrome_version: Self = this.set("minimum_chrome_version", js.undefined)
    
    @scala.inline
    def setNacl_modulesVarargs(value: Mimetype*): Self = this.set("nacl_modules", js.Array(value :_*))
    
    @scala.inline
    def setNacl_modules(value: js.Array[Mimetype]): Self = this.set("nacl_modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNacl_modules: Self = this.set("nacl_modules", js.undefined)
    
    @scala.inline
    def setOauth2(value: Clientid): Self = this.set("oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2: Self = this.set("oauth2", js.undefined)
    
    @scala.inline
    def setOffline_enabled(value: Boolean): Self = this.set("offline_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffline_enabled: Self = this.set("offline_enabled", js.undefined)
    
    @scala.inline
    def setOmnibox(value: Keyword): Self = this.set("omnibox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmnibox: Self = this.set("omnibox", js.undefined)
    
    @scala.inline
    def setOptional_permissionsVarargs(value: String*): Self = this.set("optional_permissions", js.Array(value :_*))
    
    @scala.inline
    def setOptional_permissions(value: js.Array[String]): Self = this.set("optional_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional_permissions: Self = this.set("optional_permissions", js.undefined)
    
    @scala.inline
    def setOptions_page(value: String): Self = this.set("options_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions_page: Self = this.set("options_page", js.undefined)
    
    @scala.inline
    def setOptions_ui(value: Chromestyle): Self = this.set("options_ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions_ui: Self = this.set("options_ui", js.undefined)
    
    @scala.inline
    def setPage_action(value: typings.chrome.chrome.runtime.ManifestAction): Self = this.set("page_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_action: Self = this.set("page_action", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: Naclarch*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[Naclarch]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Path*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Path]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRequirements(value: `3D`): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    
    @scala.inline
    def setSandbox(value: Contentsecuritypolicy): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_name: Self = this.set("short_name", js.undefined)
    
    @scala.inline
    def setSignature(value: js.Any): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: Dictionaryformat): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
    @scala.inline
    def setStorage(value: Managedschema): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    
    @scala.inline
    def setSystem_indicator(value: js.Any): Self = this.set("system_indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem_indicator: Self = this.set("system_indicator", js.undefined)
    
    @scala.inline
    def setTts_engine(value: Voices): Self = this.set("tts_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTts_engine: Self = this.set("tts_engine", js.undefined)
    
    @scala.inline
    def setUpdate_url(value: String): Self = this.set("update_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate_url: Self = this.set("update_url", js.undefined)
    
    @scala.inline
    def setVersion_name(value: String): Self = this.set("version_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion_name: Self = this.set("version_name", js.undefined)
    
    @scala.inline
    def setWeb_accessible_resourcesVarargs(value: String*): Self = this.set("web_accessible_resources", js.Array(value :_*))
    
    @scala.inline
    def setWeb_accessible_resources(value: js.Array[String]): Self = this.set("web_accessible_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb_accessible_resources: Self = this.set("web_accessible_resources", js.undefined)
  }
}
