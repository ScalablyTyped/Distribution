package typings.meteorMdgValidatedMethod.mod

import typings.meteorMdgValidatedMethod.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatedMethodOptions[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] extends ValidatedMethodOptionsMixinFields[Argument[TRun], Return[TRun]] {
  
  var applyOptions: js.UndefOr[Dictkey] = js.native
  
  // Force the name to be a string literal
  var name: TName with String = js.native
  
  var run: TRun = js.native
  
  var validate: (js.Function1[/* arg */ Argument[TRun], _]) | Null = js.native
}
object ValidatedMethodOptions {
  
  @scala.inline
  def apply[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */](name: TName with String, run: TRun): ValidatedMethodOptions[TName, TRun] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatedMethodOptions[TName, TRun]]
  }
  
  @scala.inline
  implicit class ValidatedMethodOptionsOps[Self <: ValidatedMethodOptions[_, _], TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with (ValidatedMethodOptions[TName, TRun])) extends AnyVal {
    
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
    def setName(value: TName with String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: TRun): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyOptions(value: Dictkey): Self = this.set("applyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyOptions: Self = this.set("applyOptions", js.undefined)
    
    @scala.inline
    def setValidate(value: /* arg */ Argument[TRun] => _): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateNull: Self = this.set("validate", null)
  }
}
