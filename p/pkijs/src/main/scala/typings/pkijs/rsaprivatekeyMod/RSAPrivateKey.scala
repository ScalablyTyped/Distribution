package typings.pkijs.rsaprivatekeyMod

import typings.asn1js.mod.Integer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSAPrivateKey extends js.Object {
  
  var coefficient: Integer = js.native
  
  var exponent1: Integer = js.native
  
  var exponent2: Integer = js.native
  
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var modulus: Integer = js.native
  
  var otherPrimeInfos: js.UndefOr[js.Array[typings.pkijs.otherPrimeInfoMod.default]] = js.native
  
  var prime1: Integer = js.native
  
  var prime2: Integer = js.native
  
  var privateExponent: Integer = js.native
  
  var publicExponent: Integer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var version: Double = js.native
}
object RSAPrivateKey {
  
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent1: Integer,
    exponent2: Integer,
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    modulus: Integer,
    prime1: Integer,
    prime2: Integer,
    privateExponent: Integer,
    publicExponent: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKey]
  }
  
  @scala.inline
  implicit class RSAPrivateKeyOps[Self <: RSAPrivateKey] (val x: Self) extends AnyVal {
    
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
    def setExponent1(value: Integer): Self = this.set("exponent1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponent2(value: Integer): Self = this.set("exponent2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromJSON(value: JsonWebKey => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModulus(value: Integer): Self = this.set("modulus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrime1(value: Integer): Self = this.set("prime1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrime2(value: Integer): Self = this.set("prime2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateExponent(value: Integer): Self = this.set("privateExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: Integer): Self = this.set("publicExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherPrimeInfosVarargs(value: typings.pkijs.otherPrimeInfoMod.default*): Self = this.set("otherPrimeInfos", js.Array(value :_*))
    
    @scala.inline
    def setOtherPrimeInfos(value: js.Array[typings.pkijs.otherPrimeInfoMod.default]): Self = this.set("otherPrimeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherPrimeInfos: Self = this.set("otherPrimeInfos", js.undefined)
  }
}
