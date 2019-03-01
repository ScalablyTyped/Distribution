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

object Options {
  @scala.inline
  def apply[Content /* <: js.Object */, Reduction](
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    endkey: js.Any = null,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    group_level: scala.Int | scala.Double = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    inclusive_end: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.Any = null,
    keys: js.Array[_] = null,
    limit: scala.Int | scala.Double = null,
    reduce: (pouchdbDashMapreduceLib.PouchDBNs.Reducer[Content, Reduction]) | pouchdbDashMapreduceLib.PouchDBNs.BuiltInReducers | scala.Boolean = null,
    skip: scala.Int | scala.Double = null,
    stale: pouchdbDashMapreduceLib.pouchdbDashMapreduceLibStrings.ok | pouchdbDashMapreduceLib.pouchdbDashMapreduceLibStrings.update_after = null,
    startkey: js.Any = null
  ): Options[Content, Reduction] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (endkey != null) __obj.updateDynamic("endkey")(endkey)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (group_level != null) __obj.updateDynamic("group_level")(group_level.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (reduce != null) __obj.updateDynamic("reduce")(reduce.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (startkey != null) __obj.updateDynamic("startkey")(startkey)
    __obj.asInstanceOf[Options[Content, Reduction]]
  }
}

