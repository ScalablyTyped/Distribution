package typings.postcss.postcssMod

import typings.postcss.postcssStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a comment between declarations or statements (rule and at-rules).
  * Comments inside selectors, at-rule parameters, or declaration values will
  * be stored in the Node#raws properties.
  */
@js.native
trait Comment
  extends ChildNode
     with NodeBase {
  /**
    * Returns the comment's parent node.
    */
  var parent: Container = js.native
  /**
    * The comment's text.
    */
  var text: String = js.native
  var `type`: comment = js.native
}

@JSImport("postcss", "comment")
@js.native
object comment extends js.Object {
  /**
    * Creates a new Comment node.
    * @param defaults Properties for the new Comment node.
    * @returns The new node.
    */
  def apply(): Comment = js.native
  def apply(defaults: CommentNewProps): Comment = js.native
}

