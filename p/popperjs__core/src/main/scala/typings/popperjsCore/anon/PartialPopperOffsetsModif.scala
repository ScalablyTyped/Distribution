package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.popperjsCore.popperjsCoreStrings.popperOffsets
import typings.popperjsCore.typesMod.ModifierArguments
import typings.popperjsCore.typesMod.Obj
import typings.popperjsCore.typesMod.State
import typings.popperjsCore.typesMod.StrictModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/popperOffsets.PopperOffsetsModifier> */
trait PartialPopperOffsetsModif
  extends StObject
     with StrictModifiers {
  
  var data: js.UndefOr[Obj] = js.undefined
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], js.Function0[Unit] | Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fn: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], State | Unit]] = js.undefined
  
  var name: js.UndefOr[popperOffsets] = js.undefined
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var phase: js.UndefOr[ModifierPhases_] = js.undefined
  
  var requires: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialPopperOffsetsModif {
  
  @scala.inline
  def apply(): PartialPopperOffsetsModif = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPopperOffsetsModif]
  }
  
  @scala.inline
  implicit class PartialPopperOffsetsModifMutableBuilder[Self <: PartialPopperOffsetsModif] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEffect(value: /* arg0 */ ModifierArguments[js.Object] => js.Function0[Unit] | Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFn(value: /* arg0 */ ModifierArguments[js.Object] => State | Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    @scala.inline
    def setName(value: popperOffsets): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
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
