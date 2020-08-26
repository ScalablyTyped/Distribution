package typings.parse5SaxParser.mod

import typings.parse5.mod.Attribute
import typings.parse5.mod.StartTagLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTagToken extends js.Object {
  /**
    * List of attributes.
    */
  var attrs: js.Array[Attribute] = js.native
  /**
    * Indicates if the tag is self-closing.
    */
  var selfClosing: Boolean = js.native
  /**
    * Start tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[StartTagLocation] = js.native
  /**
    * Tag name.
    */
  var tagName: String = js.native
}

object StartTagToken {
  @scala.inline
  def apply(attrs: js.Array[Attribute], selfClosing: Boolean, tagName: String): StartTagToken = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagToken]
  }
  @scala.inline
  implicit class StartTagTokenOps[Self <: StartTagToken] (val x: Self) extends AnyVal {
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
    def setAttrsVarargs(value: Attribute*): Self = this.set("attrs", js.Array(value :_*))
    @scala.inline
    def setAttrs(value: js.Array[Attribute]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfClosing(value: Boolean): Self = this.set("selfClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCodeLocation(value: StartTagLocation): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
  }
  
}

