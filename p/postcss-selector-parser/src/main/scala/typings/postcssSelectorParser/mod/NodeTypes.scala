package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeTypes extends js.Object {
  var attribute: Attribute_ = js.native
  var `class`: ClassName_ = js.native
  var combinator: Combinator_ = js.native
  var comment: Comment_ = js.native
  var id: Identifier = js.native
  var nesting: Nesting_ = js.native
  var pseudo: Pseudo_ = js.native
  var root: Root_ = js.native
  var selector: Selector_ = js.native
  var string: String_ = js.native
  var tag: Tag_ = js.native
  var universal: Universal_ = js.native
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
  @scala.inline
  implicit class NodeTypesOps[Self <: NodeTypes] (val x: Self) extends AnyVal {
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
    def setAttribute(value: Attribute_): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: ClassName_): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCombinator(value: Combinator_): Self = this.set("combinator", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: Comment_): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNesting(value: Nesting_): Self = this.set("nesting", value.asInstanceOf[js.Any])
    @scala.inline
    def setPseudo(value: Pseudo_): Self = this.set("pseudo", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Root_): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: Selector_): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String_): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Tag_): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniversal(value: Universal_): Self = this.set("universal", value.asInstanceOf[js.Any])
  }
  
}

