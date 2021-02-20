package typings.ol

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strokeMod {
  
  @JSImport("ol/style/Stroke", JSImport.Default)
  @js.native
  class default () extends Stroke {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var color: js.UndefOr[Color | ColorLike] = js.native
    
    var lineCap: js.UndefOr[CanvasLineCap] = js.native
    
    var lineDash: js.UndefOr[js.Array[Double]] = js.native
    
    var lineDashOffset: js.UndefOr[Double] = js.native
    
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.native
    
    var miterLimit: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
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
      def setColor(value: Color | ColorLike): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      @scala.inline
      def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Stroke extends StObject {
    
    /**
      * Get the stroke color.
      */
    def getColor(): Color | ColorLike = js.native
    
    /**
      * Get the line cap type for the stroke.
      */
    def getLineCap(): js.UndefOr[CanvasLineCap] = js.native
    
    /**
      * Get the line dash style for the stroke.
      */
    def getLineDash(): js.Array[Double] = js.native
    
    /**
      * Get the line dash offset for the stroke.
      */
    def getLineDashOffset(): js.UndefOr[Double] = js.native
    
    /**
      * Get the line join type for the stroke.
      */
    def getLineJoin(): js.UndefOr[CanvasLineJoin] = js.native
    
    /**
      * Get the miter limit for the stroke.
      */
    def getMiterLimit(): js.UndefOr[Double] = js.native
    
    /**
      * Get the stroke width.
      */
    def getWidth(): js.UndefOr[Double] = js.native
    
    /**
      * Set the color.
      */
    def setColor(color: Color): Unit = js.native
    def setColor(color: ColorLike): Unit = js.native
    
    /**
      * Set the line cap.
      */
    def setLineCap(): Unit = js.native
    def setLineCap(lineCap: CanvasLineCap): Unit = js.native
    
    /**
      * Set the line dash.
      * Please note that Internet Explorer 10 and lower do not support the
      * setLineDash method on the CanvasRenderingContext2D and therefore this
      * property will have no visual effect in these browsers.
      */
    def setLineDash(lineDash: js.Array[Double]): Unit = js.native
    
    /**
      * Set the line dash offset.
      */
    def setLineDashOffset(): Unit = js.native
    def setLineDashOffset(lineDashOffset: Double): Unit = js.native
    
    /**
      * Set the line join.
      */
    def setLineJoin(): Unit = js.native
    def setLineJoin(lineJoin: CanvasLineJoin): Unit = js.native
    
    /**
      * Set the miter limit.
      */
    def setMiterLimit(): Unit = js.native
    def setMiterLimit(miterLimit: Double): Unit = js.native
    
    /**
      * Set the width.
      */
    def setWidth(): Unit = js.native
    def setWidth(width: Double): Unit = js.native
  }
}
