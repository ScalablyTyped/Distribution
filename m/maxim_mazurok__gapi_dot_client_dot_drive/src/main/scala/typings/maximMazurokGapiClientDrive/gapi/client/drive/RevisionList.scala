package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionList extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#revisionList". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of revisions. This will be absent if the end of the revisions list has been reached. If the token is rejected for any reason, it should be
    * discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of revisions. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var revisions: js.UndefOr[js.Array[Revision]] = js.undefined
}
object RevisionList {
  
  @scala.inline
  def apply(): RevisionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionList]
  }
  
  @scala.inline
  implicit class RevisionListMutableBuilder[Self <: RevisionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRevisions(value: js.Array[Revision]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    @scala.inline
    def setRevisionsVarargs(value: Revision*): Self = StObject.set(x, "revisions", js.Array(value :_*))
  }
}
