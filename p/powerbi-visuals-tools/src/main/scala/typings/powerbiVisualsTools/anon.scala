package typings.powerbiVisualsTools

import typings.powerbiVisualsTools.mod.FillSolidColorTypeDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var color: js.UndefOr[FillSolidColorTypeDescriptor] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setColor(value: FillSolidColorTypeDescriptor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait ColorPatternKind extends StObject {
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var patternKind: js.UndefOr[Boolean] = js.undefined
  }
  object ColorPatternKind {
    
    inline def apply(): ColorPatternKind = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPatternKind]
    }
    
    extension [Self <: ColorPatternKind](x: Self) {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setPatternKind(value: Boolean): Self = StObject.set(x, "patternKind", value.asInstanceOf[js.Any])
      
      inline def setPatternKindUndefined: Self = StObject.set(x, "patternKind", js.undefined)
    }
  }
  
  trait EndColor extends StObject {
    
    var endColor: js.UndefOr[String] = js.undefined
    
    var startColor: js.UndefOr[String] = js.undefined
  }
  object EndColor {
    
    inline def apply(): EndColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndColor]
    }
    
    extension [Self <: EndColor](x: Self) {
      
      inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
      
      inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
      
      inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
      
      inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    }
  }
  
  trait PatternKind extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var patternKind: js.UndefOr[String] = js.undefined
  }
  object PatternKind {
    
    inline def apply(): PatternKind = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternKind]
    }
    
    extension [Self <: PatternKind](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setPatternKind(value: String): Self = StObject.set(x, "patternKind", value.asInstanceOf[js.Any])
      
      inline def setPatternKindUndefined: Self = StObject.set(x, "patternKind", js.undefined)
    }
  }
  
  trait StartColor extends StObject {
    
    var endColor: js.UndefOr[Boolean] = js.undefined
    
    var startColor: js.UndefOr[Boolean] = js.undefined
  }
  object StartColor {
    
    inline def apply(): StartColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartColor]
    }
    
    extension [Self <: StartColor](x: Self) {
      
      inline def setEndColor(value: Boolean): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
      
      inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
      
      inline def setStartColor(value: Boolean): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
      
      inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    }
  }
}
