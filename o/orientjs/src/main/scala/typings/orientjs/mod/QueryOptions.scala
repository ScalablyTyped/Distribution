package typings.orientjs.mod

import typings.orientjs.orientjsStrings.Javascript
import typings.orientjs.orientjsStrings.SQL
import typings.orientjs.orientjsStrings.a
import typings.orientjs.orientjsStrings.l
import typings.orientjs.orientjsStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var fetchPlan: js.UndefOr[js.Any] = js.native
  var language: js.UndefOr[SQL | Javascript] = js.native
  var limit: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[s | a | l] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var token: js.UndefOr[js.Any] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setFetchPlan(value: js.Any): Self = this.set("fetchPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPlan: Self = this.set("fetchPlan", js.undefined)
    @scala.inline
    def setLanguage(value: SQL | Javascript): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMode(value: s | a | l): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

