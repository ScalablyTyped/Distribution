package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesParams extends js.Object {
  // Include encoding information in attachment stubs if include_docs is true and the particular attachment is
  // compressed. Ignored if include_docs isn’t true. Default is false.
  var att_encoding_info: js.UndefOr[scala.Boolean] = js.undefined
  // Include the Base64-encoded content of attachments in the documents that are included if include_docs is true.
  // Ignored if include_docs isn’t true. Default is false.
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  // Return the change results in descending sequence order (most recent change first). Default is false.
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  // List of document IDs to filter the changes feed as valid JSON array. Used with _doc_ids filter. Since length of
  // URL is limited, it is better to use POST /{db}/_changes instead.
  var doc_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // - normal Specifies Normal Polling Mode. All past changes are returned immediately. Default.
  // - longpoll Specifies Long Polling Mode. Waits until at least one change has occurred, sends the change, then
  // closes the connection. Most commonly used in conjunction with since=now, to wait for the next change.
  // - continuous Sets Continuous Mode. Sends a line of JSON per event. Keeps the socket open until timeout.
  // - eventsource Sets Event Source Mode. Works the same as Continuous Mode, but sends the events in EventSource
  // format.
  var feed: js.UndefOr[
    nanoLib.nanoLibStrings.normal | nanoLib.nanoLibStrings.longpoll | nanoLib.nanoLibStrings.continuous | nanoLib.nanoLibStrings.eventsource
  ] = js.undefined
  // Reference to a filter function from a design document that will filter whole stream emitting only filtered
  // events. See the section Change Notifications in the book CouchDB The Definitive Guide for more information.
  var filter: js.UndefOr[java.lang.String] = js.undefined
  // Period in milliseconds after which an empty line is sent in the results. Only applicable for longpoll,
  // continuous, and eventsource feeds. Overrides any timeout to keep the feed alive indefinitely. Default is 60000.
  // May be true to use default value.
  var heartbeat: js.UndefOr[scala.Double] = js.undefined
  // Include the associated document with each result. If there are conflicts, only the winning revision is returned.
  // Default is false.
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  // Limit number of result rows to the specified value (note that using 0 here has the same effect as 1).
  var limit: js.UndefOr[scala.Double] = js.undefined
  // Start the results from the change immediately after the given update sequence. Can be valid update sequence or
  // now value. Default is 0.
  var since: js.UndefOr[scala.Double] = js.undefined
  // Specifies how many revisions are returned in the changes array. The default, main_only, will only return the
  // current “winning” revision; all_docs will return all leaf revisions (including conflicts and deleted former
  // conflicts).
  var style: js.UndefOr[java.lang.String] = js.undefined
  // Maximum period in milliseconds to wait for a change before the response is sent, even if there are no results.
  // Only applicable for longpoll or continuous feeds. Default value is specified by httpd/changes_timeout
  // configuration option. Note that 60000 value is also the default maximum timeout to prevent undetected dead
  // connections.
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // Allows to use view functions as filters. Documents counted as “passed” for view filter in case if map function
  // emits at least one record for them. See _view for more info.
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object DatabaseChangesParams {
  @scala.inline
  def apply(
    att_encoding_info: js.UndefOr[scala.Boolean] = js.undefined,
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    doc_ids: js.Array[java.lang.String] = null,
    feed: nanoLib.nanoLibStrings.normal | nanoLib.nanoLibStrings.longpoll | nanoLib.nanoLibStrings.continuous | nanoLib.nanoLibStrings.eventsource = null,
    filter: java.lang.String = null,
    heartbeat: scala.Int | scala.Double = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    since: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    view: java.lang.String = null
  ): DatabaseChangesParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(att_encoding_info)) __obj.updateDynamic("att_encoding_info")(att_encoding_info)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids)
    if (feed != null) __obj.updateDynamic("feed")(feed.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DatabaseChangesParams]
  }
}

