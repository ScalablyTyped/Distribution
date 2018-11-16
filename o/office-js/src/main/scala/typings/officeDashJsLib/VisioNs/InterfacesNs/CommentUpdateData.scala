package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Comment object, for use in "comment.set({ ... })". */

trait CommentUpdateData extends js.Object {
  /**
               *
               * A string that specifies the name of the author of the comment.
               *
               * [Api set:  1.1]
               */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * A string that specifies the date when the comment was created.
               *
               * [Api set:  1.1]
               */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * A string that contains the comment text.
               *
               * [Api set:  1.1]
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

