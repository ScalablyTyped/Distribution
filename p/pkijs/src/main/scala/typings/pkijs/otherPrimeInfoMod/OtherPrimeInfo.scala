package typings.pkijs.otherPrimeInfoMod

import typings.asn1js.mod.Integer
import typings.pkijs.JsonOtherPrimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherPrimeInfo extends js.Object {
  
  var coefficient: Integer = js.native
  
  var exponent: Integer = js.native
  
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  def fromJSON(json: JsonOtherPrimeInfo): Unit = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var prime: Integer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object OtherPrimeInfo {
  
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent: Integer,
    fromJSON: JsonOtherPrimeInfo => Unit,
    fromSchema: js.Any => Unit,
    prime: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), prime = prime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherPrimeInfo]
  }
  
  @scala.inline
  implicit class OtherPrimeInfoOps[Self <: OtherPrimeInfo] (val x: Self) extends AnyVal {
    
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
    def setCoefficient(value: Integer): Self = this.set("coefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponent(value: Integer): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromJSON(value: JsonOtherPrimeInfo => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrime(value: Integer): Self = this.set("prime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
