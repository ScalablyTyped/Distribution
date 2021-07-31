package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailSearchFolder
  extends StObject
     with MailFolder {
  
  // The OData query to filter the messages.
  var filterQuery: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be
    * done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a
    * shallow search of only each of the folders explicitly specified in sourceFolderIds.
    */
  var includeNestedFolders: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether a search folder is editable using REST APIs.
  var isSupported: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The mailbox folders that should be mined.
  var sourceFolderIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object MailSearchFolder {
  
  @scala.inline
  def apply(): MailSearchFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailSearchFolder]
  }
  
  @scala.inline
  implicit class MailSearchFolderMutableBuilder[Self <: MailSearchFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterQuery(value: NullableOption[String]): Self = StObject.set(x, "filterQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterQueryNull: Self = StObject.set(x, "filterQuery", null)
    
    @scala.inline
    def setFilterQueryUndefined: Self = StObject.set(x, "filterQuery", js.undefined)
    
    @scala.inline
    def setIncludeNestedFolders(value: NullableOption[Boolean]): Self = StObject.set(x, "includeNestedFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNestedFoldersNull: Self = StObject.set(x, "includeNestedFolders", null)
    
    @scala.inline
    def setIncludeNestedFoldersUndefined: Self = StObject.set(x, "includeNestedFolders", js.undefined)
    
    @scala.inline
    def setIsSupported(value: NullableOption[Boolean]): Self = StObject.set(x, "isSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSupportedNull: Self = StObject.set(x, "isSupported", null)
    
    @scala.inline
    def setIsSupportedUndefined: Self = StObject.set(x, "isSupported", js.undefined)
    
    @scala.inline
    def setSourceFolderIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "sourceFolderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFolderIdsNull: Self = StObject.set(x, "sourceFolderIds", null)
    
    @scala.inline
    def setSourceFolderIdsUndefined: Self = StObject.set(x, "sourceFolderIds", js.undefined)
    
    @scala.inline
    def setSourceFolderIdsVarargs(value: String*): Self = StObject.set(x, "sourceFolderIds", js.Array(value :_*))
  }
}
