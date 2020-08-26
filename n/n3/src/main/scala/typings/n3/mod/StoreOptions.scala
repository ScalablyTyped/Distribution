package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreOptions extends js.Object {
  var factory: js.UndefOr[typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]] = js.native
}

object StoreOptions {
  @scala.inline
  def apply(): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions]
  }
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions] (val x: Self) extends AnyVal {
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
    def setFactory(value: typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
  }
  
}

