package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// These are the base interfaces. These should remain empty
// All visual versions should extend these for type compatability
trait IVisual extends js.Object {
  /** Notifies the visual that it is being destroyed, and to do any cleanup necessary (such as unsubscribing event handlers). */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

