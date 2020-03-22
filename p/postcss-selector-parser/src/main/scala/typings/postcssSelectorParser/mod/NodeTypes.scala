package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeTypes extends js.Object {
  var attribute: Attribute_
  var `class`: ClassName_
  var combinator: Combinator_
  var comment: Comment_
  var id: Identifier
  var nesting: Nesting_
  var pseudo: Pseudo_
  var root: Root_
  var selector: Selector_
  var string: String_
  var tag: Tag_
  var universal: Universal_
}

object NodeTypes {
  @scala.inline
  def apply(
    attribute: Attribute_,
    `class`: ClassName_,
    combinator: Combinator_,
    comment: Comment_,
    id: Identifier,
    nesting: Nesting_,
    pseudo: Pseudo_,
    root: Root_,
    selector: Selector_,
    string: String_,
    tag: Tag_,
    universal: Universal_
  ): NodeTypes = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], combinator = combinator.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeTypes]
  }
}

