package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.popperjsCore.popperjsCoreStrings.applyStyles
import typings.popperjsCore.typesMod.ModifierArguments
import typings.popperjsCore.typesMod.Obj
import typings.popperjsCore.typesMod.State
import typings.popperjsCore.typesMod.StrictModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/applyStyles.ApplyStylesModifier> */
trait PartialApplyStylesModifie
  extends StObject
     with StrictModifiers {
  
  var data: js.UndefOr[Obj] = js.undefined
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], js.Function0[Unit] | Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fn: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], State | Unit]] = js.undefined
  
  var name: js.UndefOr[applyStyles] = js.undefined
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var phase: js.UndefOr[ModifierPhases_] = js.undefined
  
  var requires: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialApplyStylesModifie {
  
  inline def apply(): PartialApplyStylesModifie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialApplyStylesModifie]
  }
  
  extension [Self <: PartialApplyStylesModifie](x: Self) {
    
    inline def setData(value: Obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEffect(value: /* arg0 */ ModifierArguments[js.Object] => js.Function0[Unit] | Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFn(value: /* arg0 */ ModifierArguments[js.Object] => State | Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    inline def setName(value: applyStyles): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPhase(value: ModifierPhases_): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresIfExists(value: js.Array[String]): Self = StObject.set(x, "requiresIfExists", value.asInstanceOf[js.Any])
    
    inline def setRequiresIfExistsUndefined: Self = StObject.set(x, "requiresIfExists", js.undefined)
    
    inline def setRequiresIfExistsVarargs(value: String*): Self = StObject.set(x, "requiresIfExists", js.Array(value*))
    
    inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
  }
}
