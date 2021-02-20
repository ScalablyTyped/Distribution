package typings.popperjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.OptionsGeneric
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.StateRects
import typings.std.CSSStyleDeclaration
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/types.State> */
@js.native
trait PartialState extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[StringDictionary[String | Boolean]]] = js.native
  
  var elements: js.UndefOr[Arrow] = js.native
  
  var modifiersData: js.UndefOr[Dictkey] = js.native
  
  var options: js.UndefOr[OptionsGeneric[_]] = js.native
  
  var orderedModifiers: js.UndefOr[js.Array[Modifier[_, _]]] = js.native
  
  var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.native
  
  var rects: js.UndefOr[StateRects] = js.native
  
  var reset: js.UndefOr[Boolean] = js.native
  
  var scrollParents: js.UndefOr[Popper] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
  
  var styles: js.UndefOr[StringDictionary[Partial[CSSStyleDeclaration]]] = js.native
}
object PartialState {
  
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  @scala.inline
  implicit class PartialStateMutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setElements(value: Arrow): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setModifiersData(value: Dictkey): Self = StObject.set(x, "modifiersData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersDataUndefined: Self = StObject.set(x, "modifiersData", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsGeneric[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOrderedModifiers(value: js.Array[Modifier[_, _]]): Self = StObject.set(x, "orderedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedModifiersUndefined: Self = StObject.set(x, "orderedModifiers", js.undefined)
    
    @scala.inline
    def setOrderedModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = StObject.set(x, "orderedModifiers", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setRects(value: StateRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setScrollParents(value: Popper): Self = StObject.set(x, "scrollParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollParentsUndefined: Self = StObject.set(x, "scrollParents", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[Partial[CSSStyleDeclaration]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
