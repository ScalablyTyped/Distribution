package typings.meteorMdgValidatedMethod.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatedMethodOptionsWithMixins[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] extends ValidatedMethodOptions[TName, TRun] {
  
  // Force TRun to be inferred from run itself rather than from the elements of mixins
  var mixins: js.UndefOr[js.Array[Mixin[TName, _]]] = js.native
}
object ValidatedMethodOptionsWithMixins {
  
  @scala.inline
  def apply[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */](name: TName with String, run: TRun): ValidatedMethodOptionsWithMixins[TName, TRun] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatedMethodOptionsWithMixins[TName, TRun]]
  }
  
  @scala.inline
  implicit class ValidatedMethodOptionsWithMixinsOps[Self <: ValidatedMethodOptionsWithMixins[_, _], TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with (ValidatedMethodOptionsWithMixins[TName, TRun])) extends AnyVal {
    
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
    def setMixinsVarargs(value: (Mixin[TName, js.Any])*): Self = this.set("mixins", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[Mixin[TName, _]]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
  }
}
