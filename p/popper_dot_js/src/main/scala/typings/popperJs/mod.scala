package typings.popperJs

import org.scalablytyped.runtime.StringDictionary
import typings.popperJs.anon.Arrow
import typings.popperJs.anon.BaseModifierbehaviorBehav
import typings.popperJs.anon.BaseModifierelementstring
import typings.popperJs.anon.BaseModifiergpuAccelerati
import typings.popperJs.anon.BaseModifiernamestring
import typings.popperJs.anon.BaseModifieroffsetnumbers
import typings.popperJs.anon.BaseModifieronLoadFunctio
import typings.popperJs.anon.BaseModifierpriorityArray
import typings.popperJs.popperJsBooleans.`false`
import typings.popperJs.popperJsStrings._empty
import typings.std.CSSStyleDeclaration
import typings.std.ClientRect
import typings.std.Element
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popper.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Popper {
    def this(reference: ReferenceObject, popper: Element) = this()
    def this(reference: Element, popper: Element) = this()
    def this(reference: ReferenceObject, popper: Element, options: PopperOptions) = this()
    def this(reference: Element, popper: Element, options: PopperOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disableEventListeners(): Unit = js.native
    
    /* CompleteClass */
    override def enableEventListeners(): Unit = js.native
    
    /* CompleteClass */
    var options: PopperOptions = js.native
    
    /* CompleteClass */
    var popper: Element = js.native
    
    /* CompleteClass */
    var reference: Element | ReferenceObject = js.native
    
    /* CompleteClass */
    override def scheduleUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  object default {
    
    @JSImport("popper.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("popper.js", "default.Defaults")
    @js.native
    def Defaults: PopperOptions = js.native
    inline def Defaults_=(x: PopperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("popper.js", "default.modifiers")
    @js.native
    def modifiers: js.Array[BaseModifiernamestring] = js.native
    inline def modifiers_=(x: js.Array[BaseModifiernamestring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("popper.js", "default.placements")
    @js.native
    def placements: js.Array[Placement] = js.native
    inline def placements_=(x: js.Array[Placement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placements")(x.asInstanceOf[js.Any])
  }
  
  type BaseModifier = typings.popperJs.mod.Popper.BaseModifier
  
  type Behavior = typings.popperJs.mod.Popper.Behavior
  
  type Boundary = typings.popperJs.mod.Popper.Boundary
  
  type Data = typings.popperJs.mod.Popper.Data
  
  type ModifierFn = typings.popperJs.mod.Popper.ModifierFn
  
  type Modifiers = typings.popperJs.mod.Popper.Modifiers
  
  type Offset = typings.popperJs.mod.Popper.Offset
  
  type Padding = typings.popperJs.mod.Popper.Padding
  
  type Placement = typings.popperJs.mod.Popper.Placement
  
  trait Popper extends StObject {
    
    def destroy(): Unit
    
    def disableEventListeners(): Unit
    
    def enableEventListeners(): Unit
    
    var options: PopperOptions
    
    var popper: Element
    
    var reference: Element | ReferenceObject
    
    def scheduleUpdate(): Unit
    
    def update(): Unit
  }
  object Popper {
    
    inline def apply(
      destroy: () => Unit,
      disableEventListeners: () => Unit,
      enableEventListeners: () => Unit,
      options: typings.popperJs.mod.PopperOptions,
      popper: Element,
      reference: Element | typings.popperJs.mod.ReferenceObject,
      scheduleUpdate: () => Unit,
      update: () => Unit
    ): Popper = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEventListeners = js.Any.fromFunction0(disableEventListeners), enableEventListeners = js.Any.fromFunction0(enableEventListeners), options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Popper]
    }
    
    trait Attributes extends StObject {
      
      var `x-out-of-boundaries`: _empty | `false`
      
      var `x-placement`: typings.popperJs.mod.Popper.Placement
    }
    object Attributes {
      
      inline def apply(`x-out-of-boundaries`: _empty | `false`, `x-placement`: typings.popperJs.mod.Popper.Placement): Attributes = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
        __obj.updateDynamic("x-placement")(`x-placement`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Attributes]
      }
      
      extension [Self <: Attributes](x: Self) {
        
        inline def `setX-out-of-boundaries`(value: _empty | `false`): Self = StObject.set(x, "x-out-of-boundaries", value.asInstanceOf[js.Any])
        
        inline def `setX-placement`(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "x-placement", value.asInstanceOf[js.Any])
      }
    }
    
    trait BaseModifier extends StObject {
      
      var enabled: js.UndefOr[Boolean] = js.undefined
      
      var fn: js.UndefOr[typings.popperJs.mod.Popper.ModifierFn] = js.undefined
      
      var order: js.UndefOr[Double] = js.undefined
    }
    object BaseModifier {
      
      inline def apply(): typings.popperJs.mod.Popper.BaseModifier = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.BaseModifier]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.BaseModifier](x: Self) {
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        inline def setFn(
          value: (/* data */ typings.popperJs.mod.Popper.Data, /* options */ js.Object) => typings.popperJs.mod.Popper.Data
        ): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
        
        inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
        
        inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
        
        inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.flip
      - typings.popperJs.popperJsStrings.clockwise
      - typings.popperJs.popperJsStrings.counterclockwise
    */
    trait Behavior extends StObject
    object Behavior {
      
      inline def clockwise: typings.popperJs.popperJsStrings.clockwise = "clockwise".asInstanceOf[typings.popperJs.popperJsStrings.clockwise]
      
      inline def counterclockwise: typings.popperJs.popperJsStrings.counterclockwise = "counterclockwise".asInstanceOf[typings.popperJs.popperJsStrings.counterclockwise]
      
      inline def flip: typings.popperJs.popperJsStrings.flip = "flip".asInstanceOf[typings.popperJs.popperJsStrings.flip]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.scrollParent
      - typings.popperJs.popperJsStrings.viewport
      - typings.popperJs.popperJsStrings.window
    */
    trait Boundary extends StObject
    object Boundary {
      
      inline def scrollParent: typings.popperJs.popperJsStrings.scrollParent = "scrollParent".asInstanceOf[typings.popperJs.popperJsStrings.scrollParent]
      
      inline def viewport: typings.popperJs.popperJsStrings.viewport = "viewport".asInstanceOf[typings.popperJs.popperJsStrings.viewport]
      
      inline def window: typings.popperJs.popperJsStrings.window = "window".asInstanceOf[typings.popperJs.popperJsStrings.window]
    }
    
    trait Data extends StObject {
      
      var arrowElement: Element
      
      var arrowStyles: CSSStyleDeclaration
      
      var attributes: Attributes
      
      var boundaries: js.Object
      
      var flipped: Boolean
      
      var hide: Boolean
      
      var instance: Popper
      
      var offsets: Arrow
      
      var originalPlacement: typings.popperJs.mod.Popper.Placement
      
      var placement: typings.popperJs.mod.Popper.Placement
      
      var styles: CSSStyleDeclaration
    }
    object Data {
      
      inline def apply(
        arrowElement: Element,
        arrowStyles: CSSStyleDeclaration,
        attributes: Attributes,
        boundaries: js.Object,
        flipped: Boolean,
        hide: Boolean,
        instance: Popper,
        offsets: Arrow,
        originalPlacement: typings.popperJs.mod.Popper.Placement,
        placement: typings.popperJs.mod.Popper.Placement,
        styles: CSSStyleDeclaration
      ): typings.popperJs.mod.Popper.Data = {
        val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Data]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.Data](x: Self) {
        
        inline def setArrowElement(value: Element): Self = StObject.set(x, "arrowElement", value.asInstanceOf[js.Any])
        
        inline def setArrowStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "arrowStyles", value.asInstanceOf[js.Any])
        
        inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setBoundaries(value: js.Object): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
        
        inline def setFlipped(value: Boolean): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
        
        inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setInstance(value: Popper): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        inline def setOffsets(value: Arrow): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
        
        inline def setOriginalPlacement(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "originalPlacement", value.asInstanceOf[js.Any])
        
        inline def setPlacement(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      }
    }
    
    type ModifierFn = js.Function2[
        /* data */ typings.popperJs.mod.Popper.Data, 
        /* options */ js.Object, 
        typings.popperJs.mod.Popper.Data
      ]
    
    trait Modifiers
      extends StObject
         with /* name */ StringDictionary[js.UndefOr[typings.popperJs.mod.Popper.BaseModifier & (Record[String, Any])]] {
      
      var applyStyle: js.UndefOr[BaseModifieronLoadFunctio] = js.undefined
      
      var arrow: js.UndefOr[BaseModifierelementstring] = js.undefined
      
      var computeStyle: js.UndefOr[BaseModifiergpuAccelerati] = js.undefined
      
      var flip: js.UndefOr[BaseModifierbehaviorBehav] = js.undefined
      
      var hide: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.undefined
      
      var inner: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.undefined
      
      var keepTogether: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.undefined
      
      var offset: js.UndefOr[BaseModifieroffsetnumbers] = js.undefined
      
      var preventOverflow: js.UndefOr[BaseModifierpriorityArray] = js.undefined
      
      var shift: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.undefined
    }
    object Modifiers {
      
      inline def apply(): typings.popperJs.mod.Popper.Modifiers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Modifiers]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.Modifiers](x: Self) {
        
        inline def setApplyStyle(value: BaseModifieronLoadFunctio): Self = StObject.set(x, "applyStyle", value.asInstanceOf[js.Any])
        
        inline def setApplyStyleUndefined: Self = StObject.set(x, "applyStyle", js.undefined)
        
        inline def setArrow(value: BaseModifierelementstring): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        inline def setComputeStyle(value: BaseModifiergpuAccelerati): Self = StObject.set(x, "computeStyle", value.asInstanceOf[js.Any])
        
        inline def setComputeStyleUndefined: Self = StObject.set(x, "computeStyle", js.undefined)
        
        inline def setFlip(value: BaseModifierbehaviorBehav): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
        
        inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
        
        inline def setHide(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
        
        inline def setInner(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
        
        inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
        
        inline def setKeepTogether(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
        
        inline def setKeepTogetherUndefined: Self = StObject.set(x, "keepTogether", js.undefined)
        
        inline def setOffset(value: BaseModifieroffsetnumbers): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setPreventOverflow(value: BaseModifierpriorityArray): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
        
        inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
        
        inline def setShift(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
        
        inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      }
    }
    
    trait Offset extends StObject {
      
      var height: Double
      
      var left: Double
      
      var top: Double
      
      var width: Double
    }
    object Offset {
      
      inline def apply(height: Double, left: Double, top: Double, width: Double): typings.popperJs.mod.Popper.Offset = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Offset]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.Offset](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    trait Padding extends StObject {
      
      var bottom: js.UndefOr[Double] = js.undefined
      
      var left: js.UndefOr[Double] = js.undefined
      
      var right: js.UndefOr[Double] = js.undefined
      
      var top: js.UndefOr[Double] = js.undefined
    }
    object Padding {
      
      inline def apply(): typings.popperJs.mod.Popper.Padding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Padding]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.Padding](x: Self) {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.`auto-start`
      - typings.popperJs.popperJsStrings.auto
      - typings.popperJs.popperJsStrings.`auto-end`
      - typings.popperJs.popperJsStrings.`top-start`
      - typings.popperJs.popperJsStrings.top
      - typings.popperJs.popperJsStrings.`top-end`
      - typings.popperJs.popperJsStrings.`right-start`
      - typings.popperJs.popperJsStrings.right
      - typings.popperJs.popperJsStrings.`right-end`
      - typings.popperJs.popperJsStrings.`bottom-end`
      - typings.popperJs.popperJsStrings.bottom
      - typings.popperJs.popperJsStrings.`bottom-start`
      - typings.popperJs.popperJsStrings.`left-end`
      - typings.popperJs.popperJsStrings.left
      - typings.popperJs.popperJsStrings.`left-start`
    */
    trait Placement extends StObject
    object Placement {
      
      inline def auto: typings.popperJs.popperJsStrings.auto = "auto".asInstanceOf[typings.popperJs.popperJsStrings.auto]
      
      inline def `auto-end`: typings.popperJs.popperJsStrings.`auto-end` = "auto-end".asInstanceOf[typings.popperJs.popperJsStrings.`auto-end`]
      
      inline def `auto-start`: typings.popperJs.popperJsStrings.`auto-start` = "auto-start".asInstanceOf[typings.popperJs.popperJsStrings.`auto-start`]
      
      inline def bottom: typings.popperJs.popperJsStrings.bottom = "bottom".asInstanceOf[typings.popperJs.popperJsStrings.bottom]
      
      inline def `bottom-end`: typings.popperJs.popperJsStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.popperJs.popperJsStrings.`bottom-end`]
      
      inline def `bottom-start`: typings.popperJs.popperJsStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.popperJs.popperJsStrings.`bottom-start`]
      
      inline def left: typings.popperJs.popperJsStrings.left = "left".asInstanceOf[typings.popperJs.popperJsStrings.left]
      
      inline def `left-end`: typings.popperJs.popperJsStrings.`left-end` = "left-end".asInstanceOf[typings.popperJs.popperJsStrings.`left-end`]
      
      inline def `left-start`: typings.popperJs.popperJsStrings.`left-start` = "left-start".asInstanceOf[typings.popperJs.popperJsStrings.`left-start`]
      
      inline def right: typings.popperJs.popperJsStrings.right = "right".asInstanceOf[typings.popperJs.popperJsStrings.right]
      
      inline def `right-end`: typings.popperJs.popperJsStrings.`right-end` = "right-end".asInstanceOf[typings.popperJs.popperJsStrings.`right-end`]
      
      inline def `right-start`: typings.popperJs.popperJsStrings.`right-start` = "right-start".asInstanceOf[typings.popperJs.popperJsStrings.`right-start`]
      
      inline def top: typings.popperJs.popperJsStrings.top = "top".asInstanceOf[typings.popperJs.popperJsStrings.top]
      
      inline def `top-end`: typings.popperJs.popperJsStrings.`top-end` = "top-end".asInstanceOf[typings.popperJs.popperJsStrings.`top-end`]
      
      inline def `top-start`: typings.popperJs.popperJsStrings.`top-start` = "top-start".asInstanceOf[typings.popperJs.popperJsStrings.`top-start`]
    }
    
    extension [Self <: Popper](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisableEventListeners(value: () => Unit): Self = StObject.set(x, "disableEventListeners", js.Any.fromFunction0(value))
      
      inline def setEnableEventListeners(value: () => Unit): Self = StObject.set(x, "enableEventListeners", js.Any.fromFunction0(value))
      
      inline def setOptions(value: typings.popperJs.mod.PopperOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: Element): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setReference(value: Element | typings.popperJs.mod.ReferenceObject): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setScheduleUpdate(value: () => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
    
    trait PopperOptions extends StObject {
      
      var eventsEnabled: js.UndefOr[Boolean] = js.undefined
      
      var modifiers: js.UndefOr[typings.popperJs.mod.Popper.Modifiers] = js.undefined
      
      var onCreate: js.UndefOr[js.Function1[/* data */ typings.popperJs.mod.Popper.Data, Unit]] = js.undefined
      
      var onUpdate: js.UndefOr[js.Function1[/* data */ typings.popperJs.mod.Popper.Data, Unit]] = js.undefined
      
      var placement: js.UndefOr[typings.popperJs.mod.Popper.Placement] = js.undefined
      
      var positionFixed: js.UndefOr[Boolean] = js.undefined
      
      var removeOnDestroy: js.UndefOr[Boolean] = js.undefined
    }
    object PopperOptions {
      
      inline def apply(): typings.popperJs.mod.Popper.PopperOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.PopperOptions]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.PopperOptions](x: Self) {
        
        inline def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
        
        inline def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
        
        inline def setModifiers(value: typings.popperJs.mod.Popper.Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        inline def setOnCreate(value: /* data */ typings.popperJs.mod.Popper.Data => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
        
        inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
        
        inline def setOnUpdate(value: /* data */ typings.popperJs.mod.Popper.Data => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
        
        inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
        
        inline def setPlacement(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
        
        inline def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
        
        inline def setRemoveOnDestroy(value: Boolean): Self = StObject.set(x, "removeOnDestroy", value.asInstanceOf[js.Any])
        
        inline def setRemoveOnDestroyUndefined: Self = StObject.set(x, "removeOnDestroy", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.top
      - typings.popperJs.popperJsStrings.right
      - typings.popperJs.popperJsStrings.bottom
      - typings.popperJs.popperJsStrings.left
    */
    trait Position extends StObject
    object Position {
      
      inline def bottom: typings.popperJs.popperJsStrings.bottom = "bottom".asInstanceOf[typings.popperJs.popperJsStrings.bottom]
      
      inline def left: typings.popperJs.popperJsStrings.left = "left".asInstanceOf[typings.popperJs.popperJsStrings.left]
      
      inline def right: typings.popperJs.popperJsStrings.right = "right".asInstanceOf[typings.popperJs.popperJsStrings.right]
      
      inline def top: typings.popperJs.popperJsStrings.top = "top".asInstanceOf[typings.popperJs.popperJsStrings.top]
    }
    
    trait ReferenceObject extends StObject {
      
      var clientHeight: Double
      
      var clientWidth: Double
      
      def getBoundingClientRect(): ClientRect
      
      var referenceNode: js.UndefOr[Node] = js.undefined
    }
    object ReferenceObject {
      
      inline def apply(clientHeight: Double, clientWidth: Double, getBoundingClientRect: () => ClientRect): typings.popperJs.mod.Popper.ReferenceObject = {
        val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
        __obj.asInstanceOf[typings.popperJs.mod.Popper.ReferenceObject]
      }
      
      extension [Self <: typings.popperJs.mod.Popper.ReferenceObject](x: Self) {
        
        inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
        
        inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
        
        inline def setGetBoundingClientRect(value: () => ClientRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
        
        inline def setReferenceNode(value: Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
        
        inline def setReferenceNodeUndefined: Self = StObject.set(x, "referenceNode", js.undefined)
      }
    }
  }
  
  type PopperOptions = typings.popperJs.mod.Popper.PopperOptions
  
  type Position = typings.popperJs.mod.Popper.Position
  
  type ReferenceObject = typings.popperJs.mod.Popper.ReferenceObject
}
