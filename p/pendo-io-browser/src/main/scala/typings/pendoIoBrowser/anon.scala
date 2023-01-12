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
    
    inline def apply(): ArrowSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowSize] (val x: Self) extends AnyVal {
      
      inline def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
      
      inline def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
    }
  }
  
  trait Auto extends StObject {
    
    var auto: js.Array[Guide]
    
    var `override`: js.Array[Guide]
  }
  object Auto {
    
    inline def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): Auto = {
      val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Auto] (val x: Self) extends AnyVal {
      
      inline def setAuto(value: js.Array[Guide]): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoVarargs(value: Guide*): Self = StObject.set(x, "auto", js.Array(value*))
      
      inline def setOverride(value: js.Array[Guide]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideVarargs(value: Guide*): Self = StObject.set(x, "override", js.Array(value*))
    }
  }
  
  trait AutoHeight extends StObject {
    
    var autoHeight: Boolean
    
    var css: String
    
    var height: Double
    
    var position: String
    
    var variables: Any
    
    var width: Double
  }
  object AutoHeight {
    
    inline def apply(autoHeight: Boolean, css: String, height: Double, position: String, variables: Any, width: Double): AutoHeight = {
      val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoHeight] (val x: Self) extends AnyVal {
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: Any): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Badge extends StObject {
    
    var badge: Any
    
    var device: Desktop
    
    var launcher: Keywords
    
    // TODO
    var priority: Double
    
    var `type`: String
  }
  object Badge {
    
    inline def apply(badge: Any, device: Desktop, launcher: Keywords, priority: Double, `type`: String): Badge = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], launcher = launcher.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Badge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
      
      inline def setBadge(value: Any): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Desktop): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setLauncher(value: Keywords): Self = StObject.set(x, "launcher", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Boolean] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[ArrowSize] = js.undefined
  }
  object Delay {
    
    inline def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTooltip(value: ArrowSize): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait Desktop extends StObject {
    
    var desktop: Boolean
    
    var mobile: Boolean
    
    var `type`: desktop | mobile
  }
  object Desktop {
    
    inline def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): Desktop = {
      val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Desktop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Desktop] (val x: Self) extends AnyVal {
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setType(value: desktop | mobile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filters extends StObject {
    
    var filters: js.Array[Any]
  }
  object Filters {
    
    inline def apply(filters: js.Array[Any]): Filters = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: js.Array[Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: Any*): Self = StObject.set(x, "filters", js.Array(value*))
    }
  }
  
  trait Keywords extends StObject {
    
    var keywords: js.Array[String]
  }
  object Keywords {
    
    inline def apply(keywords: js.Array[String]): Keywords = {
      val __obj = js.Dynamic.literal(keywords = keywords.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keywords]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Keywords] (val x: Self) extends AnyVal {
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    }
  }
  
  trait Steps extends StObject {
    
    var steps: Double
  }
  object Steps {
    
    inline def apply(steps: Double): Steps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Until extends StObject {
    
    var until: reload
  }
  object Until {
    
    inline def apply(): Until = {
      val __obj = js.Dynamic.literal(until = "reload")
      __obj.asInstanceOf[Until]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Until] (val x: Self) extends AnyVal {
      
      inline def setUntil(value: reload): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    }
  }
}
