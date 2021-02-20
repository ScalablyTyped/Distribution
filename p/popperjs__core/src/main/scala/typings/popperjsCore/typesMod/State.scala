package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.anon.Arrow
import typings.popperjsCore.anon.Dictkey
import typings.popperjsCore.anon.PartialCSSStyleDeclaratio
import typings.popperjsCore.anon.Popper
import typings.popperjsCore.enumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  var attributes: StringDictionary[StringDictionary[String | Boolean]] = js.native
  
  var elements: Arrow = js.native
  
  var modifiersData: Dictkey = js.native
  
  var options: OptionsGeneric[_] = js.native
  
  var orderedModifiers: js.Array[Modifier[_, _]] = js.native
  
  var placement: Placement = js.native
  
  var rects: StateRects = js.native
  
  var reset: Boolean = js.native
  
  var scrollParents: Popper = js.native
  
  var strategy: PositioningStrategy = js.native
  
  var styles: StringDictionary[PartialCSSStyleDeclaratio] = js.native
}
object State {
  
  @scala.inline
  def apply(
    attributes: StringDictionary[StringDictionary[String | Boolean]],
    elements: Arrow,
    modifiersData: Dictkey,
    options: OptionsGeneric[_],
    orderedModifiers: js.Array[Modifier[_, _]],
    placement: Placement,
    rects: StateRects,
    reset: Boolean,
    scrollParents: Popper,
    strategy: PositioningStrategy,
    styles: StringDictionary[PartialCSSStyleDeclaratio]
  ): State = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], modifiersData = modifiersData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], orderedModifiers = orderedModifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], scrollParents = scrollParents.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: Arrow): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersData(value: Dictkey): Self = StObject.set(x, "modifiersData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: OptionsGeneric[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedModifiers(value: js.Array[Modifier[_, _]]): Self = StObject.set(x, "orderedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = StObject.set(x, "orderedModifiers", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRects(value: StateRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollParents(value: Popper): Self = StObject.set(x, "scrollParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[PartialCSSStyleDeclaratio]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
