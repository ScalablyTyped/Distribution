package typings.muiImage

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Height
import typings.csstype.mod.Property.ObjectFit
import typings.csstype.mod.Property.Position
import typings.csstype.mod.Property.TransitionTimingFunction
import typings.csstype.mod.Property.Width
import typings.muiImage.muiImageBooleans.`false`
import typings.muiImage.muiImageStrings.bottom
import typings.muiImage.muiImageStrings.left
import typings.muiImage.muiImageStrings.right
import typings.muiImage.muiImageStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mui-image", JSImport.Default)
  @js.native
  val default: FC[MuiImageProps] = js.native
  
  @JSImport("mui-image", "Image")
  @js.native
  val Image: FC[MuiImageProps] = js.native
  
  trait MuiImageProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var bgColor: js.UndefOr[BackgroundColor] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var distance: js.UndefOr[String | Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[TransitionTimingFunction] = js.undefined
    
    var errorIcon: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var fit: js.UndefOr[ObjectFit] = js.undefined
    
    var height: js.UndefOr[(Height[String | Double]) | Double] = js.undefined
    
    var iconWrapperClassName: js.UndefOr[String] = js.undefined
    
    var iconWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* repeated */ Any, js.UndefOr[Unit]]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* repeated */ Any, js.UndefOr[Unit]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var shift: js.UndefOr[left | right | top | bottom | `false` | Null] = js.undefined
    
    var shiftDuration: js.UndefOr[Double] = js.undefined
    
    var showLoading: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var src: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[(Width[String | Double]) | Double] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object MuiImageProps {
    
    inline def apply(src: String): MuiImageProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuiImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MuiImageProps] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setBgColor(value: BackgroundColor): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDistance(value: String | Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: TransitionTimingFunction): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setErrorIcon(value: Boolean | ReactNode): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      inline def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
      
      inline def setFit(value: ObjectFit): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setHeight(value: (Height[String | Double]) | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIconWrapperClassName(value: String): Self = StObject.set(x, "iconWrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setIconWrapperClassNameUndefined: Self = StObject.set(x, "iconWrapperClassName", js.undefined)
      
      inline def setIconWrapperStyle(value: CSSProperties): Self = StObject.set(x, "iconWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setIconWrapperStyleUndefined: Self = StObject.set(x, "iconWrapperStyle", js.undefined)
      
      inline def setOnError(value: /* repeated */ Any => js.UndefOr[Unit]): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* repeated */ Any => js.UndefOr[Unit]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShift(value: left | right | top | bottom | `false`): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftDuration(value: Double): Self = StObject.set(x, "shiftDuration", value.asInstanceOf[js.Any])
      
      inline def setShiftDurationUndefined: Self = StObject.set(x, "shiftDuration", js.undefined)
      
      inline def setShiftNull: Self = StObject.set(x, "shift", null)
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setShowLoading(value: Boolean | ReactNode): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
      
      inline def setShowLoadingUndefined: Self = StObject.set(x, "showLoading", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: (Width[String | Double]) | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      inline def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FC[MuiImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[MuiImageProps] = default
}
