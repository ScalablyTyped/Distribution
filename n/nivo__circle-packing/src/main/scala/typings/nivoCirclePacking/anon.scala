package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typings.nivoCirclePacking.distTypesTypesMod.ComputedLabel
import typings.nivoCirclePacking.nivoCirclePackingStrings.color
import typings.nivoCirclePacking.nivoCirclePackingStrings.depth
import typings.nivoCirclePacking.nivoCirclePackingStrings.fill
import typings.nivoCirclePacking.nivoCirclePackingStrings.id
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.ValueFormat
import typings.react.mod.MouseEvent
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BorderColor extends StObject {
    
    var borderColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    
    var borderWidth: Double
    
    var color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    
    var opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    
    var radius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
    
    var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    
    var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  }
  object BorderColor {
    
    inline def apply(
      borderColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
      borderWidth: Double,
      color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
      opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
      radius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any,
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    ): BorderColor = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderColor]
    }
    
    extension [Self <: BorderColor](x: Self) {
      
      inline def setBorderColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOpacity(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasEl[RawDatum] extends StObject {
    
    var canvasEl: MutableRefObject[HTMLCanvasElement | Null]
    
    var margin: Left
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
  }
  object CanvasEl {
    
    inline def apply[RawDatum](
      canvasEl: MutableRefObject[HTMLCanvasElement | Null],
      margin: Left,
      nodes: js.Array[ComputedDatum[RawDatum]]
    ): CanvasEl[RawDatum] = {
      val __obj = js.Dynamic.literal(canvasEl = canvasEl.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasEl[RawDatum]]
    }
    
    extension [Self <: CanvasEl[?], RawDatum](x: Self & CanvasEl[RawDatum]) {
      
      inline def setCanvasEl(value: MutableRefObject[HTMLCanvasElement | Null]): Self = StObject.set(x, "canvasEl", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Left): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait ChildColor[RawDatum] extends StObject {
    
    var childColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var colorBy: id | depth
    
    var colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]
    
    var data: RawDatum
    
    var height: Double
    
    var id: PropertyAccessor[RawDatum, String]
    
    var inheritColorFromParent: Boolean
    
    var leavesOnly: Boolean
    
    var padding: Double
    
    var value: PropertyAccessor[RawDatum, Double]
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var width: Double
  }
  object ChildColor {
    
    inline def apply[RawDatum](
      childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      colorBy: id | depth,
      colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
      data: RawDatum,
      height: Double,
      id: PropertyAccessor[RawDatum, String],
      inheritColorFromParent: Boolean,
      leavesOnly: Boolean,
      padding: Double,
      value: PropertyAccessor[RawDatum, Double],
      width: Double
    ): ChildColor[RawDatum] = {
      val __obj = js.Dynamic.literal(childColor = childColor.asInstanceOf[js.Any], colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildColor[RawDatum]]
    }
    
    extension [Self <: ChildColor[?], RawDatum](x: Self & ChildColor[RawDatum]) {
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => String): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filter[RawDatum] extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* label */ ComputedLabel[RawDatum], Boolean]] = js.undefined
    
    var label: PropertyAccessor[ComputedDatum[RawDatum], String]
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
    
    var skipRadius: Double
    
    var textColor: InheritedColorConfig[ComputedDatum[RawDatum]]
  }
  object Filter {
    
    inline def apply[RawDatum](
      label: PropertyAccessor[ComputedDatum[RawDatum], String],
      nodes: js.Array[ComputedDatum[RawDatum]],
      skipRadius: Double,
      textColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    ): Filter[RawDatum] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], skipRadius = skipRadius.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter[RawDatum]]
    }
    
    extension [Self <: Filter[?], RawDatum](x: Self & Filter[RawDatum]) {
      
      inline def setFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setSkipRadius(value: Double): Self = StObject.set(x, "skipRadius", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var modifiers: js.Array[js.Array[String | Double]]
  }
  object From {
    
    inline def apply(from: String, modifiers: js.Array[js.Array[String | Double]]): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
  
  trait Label[RawDatum] extends StObject {
    
    var label: String | Double
    
    var node: ComputedDatum[RawDatum]
    
    var textColor: Any
  }
  object Label {
    
    inline def apply[RawDatum](label: String | Double, node: ComputedDatum[RawDatum], textColor: Any): Label[RawDatum] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label[RawDatum]]
    }
    
    extension [Self <: Label[?], RawDatum](x: Self & Label[RawDatum]) {
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
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
  
  trait Nodes[RawDatum] extends StObject {
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
  }
  object Nodes {
    
    inline def apply[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]]): Nodes[RawDatum] = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nodes[RawDatum]]
    }
    
    extension [Self <: Nodes[?], RawDatum](x: Self & Nodes[RawDatum]) {
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait Opacity extends StObject {
    
    var opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    
    var radius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
    
    var textColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    
    var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    
    var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  }
  object Opacity {
    
    inline def apply(
      opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
      radius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any,
      textColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    ): Opacity = {
      val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opacity]
    }
    
    extension [Self <: Opacity](x: Self) {
      
      inline def setOpacity(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setTextColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<'onMouseMove' | 'onClick' | 'onMouseEnter' | 'onMouseLeave', (event : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): void>> */
  trait PartialRecordonMouseMoveo extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  }
  object PartialRecordonMouseMoveo {
    
    inline def apply(): PartialRecordonMouseMoveo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordonMouseMoveo]
    }
    
    extension [Self <: PartialRecordonMouseMoveo](x: Self) {
      
      inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    }
  }
}
