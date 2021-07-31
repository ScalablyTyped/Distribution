package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.openfinStrings.`top-left`
    - typings.openfin.openfinStrings.`top-right`
    - typings.openfin.openfinStrings.`bottom-left`
    - typings.openfin.openfinStrings.`bottom-right`
  */
  trait AnchorType extends StObject
  object AnchorType {
    
    @scala.inline
    def `bottom-left`: typings.openfin.openfinStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.openfin.openfinStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.openfin.openfinStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.openfin.openfinStrings.`bottom-right`]
    
    @scala.inline
    def `top-left`: typings.openfin.openfinStrings.`top-left` = "top-left".asInstanceOf[typings.openfin.openfinStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.openfin.openfinStrings.`top-right` = "top-right".asInstanceOf[typings.openfin.openfinStrings.`top-right`]
  }
  
  trait Bounds extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var left: Double
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: Double
    
    var width: Double
  }
  object Bounds {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextMenuSettings extends StObject {
    
    var devtools: js.UndefOr[Boolean] = js.undefined
    
    var enable: Boolean
    
    var reload: js.UndefOr[Boolean] = js.undefined
  }
  object ContextMenuSettings {
    
    @scala.inline
    def apply(enable: Boolean): ContextMenuSettings = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit class ContextMenuSettingsMutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    }
  }
  
  trait Hotkey extends StObject {
    
    var keys: String
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
  }
  object Hotkey {
    
    @scala.inline
    def apply(keys: String): Hotkey = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hotkey]
    }
    
    @scala.inline
    implicit class HotkeyMutableBuilder[Self <: Hotkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    }
  }
  
  trait Opacity
    extends StObject
       with TransitionBase {
    
    var opacity: Double
  }
  object Opacity {
    
    @scala.inline
    def apply(duration: Double, opacity: Double): Opacity = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opacity]
    }
    
    @scala.inline
    implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position
    extends StObject
       with TransitionBase {
    
    var left: Double
    
    var top: Double
  }
  object Position {
    
    @scala.inline
    def apply(duration: Double, left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGB extends StObject {
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object RGB {
    
    @scala.inline
    def apply(blue: Double, green: Double, red: Double): RGB = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortcutOverride
    extends StObject
       with Hotkey {
    
    var command: String
  }
  object ShortcutOverride {
    
    @scala.inline
    def apply(command: String, keys: String): ShortcutOverride = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutOverride]
    }
    
    @scala.inline
    implicit class ShortcutOverrideMutableBuilder[Self <: ShortcutOverride] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size
    extends StObject
       with TransitionBase {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    @scala.inline
    def apply(duration: Double, height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transition extends StObject {
    
    var opacity: js.UndefOr[Opacity] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object Transition {
    
    @scala.inline
    def apply(): Transition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transition]
    }
    
    @scala.inline
    implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpacity(value: Opacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TransitionBase extends StObject {
    
    var duration: Double
    
    var relative: js.UndefOr[Boolean] = js.undefined
  }
  object TransitionBase {
    
    @scala.inline
    def apply(duration: Double): TransitionBase = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionBase]
    }
    
    @scala.inline
    implicit class TransitionBaseMutableBuilder[Self <: TransitionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  trait TransitionOptions extends StObject {
    
    var interrupt: Boolean
    
    var tween: js.UndefOr[String] = js.undefined
  }
  object TransitionOptions {
    
    @scala.inline
    def apply(interrupt: Boolean): TransitionOptions = {
      val __obj = js.Dynamic.literal(interrupt = interrupt.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionOptions]
    }
    
    @scala.inline
    implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterrupt(value: Boolean): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTween(value: String): Self = StObject.set(x, "tween", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTweenUndefined: Self = StObject.set(x, "tween", js.undefined)
    }
  }
  
  /* Inlined std.Pick<openfin.openfin/_v2/shapes/shapes.Bounds, std.Exclude<keyof openfin.openfin/_v2/shapes/shapes.Bounds, 'right' | 'bottom'>> */
  trait ViewBounds extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object ViewBounds {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): ViewBounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewBounds]
    }
    
    @scala.inline
    implicit class ViewBoundsMutableBuilder[Self <: ViewBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
