package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.Width
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupOptionTypesMod {
  
  trait IChoiceGroupOptionProps
    extends StObject
       with IChoiceGroupOption {
    
    /**
      * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IChoiceGroupOption]] = js.undefined
    
    /**
      * Indicates if the ChoiceGroupOption should appear focused, visually
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback for receiving a notification when the choice has lost focus.
      */
    @JSName("onBlur")
    var onBlur_IChoiceGroupOptionProps: js.UndefOr[
        js.Function2[/* ev */ FocusEvent[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption], Unit]
      ] = js.undefined
    
    /**
      * A callback for receiving a notification when the choice has been changed.
      */
    @JSName("onChange")
    var onChange_IChoiceGroupOptionProps: js.UndefOr[
        js.Function2[
          /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
          /* props */ js.UndefOr[IChoiceGroupOption], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A callback for receiving a notification when the choice has received focus.
      */
    @JSName("onFocus")
    var onFocus_IChoiceGroupOptionProps: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[FocusEvent[HTMLElement | HTMLInputElement]], 
          /* props */ js.UndefOr[IChoiceGroupOption], 
          js.UndefOr[Unit]
        ]
      ] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IChoiceGroupOptionProps {
    
    @scala.inline
    def apply(key: String, text: String): IChoiceGroupOptionProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChoiceGroupOptionProps]
    }
    
    @scala.inline
    implicit class IChoiceGroupOptionPropsMutableBuilder[Self <: IChoiceGroupOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[IChoiceGroupOption]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IChoiceGroupOption | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* ev */ FocusEvent[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* props */ js.UndefOr[IChoiceGroupOption]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(
        value: (/* ev */ js.UndefOr[FocusEvent[HTMLElement | HTMLInputElement]], /* props */ js.UndefOr[IChoiceGroupOption]) => js.UndefOr[Unit]
      ): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IChoiceGroupOptionStyleProps extends StObject {
    
    /** Whether the option is checked or not. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option is disabled or not. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option is in focus or not. */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option has an icon. */
    var hasIcon: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option icon is an image. */
    var hasImage: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the image width or height are higher than `71`. */
    var imageIsLarge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Image sizes used when `hasImage` or `hasIcon` style props are enabled.
      * @defaultvalue \{height: 32, width: 32\}
      */
    var imageSize: js.UndefOr[Width] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme
  }
  object IChoiceGroupOptionStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IChoiceGroupOptionStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChoiceGroupOptionStyleProps]
    }
    
    @scala.inline
    implicit class IChoiceGroupOptionStylePropsMutableBuilder[Self <: IChoiceGroupOptionStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHasIcon(value: Boolean): Self = StObject.set(x, "hasIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasIconUndefined: Self = StObject.set(x, "hasIcon", js.undefined)
      
      @scala.inline
      def setHasImage(value: Boolean): Self = StObject.set(x, "hasImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasImageUndefined: Self = StObject.set(x, "hasImage", js.undefined)
      
      @scala.inline
      def setImageIsLarge(value: Boolean): Self = StObject.set(x, "imageIsLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageIsLargeUndefined: Self = StObject.set(x, "imageIsLarge", js.undefined)
      
      @scala.inline
      def setImageSize(value: Width): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IChoiceGroupOptionStyles extends StObject {
    
    var choiceFieldWrapper: js.UndefOr[IStyle] = js.undefined
    
    var field: js.UndefOr[IStyle] = js.undefined
    
    var iconWrapper: js.UndefOr[IStyle] = js.undefined
    
    var imageWrapper: js.UndefOr[IStyle] = js.undefined
    
    var innerField: js.UndefOr[IStyle] = js.undefined
    
    var input: js.UndefOr[IStyle] = js.undefined
    
    var labelWrapper: js.UndefOr[IStyle] = js.undefined
    
    var root: js.UndefOr[IStyle] = js.undefined
    
    var selectedImageWrapper: js.UndefOr[IStyle] = js.undefined
  }
  object IChoiceGroupOptionStyles {
    
    @scala.inline
    def apply(): IChoiceGroupOptionStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChoiceGroupOptionStyles]
    }
    
    @scala.inline
    implicit class IChoiceGroupOptionStylesMutableBuilder[Self <: IChoiceGroupOptionStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoiceFieldWrapper(value: IStyle): Self = StObject.set(x, "choiceFieldWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoiceFieldWrapperNull: Self = StObject.set(x, "choiceFieldWrapper", null)
      
      @scala.inline
      def setChoiceFieldWrapperUndefined: Self = StObject.set(x, "choiceFieldWrapper", js.undefined)
      
      @scala.inline
      def setField(value: IStyle): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNull: Self = StObject.set(x, "field", null)
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setIconWrapper(value: IStyle): Self = StObject.set(x, "iconWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconWrapperNull: Self = StObject.set(x, "iconWrapper", null)
      
      @scala.inline
      def setIconWrapperUndefined: Self = StObject.set(x, "iconWrapper", js.undefined)
      
      @scala.inline
      def setImageWrapper(value: IStyle): Self = StObject.set(x, "imageWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageWrapperNull: Self = StObject.set(x, "imageWrapper", null)
      
      @scala.inline
      def setImageWrapperUndefined: Self = StObject.set(x, "imageWrapper", js.undefined)
      
      @scala.inline
      def setInnerField(value: IStyle): Self = StObject.set(x, "innerField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerFieldNull: Self = StObject.set(x, "innerField", null)
      
      @scala.inline
      def setInnerFieldUndefined: Self = StObject.set(x, "innerField", js.undefined)
      
      @scala.inline
      def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNull: Self = StObject.set(x, "input", null)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLabelWrapper(value: IStyle): Self = StObject.set(x, "labelWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapperNull: Self = StObject.set(x, "labelWrapper", null)
      
      @scala.inline
      def setLabelWrapperUndefined: Self = StObject.set(x, "labelWrapper", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSelectedImageWrapper(value: IStyle): Self = StObject.set(x, "selectedImageWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedImageWrapperNull: Self = StObject.set(x, "selectedImageWrapper", null)
      
      @scala.inline
      def setSelectedImageWrapperUndefined: Self = StObject.set(x, "selectedImageWrapper", js.undefined)
    }
  }
  
  type OnChangeCallback = js.UndefOr[
    js.Function2[
      /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ]
  
  type OnFocusCallback = js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[FocusEvent[HTMLElement | HTMLInputElement]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      js.UndefOr[Unit]
    ]
  ]
}
