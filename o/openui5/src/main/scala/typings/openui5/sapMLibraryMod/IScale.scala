package typings.openui5.sapMLibraryMod

import typings.openui5.float
import typings.openui5.int
import typings.openui5.jQuery.Event
import typings.openui5.sapMSliderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScale extends StObject {
  
  var __implements__sap_m_IScale: Boolean
  
  /**
    * Returns how many tickmarks would be drawn on the screen.
    *
    * **Note:** There would always be a tickmark in the beginning and in the end of the slider, regardless
    * of the value this method returns. The start and the end tickmark are taken into account for the later
    * calculations.
    *
    * @returns The number of tickmarks
    */
  def calcNumberOfTickmarks(
    /**
    * Size of the scale. This is the distance between the start and end point i.e. 0..100
    */
  fSize: float,
    /**
    * The step walking from start to end.
    */
  fStep: float,
    /**
    * Limits the number of tickmarks.
    */
  iTickmarksThreshold: int
  ): int
  
  /**
    * Provides a custom tickmark label.
    *
    * This method is optional. If it is not provided, the slider values will be placed as labels. If provided,
    * the value of the tickmark labels and accessibility attributes (aria-valuenow and aria-valuetext) of the
    * slider are changed accordingly.
    *
    * @returns The label that should be placed in the current position.
    */
  var getLabel: js.UndefOr[
    js.Function2[
      /* fValue */ float, 
      /* oSlider */ default | typings.openui5.sapMRangeSliderMod.default, 
      String | Double
    ]
  ] = js.undefined
  
  /**
    * Returns the number of tickmarks, which should be placed between labels.
    *
    * **Note:** There would always be a tickmark in the beginning and in the end of the slider, regardless
    * of the value that this method returns.
    *
    * @returns The number of tickmarks
    */
  def getTickmarksBetweenLabels(/**
    * The option array
    */
  mOptions: js.Object): int
  
  /**
    * Called, when the slider is getting resized.
    *
    * The Slider/RangeSlider control could be accessed via the oEvent.control parameter.
    *
    * Implementing this method is optional.
    */
  var handleResize: js.UndefOr[js.Function1[/* oEvent */ Event, Unit]] = js.undefined
}
object IScale {
  
  inline def apply(
    __implements__sap_m_IScale: Boolean,
    calcNumberOfTickmarks: (float, float, int) => int,
    getTickmarksBetweenLabels: js.Object => int
  ): IScale = {
    val __obj = js.Dynamic.literal(__implements__sap_m_IScale = __implements__sap_m_IScale.asInstanceOf[js.Any], calcNumberOfTickmarks = js.Any.fromFunction3(calcNumberOfTickmarks), getTickmarksBetweenLabels = js.Any.fromFunction1(getTickmarksBetweenLabels))
    __obj.asInstanceOf[IScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScale] (val x: Self) extends AnyVal {
    
    inline def setCalcNumberOfTickmarks(value: (float, float, int) => int): Self = StObject.set(x, "calcNumberOfTickmarks", js.Any.fromFunction3(value))
    
    inline def setGetLabel(
      value: (/* fValue */ float, /* oSlider */ default | typings.openui5.sapMRangeSliderMod.default) => String | Double
    ): Self = StObject.set(x, "getLabel", js.Any.fromFunction2(value))
    
    inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    inline def setGetTickmarksBetweenLabels(value: js.Object => int): Self = StObject.set(x, "getTickmarksBetweenLabels", js.Any.fromFunction1(value))
    
    inline def setHandleResize(value: /* oEvent */ Event => Unit): Self = StObject.set(x, "handleResize", js.Any.fromFunction1(value))
    
    inline def setHandleResizeUndefined: Self = StObject.set(x, "handleResize", js.undefined)
    
    inline def set__implements__sap_m_IScale(value: Boolean): Self = StObject.set(x, "__implements__sap_m_IScale", value.asInstanceOf[js.Any])
  }
}
