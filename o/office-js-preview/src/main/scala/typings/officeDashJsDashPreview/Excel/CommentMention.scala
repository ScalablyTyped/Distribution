package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the entity that is mentioned in comments.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentMention extends js.Object {
  /**
    *
    * Gets or sets the email address of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var email: String
  /**
    *
    * Gets or sets the id of the entity. This is aligned with the id information in `CommentRichContent.richContent`.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: Double
  /**
    *
    * Gets or sets the name of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: String
}

object CommentMention {
  @scala.inline
  def apply(email: String, id: Double, name: String): CommentMention = {
    val __obj = js.Dynamic.literal(email = email, id = id, name = name)
  
    __obj.asInstanceOf[CommentMention]
  }
}

