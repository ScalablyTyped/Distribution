package typings.nodePgMigrate.operatorsTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOperatorOptions extends js.Object {
  var commutator: js.UndefOr[Name] = js.native
  var hashes: js.UndefOr[Boolean] = js.native
  var join: js.UndefOr[Name] = js.native
  var left: js.UndefOr[Name] = js.native
  var merges: js.UndefOr[Boolean] = js.native
  var negator: js.UndefOr[Name] = js.native
  var procedure: Name = js.native
  var restrict: js.UndefOr[Name] = js.native
  var right: js.UndefOr[Name] = js.native
}

object CreateOperatorOptions {
  @scala.inline
  def apply(procedure: Name): CreateOperatorOptions = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOperatorOptions]
  }
  @scala.inline
  implicit class CreateOperatorOptionsOps[Self <: CreateOperatorOptions] (val x: Self) extends AnyVal {
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
    def setProcedure(value: Name): Self = this.set("procedure", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommutator(value: Name): Self = this.set("commutator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommutator: Self = this.set("commutator", js.undefined)
    @scala.inline
    def setHashes(value: Boolean): Self = this.set("hashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashes: Self = this.set("hashes", js.undefined)
    @scala.inline
    def setJoin(value: Name): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setLeft(value: Name): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMerges(value: Boolean): Self = this.set("merges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerges: Self = this.set("merges", js.undefined)
    @scala.inline
    def setNegator(value: Name): Self = this.set("negator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegator: Self = this.set("negator", js.undefined)
    @scala.inline
    def setRestrict(value: Name): Self = this.set("restrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrict: Self = this.set("restrict", js.undefined)
    @scala.inline
    def setRight(value: Name): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

