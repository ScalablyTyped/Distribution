package typings.naverWhale.whale.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.Anon3D
import typings.chrome.AnonAcceptstlschannelid
import typings.chrome.AnonActions
import typings.chrome.AnonAllframes
import typings.chrome.AnonBookmarks
import typings.chrome.AnonBookmarksui
import typings.chrome.AnonChromestyle
import typings.chrome.AnonClientid
import typings.chrome.AnonConfigurable
import typings.chrome.AnonContentsecuritypolicy
import typings.chrome.AnonDefaulttitle
import typings.chrome.AnonDescription
import typings.chrome.AnonDescriptionId
import typings.chrome.AnonDictionaryformat
import typings.chrome.AnonHomepage
import typings.chrome.AnonId
import typings.chrome.AnonKeyword
import typings.chrome.AnonManagedschema
import typings.chrome.AnonMatches
import typings.chrome.AnonMimetype
import typings.chrome.AnonNaclarch
import typings.chrome.AnonPage
import typings.chrome.AnonPath
import typings.chrome.AnonVoices
import typings.chrome.AnonWhitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest
  extends /* key */ StringDictionary[js.Any] {
  // Optional
  var author: js.UndefOr[js.Any] = js.undefined
  var automation: js.UndefOr[js.Any] = js.undefined
  var background: js.UndefOr[AnonPage] = js.undefined
  var background_page: js.UndefOr[String] = js.undefined
  // Pick one (or none)
  var browser_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.undefined
  var chrome_settings_overrides: js.UndefOr[AnonHomepage] = js.undefined
  var chrome_ui_overrides: js.UndefOr[AnonBookmarksui] = js.undefined
  var chrome_url_overrides: js.UndefOr[AnonBookmarks] = js.undefined
  var commands: js.UndefOr[StringDictionary[AnonDescription]] = js.undefined
  var content_capabilities: js.UndefOr[AnonMatches] = js.undefined
  var content_scripts: js.UndefOr[js.Array[AnonAllframes]] = js.undefined
  var content_security_policy: js.UndefOr[String] = js.undefined
  var converted_from_user_script: js.UndefOr[Boolean] = js.undefined
  var copresence: js.UndefOr[js.Any] = js.undefined
  var current_locale: js.UndefOr[String] = js.undefined
  // Recommended
  var default_locale: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devtools_page: js.UndefOr[String] = js.undefined
  var event_rules: js.UndefOr[js.Array[AnonActions]] = js.undefined
  var export: js.UndefOr[AnonWhitelist] = js.undefined
  var externally_connectable: js.UndefOr[AnonAcceptstlschannelid] = js.undefined
  var file_browser_handlers: js.UndefOr[js.Array[AnonDefaulttitle]] = js.undefined
  var file_system_provider_capabilities: js.UndefOr[AnonConfigurable] = js.undefined
  var homepage_url: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[typings.chrome.chrome.runtime.ManifestIcons] = js.undefined
  var `import`: js.UndefOr[js.Array[AnonId]] = js.undefined
  var incognito: js.UndefOr[String] = js.undefined
  var input_components: js.UndefOr[js.Array[AnonDescriptionId]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  // Required
  var manifest_version: Double
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  var nacl_modules: js.UndefOr[js.Array[AnonMimetype]] = js.undefined
  var name: String
  var oauth2: js.UndefOr[AnonClientid] = js.undefined
  var offline_enabled: js.UndefOr[Boolean] = js.undefined
  var omnibox: js.UndefOr[AnonKeyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[String]] = js.undefined
  var options_page: js.UndefOr[String] = js.undefined
  var options_ui: js.UndefOr[AnonChromestyle] = js.undefined
  var page_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.undefined
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  var platforms: js.UndefOr[js.Array[AnonNaclarch]] = js.undefined
  var plugins: js.UndefOr[js.Array[AnonPath]] = js.undefined
  var requirements: js.UndefOr[Anon3D] = js.undefined
  var sandbox: js.UndefOr[AnonContentsecuritypolicy] = js.undefined
  var short_name: js.UndefOr[String] = js.undefined
  var signature: js.UndefOr[js.Any] = js.undefined
  var spellcheck: js.UndefOr[AnonDictionaryformat] = js.undefined
  var storage: js.UndefOr[AnonManagedschema] = js.undefined
  var system_indicator: js.UndefOr[js.Any] = js.undefined
  var tts_engine: js.UndefOr[AnonVoices] = js.undefined
  var update_url: js.UndefOr[String] = js.undefined
  var version: String
  var version_name: js.UndefOr[String] = js.undefined
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.undefined
}

object Manifest {
  @scala.inline
  def apply(
    manifest_version: Double,
    name: String,
    version: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    author: js.Any = null,
    automation: js.Any = null,
    background: AnonPage = null,
    background_page: String = null,
    browser_action: typings.chrome.chrome.runtime.ManifestAction = null,
    chrome_settings_overrides: AnonHomepage = null,
    chrome_ui_overrides: AnonBookmarksui = null,
    chrome_url_overrides: AnonBookmarks = null,
    commands: StringDictionary[AnonDescription] = null,
    content_capabilities: AnonMatches = null,
    content_scripts: js.Array[AnonAllframes] = null,
    content_security_policy: String = null,
    converted_from_user_script: js.UndefOr[Boolean] = js.undefined,
    copresence: js.Any = null,
    current_locale: String = null,
    default_locale: String = null,
    description: String = null,
    devtools_page: String = null,
    event_rules: js.Array[AnonActions] = null,
    export: AnonWhitelist = null,
    externally_connectable: AnonAcceptstlschannelid = null,
    file_browser_handlers: js.Array[AnonDefaulttitle] = null,
    file_system_provider_capabilities: AnonConfigurable = null,
    homepage_url: String = null,
    icons: typings.chrome.chrome.runtime.ManifestIcons = null,
    `import`: js.Array[AnonId] = null,
    incognito: String = null,
    input_components: js.Array[AnonDescriptionId] = null,
    key: String = null,
    minimum_chrome_version: String = null,
    nacl_modules: js.Array[AnonMimetype] = null,
    oauth2: AnonClientid = null,
    offline_enabled: js.UndefOr[Boolean] = js.undefined,
    omnibox: AnonKeyword = null,
    optional_permissions: js.Array[String] = null,
    options_page: String = null,
    options_ui: AnonChromestyle = null,
    page_action: typings.chrome.chrome.runtime.ManifestAction = null,
    permissions: js.Array[String] = null,
    platforms: js.Array[AnonNaclarch] = null,
    plugins: js.Array[AnonPath] = null,
    requirements: Anon3D = null,
    sandbox: AnonContentsecuritypolicy = null,
    short_name: String = null,
    signature: js.Any = null,
    spellcheck: AnonDictionaryformat = null,
    storage: AnonManagedschema = null,
    system_indicator: js.Any = null,
    tts_engine: AnonVoices = null,
    update_url: String = null,
    version_name: String = null,
    web_accessible_resources: js.Array[String] = null
  ): Manifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (automation != null) __obj.updateDynamic("automation")(automation.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (background_page != null) __obj.updateDynamic("background_page")(background_page.asInstanceOf[js.Any])
    if (browser_action != null) __obj.updateDynamic("browser_action")(browser_action.asInstanceOf[js.Any])
    if (chrome_settings_overrides != null) __obj.updateDynamic("chrome_settings_overrides")(chrome_settings_overrides.asInstanceOf[js.Any])
    if (chrome_ui_overrides != null) __obj.updateDynamic("chrome_ui_overrides")(chrome_ui_overrides.asInstanceOf[js.Any])
    if (chrome_url_overrides != null) __obj.updateDynamic("chrome_url_overrides")(chrome_url_overrides.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (content_capabilities != null) __obj.updateDynamic("content_capabilities")(content_capabilities.asInstanceOf[js.Any])
    if (content_scripts != null) __obj.updateDynamic("content_scripts")(content_scripts.asInstanceOf[js.Any])
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy.asInstanceOf[js.Any])
    if (!js.isUndefined(converted_from_user_script)) __obj.updateDynamic("converted_from_user_script")(converted_from_user_script.asInstanceOf[js.Any])
    if (copresence != null) __obj.updateDynamic("copresence")(copresence.asInstanceOf[js.Any])
    if (current_locale != null) __obj.updateDynamic("current_locale")(current_locale.asInstanceOf[js.Any])
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devtools_page != null) __obj.updateDynamic("devtools_page")(devtools_page.asInstanceOf[js.Any])
    if (event_rules != null) __obj.updateDynamic("event_rules")(event_rules.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (externally_connectable != null) __obj.updateDynamic("externally_connectable")(externally_connectable.asInstanceOf[js.Any])
    if (file_browser_handlers != null) __obj.updateDynamic("file_browser_handlers")(file_browser_handlers.asInstanceOf[js.Any])
    if (file_system_provider_capabilities != null) __obj.updateDynamic("file_system_provider_capabilities")(file_system_provider_capabilities.asInstanceOf[js.Any])
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (incognito != null) __obj.updateDynamic("incognito")(incognito.asInstanceOf[js.Any])
    if (input_components != null) __obj.updateDynamic("input_components")(input_components.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version.asInstanceOf[js.Any])
    if (nacl_modules != null) __obj.updateDynamic("nacl_modules")(nacl_modules.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    if (!js.isUndefined(offline_enabled)) __obj.updateDynamic("offline_enabled")(offline_enabled.asInstanceOf[js.Any])
    if (omnibox != null) __obj.updateDynamic("omnibox")(omnibox.asInstanceOf[js.Any])
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions.asInstanceOf[js.Any])
    if (options_page != null) __obj.updateDynamic("options_page")(options_page.asInstanceOf[js.Any])
    if (options_ui != null) __obj.updateDynamic("options_ui")(options_ui.asInstanceOf[js.Any])
    if (page_action != null) __obj.updateDynamic("page_action")(page_action.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (system_indicator != null) __obj.updateDynamic("system_indicator")(system_indicator.asInstanceOf[js.Any])
    if (tts_engine != null) __obj.updateDynamic("tts_engine")(tts_engine.asInstanceOf[js.Any])
    if (update_url != null) __obj.updateDynamic("update_url")(update_url.asInstanceOf[js.Any])
    if (version_name != null) __obj.updateDynamic("version_name")(version_name.asInstanceOf[js.Any])
    if (web_accessible_resources != null) __obj.updateDynamic("web_accessible_resources")(web_accessible_resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

