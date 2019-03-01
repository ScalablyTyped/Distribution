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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowInteractions")(allowInteractions)
    __obj.updateDynamic("applyJsonFilter")(applyJsonFilter)
    __obj.updateDynamic("authenticationService")(authenticationService)
    __obj.updateDynamic("colorPalette")(colorPalette)
    __obj.updateDynamic("createLocalizationManager")(createLocalizationManager)
    __obj.updateDynamic("createSelectionIdBuilder")(createSelectionIdBuilder)
    __obj.updateDynamic("createSelectionManager")(createSelectionManager)
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("launchUrl")(launchUrl)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("persistProperties")(persistProperties)
    __obj.updateDynamic("refreshHostData")(refreshHostData)
    __obj.updateDynamic("telemetry")(telemetry)
    __obj.updateDynamic("tooltipService")(tooltipService)
    __obj.asInstanceOf[IVisualHost]
  }
}

