package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.popperjsCore.popperjsCoreStrings.applyStyles
import typings.popperjsCore.typesMod.ModifierArguments
import typings.popperjsCore.typesMod.Obj
import typings.popperjsCore.typesMod.State
import typings.popperjsCore.typesMod.StrictModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/applyStyles.ApplyStylesModifier> */
@js.native
trait PartialApplyStylesModifie extends StrictModifiers {
  
  var data: js.UndefOr[Obj] = js.native
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], js.Function0[Unit] | Unit]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fn: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], State | Unit]] = js.native
  
  var name: js.UndefOr[applyStyles] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var phase: js.UndefOr[ModifierPhases_] = js.native
  
  var requires: js.UndefOr[js.Array[String]] = js.native
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.native
}
object PartialApplyStylesModifie {
  
  @scala.inline
  def apply(): PartialApplyStylesModifie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialApplyStylesModifie]
  }
  
  @scala.inline
  implicit class PartialApplyStylesModifieOps[Self <: PartialApplyStylesModifie] (val x: Self) extends AnyVal {
    
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
    def setData(value: Obj): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEffect(value: /* arg0 */ ModifierArguments[js.Object] => js.Function0[Unit] | Unit): Self = this.set("effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFn(value: /* arg0 */ ModifierArguments[js.Object] => State | Unit): Self = this.set("fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    
    @scala.inline
    def setName(value: applyStyles): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPhase(value: ModifierPhases_): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = this.set("requires", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: js.Array[String]): Self = this.set("requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
    
    @scala.inline
    def setRequiresIfExistsVarargs(value: String*): Self = this.set("requiresIfExists", js.Array(value :_*))
    
    @scala.inline
    def setRequiresIfExists(value: js.Array[String]): Self = this.set("requiresIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresIfExists: Self = this.set("requiresIfExists", js.undefined)
  }
}
