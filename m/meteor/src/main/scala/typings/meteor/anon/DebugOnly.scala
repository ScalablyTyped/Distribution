package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugOnly extends js.Object {
  var debugOnly: js.UndefOr[Boolean] = js.native
  var documentation: js.UndefOr[String] = js.native
  var git: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var prodOnly: js.UndefOr[Boolean] = js.native
  var summary: js.UndefOr[String] = js.native
  var testOnly: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object DebugOnly {
  @scala.inline
  def apply(): DebugOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOnly]
  }
  @scala.inline
  implicit class DebugOnlyOps[Self <: DebugOnly] (val x: Self) extends AnyVal {
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
    def setDebugOnly(value: Boolean): Self = this.set("debugOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugOnly: Self = this.set("debugOnly", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setGit(value: String): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProdOnly(value: Boolean): Self = this.set("prodOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProdOnly: Self = this.set("prodOnly", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setTestOnly(value: Boolean): Self = this.set("testOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestOnly: Self = this.set("testOnly", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

