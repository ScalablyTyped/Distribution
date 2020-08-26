package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailSearchFolder extends MailFolder {
  // The OData query to filter the messages.
  var filterQuery: js.UndefOr[String] = js.native
  /**
    * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be
    * done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a
    * shallow search of only each of the folders explicitly specified in sourceFolderIds.
    */
  var includeNestedFolders: js.UndefOr[Boolean] = js.native
  // Indicates whether a search folder is editable using REST APIs.
  var isSupported: js.UndefOr[Boolean] = js.native
  // The mailbox folders that should be mined.
  var sourceFolderIds: js.UndefOr[js.Array[String]] = js.native
}

object MailSearchFolder {
  @scala.inline
  def apply(): MailSearchFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailSearchFolder]
  }
  @scala.inline
  implicit class MailSearchFolderOps[Self <: MailSearchFolder] (val x: Self) extends AnyVal {
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
    def setFilterQuery(value: String): Self = this.set("filterQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterQuery: Self = this.set("filterQuery", js.undefined)
    @scala.inline
    def setIncludeNestedFolders(value: Boolean): Self = this.set("includeNestedFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeNestedFolders: Self = this.set("includeNestedFolders", js.undefined)
    @scala.inline
    def setIsSupported(value: Boolean): Self = this.set("isSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSupported: Self = this.set("isSupported", js.undefined)
    @scala.inline
    def setSourceFolderIdsVarargs(value: String*): Self = this.set("sourceFolderIds", js.Array(value :_*))
    @scala.inline
    def setSourceFolderIds(value: js.Array[String]): Self = this.set("sourceFolderIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFolderIds: Self = this.set("sourceFolderIds", js.undefined)
  }
  
}

