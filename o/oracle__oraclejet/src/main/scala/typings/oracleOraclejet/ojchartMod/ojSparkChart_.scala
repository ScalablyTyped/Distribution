package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.`0`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojchartMod.ojSparkChart.ItemContext
import typings.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.`type`
import typings.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typings.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.areaColor
import typings.oracleOraclejet.oracleOraclejetStrings.areaColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.areaSvgClassName
import typings.oracleOraclejet.oracleOraclejetStrings.areaSvgClassNameChanged
import typings.oracleOraclejet.oracleOraclejetStrings.areaSvgStyle
import typings.oracleOraclejet.oracleOraclejetStrings.areaSvgStyleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.barGapRatio
import typings.oracleOraclejet.oracleOraclejetStrings.barGapRatioChanged
import typings.oracleOraclejet.oracleOraclejetStrings.baselineScaling
import typings.oracleOraclejet.oracleOraclejetStrings.baselineScalingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.firstColor
import typings.oracleOraclejet.oracleOraclejetStrings.firstColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highColor
import typings.oracleOraclejet.oracleOraclejetStrings.highColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.lastColor
import typings.oracleOraclejet.oracleOraclejetStrings.lastColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineStyle
import typings.oracleOraclejet.oracleOraclejetStrings.lineStyleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.lineType
import typings.oracleOraclejet.oracleOraclejetStrings.lineTypeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.lineWidth
import typings.oracleOraclejet.oracleOraclejetStrings.lineWidthChanged
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.lowColor
import typings.oracleOraclejet.oracleOraclejetStrings.lowColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.markerShape
import typings.oracleOraclejet.oracleOraclejetStrings.markerShapeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.markerSize
import typings.oracleOraclejet.oracleOraclejetStrings.markerSizeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.referenceObjects
import typings.oracleOraclejet.oracleOraclejetStrings.referenceObjectsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typings.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typings.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typings.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typings.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.zero
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSparkChart_[K, D] extends dvtBaseComponent[ojSparkChartSettableProperties[K, D]] {
  var animationDuration: Double | Null = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var areaColor: String = js.native
  var areaSvgClassName: String = js.native
  var areaSvgStyle: js.Object = js.native
  var as: String = js.native
  var barGapRatio: Double = js.native
  var baselineScaling: zero | min = js.native
  var color: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var firstColor: String = js.native
  var highColor: String = js.native
  var lastColor: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  var lineWidth: Double = js.native
  var lowColor: String = js.native
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  var markerSize: Double = js.native
  var onAnimationDurationChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAreaColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onAreaSvgClassNameChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onAreaSvgStyleChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onBarGapRatioChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onBaselineScalingChanged: (js.Function1[/* event */ JetElementCustomEvent[zero | min], _]) | Null = js.native
  var onColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onFirstColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onHighColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onLastColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onLineStyleChanged: (js.Function1[/* event */ JetElementCustomEvent[dotted | dashed | solid], _]) | Null = js.native
  var onLineTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
    ], 
    _
  ]) | Null = js.native
  var onLineWidthChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onLowColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onMarkerShapeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
    ], 
    _
  ]) | Null = js.native
  var onMarkerSizeChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onReferenceObjectsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[ReferenceObject]], _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[`0`], _]) | Null = js.native
  var onTypeChanged: (js.Function1[/* event */ JetElementCustomEvent[area | lineWithArea | bar | line], _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[/* event */ JetElementCustomEvent[none | auto], _]) | Null = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var tooltip: `0` = js.native
  @JSName("translations")
  var translations_ojSparkChart_ : LabelAndValue = js.native
  var `type`: area | lineWithArea | bar | line = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zero | min], _]
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zero | min], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dotted | dashed | solid], _]
  ): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dotted | dashed | solid], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[area | lineWithArea | bar | line], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[area | lineWithArea | bar | line], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[ReferenceObject]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[ReferenceObject]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0`], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0`], _],
    useCapture: Boolean
  ): Unit = js.native
  def getDataItem(itemIndex: Double): ItemContext | Null = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_areaColor(property: areaColor): String = js.native
  @JSName("getProperty")
  def getProperty_areaSvgClassName(property: areaSvgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_areaSvgStyle(property: areaSvgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_barGapRatio(property: barGapRatio): Double = js.native
  @JSName("getProperty")
  def getProperty_baselineScaling(property: baselineScaling): zero | min = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_firstColor(property: firstColor): String = js.native
  @JSName("getProperty")
  def getProperty_highColor(property: highColor): String = js.native
  @JSName("getProperty")
  def getProperty_lastColor(property: lastColor): String = js.native
  @JSName("getProperty")
  def getProperty_lineStyle(property: lineStyle): dotted | dashed | solid = js.native
  @JSName("getProperty")
  def getProperty_lineType(property: lineType): curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  @JSName("getProperty")
  def getProperty_lineWidth(property: lineWidth): Double = js.native
  @JSName("getProperty")
  def getProperty_lowColor(property: lowColor): String = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: markerShape): auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: markerSize): Double = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `0` = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): area | lineWithArea | bar | line = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojSparkChartSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: `type`, value: area): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: line): Unit = js.native
  def setProperty(property: `type`, value: lineWithArea): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: baselineScaling, value: min): Unit = js.native
  def setProperty(property: baselineScaling, value: zero): Unit = js.native
  def setProperty(property: lineStyle, value: dashed): Unit = js.native
  def setProperty(property: lineStyle, value: dotted): Unit = js.native
  def setProperty(property: lineStyle, value: solid): Unit = js.native
  def setProperty(property: lineType, value: centeredSegmented): Unit = js.native
  def setProperty(property: lineType, value: centeredStepped): Unit = js.native
  def setProperty(property: lineType, value: curved): Unit = js.native
  def setProperty(property: lineType, value: none): Unit = js.native
  def setProperty(property: lineType, value: segmented): Unit = js.native
  def setProperty(property: lineType, value: stepped): Unit = js.native
  def setProperty(property: lineType, value: straight): Unit = js.native
  def setProperty(property: markerShape, value: auto): Unit = js.native
  def setProperty(property: markerShape, value: circle): Unit = js.native
  def setProperty(property: markerShape, value: diamond): Unit = js.native
  def setProperty(property: markerShape, value: human): Unit = js.native
  def setProperty(property: markerShape, value: plus): Unit = js.native
  def setProperty(property: markerShape, value: square): Unit = js.native
  def setProperty(property: markerShape, value: star): Unit = js.native
  def setProperty(property: markerShape, value: triangleDown): Unit = js.native
  def setProperty(property: markerShape, value: triangleUp): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaColor(property: areaColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgClassName(property: areaSvgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgStyle(property: areaSvgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_barGapRatio(property: barGapRatio, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstColor(property: firstColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_highColor(property: highColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_lastColor(property: lastColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineWidth(property: lineWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_lowColor(property: lowColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerShape(property: markerShape, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `0`): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
}

