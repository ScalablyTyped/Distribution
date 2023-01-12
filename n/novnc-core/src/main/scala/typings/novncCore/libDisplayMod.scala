package typings.novncCore

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayMod {
  
  @JSImport("novnc-core/lib/display", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Display {
    def this(defaults: NvDisplayDefaults) = this()
  }
  
  @js.native
  trait Display extends StObject {
    
    def absX(x: Double): Double = js.native
    
    def absY(y: Double): Double = js.native
    
    def autoscale(containerWidth: Double, containerHeight: Double, downscaleOnly: Boolean): Unit = js.native
    
    def blitImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
    def blitImage(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      arr: js.Array[Double],
      offset: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def blitRgbImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
    def blitRgbImage(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      arr: js.Array[Double],
      offset: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def blitRgbxImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
    def blitRgbxImage(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      arr: js.Array[Double],
      offset: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def changeCursor(
      pixels: js.Array[Double],
      mask: js.Array[Double],
      hotx: Double,
      hoty: Double,
      width: Double,
      height: Double
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    def clippingDisplay(): Boolean = js.native
    
    def copyImage(old_x: Double, old_y: Double, new_x: Double, new_y: Double, width: Double, height: Double): Unit = js.native
    def copyImage(
      old_x: Double,
      old_y: Double,
      new_x: Double,
      new_y: Double,
      width: Double,
      height: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def defaultCursor(): Unit = js.native
    
    def disableLocalCursor(): Unit = js.native
    
    def drawImage(img: HTMLImageElement, x: Double, y: Double): Unit = js.native
    
    def fillRect(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
    def fillRect(x: Double, y: Double, width: Double, height: Double, color: NvColor, from_queue: Boolean): Unit = js.native
    
    def finishTile(): Unit = js.native
    
    def flip(): Unit = js.native
    def flip(from_queue: Boolean): Unit = js.native
    
    def flush(): Unit = js.native
    
    def get_context(): CanvasRenderingContext2D = js.native
    
    def get_cursor_uri(): Any = js.native
    
    def get_height(): Double = js.native
    
    def get_logo(): NvLogo = js.native
    
    def get_onFlush(): js.Function0[Unit] = js.native
    
    def get_prefer_js(): String | Boolean = js.native
    
    def get_render_mode(): String = js.native
    
    def get_scale(): Double = js.native
    
    def get_target(): HTMLCanvasElement = js.native
    
    def get_viewport(): Boolean = js.native
    
    def get_width(): Double = js.native
    
    def imageRect(x: Double, y: Double, mime: String, arr: js.Array[Double]): Unit = js.native
    
    def pending(): Boolean = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def set_cursor_uri(cursorUri: Any): Unit = js.native
    
    def set_logo(logo: NvLogo): Unit = js.native
    
    def set_onFlush(handler: js.Function0[Unit]): Unit = js.native
    
    def set_prefer_js(preferJs: String): Unit = js.native
    
    def set_scale(scale: Double): Unit = js.native
    
    def set_target(target: HTMLCanvasElement): Unit = js.native
    
    def set_viewport(viewport: Boolean): Unit = js.native
    
    def startTile(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
    
    def subTile(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
    
    def viewportChangePos(deltaX: Double, deltaY: Double): Unit = js.native
    
    def viewportChangeSize(): Unit = js.native
    def viewportChangeSize(width: Double): Unit = js.native
    def viewportChangeSize(width: Double, height: Double): Unit = js.native
    def viewportChangeSize(width: Unit, height: Double): Unit = js.native
  }
  
  type NvColor = js.Tuple3[Double, Double, Double]
  
  trait NvDisplayDefaults extends StObject {
    
    var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
    
    var cursor_uri: js.UndefOr[Any] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var logo: js.UndefOr[NvLogo] = js.undefined
    
    var onFlush: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefer_js: js.UndefOr[String] = js.undefined
    
    var render_mode: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var viewport: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object NvDisplayDefaults {
    
    inline def apply(): NvDisplayDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NvDisplayDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NvDisplayDefaults] (val x: Self) extends AnyVal {
      
      inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCursor_uri(value: Any): Self = StObject.set(x, "cursor_uri", value.asInstanceOf[js.Any])
      
      inline def setCursor_uriUndefined: Self = StObject.set(x, "cursor_uri", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLogo(value: NvLogo): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setOnFlush(value: () => Unit): Self = StObject.set(x, "onFlush", js.Any.fromFunction0(value))
      
      inline def setOnFlushUndefined: Self = StObject.set(x, "onFlush", js.undefined)
      
      inline def setPrefer_js(value: String): Self = StObject.set(x, "prefer_js", value.asInstanceOf[js.Any])
      
      inline def setPrefer_jsUndefined: Self = StObject.set(x, "prefer_js", js.undefined)
      
      inline def setRender_mode(value: String): Self = StObject.set(x, "render_mode", value.asInstanceOf[js.Any])
      
      inline def setRender_modeUndefined: Self = StObject.set(x, "render_mode", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setViewport(value: Boolean): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait NvLogo extends StObject {
    
    var data: js.Array[Double]
    
    var height: Double
    
    var `type`: String
    
    var width: Double
  }
  object NvLogo {
    
    inline def apply(data: js.Array[Double], height: Double, `type`: String, width: Double): NvLogo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NvLogo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NvLogo] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
