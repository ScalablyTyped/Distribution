package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.Source
import typings.oracleOraclejet.anon.`11`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typings.oracleOraclejet.oracleOraclejetNumbers.`1`
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.changed
import typings.oracleOraclejet.oracleOraclejetStrings.changedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.changedState
import typings.oracleOraclejet.oracleOraclejetStrings.changedStateChanged
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.hoverState
import typings.oracleOraclejet.oracleOraclejetStrings.hoverStateChanged
import typings.oracleOraclejet.oracleOraclejetStrings.max
import typings.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typings.oracleOraclejet.oracleOraclejetStrings.meet
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.minChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.orientation
import typings.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.preserveAspectRatio
import typings.oracleOraclejet.oracleOraclejetStrings.preserveAspectRatioChanged
import typings.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typings.oracleOraclejet.oracleOraclejetStrings.readonly_
import typings.oracleOraclejet.oracleOraclejetStrings.selectedState
import typings.oracleOraclejet.oracleOraclejetStrings.selectedStateChanged
import typings.oracleOraclejet.oracleOraclejetStrings.step
import typings.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typings.oracleOraclejet.oracleOraclejetStrings.thresholds
import typings.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.unselectedState
import typings.oracleOraclejet.oracleOraclejetStrings.unselectedStateChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojRatingGauge
  extends StObject
     with dvtBaseGauge[ojRatingGaugeSettableProperties] {
  
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[vertical | horizontal], 
      js.Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[vertical | horizontal], 
      js.Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | meet], js.Any]
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | meet], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0.5` | `1`], js.Any]
  ): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0.5` | `1`], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], js.Any]
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Threshold]], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Threshold]], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`11`], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`11`], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Source], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var changed: Boolean = js.native
  
  var changedState: Source = js.native
  
  @JSName("getProperty")
  def getProperty_changed(property: changed): Boolean = js.native
  @JSName("getProperty")
  def getProperty_changedState(property: changedState): Source = js.native
  @JSName("getProperty")
  def getProperty_hoverState(property: hoverState): Source = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_preserveAspectRatio(property: preserveAspectRatio): none | meet = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_selectedState(property: selectedState): Source = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): `0.5` | `1` = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `11` = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_unselectedState(property: unselectedState): Source = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  
  var hoverState: Source = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var onChangedChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], js.Any]) | Null = js.native
  
  var onChangedStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Source], js.Any]) | Null = js.native
  
  var onHoverStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Source], js.Any]) | Null = js.native
  
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], js.Any]) | Null = js.native
  
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], js.Any]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[vertical | horizontal], js.Any]) | Null = js.native
  
  var onPreserveAspectRatioChanged: (js.Function1[/* event */ JetElementCustomEvent[none | meet], js.Any]) | Null = js.native
  
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], js.Any]) | Null = js.native
  
  var onSelectedStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Source], js.Any]) | Null = js.native
  
  var onStepChanged: (js.Function1[/* event */ JetElementCustomEvent[`0.5` | `1`], js.Any]) | Null = js.native
  
  var onThresholdsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Threshold]], js.Any]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[`11`], js.Any]) | Null = js.native
  
  var onTransientValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], js.Any]) | Null = js.native
  
  var onUnselectedStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Source], js.Any]) | Null = js.native
  
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], js.Any]) | Null = js.native
  
  var onVisualEffectsChanged: (js.Function1[/* event */ JetElementCustomEvent[none | auto], js.Any]) | Null = js.native
  
  var orientation: vertical | horizontal = js.native
  
  var preserveAspectRatio: none | meet = js.native
  
  var readonly: Boolean = js.native
  
  var selectedState: Source = js.native
  
  def setProperties(properties: ojRatingGaugeSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: meet): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: none): Unit = js.native
  def setProperty(property: step, value: `0.5`): Unit = js.native
  def setProperty(property: step, value: `1`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_changed(property: changed, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_changedState(property: changedState, value: Source): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverState(property: hoverState, value: Source): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedState(property: selectedState, value: Source): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `11`): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_unselectedState(property: unselectedState, value: Source): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  
  var step: `0.5` | `1` = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `11` = js.native
  
  val transientValue: Double | Null = js.native
  
  var unselectedState: Source = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojRatingGauge {
  
  // tslint:disable-next-line interface-over-type-literal
  trait Threshold extends StObject {
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var shortDesc: js.UndefOr[String] = js.undefined
  }
  object Threshold {
    
    inline def apply(): Threshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Threshold]
    }
    
    extension [Self <: Threshold](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext extends StObject {
    
    var color: String
    
    var componentElement: Element
    
    var label: String
    
    var parentElement: Element
  }
  object TooltipContext {
    
    inline def apply(color: String, componentElement: Element, label: String, parentElement: Element): TooltipContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    extension [Self <: TooltipContext](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
}
