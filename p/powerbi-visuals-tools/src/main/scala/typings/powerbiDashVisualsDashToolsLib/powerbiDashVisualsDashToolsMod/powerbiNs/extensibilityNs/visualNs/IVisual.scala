package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.visualNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a visualization displayed within an application (PowerBI dashboards, ad-hoc reporting, etc.).
     * This interface does not make assumptions about the underlying JS/HTML constructs the visual uses to render itself.
     */
@js.native
trait IVisual
  extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.IVisual {
  /** Gets the set of objects that the visual is currently displaying. */
  var enumerateObjectInstances: js.UndefOr[
    js.Function1[
      /* options */ powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.EnumerateVisualObjectInstancesOptions, 
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualObjectInstanceEnumeration
    ]
  ] = js.native
  /** Notifies the IVisual of an update (data, viewmode, size change). */
  // tslint:disable-next-line
  def update[T](options: VisualUpdateOptions): scala.Unit = js.native
  /** Notifies the IVisual of an update (data, viewmode, size change). */
  // tslint:disable-next-line
  def update[T](options: VisualUpdateOptions, viewModel: T): scala.Unit = js.native
}

