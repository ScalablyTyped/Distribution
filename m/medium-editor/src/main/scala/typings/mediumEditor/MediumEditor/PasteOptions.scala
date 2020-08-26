package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteOptions extends js.Object {
  var cleanAttrs: js.UndefOr[js.Array[String]] = js.native
  var cleanPastedHTML: js.UndefOr[Boolean] = js.native
  var cleanReplacements: js.UndefOr[js.Array[_]] = js.native
  var cleanTags: js.UndefOr[js.Array[String]] = js.native
  var forcePlainText: js.UndefOr[Boolean] = js.native
  var preCleanReplacements: js.UndefOr[js.Array[_]] = js.native
  var unwrapTags: js.UndefOr[js.Array[String]] = js.native
}

object PasteOptions {
  @scala.inline
  def apply(): PasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteOptions]
  }
  @scala.inline
  implicit class PasteOptionsOps[Self <: PasteOptions] (val x: Self) extends AnyVal {
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
    def setCleanAttrsVarargs(value: String*): Self = this.set("cleanAttrs", js.Array(value :_*))
    @scala.inline
    def setCleanAttrs(value: js.Array[String]): Self = this.set("cleanAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanAttrs: Self = this.set("cleanAttrs", js.undefined)
    @scala.inline
    def setCleanPastedHTML(value: Boolean): Self = this.set("cleanPastedHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanPastedHTML: Self = this.set("cleanPastedHTML", js.undefined)
    @scala.inline
    def setCleanReplacementsVarargs(value: js.Any*): Self = this.set("cleanReplacements", js.Array(value :_*))
    @scala.inline
    def setCleanReplacements(value: js.Array[_]): Self = this.set("cleanReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanReplacements: Self = this.set("cleanReplacements", js.undefined)
    @scala.inline
    def setCleanTagsVarargs(value: String*): Self = this.set("cleanTags", js.Array(value :_*))
    @scala.inline
    def setCleanTags(value: js.Array[String]): Self = this.set("cleanTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanTags: Self = this.set("cleanTags", js.undefined)
    @scala.inline
    def setForcePlainText(value: Boolean): Self = this.set("forcePlainText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePlainText: Self = this.set("forcePlainText", js.undefined)
    @scala.inline
    def setPreCleanReplacementsVarargs(value: js.Any*): Self = this.set("preCleanReplacements", js.Array(value :_*))
    @scala.inline
    def setPreCleanReplacements(value: js.Array[_]): Self = this.set("preCleanReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreCleanReplacements: Self = this.set("preCleanReplacements", js.undefined)
    @scala.inline
    def setUnwrapTagsVarargs(value: String*): Self = this.set("unwrapTags", js.Array(value :_*))
    @scala.inline
    def setUnwrapTags(value: js.Array[String]): Self = this.set("unwrapTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnwrapTags: Self = this.set("unwrapTags", js.undefined)
  }
  
}

