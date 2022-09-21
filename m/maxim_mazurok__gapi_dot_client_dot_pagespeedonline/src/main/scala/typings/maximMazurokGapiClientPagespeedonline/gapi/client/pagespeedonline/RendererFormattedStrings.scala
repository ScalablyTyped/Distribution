package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererFormattedStrings extends StObject {
  
  /** The tooltip text on an expandable chevron icon. */
  var auditGroupExpandTooltip: js.UndefOr[String] = js.undefined
  
  /** Text link pointing to the Lighthouse scoring calculator. This link immediately follows a sentence stating the performance score is calculated from the perf metrics. */
  var calculatorLink: js.UndefOr[String] = js.undefined
  
  /** The label for the initial request in a critical request chain. */
  var crcInitialNavigation: js.UndefOr[String] = js.undefined
  
  /** The label for values shown in the summary of critical request chains. */
  var crcLongestDurationLabel: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that copies the Lighthouse JSON object to the system clipboard. */
  var dropdownCopyJSON: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that toggles the themeing of the report between Light(default) and Dark themes. */
  var dropdownDarkTheme: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that opens a full Lighthouse report in a print dialog. */
  var dropdownPrintExpanded: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that opens a small, summary report in a print dialog. */
  var dropdownPrintSummary: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that saves the current report as a new GitHub Gist. */
  var dropdownSaveGist: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that saves the Lighthouse report HTML locally to the system as a '.html' file. */
  var dropdownSaveHTML: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that saves the Lighthouse JSON object to the local system as a '.json' file. */
  var dropdownSaveJSON: js.UndefOr[String] = js.undefined
  
  /** Option in a dropdown menu that opens the current report in the Lighthouse Viewer Application. */
  var dropdownViewer: js.UndefOr[String] = js.undefined
  
  /** The label shown next to an audit or metric that has had an error. */
  var errorLabel: js.UndefOr[String] = js.undefined
  
  /** The error string shown next to an erroring audit. */
  var errorMissingAuditInfo: js.UndefOr[String] = js.undefined
  
  /** Label for button to create an issue against the Lighthouse GitHub project. */
  var footerIssue: js.UndefOr[String] = js.undefined
  
  /** The title of the lab data performance category. */
  var labDataTitle: js.UndefOr[String] = js.undefined
  
  /** The disclaimer shown under performance explaining that the network can vary. */
  var lsPerformanceCategoryDescription: js.UndefOr[String] = js.undefined
  
  /** The heading shown above a list of audits that were not computerd in the run. */
  var manualAuditsGroupTitle: js.UndefOr[String] = js.undefined
  
  /** The heading shown above a list of audits that do not apply to a page. */
  var notApplicableAuditsGroupTitle: js.UndefOr[String] = js.undefined
  
  /** The heading for the estimated page load savings opportunity of an audit. */
  var opportunityResourceColumnLabel: js.UndefOr[String] = js.undefined
  
  /** The heading for the estimated page load savings of opportunity audits. */
  var opportunitySavingsColumnLabel: js.UndefOr[String] = js.undefined
  
  /** The heading that is shown above a list of audits that are passing. */
  var passedAuditsGroupTitle: js.UndefOr[String] = js.undefined
  
  /** Descriptive explanation for emulation setting when emulating a generic desktop form factor, as opposed to a mobile-device like form factor. */
  var runtimeDesktopEmulation: js.UndefOr[String] = js.undefined
  
  /** Descriptive explanation for emulation setting when emulating a Nexus 5X mobile device. */
  var runtimeMobileEmulation: js.UndefOr[String] = js.undefined
  
  /** Descriptive explanation for emulation setting when no device emulation is set. */
  var runtimeNoEmulation: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows the version of the Axe library used */
  var runtimeSettingsAxeVersion: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows the estimated CPU power of the machine running Lighthouse. Example row values: 532, 1492, 783. */
  var runtimeSettingsBenchmark: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that describes the CPU throttling conditions that were used during a Lighthouse run, if any. */
  var runtimeSettingsCPUThrottling: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows in what tool Lighthouse is being run (e.g. The lighthouse CLI, Chrome DevTools, Lightrider, WebPageTest, etc). */
  var runtimeSettingsChannel: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that describes the kind of device that was emulated for the Lighthouse run. Example values for row elements: 'No Emulation', 'Emulated Desktop', etc. */
  var runtimeSettingsDevice: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows the time at which a Lighthouse run was conducted; formatted as a timestamp, e.g. Jan 1, 1970 12:00 AM UTC. */
  var runtimeSettingsFetchTime: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that describes the network throttling conditions that were used during a Lighthouse run, if any. */
  var runtimeSettingsNetworkThrottling: js.UndefOr[String] = js.undefined
  
  /** Title of the Runtime settings table in a Lighthouse report. Runtime settings are the environment configurations that a specific report used at auditing time. */
  var runtimeSettingsTitle: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows the User Agent that was detected on the Host machine that ran Lighthouse. */
  var runtimeSettingsUA: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows the User Agent that was used to send out all network requests during the Lighthouse run. */
  var runtimeSettingsUANetwork: js.UndefOr[String] = js.undefined
  
  /** Label for a row in a table that shows the URL that was audited during a Lighthouse run. */
  var runtimeSettingsUrl: js.UndefOr[String] = js.undefined
  
  /** Descriptive explanation for a runtime setting that is set to an unknown value. */
  var runtimeUnknown: js.UndefOr[String] = js.undefined
  
  /** The label that explains the score gauges scale (0-49, 50-89, 90-100). */
  var scorescaleLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label preceding a radio control for filtering the list of audits. The radio choices are various performance metrics (FCP, LCP, TBT), and if chosen, the audits in the report are
    * hidden if they are not relevant to the selected metric.
    */
  var showRelevantAudits: js.UndefOr[String] = js.undefined
  
  /** The label for the button to show only a few lines of a snippet */
  var snippetCollapseButtonLabel: js.UndefOr[String] = js.undefined
  
  /** The label for the button to show all lines of a snippet */
  var snippetExpandButtonLabel: js.UndefOr[String] = js.undefined
  
  /** This label is for a filter checkbox above a table of items */
  var thirdPartyResourcesLabel: js.UndefOr[String] = js.undefined
  
  /** Descriptive explanation for environment throttling that was provided by the runtime environment instead of provided by Lighthouse throttling. */
  var throttlingProvided: js.UndefOr[String] = js.undefined
  
  /** The label shown preceding important warnings that may have invalidated an entire report. */
  var toplevelWarningsMessage: js.UndefOr[String] = js.undefined
  
  /** The disclaimer shown below a performance metric value. */
  var varianceDisclaimer: js.UndefOr[String] = js.undefined
  
  /** Label for a button that opens the Treemap App */
  var viewTreemapLabel: js.UndefOr[String] = js.undefined
  
  /** The heading that is shown above a list of audits that have warnings */
  var warningAuditsGroupTitle: js.UndefOr[String] = js.undefined
  
  /** The label shown above a bulleted list of warnings. */
  var warningHeader: js.UndefOr[String] = js.undefined
}
object RendererFormattedStrings {
  
