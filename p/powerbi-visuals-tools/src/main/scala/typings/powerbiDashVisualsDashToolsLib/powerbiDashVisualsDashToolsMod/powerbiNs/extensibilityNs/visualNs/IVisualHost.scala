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
    applyJsonFilter: js.Function4[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IFilter, 
      java.lang.String, 
      java.lang.String, 
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FilterAction, 
      scala.Unit
    ],
    authenticationService: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IAuthenticationService,
    colorPalette: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IColorPalette,
    createLocalizationManager: js.Function0[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ILocalizationManager
    ],
    createSelectionIdBuilder: js.Function0[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionIdBuilder
    ],
    createSelectionManager: js.Function0[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ISelectionManager
    ],
    instanceId: java.lang.String,
    launchUrl: js.Function1[java.lang.String, scala.Unit],
    locale: java.lang.String,
    persistProperties: js.Function1[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualObjectInstancesToPersist, 
      scala.Unit
    ],
    refreshHostData: js.Function0[scala.Unit],
    telemetry: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ITelemetryService,
    tooltipService: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.ITooltipService
  ): IVisualHost = {
    val __obj = js.Dynamic.literal(allowInteractions = allowInteractions, applyJsonFilter = applyJsonFilter, authenticationService = authenticationService, colorPalette = colorPalette, createLocalizationManager = createLocalizationManager, createSelectionIdBuilder = createSelectionIdBuilder, createSelectionManager = createSelectionManager, instanceId = instanceId, launchUrl = launchUrl, locale = locale, persistProperties = persistProperties, refreshHostData = refreshHostData, telemetry = telemetry, tooltipService = tooltipService)
  
    __obj.asInstanceOf[IVisualHost]
  }
}

