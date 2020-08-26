package typings.nodeJose.anon

import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alg extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Object] = js.native
  var format: js.UndefOr[compact | flattened] = js.native
}

object Alg {
  @scala.inline
  def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  @scala.inline
  implicit class AlgOps[Self <: Alg] (val x: Self) extends AnyVal {
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormat(value: compact | flattened): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

