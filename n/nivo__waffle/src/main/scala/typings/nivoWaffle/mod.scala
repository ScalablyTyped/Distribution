package typings.nivoWaffle

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Colors
import typings.nivoCore.mod.Dimensions
import typings.nivoCore.mod.GetColor
import typings.nivoCore.mod.Theme
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/waffle", "ResponsiveWaffle")
  @js.native
  open class ResponsiveWaffle protected ()
    extends Component[WaffleSvgProps, js.Object, Any] {
    def this(props: WaffleSvgProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaffleSvgProps, context: Any) = this()
  }
  
  @JSImport("@nivo/waffle", "ResponsiveWaffleCanvas")
  @js.native
  open class ResponsiveWaffleCanvas protected ()
    extends Component[WaffleCanvasProps, js.Object, Any] {
    def this(props: WaffleCanvasProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaffleCanvasProps, context: Any) = this()
  }
  
  @JSImport("@nivo/waffle", "ResponsiveWaffleHtml")
  @js.native
  open class ResponsiveWaffleHtml protected ()
    extends Component[WaffleHtmlProps, js.Object, Any] {
    def this(props: WaffleHtmlProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaffleHtmlProps, context: Any) = this()
  }
  
  @JSImport("@nivo/waffle", "Waffle")
  @js.native
  open class Waffle protected ()
    extends Component[WaffleSvgProps & Dimensions, js.Object, Any] {
    def this(props: WaffleSvgProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaffleSvgProps & Dimensions, context: Any) = this()
  }
  
  @JSImport("@nivo/waffle", "WaffleCanvas")
  @js.native
  open class WaffleCanvas protected ()
    extends Component[WaffleCanvasProps & Dimensions, js.Object, Any] {
    def this(props: WaffleCanvasProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaffleCanvasProps & Dimensions, context: Any) = this()
  }
  
  @JSImport("@nivo/waffle", "WaffleHtml")
  @js.native
  open class WaffleHtml protected ()
    extends Component[WaffleHtmlProps & Dimensions, js.Object, Any] {
    def this(props: WaffleHtmlProps & Dimensions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaffleHtmlProps & Dimensions, context: Any) = this()
  }
  
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
  
  trait WaffleBaseProps extends StObject {
    
    var columns: Double
    
    var data: js.Array[js.Object]
    
    var rows: Double
    
    var total: Double
  }
  object WaffleBaseProps {
    
    inline def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleBaseProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleBaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleBaseProps] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @nivo/waffle.@nivo/waffle.WaffleBaseProps & @nivo/waffle.@nivo/waffle.WaffleCommonProps & std.Partial<{  pixelRatio :number}> */
  trait WaffleCanvasProps extends StObject {
    
    var borderColor: js.UndefOr[InheritedColorConfig[WaffleDatum]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var columns: Double
    
    var data: js.Array[js.Object]
    
    var emptyColor: js.UndefOr[String] = js.undefined
    
    var emptyOpacity: js.UndefOr[Double] = js.undefined
    
    var enableLabels: js.UndefOr[Boolean] = js.undefined
    
    var fillDirection: js.UndefOr[WaffleFillDirection] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* datum */ WaffleDatum, 
          /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var rows: Double
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ] = js.undefined
    
    var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
    
    var total: Double
  }
  object WaffleCanvasProps {
    
    inline def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleCanvasProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleCanvasProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleCanvasProps] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: InheritedColorConfig[WaffleDatum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | GetColor[WaffleDatum]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: WaffleDatum => String): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
      
      inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
      
      inline def setEmptyOpacityUndefined: Self = StObject.set(x, "emptyOpacity", js.undefined)
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
      
      inline def setFillDirection(value: WaffleFillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
      
      inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ WaffleDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormat(value: String | ValueFormatter): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = StObject.set(x, "tooltipFormat", js.Any.fromFunction1(value))
      
      inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @nivo/core.@nivo/core.ColorProps<@nivo/waffle.@nivo/waffle.WaffleDatum> & std.Partial<{  margin :@nivo/core.@nivo/core.Box,   fillDirection :@nivo/waffle.@nivo/waffle.WaffleFillDirection,   padding :number,   theme :@nivo/core.@nivo/core.Theme,   emptyColor :string,   emptyOpacity :number,   borderWidth :number,   borderColor :@nivo/colors.@nivo/colors.InheritedColorConfig<@nivo/waffle.@nivo/waffle.WaffleDatum>,   enableLabels :boolean,   isInteractive :boolean, onClick (datum : @nivo/waffle.@nivo/waffle.WaffleDatum, event : react.react.MouseEvent<std.HTMLCanvasElement, react.react.NativeMouseEvent>): void,   tooltipFormat :string | @nivo/waffle.@nivo/waffle.ValueFormatter,   tooltip :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> * / any}> */
  trait WaffleCommonProps extends StObject {
    
    var borderColor: js.UndefOr[InheritedColorConfig[WaffleDatum]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var emptyColor: js.UndefOr[String] = js.undefined
    
    var emptyOpacity: js.UndefOr[Double] = js.undefined
    
    var enableLabels: js.UndefOr[Boolean] = js.undefined
    
    var fillDirection: js.UndefOr[WaffleFillDirection] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* datum */ WaffleDatum, 
          /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ] = js.undefined
    
    var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  }
  object WaffleCommonProps {
    
    inline def apply(): WaffleCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaffleCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleCommonProps] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: InheritedColorConfig[WaffleDatum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | GetColor[WaffleDatum]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: WaffleDatum => String): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
      
      inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
      
      inline def setEmptyOpacityUndefined: Self = StObject.set(x, "emptyOpacity", js.undefined)
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
      
      inline def setFillDirection(value: WaffleFillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
      
      inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ WaffleDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormat(value: String | ValueFormatter): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = StObject.set(x, "tooltipFormat", js.Any.fromFunction1(value))
      
      inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait WaffleDatum extends StObject {
    
    var id: String | Double
    
    var label: String | Double
    
    var value: Double
  }
  object WaffleDatum {
    
    inline def apply(id: String | Double, label: String | Double, value: Double): WaffleDatum = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleDatum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleDatum] (val x: Self) extends AnyVal {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoWaffle.nivoWaffleStrings.top
    - typings.nivoWaffle.nivoWaffleStrings.right
    - typings.nivoWaffle.nivoWaffleStrings.bottom
    - typings.nivoWaffle.nivoWaffleStrings.left
  */
  trait WaffleFillDirection extends StObject
  object WaffleFillDirection {
    
    inline def bottom: typings.nivoWaffle.nivoWaffleStrings.bottom = "bottom".asInstanceOf[typings.nivoWaffle.nivoWaffleStrings.bottom]
    
    inline def left: typings.nivoWaffle.nivoWaffleStrings.left = "left".asInstanceOf[typings.nivoWaffle.nivoWaffleStrings.left]
    
    inline def right: typings.nivoWaffle.nivoWaffleStrings.right = "right".asInstanceOf[typings.nivoWaffle.nivoWaffleStrings.right]
    
    inline def top: typings.nivoWaffle.nivoWaffleStrings.top = "top".asInstanceOf[typings.nivoWaffle.nivoWaffleStrings.top]
  }
  
  /* Inlined @nivo/waffle.@nivo/waffle.WaffleBaseProps & @nivo/waffle.@nivo/waffle.WaffleCommonProps & @nivo/core.@nivo/core.MotionProps */
  trait WaffleHtmlProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[WaffleDatum]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var columns: Double
    
    var data: js.Array[js.Object]
    
    var emptyColor: js.UndefOr[String] = js.undefined
    
    var emptyOpacity: js.UndefOr[Double] = js.undefined
    
    var enableLabels: js.UndefOr[Boolean] = js.undefined
    
    var fillDirection: js.UndefOr[WaffleFillDirection] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionDamping: js.UndefOr[Double] = js.undefined
    
    var motionStiffness: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* datum */ WaffleDatum, 
          /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var rows: Double
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ] = js.undefined
    
    var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
    
    var total: Double
  }
  object WaffleHtmlProps {
    
    inline def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleHtmlProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleHtmlProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleHtmlProps] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[WaffleDatum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | GetColor[WaffleDatum]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: WaffleDatum => String): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
      
      inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
      
      inline def setEmptyOpacityUndefined: Self = StObject.set(x, "emptyOpacity", js.undefined)
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
      
      inline def setFillDirection(value: WaffleFillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
      
      inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionDamping(value: Double): Self = StObject.set(x, "motionDamping", value.asInstanceOf[js.Any])
      
      inline def setMotionDampingUndefined: Self = StObject.set(x, "motionDamping", js.undefined)
      
      inline def setMotionStiffness(value: Double): Self = StObject.set(x, "motionStiffness", value.asInstanceOf[js.Any])
      
      inline def setMotionStiffnessUndefined: Self = StObject.set(x, "motionStiffness", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ WaffleDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormat(value: String | ValueFormatter): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = StObject.set(x, "tooltipFormat", js.Any.fromFunction1(value))
      
      inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @nivo/waffle.@nivo/waffle.WaffleBaseProps & @nivo/waffle.@nivo/waffle.WaffleCommonProps & @nivo/core.@nivo/core.MotionProps & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/waffle.@nivo/waffle.WaffleDatum> & {  role :string | undefined} */
  trait WaffleSvgProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[WaffleDatum]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var columns: Double
    
    var data: js.Array[js.Object]
    
    var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
    
    var emptyColor: js.UndefOr[String] = js.undefined
    
    var emptyOpacity: js.UndefOr[Double] = js.undefined
    
    var enableLabels: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[js.Array[Id[WaffleDatum]]] = js.undefined
    
    var fillDirection: js.UndefOr[WaffleFillDirection] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionDamping: js.UndefOr[Double] = js.undefined
    
    var motionStiffness: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* datum */ WaffleDatum, 
          /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: Double
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ] = js.undefined
    
    var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
    
    var total: Double
  }
  object WaffleSvgProps {
    
    inline def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleSvgProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleSvgProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleSvgProps] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[WaffleDatum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColorBy(value: String | GetColor[WaffleDatum]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByFunction1(value: WaffleDatum => String): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
      
      inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
      
      inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
      
      inline def setEmptyOpacityUndefined: Self = StObject.set(x, "emptyOpacity", js.undefined)
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
      
      inline def setFill(value: js.Array[Id[WaffleDatum]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillDirection(value: WaffleFillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
      
      inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: Id[WaffleDatum]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionDamping(value: Double): Self = StObject.set(x, "motionDamping", value.asInstanceOf[js.Any])
      
      inline def setMotionDampingUndefined: Self = StObject.set(x, "motionDamping", js.undefined)
      
      inline def setMotionStiffness(value: Double): Self = StObject.set(x, "motionStiffness", value.asInstanceOf[js.Any])
      
      inline def setMotionStiffnessUndefined: Self = StObject.set(x, "motionStiffness", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ WaffleDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<WaffleTooltipData> */ Any
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormat(value: String | ValueFormatter): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = StObject.set(x, "tooltipFormat", js.Any.fromFunction1(value))
      
      inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaffleTooltipData
    extends StObject
       with WaffleDatum {
    
    var color: String
    
    var column: Double
    
    var endAt: Double
    
    var groupIndex: Double
    
    var position: Double
    
    var row: Double
    
    var startAt: Double
  }
  object WaffleTooltipData {
    
    inline def apply(
      color: String,
      column: Double,
      endAt: Double,
      groupIndex: Double,
      id: String | Double,
      label: String | Double,
      position: Double,
      row: Double,
      startAt: Double,
      value: Double
    ): WaffleTooltipData = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleTooltipData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleTooltipData] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setEndAt(value: Double): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    }
  }
}
