package typings.popperjsCore.anon

import typings.popperjsCore.arrowMod.Options
import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.popperjsCore.popperjsCoreStrings.arrow
import typings.popperjsCore.typesMod.ModifierArguments
import typings.popperjsCore.typesMod.Obj
import typings.popperjsCore.typesMod.State
import typings.popperjsCore.typesMod.StrictModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/arrow.ArrowModifier> */
@js.native
trait PartialArrowModifier extends StrictModifiers {
  
  var data: js.UndefOr[Obj] = js.native
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[Options], js.Function0[Unit] | Unit]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fn: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[Options], State | Unit]] = js.native
  
  var name: js.UndefOr[arrow] = js.native
  
  var options: js.UndefOr[PartialOptionsElement] = js.native
  
  var phase: js.UndefOr[ModifierPhases_] = js.native
  
  var requires: js.UndefOr[js.Array[String]] = js.native
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.native
}
object PartialArrowModifier {
  
  @scala.inline
  def apply(): PartialArrowModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArrowModifier]
  }
  
  @scala.inline
  implicit class PartialArrowModifierMutableBuilder[Self <: PartialArrowModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEffect(value: /* arg0 */ ModifierArguments[Options] => js.Function0[Unit] | Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFn(value: /* arg0 */ ModifierArguments[Options] => State | Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    @scala.inline
    def setName(value: arrow): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: PartialOptionsElement): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPhase(value: ModifierPhases_): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    @scala.inline
    def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresIfExists(value: js.Array[String]): Self = StObject.set(x, "requiresIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresIfExistsUndefined: Self = StObject.set(x, "requiresIfExists", js.undefined)
    
    @scala.inline
    def setRequiresIfExistsVarargs(value: String*): Self = StObject.set(x, "requiresIfExists", js.Array(value :_*))
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
  }
}
