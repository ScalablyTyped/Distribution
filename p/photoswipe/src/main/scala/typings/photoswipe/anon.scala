package typings.photoswipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double | String
    
    var top: Double
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double | String, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prevent extends StObject {
    
    var prevent: Boolean
  }
  object Prevent {
    
    @scala.inline
    def apply(prevent: Boolean): Prevent = {
      val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prevent]
    }
    
    @scala.inline
    implicit class PreventMutableBuilder[Self <: Prevent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevent(value: Boolean): Self = StObject.set(x, "prevent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Top extends StObject {
    
    var bottom: Double
    
    var top: Double
  }
  object Top {
    
    @scala.inline
    def apply(bottom: Double, top: Double): Top = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Top]
    }
    
    @scala.inline
    implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait W extends StObject {
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object W {
    
    @scala.inline
    def apply(w: Double, x: Double, y: Double): W = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[W]
    }
    
    @scala.inline
    implicit class WMutableBuilder[Self <: W] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
