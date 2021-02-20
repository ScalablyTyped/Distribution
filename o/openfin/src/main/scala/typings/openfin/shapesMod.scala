package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Bounds extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
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
  
  @js.native
  trait ContextMenuSettings extends StObject {
    
    var devtools: js.UndefOr[Boolean] = js.native
    
    var enable: Boolean = js.native
    
    var reload: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait Hotkey extends StObject {
    
    var keys: String = js.native
    
    var preventDefault: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait Opacity extends TransitionBase {
    
    var opacity: Double = js.native
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
  
  @js.native
  trait Position extends TransitionBase {
    
    var left: Double = js.native
    
    var top: Double = js.native
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
  
  @js.native
  trait RGB extends StObject {
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
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
  
  @js.native
  trait ShortcutOverride extends Hotkey {
    
    var command: String = js.native
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
  
  @js.native
  trait Size extends TransitionBase {
    
    var height: Double = js.native
    
    var width: Double = js.native
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
  
  @js.native
  trait Transition extends StObject {
    
    var opacity: js.UndefOr[Opacity] = js.native
    
    var position: js.UndefOr[Position] = js.native
    
    var size: js.UndefOr[Size] = js.native
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
  
  @js.native
  trait TransitionBase extends StObject {
    
    var duration: Double = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait TransitionOptions extends StObject {
    
    var interrupt: Boolean = js.native
    
    var tween: js.UndefOr[String] = js.native
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
  @js.native
  trait ViewBounds extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
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
