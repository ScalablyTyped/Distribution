package typings.nano.mod

import typings.nano.nanoStrings.continuous
import typings.nano.nanoStrings.eventsource
import typings.nano.nanoStrings.longpoll
import typings.nano.nanoStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesParams extends StObject {
  
  // Include encoding information in attachment stubs if include_docs is true and the particular attachment is
  // compressed. Ignored if include_docs isn’t true. Default is false.
  var att_encoding_info: js.UndefOr[Boolean] = js.undefined
  
  // Include the Base64-encoded content of attachments in the documents that are included if include_docs is true.
  // Ignored if include_docs isn’t true. Default is false.
  var attachments: js.UndefOr[Boolean] = js.undefined
  
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.undefined
  
  // Return the change results in descending sequence order (most recent change first). Default is false.
  var descending: js.UndefOr[Boolean] = js.undefined
  
  // List of document IDs to filter the changes feed as valid JSON array. Used with _doc_ids filter. Since length of
  // URL is limited, it is better to use POST /{db}/_changes instead.
  var doc_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  // - normal Specifies Normal Polling Mode. All past changes are returned immediately. Default.
  // - longpoll Specifies Long Polling Mode. Waits until at least one change has occurred, sends the change, then
  // closes the connection. Most commonly used in conjunction with since=now, to wait for the next change.
  // - continuous Sets Continuous Mode. Sends a line of JSON per event. Keeps the socket open until timeout.
  // - eventsource Sets Event Source Mode. Works the same as Continuous Mode, but sends the events in EventSource
  // format.
  var feed: js.UndefOr[normal | longpoll | continuous | eventsource] = js.undefined
  
  // Reference to a filter function from a design document that will filter whole stream emitting only filtered
  // events. See the section Change Notifications in the book CouchDB The Definitive Guide for more information.
  var filter: js.UndefOr[String] = js.undefined
  
  // Period in milliseconds after which an empty line is sent in the results. Only applicable for longpoll,
  // continuous, and eventsource feeds. Overrides any timeout to keep the feed alive indefinitely. Default is 60000.
  // May be true to use default value.
  var heartbeat: js.UndefOr[Double] = js.undefined
  
  // Include the associated document with each result. If there are conflicts, only the winning revision is returned.
  // Default is false.
  var include_docs: js.UndefOr[Boolean] = js.undefined
  
  // Limit number of result rows to the specified value (note that using 0 here has the same effect as 1).
  var limit: js.UndefOr[Double] = js.undefined
  
  // Start the results from the change immediately after the given update sequence. Can be valid update sequence or
  // now value. Default is 0.
  var since: js.UndefOr[Double] = js.undefined
  
  // Specifies how many revisions are returned in the changes array. The default, main_only, will only return the
  // current “winning” revision; all_docs will return all leaf revisions (including conflicts and deleted former
  // conflicts).
  var style: js.UndefOr[String] = js.undefined
  
  // Maximum period in milliseconds to wait for a change before the response is sent, even if there are no results.
  // Only applicable for longpoll or continuous feeds. Default value is specified by httpd/changes_timeout
  // configuration option. Note that 60000 value is also the default maximum timeout to prevent undetected dead
  // connections.
  var timeout: js.UndefOr[Double] = js.undefined
  
  // Allows to use view functions as filters. Documents counted as “passed” for view filter in case if map function
  // emits at least one record for them. See _view for more info.
  var view: js.UndefOr[String] = js.undefined
}
object DatabaseChangesParams {
  
  inline def apply(): DatabaseChangesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseChangesParams]
  }
  
  extension [Self <: DatabaseChangesParams](x: Self) {
    
    inline def setAtt_encoding_info(value: Boolean): Self = StObject.set(x, "att_encoding_info", value.asInstanceOf[js.Any])
    
    inline def setAtt_encoding_infoUndefined: Self = StObject.set(x, "att_encoding_info", js.undefined)
    
    inline def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    inline def setDoc_ids(value: js.Array[String]): Self = StObject.set(x, "doc_ids", value.asInstanceOf[js.Any])
    
    inline def setDoc_idsUndefined: Self = StObject.set(x, "doc_ids", js.undefined)
    
    inline def setDoc_idsVarargs(value: String*): Self = StObject.set(x, "doc_ids", js.Array(value :_*))
    
    inline def setFeed(value: normal | longpoll | continuous | eventsource): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
    
    inline def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    inline def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
