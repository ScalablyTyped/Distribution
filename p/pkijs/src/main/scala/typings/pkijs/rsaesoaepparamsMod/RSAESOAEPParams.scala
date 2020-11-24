package typings.pkijs.rsaesoaepparamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSAESOAEPParams extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object RSAESOAEPParams {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RSAESOAEPParams = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], pSourceAlgorithm = pSourceAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[RSAESOAEPParams]
  }
  
  @scala.inline
  implicit class RSAESOAEPParamsOps[Self <: RSAESOAEPParams] (val x: Self) extends AnyVal {
    
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
    def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskGenAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPSourceAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("pSourceAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
