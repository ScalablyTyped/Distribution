package typings.pkijs.distributionPointMod

import typings.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionPoint extends js.Object {
  
  var cRLIssuer: js.UndefOr[js.Array[typings.pkijs.generalNameMod.default]] = js.native
  
  var distributionPoint: js.UndefOr[js.Array[typings.pkijs.generalNameMod.default]] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var reasons: js.UndefOr[BitString] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object DistributionPoint {
  
  @scala.inline
  def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): DistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[DistributionPoint]
  }
  
  @scala.inline
  implicit class DistributionPointOps[Self <: DistributionPoint] (val x: Self) extends AnyVal {
    
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCRLIssuerVarargs(value: typings.pkijs.generalNameMod.default*): Self = this.set("cRLIssuer", js.Array(value :_*))
    
    @scala.inline
    def setCRLIssuer(value: js.Array[typings.pkijs.generalNameMod.default]): Self = this.set("cRLIssuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCRLIssuer: Self = this.set("cRLIssuer", js.undefined)
    
    @scala.inline
    def setDistributionPointVarargs(value: typings.pkijs.generalNameMod.default*): Self = this.set("distributionPoint", js.Array(value :_*))
    
    @scala.inline
    def setDistributionPoint(value: js.Array[typings.pkijs.generalNameMod.default]): Self = this.set("distributionPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionPoint: Self = this.set("distributionPoint", js.undefined)
    
    @scala.inline
    def setReasons(value: BitString): Self = this.set("reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasons: Self = this.set("reasons", js.undefined)
  }
}
