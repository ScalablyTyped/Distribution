package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VisualObjectRepetition extends js.Object {
  /** Used to group differernt repetitions into containers. That will be used as the container displayName in the PropertyPane */
  var containerName: js.UndefOr[java.lang.String] = js.undefined
  /** The set of repetition descriptors for this object. */
  var objects: org.scalablytyped.runtime.StringDictionary[DataViewRepetitionObjectDescriptor]
  /** The selector that identifies the objects. */
  var selector: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.Selector
}

