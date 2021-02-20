package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/types.OptionsGeneric<any>> */
@js.native
trait PartialOptionsGenericany extends StObject {
  
  var modifiers: js.UndefOr[js.Array[_]] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
}
object PartialOptionsGenericany {
  
  @scala.inline
  def apply(): PartialOptionsGenericany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsGenericany]
  }
  
  @scala.inline
  implicit class PartialOptionsGenericanyMutableBuilder[Self <: PartialOptionsGenericany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: js.Array[_]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(value: js.Any*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