  inline def apply(): RendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererFormattedStrings]
  }
  
  extension [Self <: RendererFormattedStrings](x: Self) {
    
    inline def setAuditGroupExpandTooltip(value: String): Self = StObject.set(x, "auditGroupExpandTooltip", value.asInstanceOf[js.Any])
    
    inline def setAuditGroupExpandTooltipUndefined: Self = StObject.set(x, "auditGroupExpandTooltip", js.undefined)
    
    inline def setCalculatorLink(value: String): Self = StObject.set(x, "calculatorLink", value.asInstanceOf[js.Any])
    
    inline def setCalculatorLinkUndefined: Self = StObject.set(x, "calculatorLink", js.undefined)
    
    inline def setCrcInitialNavigation(value: String): Self = StObject.set(x, "crcInitialNavigation", value.asInstanceOf[js.Any])
    
    inline def setCrcInitialNavigationUndefined: Self = StObject.set(x, "crcInitialNavigation", js.undefined)
    
    inline def setCrcLongestDurationLabel(value: String): Self = StObject.set(x, "crcLongestDurationLabel", value.asInstanceOf[js.Any])
    
    inline def setCrcLongestDurationLabelUndefined: Self = StObject.set(x, "crcLongestDurationLabel", js.undefined)
    
    inline def setDropdownCopyJSON(value: String): Self = StObject.set(x, "dropdownCopyJSON", value.asInstanceOf[js.Any])
    
    inline def setDropdownCopyJSONUndefined: Self = StObject.set(x, "dropdownCopyJSON", js.undefined)
    
    inline def setDropdownDarkTheme(value: String): Self = StObject.set(x, "dropdownDarkTheme", value.asInstanceOf[js.Any])
    
    inline def setDropdownDarkThemeUndefined: Self = StObject.set(x, "dropdownDarkTheme", js.undefined)
    
    inline def setDropdownPrintExpanded(value: String): Self = StObject.set(x, "dropdownPrintExpanded", value.asInstanceOf[js.Any])
    
    inline def setDropdownPrintExpandedUndefined: Self = StObject.set(x, "dropdownPrintExpanded", js.undefined)
    
    inline def setDropdownPrintSummary(value: String): Self = StObject.set(x, "dropdownPrintSummary", value.asInstanceOf[js.Any])
    
    inline def setDropdownPrintSummaryUndefined: Self = StObject.set(x, "dropdownPrintSummary", js.undefined)
    
    inline def setDropdownSaveGist(value: String): Self = StObject.set(x, "dropdownSaveGist", value.asInstanceOf[js.Any])
    
    inline def setDropdownSaveGistUndefined: Self = StObject.set(x, "dropdownSaveGist", js.undefined)
    
    inline def setDropdownSaveHTML(value: String): Self = StObject.set(x, "dropdownSaveHTML", value.asInstanceOf[js.Any])
    
    inline def setDropdownSaveHTMLUndefined: Self = StObject.set(x, "dropdownSaveHTML", js.undefined)
    
    inline def setDropdownSaveJSON(value: String): Self = StObject.set(x, "dropdownSaveJSON", value.asInstanceOf[js.Any])
    
    inline def setDropdownSaveJSONUndefined: Self = StObject.set(x, "dropdownSaveJSON", js.undefined)
    
    inline def setDropdownViewer(value: String): Self = StObject.set(x, "dropdownViewer", value.asInstanceOf[js.Any])
    
    inline def setDropdownViewerUndefined: Self = StObject.set(x, "dropdownViewer", js.undefined)
    
    inline def setErrorLabel(value: String): Self = StObject.set(x, "errorLabel", value.asInstanceOf[js.Any])
    
    inline def setErrorLabelUndefined: Self = StObject.set(x, "errorLabel", js.undefined)
    
    inline def setErrorMissingAuditInfo(value: String): Self = StObject.set(x, "errorMissingAuditInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorMissingAuditInfoUndefined: Self = StObject.set(x, "errorMissingAuditInfo", js.undefined)
    
    inline def setFooterIssue(value: String): Self = StObject.set(x, "footerIssue", value.asInstanceOf[js.Any])
    
    inline def setFooterIssueUndefined: Self = StObject.set(x, "footerIssue", js.undefined)
    
    inline def setLabDataTitle(value: String): Self = StObject.set(x, "labDataTitle", value.asInstanceOf[js.Any])
    
    inline def setLabDataTitleUndefined: Self = StObject.set(x, "labDataTitle", js.undefined)
    
    inline def setLsPerformanceCategoryDescription(value: String): Self = StObject.set(x, "lsPerformanceCategoryDescription", value.asInstanceOf[js.Any])
    
    inline def setLsPerformanceCategoryDescriptionUndefined: Self = StObject.set(x, "lsPerformanceCategoryDescription", js.undefined)
    
    inline def setManualAuditsGroupTitle(value: String): Self = StObject.set(x, "manualAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    inline def setManualAuditsGroupTitleUndefined: Self = StObject.set(x, "manualAuditsGroupTitle", js.undefined)
    
    inline def setNotApplicableAuditsGroupTitle(value: String): Self = StObject.set(x, "notApplicableAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableAuditsGroupTitleUndefined: Self = StObject.set(x, "notApplicableAuditsGroupTitle", js.undefined)
    
    inline def setOpportunityResourceColumnLabel(value: String): Self = StObject.set(x, "opportunityResourceColumnLabel", value.asInstanceOf[js.Any])
    
    inline def setOpportunityResourceColumnLabelUndefined: Self = StObject.set(x, "opportunityResourceColumnLabel", js.undefined)
    
    inline def setOpportunitySavingsColumnLabel(value: String): Self = StObject.set(x, "opportunitySavingsColumnLabel", value.asInstanceOf[js.Any])
    
    inline def setOpportunitySavingsColumnLabelUndefined: Self = StObject.set(x, "opportunitySavingsColumnLabel", js.undefined)
    
    inline def setPassedAuditsGroupTitle(value: String): Self = StObject.set(x, "passedAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    inline def setPassedAuditsGroupTitleUndefined: Self = StObject.set(x, "passedAuditsGroupTitle", js.undefined)
    
    inline def setRuntimeDesktopEmulation(value: String): Self = StObject.set(x, "runtimeDesktopEmulation", value.asInstanceOf[js.Any])
    
    inline def setRuntimeDesktopEmulationUndefined: Self = StObject.set(x, "runtimeDesktopEmulation", js.undefined)
    
    inline def setRuntimeMobileEmulation(value: String): Self = StObject.set(x, "runtimeMobileEmulation", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMobileEmulationUndefined: Self = StObject.set(x, "runtimeMobileEmulation", js.undefined)
    
    inline def setRuntimeNoEmulation(value: String): Self = StObject.set(x, "runtimeNoEmulation", value.asInstanceOf[js.Any])
    
    inline def setRuntimeNoEmulationUndefined: Self = StObject.set(x, "runtimeNoEmulation", js.undefined)
    
    inline def setRuntimeSettingsAxeVersion(value: String): Self = StObject.set(x, "runtimeSettingsAxeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsAxeVersionUndefined: Self = StObject.set(x, "runtimeSettingsAxeVersion", js.undefined)
    
    inline def setRuntimeSettingsBenchmark(value: String): Self = StObject.set(x, "runtimeSettingsBenchmark", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsBenchmarkUndefined: Self = StObject.set(x, "runtimeSettingsBenchmark", js.undefined)
    
    inline def setRuntimeSettingsCPUThrottling(value: String): Self = StObject.set(x, "runtimeSettingsCPUThrottling", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsCPUThrottlingUndefined: Self = StObject.set(x, "runtimeSettingsCPUThrottling", js.undefined)
    
    inline def setRuntimeSettingsChannel(value: String): Self = StObject.set(x, "runtimeSettingsChannel", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsChannelUndefined: Self = StObject.set(x, "runtimeSettingsChannel", js.undefined)
    
    inline def setRuntimeSettingsDevice(value: String): Self = StObject.set(x, "runtimeSettingsDevice", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsDeviceUndefined: Self = StObject.set(x, "runtimeSettingsDevice", js.undefined)
    
    inline def setRuntimeSettingsFetchTime(value: String): Self = StObject.set(x, "runtimeSettingsFetchTime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsFetchTimeUndefined: Self = StObject.set(x, "runtimeSettingsFetchTime", js.undefined)
    
    inline def setRuntimeSettingsNetworkThrottling(value: String): Self = StObject.set(x, "runtimeSettingsNetworkThrottling", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsNetworkThrottlingUndefined: Self = StObject.set(x, "runtimeSettingsNetworkThrottling", js.undefined)
    
    inline def setRuntimeSettingsTitle(value: String): Self = StObject.set(x, "runtimeSettingsTitle", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsTitleUndefined: Self = StObject.set(x, "runtimeSettingsTitle", js.undefined)
    
    inline def setRuntimeSettingsUA(value: String): Self = StObject.set(x, "runtimeSettingsUA", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsUANetwork(value: String): Self = StObject.set(x, "runtimeSettingsUANetwork", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsUANetworkUndefined: Self = StObject.set(x, "runtimeSettingsUANetwork", js.undefined)
    
    inline def setRuntimeSettingsUAUndefined: Self = StObject.set(x, "runtimeSettingsUA", js.undefined)
    
    inline def setRuntimeSettingsUrl(value: String): Self = StObject.set(x, "runtimeSettingsUrl", value.asInstanceOf[js.Any])
    
    inline def setRuntimeSettingsUrlUndefined: Self = StObject.set(x, "runtimeSettingsUrl", js.undefined)
    
    inline def setRuntimeUnknown(value: String): Self = StObject.set(x, "runtimeUnknown", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUnknownUndefined: Self = StObject.set(x, "runtimeUnknown", js.undefined)
    
    inline def setScorescaleLabel(value: String): Self = StObject.set(x, "scorescaleLabel", value.asInstanceOf[js.Any])
    
    inline def setScorescaleLabelUndefined: Self = StObject.set(x, "scorescaleLabel", js.undefined)
    
    inline def setShowRelevantAudits(value: String): Self = StObject.set(x, "showRelevantAudits", value.asInstanceOf[js.Any])
    
    inline def setShowRelevantAuditsUndefined: Self = StObject.set(x, "showRelevantAudits", js.undefined)
    
    inline def setSnippetCollapseButtonLabel(value: String): Self = StObject.set(x, "snippetCollapseButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setSnippetCollapseButtonLabelUndefined: Self = StObject.set(x, "snippetCollapseButtonLabel", js.undefined)
    
    inline def setSnippetExpandButtonLabel(value: String): Self = StObject.set(x, "snippetExpandButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setSnippetExpandButtonLabelUndefined: Self = StObject.set(x, "snippetExpandButtonLabel", js.undefined)
    
    inline def setThirdPartyResourcesLabel(value: String): Self = StObject.set(x, "thirdPartyResourcesLabel", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyResourcesLabelUndefined: Self = StObject.set(x, "thirdPartyResourcesLabel", js.undefined)
    
    inline def setThrottlingProvided(value: String): Self = StObject.set(x, "throttlingProvided", value.asInstanceOf[js.Any])
    
    inline def setThrottlingProvidedUndefined: Self = StObject.set(x, "throttlingProvided", js.undefined)
    
    inline def setToplevelWarningsMessage(value: String): Self = StObject.set(x, "toplevelWarningsMessage", value.asInstanceOf[js.Any])
    
    inline def setToplevelWarningsMessageUndefined: Self = StObject.set(x, "toplevelWarningsMessage", js.undefined)
    
    inline def setVarianceDisclaimer(value: String): Self = StObject.set(x, "varianceDisclaimer", value.asInstanceOf[js.Any])
    
    inline def setVarianceDisclaimerUndefined: Self = StObject.set(x, "varianceDisclaimer", js.undefined)
    
    inline def setViewTreemapLabel(value: String): Self = StObject.set(x, "viewTreemapLabel", value.asInstanceOf[js.Any])
    
    inline def setViewTreemapLabelUndefined: Self = StObject.set(x, "viewTreemapLabel", js.undefined)
    
    inline def setWarningAuditsGroupTitle(value: String): Self = StObject.set(x, "warningAuditsGroupTitle", value.asInstanceOf[js.Any])
    
    inline def setWarningAuditsGroupTitleUndefined: Self = StObject.set(x, "warningAuditsGroupTitle", js.undefined)
    
    inline def setWarningHeader(value: String): Self = StObject.set(x, "warningHeader", value.asInstanceOf[js.Any])
    
    inline def setWarningHeaderUndefined: Self = StObject.set(x, "warningHeader", js.undefined)
  }
}
