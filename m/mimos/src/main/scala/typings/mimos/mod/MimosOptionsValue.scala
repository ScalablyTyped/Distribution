package typings.mimos.mod

import typings.mimeDb.mod.MimeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimosOptionsValue extends MimeEntry {
  /** method with signature function(mime) when this mime type is found in the database, this function will run. This allows you make customizations to mime based on developer criteria. */
  var predicate: js.UndefOr[js.Function1[/* mime */ this.type, this.type]] = js.native
  /** specify the type value of result objects, defaults to key. See the example below for more clarification. */
  var `type`: js.UndefOr[String] = js.native
}

object MimosOptionsValue {
  @scala.inline
  def apply(): MimosOptionsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimosOptionsValue]
  }
  @scala.inline
  implicit class MimosOptionsValueOps[Self <: MimosOptionsValue] (val x: Self) extends AnyVal {
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
    def setPredicate(value: MimosOptionsValue => MimosOptionsValue): Self = this.set("predicate", js.Any.fromFunction1(value))
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

