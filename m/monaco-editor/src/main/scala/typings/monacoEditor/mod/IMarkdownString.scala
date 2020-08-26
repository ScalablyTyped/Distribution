package typings.monacoEditor.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarkdownString extends js.Object {
  val isTrusted: js.UndefOr[Boolean] = js.native
  val supportThemeIcons: js.UndefOr[Boolean] = js.native
  var uris: js.UndefOr[StringDictionary[UriComponents]] = js.native
  val value: String = js.native
}

object IMarkdownString {
  @scala.inline
  def apply(value: String): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownString]
  }
  @scala.inline
  implicit class IMarkdownStringOps[Self <: IMarkdownString] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTrusted: Self = this.set("isTrusted", js.undefined)
    @scala.inline
    def setSupportThemeIcons(value: Boolean): Self = this.set("supportThemeIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportThemeIcons: Self = this.set("supportThemeIcons", js.undefined)
    @scala.inline
    def setUris(value: StringDictionary[UriComponents]): Self = this.set("uris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUris: Self = this.set("uris", js.undefined)
  }
  
}

