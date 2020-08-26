package typings.nano.mod

import typings.nano.nanoStrings.continuous
import typings.nano.nanoStrings.eventsource
import typings.nano.nanoStrings.longpoll
import typings.nano.nanoStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesParams extends js.Object {
  // Include encoding information in attachment stubs if include_docs is true and the particular attachment is
  // compressed. Ignored if include_docs isn’t true. Default is false.
  var att_encoding_info: js.UndefOr[Boolean] = js.native
  // Include the Base64-encoded content of attachments in the documents that are included if include_docs is true.
  // Ignored if include_docs isn’t true. Default is false.
  var attachments: js.UndefOr[Boolean] = js.native
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.native
  // Return the change results in descending sequence order (most recent change first). Default is false.
  var descending: js.UndefOr[Boolean] = js.native
  // List of document IDs to filter the changes feed as valid JSON array. Used with _doc_ids filter. Since length of
  // URL is limited, it is better to use POST /{db}/_changes instead.
  var doc_ids: js.UndefOr[js.Array[String]] = js.native
  // - normal Specifies Normal Polling Mode. All past changes are returned immediately. Default.
  // - longpoll Specifies Long Polling Mode. Waits until at least one change has occurred, sends the change, then
  // closes the connection. Most commonly used in conjunction with since=now, to wait for the next change.
  // - continuous Sets Continuous Mode. Sends a line of JSON per event. Keeps the socket open until timeout.
  // - eventsource Sets Event Source Mode. Works the same as Continuous Mode, but sends the events in EventSource
  // format.
  var feed: js.UndefOr[normal | longpoll | continuous | eventsource] = js.native
  // Reference to a filter function from a design document that will filter whole stream emitting only filtered
  // events. See the section Change Notifications in the book CouchDB The Definitive Guide for more information.
  var filter: js.UndefOr[String] = js.native
  // Period in milliseconds after which an empty line is sent in the results. Only applicable for longpoll,
  // continuous, and eventsource feeds. Overrides any timeout to keep the feed alive indefinitely. Default is 60000.
  // May be true to use default value.
  var heartbeat: js.UndefOr[Double] = js.native
  // Include the associated document with each result. If there are conflicts, only the winning revision is returned.
  // Default is false.
  var include_docs: js.UndefOr[Boolean] = js.native
  // Limit number of result rows to the specified value (note that using 0 here has the same effect as 1).
  var limit: js.UndefOr[Double] = js.native
  // Start the results from the change immediately after the given update sequence. Can be valid update sequence or
  // now value. Default is 0.
  var since: js.UndefOr[Double] = js.native
  // Specifies how many revisions are returned in the changes array. The default, main_only, will only return the
  // current “winning” revision; all_docs will return all leaf revisions (including conflicts and deleted former
  // conflicts).
  var style: js.UndefOr[String] = js.native
  // Maximum period in milliseconds to wait for a change before the response is sent, even if there are no results.
  // Only applicable for longpoll or continuous feeds. Default value is specified by httpd/changes_timeout
  // configuration option. Note that 60000 value is also the default maximum timeout to prevent undetected dead
  // connections.
  var timeout: js.UndefOr[Double] = js.native
  // Allows to use view functions as filters. Documents counted as “passed” for view filter in case if map function
  // emits at least one record for them. See _view for more info.
  var view: js.UndefOr[String] = js.native
}

object DatabaseChangesParams {
  @scala.inline
  def apply(): DatabaseChangesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseChangesParams]
  }
  @scala.inline
  implicit class DatabaseChangesParamsOps[Self <: DatabaseChangesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtt_encoding_info(value: Boolean): Self = this.set("att_encoding_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtt_encoding_info: Self = this.set("att_encoding_info", js.undefined)
    @scala.inline
    def setAttachments(value: Boolean): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setConflicts(value: Boolean): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    @scala.inline
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    @scala.inline
    def setDoc_idsVarargs(value: String*): Self = this.set("doc_ids", js.Array(value :_*))
    @scala.inline
    def setDoc_ids(value: js.Array[String]): Self = this.set("doc_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc_ids: Self = this.set("doc_ids", js.undefined)
    @scala.inline
    def setFeed(value: normal | longpoll | continuous | eventsource): Self = this.set("feed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeed: Self = this.set("feed", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHeartbeat(value: Double): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

