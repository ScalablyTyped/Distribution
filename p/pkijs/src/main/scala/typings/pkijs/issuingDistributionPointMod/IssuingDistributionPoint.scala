package typings.pkijs.issuingDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuingDistributionPoint extends js.Object {
  var distributionPoint: js.UndefOr[
    js.Array[typings.pkijs.generalNameMod.default] | typings.pkijs.relativeDistinguishedNamesMod.default
  ] = js.native
  var indirectCRL: Boolean = js.native
  var onlyContainsAttributeCerts: Boolean = js.native
  var onlyContainsUserCerts: Boolean = js.native
  var onlySomeReasons: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object IssuingDistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    indirectCRL: Boolean,
    onlyContainsAttributeCerts: Boolean,
    onlyContainsUserCerts: Boolean,
    onlySomeReasons: Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): IssuingDistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), indirectCRL = indirectCRL.asInstanceOf[js.Any], onlyContainsAttributeCerts = onlyContainsAttributeCerts.asInstanceOf[js.Any], onlyContainsUserCerts = onlyContainsUserCerts.asInstanceOf[js.Any], onlySomeReasons = onlySomeReasons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[IssuingDistributionPoint]
  }
  @scala.inline
  implicit class IssuingDistributionPointOps[Self <: IssuingDistributionPoint] (val x: Self) extends AnyVal {
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setIndirectCRL(value: Boolean): Self = this.set("indirectCRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyContainsAttributeCerts(value: Boolean): Self = this.set("onlyContainsAttributeCerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyContainsUserCerts(value: Boolean): Self = this.set("onlyContainsUserCerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlySomeReasons(value: Double): Self = this.set("onlySomeReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setDistributionPointVarargs(value: typings.pkijs.generalNameMod.default*): Self = this.set("distributionPoint", js.Array(value :_*))
    @scala.inline
    def setDistributionPoint(
      value: js.Array[typings.pkijs.generalNameMod.default] | typings.pkijs.relativeDistinguishedNamesMod.default
    ): Self = this.set("distributionPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionPoint: Self = this.set("distributionPoint", js.undefined)
  }
  
}

