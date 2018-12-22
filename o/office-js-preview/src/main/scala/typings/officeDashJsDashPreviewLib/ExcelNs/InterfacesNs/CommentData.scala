package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "comment.toJSON()". */

trait CommentData extends js.Object {
  /**
               *
               * Represents the comment identifier. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Represents whether it is a comment thread or reply. Always return true here. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents a collection of reply objects associated with the comment. Read-only.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
}

