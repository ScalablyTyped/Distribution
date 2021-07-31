package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDriveActivityRequest extends StObject {
  
  /** Return activities for this Drive folder and all children and descendants. The format is "items/ITEM_ID". */
  var ancestorName: js.UndefOr[String] = js.undefined
  
  /** Details on how to consolidate related actions that make up the activity. If not set, then related actions are not consolidated. */
  var consolidationStrategy: js.UndefOr[ConsolidationStrategy] = js.undefined
  
  /**
    * The filtering for items returned from this query request. The format of the filter string is a sequence of expressions, joined by an optional "AND", where each expression is of the
    * form "field operator value". Supported fields: - time: Uses numerical operators on date values either in terms of milliseconds since Jan 1, 1970 or in RFC 3339 format. Examples: -
    * time > 1452409200000 AND time <= 1492812924310 - time >= "2016-01-10T01:02:03-05:00" - detail.action_detail_case: Uses the "has" operator (:) and either a singular value or a list
    * of allowed action types enclosed in parentheses. Examples: - detail.action_detail_case: RENAME - detail.action_detail_case:(CREATE EDIT) - -detail.action_detail_case:MOVE
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Return activities for this Drive item. The format is "items/ITEM_ID". */
  var itemName: js.UndefOr[String] = js.undefined
  
  /**
    * The miminum number of activities desired in the response; the server will attempt to return at least this quanitity. The server may also return fewer activities if it has a partial
    * response ready before the request times out. If not set, a default value is used.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token identifying which page of results to return. Set this to the next_page_token value returned from a previous query to obtain the following page of results. If not set, the
    * first page of results will be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object QueryDriveActivityRequest {
  
  @scala.inline
  def apply(): QueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDriveActivityRequest]
  }
  
  @scala.inline
  implicit class QueryDriveActivityRequestMutableBuilder[Self <: QueryDriveActivityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestorName(value: String): Self = StObject.set(x, "ancestorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorNameUndefined: Self = StObject.set(x, "ancestorName", js.undefined)
    
    @scala.inline
    def setConsolidationStrategy(value: ConsolidationStrategy): Self = StObject.set(x, "consolidationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationStrategyUndefined: Self = StObject.set(x, "consolidationStrategy", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
