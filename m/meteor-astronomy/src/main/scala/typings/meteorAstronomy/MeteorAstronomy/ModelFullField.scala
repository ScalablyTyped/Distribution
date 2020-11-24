package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelFullField[Field, Doc] extends js.Object {
  
  var default: js.UndefOr[js.Function0[Field]] = js.native
  
  var immutable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | Double] = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var resolve: js.UndefOr[js.Function1[/* doc */ Doc, Field]] = js.native
  
  var transient: js.UndefOr[Boolean] = js.native
  
  var `type`: TypeOptions = js.native
  
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}
object ModelFullField {
  
  @scala.inline
  def apply[Field, Doc](`type`: TypeOptions): ModelFullField[Field, Doc] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFullField[Field, Doc]]
  }
  
  @scala.inline
  implicit class ModelFullFieldOps[Self <: ModelFullField[_, _], Field, Doc] (val x: Self with (ModelFullField[Field, Doc])) extends AnyVal {
    
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
    def setTypeVarargs(value: TypeOptionsPrimitives*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: () => Field): Self = this.set("default", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    
    @scala.inline
    def setIndex(value: String | Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setResolve(value: /* doc */ Doc => Field): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setTransient(value: Boolean): Self = this.set("transient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransient: Self = this.set("transient", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
}
