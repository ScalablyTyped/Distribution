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
    
    inline def apply(): FillStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillStyle]
    }
    
    extension [Self <: FillStyle](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
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
    
    inline def apply(): LineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineStyle]
    }
    
    extension [Self <: LineStyle](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
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
    
    inline def apply(): RoundedRectRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoundedRectRadius]
    }
    
    extension [Self <: RoundedRectRadius](x: Self) {
      
      inline def setBl(value: Double): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
      
      inline def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
      
      inline def setBr(value: Double): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setTl(value: Double): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
      
      inline def setTlUndefined: Self = StObject.set(x, "tl", js.undefined)
      
      inline def setTr(value: Double): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
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
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setFillStyle(value: FillStyle): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      inline def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    }
  }
}
