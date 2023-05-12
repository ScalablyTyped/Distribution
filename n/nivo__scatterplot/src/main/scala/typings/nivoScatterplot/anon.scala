package typings.nivoScatterplot

import typings.d3Scale.mod.NumberValue
import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAxes.distTypesTypesMod.AxisProps
import typings.nivoAxes.distTypesTypesMod.GridValues
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.nivoScales.distTypesComputeMod.ComputedSerie
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.nivoScales.distTypesTypesMod.ScaleLog
import typings.nivoScales.distTypesTypesMod.ScalePoint
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import typings.nivoScales.distTypesTypesMod.ScaleSymlog
import typings.nivoScales.distTypesTypesMod.ScaleTime
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotCustomCanvasLayer
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotLayerId
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotMouseHandler
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeDynamicSizeSpec
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotRawSerie
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltip
import typings.nivoScatterplot.distTypesTypesMod.ScatterPlotValue
import typings.nivoScatterplot.nivoScatterplotStrings.color
import typings.nivoScatterplot.nivoScatterplotStrings.id
import typings.nivoScatterplot.nivoScatterplotStrings.size
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: String
    
    var id: String | Double
    
    var label: String | Double
  }
  object Color {
    
    inline def apply(color: String, id: String | Double, label: String | Double): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait Colors[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var colors: OrdinalColorScaleConfig[SerieId]
    
    var data: js.Array[ScatterPlotRawSerie[RawDatum]]
    
    var height: Double
    
    var nodeId: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | color | size], String]
    
    var nodeSize: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], color | size], Double])
    
    var width: Double
    
    var xFormat: js.UndefOr[
        ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var xScaleSpec: ScaleSpec
    
    var yFormat: js.UndefOr[
        ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var yScaleSpec: ScaleSpec
  }
  object Colors {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      colors: OrdinalColorScaleConfig[SerieId],
      data: js.Array[ScatterPlotRawSerie[RawDatum]],
      height: Double,
      nodeId: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | color | size], String],
      nodeSize: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], color | size], Double]),
      width: Double,
      xScaleSpec: ScaleSpec,
      yScaleSpec: ScaleSpec
    ): Colors[RawDatum] = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScaleSpec = xScaleSpec.asInstanceOf[js.Any], yScaleSpec = yScaleSpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colors[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & Colors[RawDatum]) extends AnyVal {
      
      inline def setColors(value: OrdinalColorScaleConfig[SerieId]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: SerieId => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[ScatterPlotRawSerie[RawDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterPlotRawSerie[RawDatum]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | color | size], String]): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdFunction1(value: Omit[ScatterPlotNodeData[RawDatum], id | color | size] => String): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeSize(
        value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], color | size], Double])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: Omit[ScatterPlotNodeData[RawDatum], color | size] => Double): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
      
      inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
      
      inline def setXScaleSpec(value: ScaleSpec): Self = StObject.set(x, "xScaleSpec", value.asInstanceOf[js.Any])
      
      inline def setYFormat(
        value: ValueFormat[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
      
      inline def setYFormatUndefined: Self = StObject.set(x, "yFormat", js.undefined)
      
      inline def setYScaleSpec(value: ScaleSpec): Self = StObject.set(x, "yScaleSpec", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatX[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    @JSName("formatX")
    def formatX_x(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
    ): String | Double
    
    @JSName("formatY")
    def formatY_x(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
    ): String | Double
    
    def getNodeId(d: Omit[ScatterPlotNodeData[RawDatum], id | color | size]): String
    
    var series: js.Array[ComputedSerie[Id, RawDatum]]
  }
  object FormatX {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      formatX: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any => String | Double,
      formatY: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any => String | Double,
      getNodeId: Omit[ScatterPlotNodeData[RawDatum], id | color | size] => String,
      series: js.Array[ComputedSerie[Id, RawDatum]]
    ): FormatX[RawDatum] = {
      val __obj = js.Dynamic.literal(formatX = js.Any.fromFunction1(formatX), formatY = js.Any.fromFunction1(formatY), getNodeId = js.Any.fromFunction1(getNodeId), series = series.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatX[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatX[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & FormatX[RawDatum]) extends AnyVal {
      
      inline def setFormatX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any => String | Double
      ): Self = StObject.set(x, "formatX", js.Any.fromFunction1(value))
      
      inline def setFormatY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any => String | Double
      ): Self = StObject.set(x, "formatY", js.Any.fromFunction1(value))
      
      inline def setGetNodeId(value: Omit[ScatterPlotNodeData[RawDatum], id | color | size] => String): Self = StObject.set(x, "getNodeId", js.Any.fromFunction1(value))
      
      inline def setSeries(value: js.Array[ComputedSerie[Id, RawDatum]]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesVarargs(value: (ComputedSerie[Id, RawDatum])*): Self = StObject.set(x, "series", js.Array(value*))
    }
  }
  
  trait Id extends StObject {
    
    var id: String | Double
  }
  object Id {
    
    inline def apply(id: String | Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegendData[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var legendData: js.Array[Color]
    
    var nodes: js.Array[ScatterPlotNodeData[RawDatum]]
    
    var xScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
      ]) | (ScaleBand[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
      ])
    
    var yScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
      ]) | (ScaleBand[
        /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
      ])
  }
  object LegendData {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      legendData: js.Array[Color],
      nodes: js.Array[ScatterPlotNodeData[RawDatum]],
      xScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ]) | (ScaleBand[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ]),
      yScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
        ]) | (ScaleBand[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
        ])
    ): LegendData[RawDatum] = {
      val __obj = js.Dynamic.literal(legendData = legendData.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendData[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendData[?], RawDatum /* <: ScatterPlotDatum */] (val x: Self & LegendData[RawDatum]) extends AnyVal {
      
      inline def setLegendData(value: js.Array[Color]): Self = StObject.set(x, "legendData", value.asInstanceOf[js.Any])
      
      inline def setLegendDataVarargs(value: Color*): Self = StObject.set(x, "legendData", js.Array(value*))
      
      inline def setNodes(value: js.Array[ScatterPlotNodeData[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ScatterPlotNodeData[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setXScale(
        value: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
            ]) | (ScaleBand[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
            ])
      ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setYScale(
        value: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
            ]) | (ScaleBand[
              /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
            ])
      ): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCanvasProps<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum>, 'width' | 'height'> & react.react.RefAttributes<std.HTMLCanvasElement> */
  trait OmitScatterPlotCanvasProp extends StObject {
    
    var annotations: js.UndefOr[js.Array[AnnotationMatcher[ScatterPlotNodeData[ScatterPlotDatum]]]] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[SerieId]] = js.undefined
    
    var data: js.Array[ScatterPlotRawSerie[ScatterPlotDatum]]
    
    var debugMesh: js.UndefOr[Boolean] = js.undefined
    
    var enableGridX: js.UndefOr[Boolean] = js.undefined
    
    var enableGridY: js.UndefOr[Boolean] = js.undefined
    
    var gridXValues: js.UndefOr[GridValues[ScatterPlotValue]] = js.undefined
    
    var gridYValues: js.UndefOr[GridValues[ScatterPlotValue]] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var layers: js.UndefOr[js.Array[ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[ScatterPlotDatum]]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var nodeId: js.UndefOr[PropertyAccessor[OmitScatterPlotNodeDataSc, String]] = js.undefined
    
    var nodeSize: js.UndefOr[
        Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[OmitScatterPlotNodeDataScData, Double])
      ] = js.undefined
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows getting a ref to the component instance.
      * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
      * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
      */
    var ref: js.UndefOr[Ref[HTMLCanvasElement]] = js.undefined
    
    var renderNode: js.UndefOr[
        js.Function2[
          /* ctx */ CanvasRenderingContext2D, 
          /* node */ ScatterPlotNodeData[ScatterPlotDatum], 
          Unit
        ]
      ] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[ScatterPlotTooltip[ScatterPlotDatum]] = js.undefined
    
    var useMesh: js.UndefOr[Boolean] = js.undefined
    
    var xFormat: js.UndefOr[ValueFormat[ScatterPlotValue, Unit]] = js.undefined
    
    var xScale: js.UndefOr[ScaleSpec] = js.undefined
    
    var yFormat: js.UndefOr[ValueFormat[ScatterPlotValue, Unit]] = js.undefined
    
    var yScale: js.UndefOr[ScaleSpec] = js.undefined
  }
  object OmitScatterPlotCanvasProp {
    
    inline def apply(data: js.Array[ScatterPlotRawSerie[ScatterPlotDatum]]): OmitScatterPlotCanvasProp = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitScatterPlotCanvasProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitScatterPlotCanvasProp] (val x: Self) extends AnyVal {
      
      inline def setAnnotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[ScatterPlotDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[ScatterPlotDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
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
      
      inline def setData(value: js.Array[ScatterPlotRawSerie[ScatterPlotDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterPlotRawSerie[ScatterPlotDatum]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebugMesh(value: Boolean): Self = StObject.set(x, "debugMesh", value.asInstanceOf[js.Any])
      
      inline def setDebugMeshUndefined: Self = StObject.set(x, "debugMesh", js.undefined)
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
      
      inline def setGridXValues(value: GridValues[ScatterPlotValue]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
      
      inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(value: GridValues[ScatterPlotValue]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
      
      inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLayers(value: js.Array[ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[ScatterPlotDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[ScatterPlotDatum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setNodeId(value: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdFunction1(value: OmitScatterPlotNodeDataSc => String): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setNodeSize(
        value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[OmitScatterPlotNodeDataScData, Double])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: OmitScatterPlotNodeDataScData => Double): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRef(value: Ref[HTMLCanvasElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLCanvasElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRenderNode(
        value: (/* ctx */ CanvasRenderingContext2D, /* node */ ScatterPlotNodeData[ScatterPlotDatum]) => Unit
      ): Self = StObject.set(x, "renderNode", js.Any.fromFunction2(value))
      
      inline def setRenderNodeUndefined: Self = StObject.set(x, "renderNode", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ScatterPlotTooltip[ScatterPlotDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseMesh(value: Boolean): Self = StObject.set(x, "useMesh", value.asInstanceOf[js.Any])
      
      inline def setUseMeshUndefined: Self = StObject.set(x, "useMesh", js.undefined)
      
      inline def setXFormat(value: ValueFormat[ScatterPlotValue, Unit]): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
      
      inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
      
      inline def setXScale(value: ScaleSpec): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
      
      inline def setYFormat(value: ValueFormat[ScatterPlotValue, Unit]): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
      
      inline def setYFormatUndefined: Self = StObject.set(x, "yFormat", js.undefined)
      
      inline def setYScale(value: ScaleSpec): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
      
      inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotNodeData<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum>, 'id' | 'color' | 'size'> */
  trait OmitScatterPlotNodeDataSc extends StObject {
    
    var data: ScatterPlotDatum
    
    var formattedX: String | Double
    
    var formattedY: String | Double
    
    var index: Double
    
    var serieId: String | Double
    
    var serieIndex: Double
    
    var x: Double
    
    var xValue: ScatterPlotValue
    
    var y: Double
    
    var yValue: ScatterPlotValue
  }
  object OmitScatterPlotNodeDataSc {
    
    inline def apply(
      data: ScatterPlotDatum,
      formattedX: String | Double,
      formattedY: String | Double,
      index: Double,
      serieId: String | Double,
      serieIndex: Double,
      x: Double,
      xValue: ScatterPlotValue,
      y: Double,
      yValue: ScatterPlotValue
    ): OmitScatterPlotNodeDataSc = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], formattedX = formattedX.asInstanceOf[js.Any], formattedY = formattedY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], serieIndex = serieIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitScatterPlotNodeDataSc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitScatterPlotNodeDataSc] (val x: Self) extends AnyVal {
      
      inline def setData(value: ScatterPlotDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormattedX(value: String | Double): Self = StObject.set(x, "formattedX", value.asInstanceOf[js.Any])
      
      inline def setFormattedY(value: String | Double): Self = StObject.set(x, "formattedY", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSerieId(value: String | Double): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
      
      inline def setSerieIndex(value: Double): Self = StObject.set(x, "serieIndex", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXValue(value: ScatterPlotValue): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYValue(value: ScatterPlotValue): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotNodeData<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum>, 'size' | 'color'> */
  trait OmitScatterPlotNodeDataScData extends StObject {
    
    var data: ScatterPlotDatum
    
    var formattedX: String | Double
    
    var formattedY: String | Double
    
    var id: String
    
    var index: Double
    
    var serieId: String | Double
    
    var serieIndex: Double
    
    var x: Double
    
    var xValue: ScatterPlotValue
    
    var y: Double
    
    var yValue: ScatterPlotValue
  }
  object OmitScatterPlotNodeDataScData {
    
    inline def apply(
      data: ScatterPlotDatum,
      formattedX: String | Double,
      formattedY: String | Double,
      id: String,
      index: Double,
      serieId: String | Double,
      serieIndex: Double,
      x: Double,
      xValue: ScatterPlotValue,
      y: Double,
      yValue: ScatterPlotValue
    ): OmitScatterPlotNodeDataScData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], formattedX = formattedX.asInstanceOf[js.Any], formattedY = formattedY.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], serieIndex = serieIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitScatterPlotNodeDataScData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitScatterPlotNodeDataScData] (val x: Self) extends AnyVal {
      
      inline def setData(value: ScatterPlotDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormattedX(value: String | Double): Self = StObject.set(x, "formattedX", value.asInstanceOf[js.Any])
      
      inline def setFormattedY(value: String | Double): Self = StObject.set(x, "formattedY", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSerieId(value: String | Double): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
      
      inline def setSerieIndex(value: Double): Self = StObject.set(x, "serieIndex", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXValue(value: ScatterPlotValue): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYValue(value: ScatterPlotValue): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCommonProps<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum>> & @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDataProps<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum> & @nivo/core.@nivo/core.Dimensions & {  layers :std.Array<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotLayerId | @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotCustomCanvasLayer<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum>> | undefined,   pixelRatio :number | undefined,   renderNode :(ctx : std.CanvasRenderingContext2D, node : @nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotNodeData<@nivo/scatterplot.@nivo/scatterplot/dist/types/types.ScatterPlotDatum>): void | undefined} & react.react.RefAttributes<std.HTMLCanvasElement> */
  trait PartialScatterPlotCommonP extends StObject {
    
    var annotations: js.UndefOr[js.Array[AnnotationMatcher[ScatterPlotNodeData[ScatterPlotDatum]]]] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[SerieId]] = js.undefined
    
    var data: js.Array[ScatterPlotRawSerie[ScatterPlotDatum]]
    
    var debugMesh: js.UndefOr[Boolean] = js.undefined
    
    var enableGridX: js.UndefOr[Boolean] = js.undefined
    
    var enableGridY: js.UndefOr[Boolean] = js.undefined
    
    var gridXValues: js.UndefOr[GridValues[ScatterPlotValue]] = js.undefined
    
    var gridYValues: js.UndefOr[GridValues[ScatterPlotValue]] = js.undefined
    
    var height: Double
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var layers: js.UndefOr[js.Array[ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[ScatterPlotDatum]]] = js.undefined
    
    var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var nodeId: js.UndefOr[PropertyAccessor[OmitScatterPlotNodeDataSc, String]] = js.undefined
    
    var nodeSize: js.UndefOr[
        Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[OmitScatterPlotNodeDataScData, Double])
      ] = js.undefined
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[ScatterPlotDatum]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows getting a ref to the component instance.
      * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
      * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
      */
    var ref: js.UndefOr[Ref[HTMLCanvasElement]] = js.undefined
    
    var renderNode: js.UndefOr[
        js.Function2[
          /* ctx */ CanvasRenderingContext2D, 
          /* node */ ScatterPlotNodeData[ScatterPlotDatum], 
          Unit
        ]
      ] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[ScatterPlotTooltip[ScatterPlotDatum]] = js.undefined
    
    var useMesh: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
    
    var xFormat: js.UndefOr[ValueFormat[ScatterPlotValue, Unit]] = js.undefined
    
    var xScale: js.UndefOr[ScaleSpec] = js.undefined
    
    var yFormat: js.UndefOr[ValueFormat[ScatterPlotValue, Unit]] = js.undefined
    
    var yScale: js.UndefOr[ScaleSpec] = js.undefined
  }
  object PartialScatterPlotCommonP {
    
    inline def apply(data: js.Array[ScatterPlotRawSerie[ScatterPlotDatum]], height: Double, width: Double): PartialScatterPlotCommonP = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialScatterPlotCommonP]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialScatterPlotCommonP] (val x: Self) extends AnyVal {
      
      inline def setAnnotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[ScatterPlotDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[ScatterPlotDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
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
      
      inline def setData(value: js.Array[ScatterPlotRawSerie[ScatterPlotDatum]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterPlotRawSerie[ScatterPlotDatum]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebugMesh(value: Boolean): Self = StObject.set(x, "debugMesh", value.asInstanceOf[js.Any])
      
      inline def setDebugMeshUndefined: Self = StObject.set(x, "debugMesh", js.undefined)
      
      inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
      
      inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
      
      inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
      
      inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
      
      inline def setGridXValues(value: GridValues[ScatterPlotValue]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
      
      inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
      
      inline def setGridXValuesVarargs(value: Double*): Self = StObject.set(x, "gridXValues", js.Array(value*))
      
      inline def setGridYValues(value: GridValues[ScatterPlotValue]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
      
      inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
      
      inline def setGridYValuesVarargs(value: Double*): Self = StObject.set(x, "gridYValues", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLayers(value: js.Array[ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[ScatterPlotDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: (ScatterPlotLayerId | ScatterPlotCustomCanvasLayer[ScatterPlotDatum])*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setNodeId(value: PropertyAccessor[OmitScatterPlotNodeDataSc, String]): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdFunction1(value: OmitScatterPlotNodeDataSc => String): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setNodeSize(
        value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[OmitScatterPlotNodeDataScData, Double])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: OmitScatterPlotNodeDataScData => Double): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[ScatterPlotDatum], /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRef(value: Ref[HTMLCanvasElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLCanvasElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRenderNode(
        value: (/* ctx */ CanvasRenderingContext2D, /* node */ ScatterPlotNodeData[ScatterPlotDatum]) => Unit
      ): Self = StObject.set(x, "renderNode", js.Any.fromFunction2(value))
      
      inline def setRenderNodeUndefined: Self = StObject.set(x, "renderNode", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ScatterPlotTooltip[ScatterPlotDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseMesh(value: Boolean): Self = StObject.set(x, "useMesh", value.asInstanceOf[js.Any])
      
      inline def setUseMeshUndefined: Self = StObject.set(x, "useMesh", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXFormat(value: ValueFormat[ScatterPlotValue, Unit]): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
      
      inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
      
      inline def setXScale(value: ScaleSpec): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
      
      inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
      
      inline def setYFormat(value: ValueFormat[ScatterPlotValue, Unit]): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
      
      inline def setYFormatUndefined: Self = StObject.set(x, "yFormat", js.undefined)
      
      inline def setYScale(value: ScaleSpec): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
      
      inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
    }
  }
  
  trait SerieId extends StObject {
    
    var serieId: String | Double
  }
  object SerieId {
    
    inline def apply(serieId: String | Double): SerieId = {
      val __obj = js.Dynamic.literal(serieId = serieId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerieId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerieId] (val x: Self) extends AnyVal {
      
      inline def setSerieId(value: String | Double): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var color: String
    
    var size: Double
    
    var x: Double
    
    var y: Double
  }
  object Size {
    
    inline def apply(color: String, size: Double, x: Double, y: Double): Size = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
