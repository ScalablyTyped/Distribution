package typings.pendoIoBrowser

import typings.pendoIoBrowser.pendo.Guide
import typings.pendoIoBrowser.pendoIoBrowserStrings.desktop
import typings.pendoIoBrowser.pendoIoBrowserStrings.mobile
import typings.pendoIoBrowser.pendoIoBrowserStrings.reload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrowSize extends StObject {
    
    var arrowSize: js.UndefOr[Double] = js.undefined
  }
  object ArrowSize {
    
    @scala.inline
    def apply(): ArrowSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowSize]
    }
    
    @scala.inline
    implicit class ArrowSizeMutableBuilder[Self <: ArrowSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
    }
  }
  
  trait Auto extends StObject {
    
    var auto: js.Array[Guide]
    
    var `override`: js.Array[Guide]
  }
  object Auto {
    
    @scala.inline
    def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): Auto = {
      val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auto]
    }
    
    @scala.inline
    implicit class AutoMutableBuilder[Self <: Auto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: js.Array[Guide]): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoVarargs(value: Guide*): Self = StObject.set(x, "auto", js.Array(value :_*))
      
      @scala.inline
      def setOverride(value: js.Array[Guide]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideVarargs(value: Guide*): Self = StObject.set(x, "override", js.Array(value :_*))
    }
  }
  
  trait AutoHeight extends StObject {
    
    var autoHeight: Boolean
    
    var css: String
    
    var height: Double
    
    var position: String
    
    var variables: js.Any
    
    var width: Double
  }
  object AutoHeight {
    
    @scala.inline
    def apply(
      autoHeight: Boolean,
      css: String,
      height: Double,
      position: String,
      variables: js.Any,
      width: Double
    ): AutoHeight = {
      val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoHeight]
    }
    
    @scala.inline
    implicit class AutoHeightMutableBuilder[Self <: AutoHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: js.Any): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Badge extends StObject {
    
    var badge: js.Any
    
    var device: Desktop
    
    var launcher: Keywords
    
    // TODO
    var priority: Double
    
    var `type`: String
  }
  object Badge {
    
    @scala.inline
    def apply(badge: js.Any, device: Desktop, launcher: Keywords, priority: Double, `type`: String): Badge = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], launcher = launcher.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Badge]
    }
    
    @scala.inline
    implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: js.Any): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: Desktop): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLauncher(value: Keywords): Self = StObject.set(x, "launcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Boolean] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[ArrowSize] = js.undefined
  }
  object Delay {
    
    @scala.inline
    def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTooltip(value: ArrowSize): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait Desktop extends StObject {
    
    var desktop: Boolean
    
    var mobile: Boolean
    
    var `type`: desktop | mobile
  }
  object Desktop {
    
    @scala.inline
    def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): Desktop = {
      val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Desktop]
    }
    
    @scala.inline
    implicit class DesktopMutableBuilder[Self <: Desktop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: desktop | mobile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filters extends StObject {
    
    var filters: js.Array[js.Any]
  }
  object Filters {
    
    @scala.inline
    def apply(filters: js.Array[js.Any]): Filters = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters]
    }
    
    @scala.inline
    implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[js.Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: js.Any*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  trait Keywords extends StObject {
    
    var keywords: js.Array[String]
  }
  object Keywords {
    
    @scala.inline
    def apply(keywords: js.Array[String]): Keywords = {
      val __obj = js.Dynamic.literal(keywords = keywords.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keywords]
    }
    
    @scala.inline
    implicit class KeywordsMutableBuilder[Self <: Keywords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    }
  }
  
  trait Steps extends StObject {
    
    var steps: Double
  }
  object Steps {
    
    @scala.inline
    def apply(steps: Double): Steps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    @scala.inline
    implicit class StepsMutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Until extends StObject {
    
    var until: reload
  }
  object Until {
    
    @scala.inline
    def apply(): Until = {
      val __obj = js.Dynamic.literal(until = "reload")
      __obj.asInstanceOf[Until]
    }
    
    @scala.inline
    implicit class UntilMutableBuilder[Self <: Until] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUntil(value: reload): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    }
  }
}
