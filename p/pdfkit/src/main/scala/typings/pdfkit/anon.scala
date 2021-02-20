package typings.pdfkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Annots extends StObject {
    
    var Annots: js.Any = js.native
    
    var ExtGState: js.UndefOr[js.Any] = js.native
    
    var Font: js.UndefOr[js.Any] = js.native
    
    var Pattern: js.Any = js.native
    
    var XObject: js.UndefOr[js.Any] = js.native
  }
  object Annots {
    
    @scala.inline
    def apply(Annots: js.Any, Pattern: js.Any): Annots = {
      val __obj = js.Dynamic.literal(Annots = Annots.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Annots]
    }
    
    @scala.inline
    implicit class AnnotsMutableBuilder[Self <: Annots] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnots(value: js.Any): Self = StObject.set(x, "Annots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtGState(value: js.Any): Self = StObject.set(x, "ExtGState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtGStateUndefined: Self = StObject.set(x, "ExtGState", js.undefined)
      
      @scala.inline
      def setFont(value: js.Any): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "Font", js.undefined)
      
      @scala.inline
      def setPattern(value: js.Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXObject(value: js.Any): Self = StObject.set(x, "XObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXObjectUndefined: Self = StObject.set(x, "XObject", js.undefined)
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var start: Double = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, start: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Origin extends StObject {
    
    var origin: js.UndefOr[js.Array[Double]] = js.native
  }
  object Origin {
    
    @scala.inline
    def apply(): Origin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Origin]
    }
    
    @scala.inline
    implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value :_*))
    }
  }
}
