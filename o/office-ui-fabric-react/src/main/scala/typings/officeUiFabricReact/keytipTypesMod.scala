package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipTypesMod {
  
  @js.native
  trait IKeytipProps extends StObject {
    
    /**
      * ICalloutProps to pass to the callout element
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.native
    
    /**
      * Content to put inside the keytip
      */
    var content: String = js.native
    
    /**
      * T/F if the corresponding control for this keytip is disabled
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on
      * keytip activation). Common cases are a Pivot or Modal.
      */
    var hasDynamicChildren: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not this keytip belongs to a component that has a menu
      * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
      */
    var hasMenu: js.UndefOr[Boolean] = js.native
    
    /**
      * Array of KeySequences which is the full key sequence to trigger this keytip
      * Should not include initial 'start' key sequence
      */
    var keySequences: js.Array[String] = js.native
    
    /**
      * Offset x and y for the keytip, added from the top-left corner
      * By default the keytip will be anchored to the bottom-center of the element
      */
    var offset: js.UndefOr[Point] = js.native
    
    /**
      * Function to call when this keytip is activated.
      * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
      * 'target' is the DOM element marked with 'data-ktp-target'.
      */
    var onExecute: js.UndefOr[
        js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
      ] = js.native
    
    /**
      * Function to call when the keytip is the currentKeytip and a return sequence is pressed.
      * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
      * 'target' is the DOM element marked with 'data-ktp-target'.
      */
    var onReturn: js.UndefOr[
        js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
      ] = js.native
    
    /**
      * Full KeySequence of the overflow set button, will be set automatically if this keytip is inside an overflow
      */
    var overflowSetSequence: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Optional styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.native
    
    /**
      * Theme for the component
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * T/F if the keytip is visible
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object IKeytipProps {
    
    @scala.inline
    def apply(content: String, keySequences: js.Array[String]): IKeytipProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipProps]
    }
    
    @scala.inline
    implicit class IKeytipPropsMutableBuilder[Self <: IKeytipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHasDynamicChildren(value: Boolean): Self = StObject.set(x, "hasDynamicChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDynamicChildrenUndefined: Self = StObject.set(x, "hasDynamicChildren", js.undefined)
      
      @scala.inline
      def setHasMenu(value: Boolean): Self = StObject.set(x, "hasMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMenuUndefined: Self = StObject.set(x, "hasMenu", js.undefined)
      
      @scala.inline
      def setKeySequences(value: js.Array[String]): Self = StObject.set(x, "keySequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySequencesVarargs(value: String*): Self = StObject.set(x, "keySequences", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      @scala.inline
      def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = StObject.set(x, "onReturn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReturnUndefined: Self = StObject.set(x, "onReturn", js.undefined)
      
      @scala.inline
      def setOverflowSetSequence(value: js.Array[String]): Self = StObject.set(x, "overflowSetSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowSetSequenceUndefined: Self = StObject.set(x, "overflowSetSequence", js.undefined)
      
      @scala.inline
      def setOverflowSetSequenceVarargs(value: String*): Self = StObject.set(x, "overflowSetSequence", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait IKeytipStyleProps extends StObject {
    
    /**
      * Whether the keytip is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The theme for the keytip.
      */
    var theme: ITheme = js.native
    
    /**
      * T/F if the keytip is visible
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object IKeytipStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IKeytipStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipStyleProps]
    }
    
    @scala.inline
    implicit class IKeytipStylePropsMutableBuilder[Self <: IKeytipStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait IKeytipStyles extends StObject {
    
    /**
      * Style for the div container surrounding the keytip content.
      */
    var container: IStyle = js.native
    
    /**
      * Style for the keytip content element.
      */
    var root: IStyle = js.native
  }
  object IKeytipStyles {
    
    @scala.inline
    def apply(): IKeytipStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeytipStyles]
    }
    
    @scala.inline
    implicit class IKeytipStylesMutableBuilder[Self <: IKeytipStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
