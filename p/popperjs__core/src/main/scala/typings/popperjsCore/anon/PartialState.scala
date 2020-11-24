package typings.popperjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.OptionsGeneric
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.StateRects
import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/types.State> */
@js.native
trait PartialState extends js.Object {
  
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
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
    
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
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setElements(value: Arrow): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setModifiersData(value: Dictkey): Self = this.set("modifiersData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiersData: Self = this.set("modifiersData", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsGeneric[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOrderedModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = this.set("orderedModifiers", js.Array(value :_*))
    
    @scala.inline
    def setOrderedModifiers(value: js.Array[Modifier[_, _]]): Self = this.set("orderedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderedModifiers: Self = this.set("orderedModifiers", js.undefined)
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setRects(value: StateRects): Self = this.set("rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRects: Self = this.set("rects", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setScrollParents(value: Popper): Self = this.set("scrollParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollParents: Self = this.set("scrollParents", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[Partial[CSSStyleDeclaration]]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
