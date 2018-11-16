package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AllDocsWithinRangeOptions extends AllDocsOptions {
  /** High end of range, or low end if `descending` is `true`. */
  var endkey: DocumentKey
  /**
               * Include any documents identified by `endkey`.
               *
               * Defaults to `true`.
               */
  var inclusive_end: js.UndefOr[scala.Boolean] = js.undefined
  /** Low end of range, or high end if `descending` is `true`. */
  var startkey: DocumentKey
}

