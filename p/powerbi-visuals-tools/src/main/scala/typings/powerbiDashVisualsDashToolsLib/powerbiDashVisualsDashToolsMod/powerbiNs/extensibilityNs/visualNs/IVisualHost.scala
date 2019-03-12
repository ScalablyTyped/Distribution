package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.visualNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisualHost
  extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IVisualHost {
  var allowInteractions: scala.Boolean
  var authenticationService: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IAuthenticationService
  var colorPalette: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IColorPalette
  var locale: java.lang.String
  var telemetry: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ITelemetryService
  var tooltipService: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ITooltipService
  def applyJsonFilter(
    filter: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IFilter,
    objectName: java.lang.String,
    propertyName: java.lang.String,
    action: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FilterAction
  ): scala.Unit
  def createLocalizationManager(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ILocalizationManager
  def createSelectionIdBuilder(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionIdBuilder
  def createSelectionManager(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ISelectionManager
  def launchUrl(url: java.lang.String): scala.Unit
  def persistProperties(
    changes: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualObjectInstancesToPersist
  ): scala.Unit
  def refreshHostData(): scala.Unit
}

object IVisualHost {
  @scala.inline
  def apply(
    allowInteractions: scala.Boolean,
    applyJsonFilter: (powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IFilter, java.lang.String, java.lang.String, powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FilterAction) => scala.Unit,
    authenticationService: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IAuthenticationService,
    colorPalette: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IColorPalette,
    createLocalizationManager: () => powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ILocalizationManager,
    createSelectionIdBuilder: () => powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionIdBuilder,
    createSelectionManager: () => powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ISelectionManager,
    instanceId: java.lang.String,
    launchUrl: java.lang.String => scala.Unit,
    locale: java.lang.String,
    persistProperties: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualObjectInstancesToPersist => scala.Unit,
    refreshHostData: () => scala.Unit,
    telemetry: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ITelemetryService,
    tooltipService: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ITooltipService
  ): IVisualHost = {
    val __obj = js.Dynamic.literal(allowInteractions = allowInteractions, applyJsonFilter = js.Any.fromFunction4(applyJsonFilter), authenticationService = authenticationService, colorPalette = colorPalette, createLocalizationManager = js.Any.fromFunction0(createLocalizationManager), createSelectionIdBuilder = js.Any.fromFunction0(createSelectionIdBuilder), createSelectionManager = js.Any.fromFunction0(createSelectionManager), instanceId = instanceId, launchUrl = js.Any.fromFunction1(launchUrl), locale = locale, persistProperties = js.Any.fromFunction1(persistProperties), refreshHostData = js.Any.fromFunction0(refreshHostData), telemetry = telemetry, tooltipService = tooltipService)
  
    __obj.asInstanceOf[IVisualHost]
  }
}

