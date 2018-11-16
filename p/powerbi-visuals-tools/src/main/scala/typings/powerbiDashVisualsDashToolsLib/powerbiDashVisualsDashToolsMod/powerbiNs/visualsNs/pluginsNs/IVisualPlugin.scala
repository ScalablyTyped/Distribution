package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This IVisualPlugin interface is only used by the CLI tools when compiling */

@js.native
trait IVisualPlugin extends js.Object {
  /** The version of the api that this plugin should be run against */
  var apiVersion: java.lang.String = js.native
  /** The class of the plugin.  At the moment it is only used to have a way to indicate the class name that a custom visual has. */
  var `class`: java.lang.String = js.native
  /** Check if a visual is custom */
  var custom: scala.Boolean = js.native
  /** Human readable plugin name displayed to users */
  var displayName: java.lang.String = js.native
  /** The name of the plugin.  Must match the property name in powerbi.visuals. */
  var name: java.lang.String = js.native
  /** Function to call to create the visual. */
  def create(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IVisual = js.native
  /** Function to call to create the visual. */
  def create(
    options: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.VisualConstructorOptions
  ): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IVisual = js.native
}

