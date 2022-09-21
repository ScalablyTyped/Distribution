package typings.popperJs

import typings.popperJs.mod.Popper.Behavior
import typings.popperJs.mod.Popper.Boundary
import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.mod.Popper.Offset
import typings.popperJs.mod.Popper.Padding
import typings.popperJs.mod.Popper.Position
import typings.popperJs.popperJsStrings.bottom
import typings.popperJs.popperJsStrings.left
import typings.popperJs.popperJsStrings.right
import typings.popperJs.popperJsStrings.top
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arrow extends StObject {
    
    var arrow: Left
    
    var popper: Offset
    
    var reference: Offset
  }
  object Arrow {
    
    inline def apply(arrow: Left, popper: Offset, reference: Offset): Arrow = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arrow]
    }
    
    extension [Self <: Arrow](x: Self) {
      
      inline def setArrow(value: Left): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: Offset): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setReference(value: Offset): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   flipVariations :boolean | undefined,   flipVariationsByContent :boolean | undefined} */
  trait BaseModifierbehaviorBehav extends StObject {
    
    var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.undefined
    
    var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var flipVariations: js.UndefOr[Boolean] = js.undefined
    
    var flipVariationsByContent: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Double | Padding] = js.undefined
  }
  object BaseModifierbehaviorBehav {
    
    inline def apply(): BaseModifierbehaviorBehav = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifierbehaviorBehav]
    }
    
    extension [Self <: BaseModifierbehaviorBehav](x: Self) {
      
      inline def setBehavior(value: Behavior | js.Array[Position]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setBehaviorVarargs(value: Position*): Self = StObject.set(x, "behavior", js.Array(value*))
      
      inline def setBoundariesElement(value: Boundary | Element): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      inline def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      inline def setFlipVariationsByContent(value: Boolean): Self = StObject.set(x, "flipVariationsByContent", value.asInstanceOf[js.Any])
      
      inline def setFlipVariationsByContentUndefined: Self = StObject.set(x, "flipVariationsByContent", js.undefined)
      
      inline def setFlipVariationsUndefined: Self = StObject.set(x, "flipVariations", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  element :string | std.Element | undefined} */
  trait BaseModifierelementstring extends StObject {
    
    var element: js.UndefOr[String | Element] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object BaseModifierelementstring {
    
    inline def apply(): BaseModifierelementstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifierelementstring]
    }
    
    extension [Self <: BaseModifierelementstring](x: Self) {
      
      inline def setElement(value: String | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  gpuAcceleration :boolean | undefined,   x :'bottom' | 'top' | undefined,   y :'left' | 'right' | undefined} */
  trait BaseModifiergpuAccelerati extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[bottom | top] = js.undefined
    
    var y: js.UndefOr[left | right] = js.undefined
  }
  object BaseModifiergpuAccelerati {
    
    inline def apply(): BaseModifiergpuAccelerati = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifiergpuAccelerati]
    }
    
    extension [Self <: BaseModifiergpuAccelerati](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
      
      inline def setGpuAccelerationUndefined: Self = StObject.set(x, "gpuAcceleration", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setX(value: bottom | top): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: left | right): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.BaseModifier & {  name :string} */
  trait BaseModifiernamestring extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var name: String
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object BaseModifiernamestring {
    
    inline def apply(name: String): BaseModifiernamestring = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseModifiernamestring]
    }
    
    extension [Self <: BaseModifiernamestring](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  offset :number | string | undefined} */
  trait BaseModifieroffsetnumbers extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object BaseModifieroffsetnumbers {
    
    inline def apply(): BaseModifieroffsetnumbers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifieroffsetnumbers]
    }
    
    extension [Self <: BaseModifieroffsetnumbers](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  onLoad :std.Function | undefined,   gpuAcceleration :boolean | undefined} */
  trait BaseModifieronLoadFunctio extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
    
    var onLoad: js.UndefOr[js.Function] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
  }
  object BaseModifieronLoadFunctio {
    
    inline def apply(): BaseModifieronLoadFunctio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifieronLoadFunctio]
    }
    
    extension [Self <: BaseModifieronLoadFunctio](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
      
      inline def setGpuAccelerationUndefined: Self = StObject.set(x, "gpuAcceleration", js.undefined)
      
      inline def setOnLoad(value: js.Function): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  priority :std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   escapeWithReference :boolean | undefined} */
  trait BaseModifierpriorityArray extends StObject {
    
    var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var escapeWithReference: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[ModifierFn] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Double | Padding] = js.undefined
    
    var priority: js.UndefOr[js.Array[Position]] = js.undefined
  }
  object BaseModifierpriorityArray {
    
    inline def apply(): BaseModifierpriorityArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifierpriorityArray]
    }
    
    extension [Self <: BaseModifierpriorityArray](x: Self) {
      
      inline def setBoundariesElement(value: Boundary | Element): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      inline def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEscapeWithReference(value: Boolean): Self = StObject.set(x, "escapeWithReference", value.asInstanceOf[js.Any])
      
      inline def setEscapeWithReferenceUndefined: Self = StObject.set(x, "escapeWithReference", js.undefined)
      
      inline def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPriority(value: js.Array[Position]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setPriorityVarargs(value: Position*): Self = StObject.set(x, "priority", js.Array(value*))
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    inline def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
