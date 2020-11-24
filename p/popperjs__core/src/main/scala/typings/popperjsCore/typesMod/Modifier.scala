package typings.popperjsCore.typesMod

import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modifier[Name, Options] extends js.Object {
  
  var data: js.UndefOr[Obj] = js.native
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[Options], js.Function0[Unit] | Unit]] = js.native
  
  var enabled: Boolean = js.native
  
  def fn(arg0: ModifierArguments[Options]): State | Unit = js.native
  
  var name: Name = js.native
  
  var options: js.UndefOr[Partial[Options]] = js.native
  
  var phase: ModifierPhases_ = js.native
  
  var requires: js.UndefOr[js.Array[String]] = js.native
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.native
}
object Modifier {
  
  @scala.inline
  def apply[Name, Options](
    enabled: Boolean,
    fn: ModifierArguments[Options] => State | Unit,
    name: Name,
    phase: ModifierPhases_
  ): Modifier[Name, Options] = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifier[Name, Options]]
  }
  
  @scala.inline
  implicit class ModifierOps[Self <: Modifier[_, _], Name, Options] (val x: Self with (Modifier[Name, Options])) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: ModifierArguments[Options] => State | Unit): Self = this.set("fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: ModifierPhases_): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Obj): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEffect(value: /* arg0 */ ModifierArguments[Options] => js.Function0[Unit] | Unit): Self = this.set("effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setOptions(value: Partial[Options]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
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
