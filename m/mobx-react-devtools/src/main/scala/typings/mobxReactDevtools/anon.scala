package typings.mobxReactDevtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[Double | String] = js.undefined
    
    var left: js.UndefOr[Double | String] = js.undefined
    
    var right: js.UndefOr[Double | String] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait GraphEnabled extends StObject {
    
    var graphEnabled: js.UndefOr[Boolean] = js.undefined
    
    var logEnabled: js.UndefOr[Boolean] = js.undefined
    
    var logFilter: js.UndefOr[js.Function1[/* p */ Any, Boolean]] = js.undefined
    
    var updatesEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object GraphEnabled {
    
    inline def apply(): GraphEnabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphEnabled]
    }
    
    extension [Self <: GraphEnabled](x: Self) {
      
      inline def setGraphEnabled(value: Boolean): Self = StObject.set(x, "graphEnabled", value.asInstanceOf[js.Any])
      
      inline def setGraphEnabledUndefined: Self = StObject.set(x, "graphEnabled", js.undefined)
      
      inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "logEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogEnabledUndefined: Self = StObject.set(x, "logEnabled", js.undefined)
      
      inline def setLogFilter(value: /* p */ Any => Boolean): Self = StObject.set(x, "logFilter", js.Any.fromFunction1(value))
      
      inline def setLogFilterUndefined: Self = StObject.set(x, "logFilter", js.undefined)
      
      inline def setUpdatesEnabled(value: Boolean): Self = StObject.set(x, "updatesEnabled", value.asInstanceOf[js.Any])
      
      inline def setUpdatesEnabledUndefined: Self = StObject.set(x, "updatesEnabled", js.undefined)
    }
  }
  
  trait HighlightTimeout extends StObject {
    
    var highlightTimeout: js.UndefOr[Double] = js.undefined
  }
  object HighlightTimeout {
    
    inline def apply(): HighlightTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightTimeout]
    }
    
    extension [Self <: HighlightTimeout](x: Self) {
      
      inline def setHighlightTimeout(value: Double): Self = StObject.set(x, "highlightTimeout", value.asInstanceOf[js.Any])
      
      inline def setHighlightTimeoutUndefined: Self = StObject.set(x, "highlightTimeout", js.undefined)
    }
  }
}
