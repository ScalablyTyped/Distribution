package typings.nivoScatterplot

import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAxes.distTypesTypesMod.AxisProps
import typings.nivoAxes.distTypesTypesMod.GridValues
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.nivoScales.distTypesTypesMod.AnyScale
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import typings.nivoScatterplot.anon.SerieId
import typings.nivoScatterplot.anon.Size
import typings.nivoScatterplot.nivoScatterplotStrings.color
import typings.nivoScatterplot.nivoScatterplotStrings.id
import typings.nivoScatterplot.nivoScatterplotStrings.size
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactSpringCore.mod.SpringConfig
import typings.reactSpringCore.mod.SpringValues
import typings.std.CanvasRenderingContext2D
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* Inlined std.Partial<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCommonProps<RawDatum>> & @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDataProps<RawDatum> & @nivo/core.@nivo/core.Dimensions & {  layers :std.Array<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotLayerId | @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCustomCanvasLayer<RawDatum>> | undefined,   pixelRatio :number | undefined,   renderNode :(ctx : std.CanvasRenderingContext2D, node : @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotNodeData<RawDatum>): void | undefined} */
  trait ScatterPlotCanvasProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var annotations: js.UndefOr[js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[SerieId]] = js.undefined
    
    var data: js.Array[ScatterPlotRawSerie[RawDatum]]
    
    var debugMesh: js.UndefOr[Boolean] = js.undefined
    
    var enableGridX: js.UndefOr[Boolean] = js.undefined
    
    var enableGridY: js.UndefOr[Boolean] = js.undefined
    
    var gridXValues: js.UndefOr[
        GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ]
      ] = js.undefined
    
    var gridYValues: js.UndefOr[
        GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
        ]
      ] = js.undefined
    
    var height: Double
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var layers: js.UndefOr[js.Array[ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[RawDatum]]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var nodeId: js.UndefOr[PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]] = js.undefined
    
    var nodeSize: js.UndefOr[
        Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
      ] = js.undefined
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var renderNode: js.UndefOr[
        js.Function2[/* ctx */ CanvasRenderingContext2D, /* node */ ScatterPlotNodeData[RawDatum], Unit]
      ] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[ScatterPlotTooltip[RawDatum]] = js.undefined
    
    var useMesh: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
    
    var xFormat: js.UndefOr[
        ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var xScale: js.UndefOr[ScaleSpec] = js.undefined
    
    var yFormat: js.UndefOr[
        ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var yScale: js.UndefOr[ScaleSpec] = js.undefined
  }
  object ScatterPlotCanvasProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](data: js.Array[ScatterPlotRawSerie[RawDatum]], height: Double, width: Double): ScatterPlotCanvasProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotCanvasProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotCanvasProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotCanvasProps[RawDatum]) extends AnyVal {
      
      inline def setAnnotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAxisBottom(value: AxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
      
      inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      inline def setAxisLeft(value: AxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
      
      inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      inline def setAxisRight(value: AxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
      
      inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      inline def setAxisTop(value: AxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
      
      inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[SerieId]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: SerieId => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[ScatterPlotRawSerie[RawDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterPlotRawSerie[RawDatum]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebugMesh(value: Boolean): Self = StObject.set(x, "debugMesh", value.asInstanceOf[js.Any])
      
      inline def setDebugMeshUndefined: Self = StObject.set(x, "debugMesh", js.undefined)
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
      
      inline def setGridXValues(
        value: GridValues[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
            ]
      ): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
      
      inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(
        value: GridValues[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
            ]
      ): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
      
      inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLayers(value: js.Array[ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[RawDatum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setNodeId(value: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdFunction1(value: Omit[ScatterPlotNodeData[RawDatum], id | size | color] => String): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setNodeSize(
        value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: Omit[ScatterPlotNodeData[RawDatum], size | color] => Double): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRenderNode(value: (/* ctx */ CanvasRenderingContext2D, /* node */ ScatterPlotNodeData[RawDatum]) => Unit): Self = StObject.set(x, "renderNode", js.Any.fromFunction2(value))
      
      inline def setRenderNodeUndefined: Self = StObject.set(x, "renderNode", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ScatterPlotTooltip[RawDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseMesh(value: Boolean): Self = StObject.set(x, "useMesh", value.asInstanceOf[js.Any])
      
      inline def setUseMeshUndefined: Self = StObject.set(x, "useMesh", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
      
      inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
      
      inline def setXScale(value: ScaleSpec): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
      
      inline def setYFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
      
      inline def setYFormatUndefined: Self = StObject.set(x, "yFormat", js.undefined)
      
      inline def setYScale(value: ScaleSpec): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
      
      inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
    }
  }
  
  trait ScatterPlotCommonProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: AxisProps[Any] | Null
    
    var axisLeft: AxisProps[Any] | Null
    
    var axisRight: AxisProps[Any] | Null
    
    var axisTop: AxisProps[Any] | Null
    
    var colors: OrdinalColorScaleConfig[SerieId]
    
    var debugMesh: Boolean
    
    var enableGridX: Boolean
    
    var enableGridY: Boolean
    
    var gridXValues: GridValues[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
      ]
    
    var gridYValues: GridValues[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
      ]
    
    var isInteractive: Boolean
    
    var legends: js.Array[LegendProps]
    
    var margin: Box
    
    var nodeId: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]
    
    var nodeSize: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
    
    var onClick: ScatterPlotMouseHandler[RawDatum]
    
    var onMouseEnter: ScatterPlotMouseHandler[RawDatum]
    
    var onMouseLeave: ScatterPlotMouseHandler[RawDatum]
    
    var onMouseMove: ScatterPlotMouseHandler[RawDatum]
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: String
    
    var theme: Theme
    
    var tooltip: ScatterPlotTooltip[RawDatum]
    
    var useMesh: Boolean
    
    var xFormat: ValueFormat[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
        Unit
      ]
    
    var xScale: ScaleSpec
    
    var yFormat: ValueFormat[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
        Unit
      ]
    
    var yScale: ScaleSpec
  }
  object ScatterPlotCommonProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]],
      colors: OrdinalColorScaleConfig[SerieId],
      debugMesh: Boolean,
      enableGridX: Boolean,
      enableGridY: Boolean,
      gridXValues: GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ],
      gridYValues: GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
        ],
      isInteractive: Boolean,
      legends: js.Array[LegendProps],
      margin: Box,
      nodeId: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String],
      nodeSize: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double]),
      onClick: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit,
      onMouseEnter: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit,
      onMouseLeave: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit,
      onMouseMove: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit,
      role: String,
      theme: Theme,
      tooltip: ScatterPlotTooltip[RawDatum],
      useMesh: Boolean,
      xFormat: ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
          Unit
        ],
      xScale: ScaleSpec,
      yFormat: ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
          Unit
        ],
      yScale: ScaleSpec
    ): ScatterPlotCommonProps[RawDatum] = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], debugMesh = debugMesh.asInstanceOf[js.Any], enableGridX = enableGridX.asInstanceOf[js.Any], enableGridY = enableGridY.asInstanceOf[js.Any], gridXValues = gridXValues.asInstanceOf[js.Any], gridYValues = gridYValues.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], useMesh = useMesh.asInstanceOf[js.Any], xFormat = xFormat.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yFormat = yFormat.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any], axisBottom = null, axisLeft = null, axisRight = null, axisTop = null)
      __obj.asInstanceOf[ScatterPlotCommonProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotCommonProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotCommonProps[RawDatum]) extends AnyVal {
      
      inline def setAnnotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAxisBottom(value: AxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
      
      inline def setAxisLeft(value: AxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
      
      inline def setAxisRight(value: AxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
      
      inline def setAxisTop(value: AxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
      
      inline def setColors(value: OrdinalColorScaleConfig[SerieId]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: SerieId => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDebugMesh(value: Boolean): Self = StObject.set(x, "debugMesh", value.asInstanceOf[js.Any])
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setGridXValues(
        value: GridValues[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
            ]
      ): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(
        value: GridValues[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
            ]
      ): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdFunction1(value: Omit[ScatterPlotNodeData[RawDatum], id | size | color] => String): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeSize(
        value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: Omit[ScatterPlotNodeData[RawDatum], size | color] => Double): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: ScatterPlotTooltip[RawDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setUseMesh(value: Boolean): Self = StObject.set(x, "useMesh", value.asInstanceOf[js.Any])
      
      inline def setXFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
      
      inline def setXScale(value: ScaleSpec): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
      
      inline def setYScale(value: ScaleSpec): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  type ScatterPlotCustomCanvasLayer[RawDatum /* <: ScatterPlotDatum */] = js.Function2[
    /* ctx */ CanvasRenderingContext2D, 
    /* props */ ScatterPlotLayerProps[RawDatum], 
    Unit
  ]
  
  type ScatterPlotCustomSvgLayer[RawDatum /* <: ScatterPlotDatum */] = FunctionComponent[ScatterPlotLayerProps[RawDatum]]
  
  trait ScatterPlotDataProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var data: js.Array[ScatterPlotRawSerie[RawDatum]]
  }
  object ScatterPlotDataProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](data: js.Array[ScatterPlotRawSerie[RawDatum]]): ScatterPlotDataProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotDataProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotDataProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotDataProps[RawDatum]) extends AnyVal {
      
      inline def setData(value: js.Array[ScatterPlotRawSerie[RawDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterPlotRawSerie[RawDatum]*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait ScatterPlotDatum extends StObject {
    
    var x: ScatterPlotValue
    
    var y: ScatterPlotValue
  }
  object ScatterPlotDatum {
    
    inline def apply(x: ScatterPlotValue, y: ScatterPlotValue): ScatterPlotDatum = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotDatum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotDatum] (val x: Self) extends AnyVal {
      
      inline def setX(value: ScatterPlotValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: ScatterPlotValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoScatterplot.nivoScatterplotStrings.grid
    - typings.nivoScatterplot.nivoScatterplotStrings.axes
    - typings.nivoScatterplot.nivoScatterplotStrings.nodes
    - typings.nivoScatterplot.nivoScatterplotStrings.markers
    - typings.nivoScatterplot.nivoScatterplotStrings.mesh
    - typings.nivoScatterplot.nivoScatterplotStrings.legends
    - typings.nivoScatterplot.nivoScatterplotStrings.annotations
  */
  trait ScatterPlotLayerId extends StObject
  object ScatterPlotLayerId {
    
    inline def annotations: typings.nivoScatterplot.nivoScatterplotStrings.annotations = "annotations".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.annotations]
    
    inline def axes: typings.nivoScatterplot.nivoScatterplotStrings.axes = "axes".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.axes]
    
    inline def grid: typings.nivoScatterplot.nivoScatterplotStrings.grid = "grid".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.grid]
    
    inline def legends: typings.nivoScatterplot.nivoScatterplotStrings.legends = "legends".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.legends]
    
    inline def markers: typings.nivoScatterplot.nivoScatterplotStrings.markers = "markers".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.markers]
    
    inline def mesh: typings.nivoScatterplot.nivoScatterplotStrings.mesh = "mesh".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.mesh]
    
    inline def nodes: typings.nivoScatterplot.nivoScatterplotStrings.nodes = "nodes".asInstanceOf[typings.nivoScatterplot.nivoScatterplotStrings.nodes]
  }
  
  trait ScatterPlotLayerProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var innerHeight: Double
    
    var innerWidth: Double
    
    var nodes: js.Array[ScatterPlotNodeData[RawDatum]]
    
    var outerHeight: Double
    
    var outerWidth: Double
    
    var xScale: AnyScale
    
    var yScale: AnyScale
  }
  object ScatterPlotLayerProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      innerHeight: Double,
      innerWidth: Double,
      nodes: js.Array[ScatterPlotNodeData[RawDatum]],
      outerHeight: Double,
      outerWidth: Double,
      xScale: AnyScale,
      yScale: AnyScale
    ): ScatterPlotLayerProps[RawDatum] = {
      val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotLayerProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotLayerProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotLayerProps[RawDatum]) extends AnyVal {
      
      inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
      
      inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ScatterPlotNodeData[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ScatterPlotNodeData[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOuterHeight(value: Double): Self = StObject.set(x, "outerHeight", value.asInstanceOf[js.Any])
      
      inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
      
      inline def setXScale(value: AnyScale): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYScale(value: AnyScale): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  type ScatterPlotMouseHandler[RawDatum /* <: ScatterPlotDatum */] = js.Function2[
    /* node */ ScatterPlotNodeData[RawDatum], 
    /* event */ MouseEvent[Any, NativeMouseEvent], 
    Unit
  ]
  
  type ScatterPlotNode[RawDatum /* <: ScatterPlotDatum */] = FunctionComponent[ScatterPlotNodeProps[RawDatum]]
  
  trait ScatterPlotNodeData[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var color: String
    
    var data: RawDatum
    
    var formattedX: String | Double
    
    var formattedY: String | Double
    
    var id: String
    
    var index: Double
    
    var serieId: String | Double
    
    var serieIndex: Double
    
    var size: Double
    
    var x: Double
    
    var xValue: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
    
    var y: Double
    
    var yValue: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
  }
  object ScatterPlotNodeData {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      color: String,
      data: RawDatum,
      formattedX: String | Double,
      formattedY: String | Double,
      id: String,
      index: Double,
      serieId: String | Double,
      serieIndex: Double,
      size: Double,
      x: Double,
      xValue: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any,
      y: Double,
      yValue: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
    ): ScatterPlotNodeData[RawDatum] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedX = formattedX.asInstanceOf[js.Any], formattedY = formattedY.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], serieIndex = serieIndex.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotNodeData[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotNodeData[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotNodeData[RawDatum]) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormattedX(value: String | Double): Self = StObject.set(x, "formattedX", value.asInstanceOf[js.Any])
      
      inline def setFormattedY(value: String | Double): Self = StObject.set(x, "formattedY", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSerieId(value: String | Double): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
      
      inline def setSerieIndex(value: Double): Self = StObject.set(x, "serieIndex", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
      ): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
      ): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScatterPlotNodeDynamicSizeSpec extends StObject {
    
    var key: String
    
    var sizes: js.Tuple2[Double, Double]
    
    var values: js.Tuple2[Double, Double]
  }
  object ScatterPlotNodeDynamicSizeSpec {
    
    inline def apply(key: String, sizes: js.Tuple2[Double, Double], values: js.Tuple2[Double, Double]): ScatterPlotNodeDynamicSizeSpec = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotNodeDynamicSizeSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotNodeDynamicSizeSpec] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScatterPlotNodeProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var blendMode: CssMixBlendMode
    
    var isInteractive: Boolean
    
    var node: ScatterPlotNodeData[RawDatum]
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var style: SpringValues[Size]
  }
  object ScatterPlotNodeProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      blendMode: CssMixBlendMode,
      isInteractive: Boolean,
      node: ScatterPlotNodeData[RawDatum],
      style: SpringValues[Size]
    ): ScatterPlotNodeProps[RawDatum] = {
      val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotNodeProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotNodeProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotNodeProps[RawDatum]) extends AnyVal {
      
      inline def setBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ScatterPlotNodeData[RawDatum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setStyle(value: SpringValues[Size]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScatterPlotRawSerie[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var data: js.Array[RawDatum]
    
    var id: String | Double
  }
  object ScatterPlotRawSerie {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](data: js.Array[RawDatum], id: String | Double): ScatterPlotRawSerie[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotRawSerie[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotRawSerie[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotRawSerie[RawDatum]) extends AnyVal {
      
      inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCommonProps<RawDatum>> & @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDataProps<RawDatum> & @nivo/core.@nivo/core.Dimensions & @nivo/core.@nivo/core.MotionProps & {  blendMode :@nivo/core.@nivo/core.CssMixBlendMode | undefined,   layers :std.Array<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotLayerId | @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCustomSvgLayer<RawDatum>> | undefined,   nodeComponent :@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotNode<RawDatum> | undefined,   markers :std.Array<@nivo/core.@nivo/core.CartesianMarkerProps<RawDatum['x'] | RawDatum['y']>> | undefined} */
  trait ScatterPlotSvgProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var annotations: js.UndefOr[js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var blendMode: js.UndefOr[CssMixBlendMode] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[SerieId]] = js.undefined
    
    var data: js.Array[ScatterPlotRawSerie[RawDatum]]
    
    var debugMesh: js.UndefOr[Boolean] = js.undefined
    
    var enableGridX: js.UndefOr[Boolean] = js.undefined
    
    var enableGridY: js.UndefOr[Boolean] = js.undefined
    
    var gridXValues: js.UndefOr[
        GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ]
      ] = js.undefined
    
    var gridYValues: js.UndefOr[
        GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
        ]
      ] = js.undefined
    
    var height: Double
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var layers: js.UndefOr[js.Array[ScatterPlotLayerId | ScatterPlotCustomSvgLayer[RawDatum]]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var markers: js.UndefOr[
        js.Array[
          CartesianMarkerProps[
            /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
          ]
        ]
      ] = js.undefined
    
    var motionConfig: js.UndefOr[String | SpringConfig] = js.undefined
    
    var nodeComponent: js.UndefOr[ScatterPlotNode[RawDatum]] = js.undefined
    
    var nodeId: js.UndefOr[PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]] = js.undefined
    
    var nodeSize: js.UndefOr[
        Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
      ] = js.undefined
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[ScatterPlotTooltip[RawDatum]] = js.undefined
    
    var useMesh: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
    
    var xFormat: js.UndefOr[
        ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var xScale: js.UndefOr[ScaleSpec] = js.undefined
    
    var yFormat: js.UndefOr[
        ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var yScale: js.UndefOr[ScaleSpec] = js.undefined
  }
  object ScatterPlotSvgProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](data: js.Array[ScatterPlotRawSerie[RawDatum]], height: Double, width: Double): ScatterPlotSvgProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotSvgProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotSvgProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotSvgProps[RawDatum]) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnnotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAxisBottom(value: AxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
      
      inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      inline def setAxisLeft(value: AxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
      
      inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      inline def setAxisRight(value: AxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
      
      inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      inline def setAxisTop(value: AxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
      
      inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      inline def setBlendMode(value: CssMixBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[SerieId]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: SerieId => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[ScatterPlotRawSerie[RawDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterPlotRawSerie[RawDatum]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebugMesh(value: Boolean): Self = StObject.set(x, "debugMesh", value.asInstanceOf[js.Any])
      
      inline def setDebugMeshUndefined: Self = StObject.set(x, "debugMesh", js.undefined)
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
      
      inline def setGridXValues(
        value: GridValues[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
            ]
      ): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
      
      inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(
        value: GridValues[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
            ]
      ): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
      
      inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLayers(value: js.Array[ScatterPlotLayerId | ScatterPlotCustomSvgLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (ScatterPlotLayerId | ScatterPlotCustomSvgLayer[RawDatum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarkers(
        value: js.Array[
              CartesianMarkerProps[
                /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(
        value: (CartesianMarkerProps[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
            ])*
      ): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMotionConfig(value: String | SpringConfig): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setNodeComponent(value: ScatterPlotNode[RawDatum]): Self = StObject.set(x, "nodeComponent", value.asInstanceOf[js.Any])
      
      inline def setNodeComponentUndefined: Self = StObject.set(x, "nodeComponent", js.undefined)
      
      inline def setNodeId(value: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdFunction1(value: Omit[ScatterPlotNodeData[RawDatum], id | size | color] => String): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setNodeSize(
        value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: Omit[ScatterPlotNodeData[RawDatum], size | color] => Double): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ScatterPlotTooltip[RawDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseMesh(value: Boolean): Self = StObject.set(x, "useMesh", value.asInstanceOf[js.Any])
      
      inline def setUseMeshUndefined: Self = StObject.set(x, "useMesh", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
      
      inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
      
      inline def setXScale(value: ScaleSpec): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
      
      inline def setYFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
      
      inline def setYFormatUndefined: Self = StObject.set(x, "yFormat", js.undefined)
      
      inline def setYScale(value: ScaleSpec): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
      
      inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
    }
  }
  
  type ScatterPlotTooltip[RawDatum /* <: ScatterPlotDatum */] = FunctionComponent[ScatterPlotTooltipProps[RawDatum]]
  
  trait ScatterPlotTooltipProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var node: ScatterPlotNodeData[RawDatum]
  }
  object ScatterPlotTooltipProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](node: ScatterPlotNodeData[RawDatum]): ScatterPlotTooltipProps[RawDatum] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotTooltipProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterPlotTooltipProps[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & ScatterPlotTooltipProps[RawDatum]) extends AnyVal {
      
      inline def setNode(value: ScatterPlotNodeData[RawDatum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type ScatterPlotValue = Double | String | js.Date
}
