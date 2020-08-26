package typings.nodeHtmlParser.anon

import typings.nodeHtmlParser.nodeHtmlParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node-html-parser.node-html-parser/dist/nodes/html.Options & {  noFix :true} */
@js.native
trait OptionsnoFixtrue extends js.Object {
  var comment: js.UndefOr[Boolean] = js.native
  var lowerCaseTagName: js.UndefOr[Boolean] = js.native
  var noFix: `true` = js.native
  var pre: js.UndefOr[Boolean] = js.native
  var script: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[Boolean] = js.native
}

object OptionsnoFixtrue {
  @scala.inline
  def apply(noFix: `true`): OptionsnoFixtrue = {
    val __obj = js.Dynamic.literal(noFix = noFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsnoFixtrue]
  }
  @scala.inline
  implicit class OptionsnoFixtrueOps[Self <: OptionsnoFixtrue] (val x: Self) extends AnyVal {
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
    def setNoFix(value: `true`): Self = this.set("noFix", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: Boolean): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setLowerCaseTagName(value: Boolean): Self = this.set("lowerCaseTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerCaseTagName: Self = this.set("lowerCaseTagName", js.undefined)
    @scala.inline
    def setPre(value: Boolean): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setScript(value: Boolean): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

