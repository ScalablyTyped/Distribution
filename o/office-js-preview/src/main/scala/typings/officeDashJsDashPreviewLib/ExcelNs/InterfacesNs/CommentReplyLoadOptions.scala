package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a cell comment reply object in the workbook.
         *
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait CommentReplyLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the comment reply identifier. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents whether it is a comment thread or reply. Always return false here. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
}

