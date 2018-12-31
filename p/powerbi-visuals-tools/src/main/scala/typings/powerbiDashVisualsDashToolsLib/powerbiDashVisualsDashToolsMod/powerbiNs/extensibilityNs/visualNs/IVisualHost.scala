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

