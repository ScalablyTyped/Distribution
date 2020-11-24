package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.anon.Arrow
import typings.popperjsCore.anon.Dictkey
import typings.popperjsCore.anon.PartialCSSStyleDeclaratio
import typings.popperjsCore.anon.Popper
import typings.popperjsCore.enumsMod.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
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
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: Arrow): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersData(value: Dictkey): Self = this.set("modifiersData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: OptionsGeneric[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = this.set("orderedModifiers", js.Array(value :_*))
    
    @scala.inline
    def setOrderedModifiers(value: js.Array[Modifier[_, _]]): Self = this.set("orderedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRects(value: StateRects): Self = this.set("rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollParents(value: Popper): Self = this.set("scrollParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[PartialCSSStyleDeclaratio]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
