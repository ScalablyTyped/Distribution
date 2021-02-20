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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Arrow extends StObject {
    
    var arrow: Left = js.native
    
    var popper: Offset = js.native
    
    var reference: Offset = js.native
  }
  object Arrow {
    
    @scala.inline
    def apply(arrow: Left, popper: Offset, reference: Offset): Arrow = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arrow]
    }
    
    @scala.inline
    implicit class ArrowMutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: Left): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopper(value: Offset): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: Offset): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   flipVariations :boolean | undefined,   flipVariationsByContent :boolean | undefined} */
  @js.native
  trait BaseModifierbehaviorBehav extends StObject {
    
    var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.native
    
    var boundariesElement: js.UndefOr[Boundary | Element] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var flipVariations: js.UndefOr[Boolean] = js.native
    
    var flipVariationsByContent: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Double | Padding] = js.native
  }
  object BaseModifierbehaviorBehav {
    
    @scala.inline
    def apply(): BaseModifierbehaviorBehav = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifierbehaviorBehav]
    }
    
    @scala.inline
    implicit class BaseModifierbehaviorBehavMutableBuilder[Self <: BaseModifierbehaviorBehav] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: Behavior | js.Array[Position]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      @scala.inline
      def setBehaviorVarargs(value: Position*): Self = StObject.set(x, "behavior", js.Array(value :_*))
      
      @scala.inline
      def setBoundariesElement(value: Boundary | Element): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipVariationsByContent(value: Boolean): Self = StObject.set(x, "flipVariationsByContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipVariationsByContentUndefined: Self = StObject.set(x, "flipVariationsByContent", js.undefined)
      
      @scala.inline
      def setFlipVariationsUndefined: Self = StObject.set(x, "flipVariations", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  element :string | std.Element | undefined} */
  @js.native
  trait BaseModifierelementstring extends StObject {
    
    var element: js.UndefOr[String | Element] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var order: js.UndefOr[Double] = js.native
  }
  object BaseModifierelementstring {
    
    @scala.inline
    def apply(): BaseModifierelementstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifierelementstring]
    }
    
    @scala.inline
    implicit class BaseModifierelementstringMutableBuilder[Self <: BaseModifierelementstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: String | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  gpuAcceleration :boolean | undefined,   x :'bottom' | 'top' | undefined,   y :'left' | 'right' | undefined} */
  @js.native
  trait BaseModifiergpuAccelerati extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var gpuAcceleration: js.UndefOr[Boolean] = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[bottom | top] = js.native
    
    var y: js.UndefOr[left | right] = js.native
  }
  object BaseModifiergpuAccelerati {
    
    @scala.inline
    def apply(): BaseModifiergpuAccelerati = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifiergpuAccelerati]
    }
    
    @scala.inline
    implicit class BaseModifiergpuAcceleratiMutableBuilder[Self <: BaseModifiergpuAccelerati] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpuAccelerationUndefined: Self = StObject.set(x, "gpuAcceleration", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setX(value: bottom | top): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: left | right): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.BaseModifier & {  name :string} */
  @js.native
  trait BaseModifiernamestring extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var name: String = js.native
    
    var order: js.UndefOr[Double] = js.native
  }
  object BaseModifiernamestring {
    
    @scala.inline
    def apply(name: String): BaseModifiernamestring = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseModifiernamestring]
    }
    
    @scala.inline
    implicit class BaseModifiernamestringMutableBuilder[Self <: BaseModifiernamestring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  offset :number | string | undefined} */
  @js.native
  trait BaseModifieroffsetnumbers extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var order: js.UndefOr[Double] = js.native
  }
  object BaseModifieroffsetnumbers {
    
    @scala.inline
    def apply(): BaseModifieroffsetnumbers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifieroffsetnumbers]
    }
    
    @scala.inline
    implicit class BaseModifieroffsetnumbersMutableBuilder[Self <: BaseModifieroffsetnumbers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  onLoad :std.Function | undefined,   gpuAcceleration :boolean | undefined} */
  @js.native
  trait BaseModifieronLoadFunctio extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var gpuAcceleration: js.UndefOr[Boolean] = js.native
    
    var onLoad: js.UndefOr[js.Function] = js.native
    
    var order: js.UndefOr[Double] = js.native
  }
  object BaseModifieronLoadFunctio {
    
    @scala.inline
    def apply(): BaseModifieronLoadFunctio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifieronLoadFunctio]
    }
    
    @scala.inline
    implicit class BaseModifieronLoadFunctioMutableBuilder[Self <: BaseModifieronLoadFunctio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpuAccelerationUndefined: Self = StObject.set(x, "gpuAcceleration", js.undefined)
      
      @scala.inline
      def setOnLoad(value: js.Function): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Inlined popper.js.popper.js.Popper.BaseModifier & {  priority :std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   escapeWithReference :boolean | undefined} */
  @js.native
  trait BaseModifierpriorityArray extends StObject {
    
    var boundariesElement: js.UndefOr[Boundary | Element] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var escapeWithReference: js.UndefOr[Boolean] = js.native
    
    var fn: js.UndefOr[ModifierFn] = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Double | Padding] = js.native
    
    var priority: js.UndefOr[js.Array[Position]] = js.native
  }
  object BaseModifierpriorityArray {
    
    @scala.inline
    def apply(): BaseModifierpriorityArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModifierpriorityArray]
    }
    
    @scala.inline
    implicit class BaseModifierpriorityArrayMutableBuilder[Self <: BaseModifierpriorityArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundariesElement(value: Boundary | Element): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEscapeWithReference(value: Boolean): Self = StObject.set(x, "escapeWithReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeWithReferenceUndefined: Self = StObject.set(x, "escapeWithReference", js.undefined)
      
      @scala.inline
      def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPriority(value: js.Array[Position]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setPriorityVarargs(value: Position*): Self = StObject.set(x, "priority", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Left extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
