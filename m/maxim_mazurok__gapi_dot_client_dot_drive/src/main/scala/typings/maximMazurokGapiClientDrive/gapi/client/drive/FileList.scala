package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileList extends StObject {
  
  /** The list of files. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var files: js.UndefOr[js.Array[File]] = js.undefined
  
  /**
    * Whether the search process was incomplete. If true, then some search results may be missing, since all documents were not searched. This may occur when searching multiple drives
    * with the "allDrives" corpora, but all corpora could not be searched. When this happens, it is suggested that clients narrow their query by choosing a different corpus such as "user"
    * or "drive".
    */
  var incompleteSearch: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#fileList". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of files. This will be absent if the end of the files list has been reached. If the token is rejected for any reason, it should be discarded, and
    * pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object FileList {
  
  @scala.inline
  def apply(): FileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileList]
  }
  
  @scala.inline
  implicit class FileListMutableBuilder[Self <: FileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setIncompleteSearch(value: Boolean): Self = StObject.set(x, "incompleteSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteSearchUndefined: Self = StObject.set(x, "incompleteSearch", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
