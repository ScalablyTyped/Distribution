package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a selector for content, including data-, metadata, and user-defined repetition. */

trait Selector extends js.Object {
  /** Data-bound repetition selection. */
  var data: js.UndefOr[js.Array[DataRepetitionSelector]] = js.undefined
  /** User-defined repetition selection. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata-bound repetition selection.  Refers to a DataViewMetadataColumn queryName. */
  var metadata: js.UndefOr[java.lang.String] = js.undefined
}

