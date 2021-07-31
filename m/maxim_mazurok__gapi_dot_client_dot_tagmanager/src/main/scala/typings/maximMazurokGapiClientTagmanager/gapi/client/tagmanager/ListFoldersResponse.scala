package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFoldersResponse extends StObject {
  
  /** All GTM Folders of a GTM Container. */
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListFoldersResponse {
  
  @scala.inline
  def apply(): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFoldersResponse]
  }
  
  @scala.inline
  implicit class ListFoldersResponseMutableBuilder[Self <: ListFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
