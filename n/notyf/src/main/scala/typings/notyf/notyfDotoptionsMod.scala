package typings.notyf

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.notyfBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notyfDotoptionsMod {
  
  @JSImport("notyf/notyf.options", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  
  @js.native
  sealed trait NotyfEvent extends StObject
  @JSImport("notyf/notyf.options", "NotyfEvent")
  @js.native
  object NotyfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotyfEvent & String] = js.native
    
    @js.native
    sealed trait Click
      extends StObject
         with NotyfEvent
    /* "click" */ val Click: typings.notyf.notyfDotoptionsMod.NotyfEvent.Click & String = js.native
    
    @js.native
    sealed trait Dismiss
      extends StObject
         with NotyfEvent
    /* "dismiss" */ val Dismiss: typings.notyf.notyfDotoptionsMod.NotyfEvent.Dismiss & String = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? notyf.notyf/notyf.options.DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  trait INotyfIcon extends StObject {
    
    var className: String
    
    var color: String
    
    var tagName: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 170, starting with typings.notyf.notyfStrings.a, typings.notyf.notyfStrings.abbr, typings.notyf.notyfStrings.address */ Any
    
    var text: String
  }
  object INotyfIcon {
    
    inline def apply(
      className: String,
      color: String,
      tagName: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 170, starting with typings.notyf.notyfStrings.a, typings.notyf.notyfStrings.abbr, typings.notyf.notyfStrings.address */ Any,
      text: String
    ): INotyfIcon = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfIcon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INotyfIcon] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setTagName(
        value: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 170, starting with typings.notyf.notyfStrings.a, typings.notyf.notyfStrings.abbr, typings.notyf.notyfStrings.address */ Any
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait INotyfNotificationOptions extends StObject {
    
    var background: String
    
    /**
      * @deprecated Use `background` instead. Removal target: v4.0.0.
      */
    var backgroundColor: String
    
    var className: String
    
    var dismissible: Boolean
    
    var duration: Double
    
    var icon: String | INotyfIcon | `false`
    
    var message: String
    
    var position: INotyfPosition
    
    var ripple: Boolean
    
    var `type`: String
  }
  object INotyfNotificationOptions {
    
    inline def apply(
      background: String,
      backgroundColor: String,
      className: String,
      dismissible: Boolean,
      duration: Double,
      icon: String | INotyfIcon | `false`,
      message: String,
      position: INotyfPosition,
      ripple: Boolean,
      `type`: String
    ): INotyfNotificationOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfNotificationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INotyfNotificationOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String | INotyfIcon | `false`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: INotyfPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait INotyfOptions extends StObject {
    
    var dismissible: Boolean
    
    var duration: Double
    
    var position: INotyfPosition
    
    var ripple: Boolean
    
    var types: js.Array[DeepPartialINotyfNotifica]
  }
  object INotyfOptions {
    
    inline def apply(
      dismissible: Boolean,
      duration: Double,
      position: INotyfPosition,
      ripple: Boolean,
      types: js.Array[DeepPartialINotyfNotifica]
    ): INotyfOptions = {
      val __obj = js.Dynamic.literal(dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INotyfOptions] (val x: Self) extends AnyVal {
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: INotyfPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[DeepPartialINotyfNotifica]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: DeepPartialINotyfNotifica*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait INotyfPosition extends StObject {
    
    var x: NotyfHorizontalPosition
    
    var y: NotyfVerticalPosition
  }
  object INotyfPosition {
    
    inline def apply(x: NotyfHorizontalPosition, y: NotyfVerticalPosition): INotyfPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INotyfPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: NotyfHorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: NotyfVerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.notyf.notyfStrings.left
    - typings.notyf.notyfStrings.center
    - typings.notyf.notyfStrings.right
  */
  trait NotyfHorizontalPosition extends StObject
  object NotyfHorizontalPosition {
    
    inline def center: typings.notyf.notyfStrings.center = "center".asInstanceOf[typings.notyf.notyfStrings.center]
    
    inline def left: typings.notyf.notyfStrings.left = "left".asInstanceOf[typings.notyf.notyfStrings.left]
    
    inline def right: typings.notyf.notyfStrings.right = "right".asInstanceOf[typings.notyf.notyfStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.notyf.notyfStrings.top
    - typings.notyf.notyfStrings.center
    - typings.notyf.notyfStrings.bottom
  */
  trait NotyfVerticalPosition extends StObject
  object NotyfVerticalPosition {
    
    inline def bottom: typings.notyf.notyfStrings.bottom = "bottom".asInstanceOf[typings.notyf.notyfStrings.bottom]
    
    inline def center: typings.notyf.notyfStrings.center = "center".asInstanceOf[typings.notyf.notyfStrings.center]
    
    inline def top: typings.notyf.notyfStrings.top = "top".asInstanceOf[typings.notyf.notyfStrings.top]
  }
}
