package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * List information for paragraph.
     *
     * [Api set: OneNoteApi 1.1]
     */

trait ParagraphInfo extends js.Object {
  /**
           *
           * //
              Bullet list type of paragraph
           *
           * [Api set: OneNoteApi 1.1]
           */
  var bulletType: java.lang.String
  /**
           *
           * //
              Index of paragraph in list
           *
           * [Api set: OneNoteApi 1.1]
           */
  var index: scala.Double
  /**
           *
           * //
              Type of list in paragraph
           *
           * [Api set: OneNoteApi 1.1]
           */
  var listType: ListType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bullet
  /**
           *
           * //
              number list type of paragraph
           *
           * [Api set: OneNoteApi 1.1]
           */
  var numberType: /* LimitUnionLength: was union type with length 63 */js.Any
}

