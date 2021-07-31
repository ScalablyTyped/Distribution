package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Graphics {
  
  /**
    * Graphics fill style settings.
    */
  trait FillStyle extends StObject {
    
    /**
      * The fill alpha.
      */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * The fill color.
      */
    var color: js.UndefOr[Double] = js.undefined
  }
  object FillStyle {
    
    @scala.inline
    def apply(): FillStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillStyle]
    }
    
    @scala.inline
    implicit class FillStyleMutableBuilder[Self <: FillStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  /**
    * Graphics line style (or stroke style) settings.
    */
  trait LineStyle extends StObject {
    
    /**
      * The stroke alpha.
      */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke color.
      */
    var color: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke width.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LineStyle {
    
    @scala.inline
    def apply(): LineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineStyle]
    }
    
    @scala.inline
    implicit class LineStyleMutableBuilder[Self <: LineStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Options for the Graphics game Object.
    */
  trait Options
    extends StObject
       with Styles {
    
    /**
      * The x coordinate of the Graphics.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The y coordinate of the Graphics.
      */
    var y: js.UndefOr[Double] = js.undefined
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
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait RoundedRectRadius extends StObject {
    
    /**
      * Bottom left
      */
    var bl: js.UndefOr[Double] = js.undefined
    
    /**
      * Bottom right
      */
    var br: js.UndefOr[Double] = js.undefined
    
    /**
      * Top left
      */
    var tl: js.UndefOr[Double] = js.undefined
    
    /**
      * Top right
      */
    var tr: js.UndefOr[Double] = js.undefined
  }
  object RoundedRectRadius {
    
    @scala.inline
    def apply(): RoundedRectRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoundedRectRadius]
    }
    
    @scala.inline
    implicit class RoundedRectRadiusMutableBuilder[Self <: RoundedRectRadius] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBl(value: Double): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
      
      @scala.inline
      def setBr(value: Double): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      @scala.inline
      def setTl(value: Double): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlUndefined: Self = StObject.set(x, "tl", js.undefined)
      
      @scala.inline
      def setTr(value: Double): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
    }
  }
  
  /**
    * Graphics style settings.
    */
  trait Styles extends StObject {
    
    /**
      * The style applied to shape areas.
      */
    var fillStyle: js.UndefOr[FillStyle] = js.undefined
    
    /**
      * The style applied to shape outlines.
      */
    var lineStyle: js.UndefOr[LineStyle] = js.undefined
  }
  object Styles {
    
    @scala.inline
    def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillStyle(value: FillStyle): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      @scala.inline
      def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    }
  }
}
