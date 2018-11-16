package typings
package pouchdbDashMapreduceLib.PouchDBNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[Content /* <: js.Object */, Reduction] extends js.Object {
  /** Include attachment data. */
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** Include conflicts in the _conflicts field of a doc. */
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  /** Reverse the order of the output rows. */
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  /** Get rows with keys in a certain range (inclusive/inclusive). */
  var endkey: js.UndefOr[js.Any] = js.undefined
  /** True if you want the reduce function to group results by keys, rather than returning a single result. */
  var group: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Number of elements in a key to group by, assuming the keys are arrays.
               * Defaults to the full length of the array.
               */
  var group_level: js.UndefOr[scala.Double] = js.undefined
  /** Include the document in each row in the doc field. */
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  /** Include rows having a key equal to the given options.endkey. */
  var inclusive_end: js.UndefOr[scala.Boolean] = js.undefined
  /** Only return rows matching this key. */
  var key: js.UndefOr[js.Any] = js.undefined
  /** Array of keys to fetch in a single shot. */
  var keys: js.UndefOr[js.Array[_]] = js.undefined
  /** Maximum number of rows to return. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** Reduce function, or the string name of a built-in function: '_sum', '_count', or '_stats'. */
  var reduce: js.UndefOr[
    (pouchdbDashMapreduceLib.PouchDBNs.Reducer[Content, Reduction]) | pouchdbDashMapreduceLib.PouchDBNs.BuiltInReducers | scala.Boolean
  ] = js.undefined
  /** Number of rows to skip before returning (warning: poor performance on IndexedDB/LevelDB!). */
  var skip: js.UndefOr[scala.Double] = js.undefined
  /**
               * unspecified (default): Returns the latest results, waiting for the view to build if necessary.
               * 'ok': Returns results immediately, even if they’re out-of-date.
               * 'update_after': Returns results immediately, but kicks off a build afterwards.
               */
  var stale: js.UndefOr[
    pouchdbDashMapreduceLib.pouchdbDashMapreduceLibStrings.ok | pouchdbDashMapreduceLib.pouchdbDashMapreduceLibStrings.update_after
  ] = js.undefined
  /** Get rows with keys in a certain range (inclusive/inclusive). */
  var startkey: js.UndefOr[js.Any] = js.undefined
}

