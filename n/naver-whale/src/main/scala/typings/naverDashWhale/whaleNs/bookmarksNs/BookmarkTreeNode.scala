package typings.naverDashWhale.whaleNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkTreeNode extends js.Object {
  /** Optional. An ordered list of children of this node.  */
  var children: js.UndefOr[js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode]] = js.undefined
  /** Optional. When this node was created, in milliseconds since the epoch (new Date(dateAdded)).  */
  var dateAdded: js.UndefOr[Double] = js.undefined
  /** Optional. When the contents of this folder last changed, in milliseconds since the epoch.   */
  var dateGroupModified: js.UndefOr[Double] = js.undefined
  /** The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the browser is restarted.  */
  var id: String
  /** Optional. The 0-based position of this node within its parent folder.  */
  var index: js.UndefOr[Double] = js.undefined
  /** Optional. The id of the parent folder. Omitted for the root node.   */
  var parentId: js.UndefOr[String] = js.undefined
  /** The text displayed for the node. */
  var title: String
  /**
    * Optional.
    * Since Chrome 37.
    * Indicates the reason why this node is unmodifiable. The managed value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
    */
  var unmodifiable: js.UndefOr[js.Any] = js.undefined
  /** Optional. The URL navigated to when a user clicks the bookmark. Omitted for folders.   */
  var url: js.UndefOr[String] = js.undefined
}

object BookmarkTreeNode {
  @scala.inline
  def apply(
    id: String,
    title: String,
    children: js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode] = null,
    dateAdded: Int | Double = null,
    dateGroupModified: Int | Double = null,
    index: Int | Double = null,
    parentId: String = null,
    unmodifiable: js.Any = null,
    url: String = null
  ): BookmarkTreeNode = {
    val __obj = js.Dynamic.literal(id = id, title = title)
    if (children != null) __obj.updateDynamic("children")(children)
    if (dateAdded != null) __obj.updateDynamic("dateAdded")(dateAdded.asInstanceOf[js.Any])
    if (dateGroupModified != null) __obj.updateDynamic("dateGroupModified")(dateGroupModified.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (unmodifiable != null) __obj.updateDynamic("unmodifiable")(unmodifiable)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkTreeNode]
  }
}

