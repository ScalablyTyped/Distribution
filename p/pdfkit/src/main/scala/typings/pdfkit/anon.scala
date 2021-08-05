package typings.pdfkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Annots extends StObject {
    
    var Annots: js.Any
    
    var ExtGState: js.UndefOr[js.Any] = js.undefined
    
    var Font: js.UndefOr[js.Any] = js.undefined
    
    var Pattern: js.Any
    
    var XObject: js.UndefOr[js.Any] = js.undefined
  }
  object Annots {
    
    inline def apply(Annots: js.Any, Pattern: js.Any): Annots = {
      val __obj = js.Dynamic.literal(Annots = Annots.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Annots]
    }
    
    extension [Self <: Annots](x: Self) {
      
      inline def setAnnots(value: js.Any): Self = StObject.set(x, "Annots", value.asInstanceOf[js.Any])
      
      inline def setExtGState(value: js.Any): Self = StObject.set(x, "ExtGState", value.asInstanceOf[js.Any])
      
      inline def setExtGStateUndefined: Self = StObject.set(x, "ExtGState", js.undefined)
      
      inline def setFont(value: js.Any): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "Font", js.undefined)
      
      inline def setPattern(value: js.Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
      
      inline def setXObject(value: js.Any): Self = StObject.set(x, "XObject", value.asInstanceOf[js.Any])
      
      inline def setXObjectUndefined: Self = StObject.set(x, "XObject", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var start: Double
  }
  object Count {
    
    inline def apply(count: Double, start: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Origin extends StObject {
    
    var origin: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Origin {
    
    inline def apply(): Origin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Origin]
    }
    
    extension [Self <: Origin](x: Self) {
      
      inline def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value :_*))
    }
  }
}
