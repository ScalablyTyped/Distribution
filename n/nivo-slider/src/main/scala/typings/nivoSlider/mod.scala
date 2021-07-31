package typings.nivoSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoSlider.nivoSliderStrings.sliceDown
    - typings.nivoSlider.nivoSliderStrings.sliceDownLeft
    - typings.nivoSlider.nivoSliderStrings.sliceUp
    - typings.nivoSlider.nivoSliderStrings.sliceUpLeft
    - typings.nivoSlider.nivoSliderStrings.sliceUpDown
    - typings.nivoSlider.nivoSliderStrings.sliceUpDownLeft
    - typings.nivoSlider.nivoSliderStrings.fold
    - typings.nivoSlider.nivoSliderStrings.fade
    - typings.nivoSlider.nivoSliderStrings.random
    - typings.nivoSlider.nivoSliderStrings.slideInRight
    - typings.nivoSlider.nivoSliderStrings.slideInLeft
    - typings.nivoSlider.nivoSliderStrings.boxRandom
    - typings.nivoSlider.nivoSliderStrings.boxRain
    - typings.nivoSlider.nivoSliderStrings.boxRainReverse
    - typings.nivoSlider.nivoSliderStrings.boxRainGrow
    - typings.nivoSlider.nivoSliderStrings.boxRainGrowReverse
  */
  trait EffectType extends StObject
  object EffectType {
    
    @scala.inline
    def boxRain: typings.nivoSlider.nivoSliderStrings.boxRain = "boxRain".asInstanceOf[typings.nivoSlider.nivoSliderStrings.boxRain]
    
    @scala.inline
    def boxRainGrow: typings.nivoSlider.nivoSliderStrings.boxRainGrow = "boxRainGrow".asInstanceOf[typings.nivoSlider.nivoSliderStrings.boxRainGrow]
    
    @scala.inline
    def boxRainGrowReverse: typings.nivoSlider.nivoSliderStrings.boxRainGrowReverse = "boxRainGrowReverse".asInstanceOf[typings.nivoSlider.nivoSliderStrings.boxRainGrowReverse]
    
    @scala.inline
    def boxRainReverse: typings.nivoSlider.nivoSliderStrings.boxRainReverse = "boxRainReverse".asInstanceOf[typings.nivoSlider.nivoSliderStrings.boxRainReverse]
    
    @scala.inline
    def boxRandom: typings.nivoSlider.nivoSliderStrings.boxRandom = "boxRandom".asInstanceOf[typings.nivoSlider.nivoSliderStrings.boxRandom]
    
    @scala.inline
    def fade: typings.nivoSlider.nivoSliderStrings.fade = "fade".asInstanceOf[typings.nivoSlider.nivoSliderStrings.fade]
    
    @scala.inline
    def fold: typings.nivoSlider.nivoSliderStrings.fold = "fold".asInstanceOf[typings.nivoSlider.nivoSliderStrings.fold]
    
    @scala.inline
    def random: typings.nivoSlider.nivoSliderStrings.random = "random".asInstanceOf[typings.nivoSlider.nivoSliderStrings.random]
    
    @scala.inline
    def sliceDown: typings.nivoSlider.nivoSliderStrings.sliceDown = "sliceDown".asInstanceOf[typings.nivoSlider.nivoSliderStrings.sliceDown]
    
    @scala.inline
    def sliceDownLeft: typings.nivoSlider.nivoSliderStrings.sliceDownLeft = "sliceDownLeft".asInstanceOf[typings.nivoSlider.nivoSliderStrings.sliceDownLeft]
    
    @scala.inline
    def sliceUp: typings.nivoSlider.nivoSliderStrings.sliceUp = "sliceUp".asInstanceOf[typings.nivoSlider.nivoSliderStrings.sliceUp]
    
    @scala.inline
    def sliceUpDown: typings.nivoSlider.nivoSliderStrings.sliceUpDown = "sliceUpDown".asInstanceOf[typings.nivoSlider.nivoSliderStrings.sliceUpDown]
    
    @scala.inline
    def sliceUpDownLeft: typings.nivoSlider.nivoSliderStrings.sliceUpDownLeft = "sliceUpDownLeft".asInstanceOf[typings.nivoSlider.nivoSliderStrings.sliceUpDownLeft]
    
    @scala.inline
    def sliceUpLeft: typings.nivoSlider.nivoSliderStrings.sliceUpLeft = "sliceUpLeft".asInstanceOf[typings.nivoSlider.nivoSliderStrings.sliceUpLeft]
    
    @scala.inline
    def slideInLeft: typings.nivoSlider.nivoSliderStrings.slideInLeft = "slideInLeft".asInstanceOf[typings.nivoSlider.nivoSliderStrings.slideInLeft]
    
    @scala.inline
    def slideInRight: typings.nivoSlider.nivoSliderStrings.slideInRight = "slideInRight".asInstanceOf[typings.nivoSlider.nivoSliderStrings.slideInRight]
  }
  
  trait Options extends StObject {
    
    var afterChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var animSpeed: js.UndefOr[Double] = js.undefined
    
    var beforeChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var boxCols: js.UndefOr[Double] = js.undefined
    
    var boxRows: js.UndefOr[Double] = js.undefined
    
    var controlNav: js.UndefOr[Boolean] = js.undefined
    
    var controlNavThumbs: js.UndefOr[Boolean] = js.undefined
    
    var directionNav: js.UndefOr[Boolean] = js.undefined
    
    var effect: js.UndefOr[EffectType] = js.undefined
    
    var lastSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var manualAdvance: js.UndefOr[Boolean] = js.undefined
    
    var nextText: js.UndefOr[String] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    var pauseTime: js.UndefOr[Double] = js.undefined
    
    var prevText: js.UndefOr[String] = js.undefined
    
    var randomStart: js.UndefOr[Boolean] = js.undefined
    
    var slices: js.UndefOr[Double] = js.undefined
    
    var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var startSlide: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterChange(value: () => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setAfterLoad(value: () => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
      @scala.inline
      def setAnimSpeed(value: Double): Self = StObject.set(x, "animSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimSpeedUndefined: Self = StObject.set(x, "animSpeed", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: () => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setBoxCols(value: Double): Self = StObject.set(x, "boxCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxColsUndefined: Self = StObject.set(x, "boxCols", js.undefined)
      
      @scala.inline
      def setBoxRows(value: Double): Self = StObject.set(x, "boxRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxRowsUndefined: Self = StObject.set(x, "boxRows", js.undefined)
      
      @scala.inline
      def setControlNav(value: Boolean): Self = StObject.set(x, "controlNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlNavThumbs(value: Boolean): Self = StObject.set(x, "controlNavThumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlNavThumbsUndefined: Self = StObject.set(x, "controlNavThumbs", js.undefined)
      
      @scala.inline
      def setControlNavUndefined: Self = StObject.set(x, "controlNav", js.undefined)
      
      @scala.inline
      def setDirectionNav(value: Boolean): Self = StObject.set(x, "directionNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNavUndefined: Self = StObject.set(x, "directionNav", js.undefined)
      
      @scala.inline
      def setEffect(value: EffectType): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setLastSlide(value: () => Unit): Self = StObject.set(x, "lastSlide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLastSlideUndefined: Self = StObject.set(x, "lastSlide", js.undefined)
      
      @scala.inline
      def setManualAdvance(value: Boolean): Self = StObject.set(x, "manualAdvance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualAdvanceUndefined: Self = StObject.set(x, "manualAdvance", js.undefined)
      
      @scala.inline
      def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPauseTime(value: Double): Self = StObject.set(x, "pauseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseTimeUndefined: Self = StObject.set(x, "pauseTime", js.undefined)
      
      @scala.inline
      def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      @scala.inline
      def setRandomStart(value: Boolean): Self = StObject.set(x, "randomStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomStartUndefined: Self = StObject.set(x, "randomStart", js.undefined)
      
      @scala.inline
      def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
      
      @scala.inline
      def setSlideshowEnd(value: () => Unit): Self = StObject.set(x, "slideshowEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideshowEndUndefined: Self = StObject.set(x, "slideshowEnd", js.undefined)
      
      @scala.inline
      def setStartSlide(value: Double): Self = StObject.set(x, "startSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSlideUndefined: Self = StObject.set(x, "startSlide", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def nivoSlider(): JQuery = js.native
      def nivoSlider(options: Options): JQuery = js.native
    }
  }
}
