package typings.muibox

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("muibox", "DialogProvider")
  @js.native
  def DialogProvider(_underscore: js.Any): js.Any = js.native
  
  @JSImport("muibox", "useDialog")
  @js.native
  def useDialog(): Dialog = js.native
  
  @JSImport("muibox", "withDialog")
  @js.native
  def withDialog(): js.Function1[/* WrappedComponent */ js.Any, js.Function1[/* props */ _, _]] = js.native
  
  @js.native
  trait AlertOptions extends StObject {
    
    var message: js.UndefOr[String | ReactNode] = js.native
    
    var ok: js.UndefOr[DialogButtonOptions] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object AlertOptions {
    
    @scala.inline
    def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    @scala.inline
    implicit class AlertOptionsMutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String | ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOk(value: DialogButtonOptions): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ConfirmOptions extends AlertOptions {
    
    var cancel: js.UndefOr[DialogButtonOptions] = js.native
  }
  object ConfirmOptions {
    
    @scala.inline
    def apply(): ConfirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmOptions]
    }
    
    @scala.inline
    implicit class ConfirmOptionsMutableBuilder[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: DialogButtonOptions): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  @js.native
  trait Dialog extends StObject {
    
    def alert(options: String): js.Promise[Unit] = js.native
    def alert(options: AlertOptions): js.Promise[Unit] = js.native
    
    def confirm(options: String): js.Promise[Unit] = js.native
    def confirm(options: ConfirmOptions): js.Promise[Unit] = js.native
    
    def prompt(options: String): js.Promise[String] = js.native
    def prompt(options: PromptOptions): js.Promise[String] = js.native
  }
  
  @js.native
  trait DialogButtonOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var endIcon: js.UndefOr[ReactNode] = js.native
    
    var startIcon: js.UndefOr[ReactNode] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
  }
  object DialogButtonOptions {
    
    @scala.inline
    def apply(): DialogButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogButtonOptions]
    }
    
    @scala.inline
    implicit class DialogButtonOptionsMutableBuilder[Self <: DialogButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEndIcon(value: ReactNode): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
      
      @scala.inline
      def setStartIcon(value: ReactNode): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  @js.native
  trait PromptOptions extends ConfirmOptions {
    
    var defaultValue: js.UndefOr[String | Double] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object PromptOptions {
    
    @scala.inline
    def apply(): PromptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptOptions]
    }
    
    @scala.inline
    implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
}
