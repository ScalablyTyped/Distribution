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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipTypesMod {
  
  trait IKeytipProps extends StObject {
    
    /**
      * ICalloutProps to pass to the callout element
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
    
    /**
      * Content to put inside the keytip
      */
    var content: String
    
    /**
      * T/F if the corresponding control for this keytip is disabled
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on
      * keytip activation). Common cases are a Pivot or Modal.
      */
    var hasDynamicChildren: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not this keytip belongs to a component that has a menu
      * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
      */
    var hasMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of KeySequences which is the full key sequence to trigger this keytip
      * Should not include initial 'start' key sequence
      */
    var keySequences: js.Array[String]
    
    /**
      * Offset x and y for the keytip, added from the top-left corner
      * By default the keytip will be anchored to the bottom-center of the element
      */
    var offset: js.UndefOr[Point] = js.undefined
    
    /**
      * Function to call when this keytip is activated.
      * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
      * 'target' is the DOM element marked with 'data-ktp-target'.
      */
    var onExecute: js.UndefOr[
        js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
      ] = js.undefined
    
    /**
      * Function to call when the keytip is the currentKeytip and a return sequence is pressed.
      * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
      * 'target' is the DOM element marked with 'data-ktp-target'.
      */
    var onReturn: js.UndefOr[
        js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
      ] = js.undefined
    
    /**
      * Full KeySequence of the overflow set button, will be set automatically if this keytip is inside an overflow
      */
    var overflowSetSequence: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.undefined
    
    /**
      * Theme for the component
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * T/F if the keytip is visible
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IKeytipProps {
    
    inline def apply(content: String, keySequences: js.Array[String]): IKeytipProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipProps]
    }
    
    extension [Self <: IKeytipProps](x: Self) {
      
      inline def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasDynamicChildren(value: Boolean): Self = StObject.set(x, "hasDynamicChildren", value.asInstanceOf[js.Any])
      
      inline def setHasDynamicChildrenUndefined: Self = StObject.set(x, "hasDynamicChildren", js.undefined)
      
      inline def setHasMenu(value: Boolean): Self = StObject.set(x, "hasMenu", value.asInstanceOf[js.Any])
      
      inline def setHasMenuUndefined: Self = StObject.set(x, "hasMenu", js.undefined)
      
      inline def setKeySequences(value: js.Array[String]): Self = StObject.set(x, "keySequences", value.asInstanceOf[js.Any])
      
      inline def setKeySequencesVarargs(value: String*): Self = StObject.set(x, "keySequences", js.Array(value :_*))
      
      inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction2(value))
      
      inline def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      inline def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = StObject.set(x, "onReturn", js.Any.fromFunction2(value))
      
      inline def setOnReturnUndefined: Self = StObject.set(x, "onReturn", js.undefined)
      
      inline def setOverflowSetSequence(value: js.Array[String]): Self = StObject.set(x, "overflowSetSequence", value.asInstanceOf[js.Any])
      
      inline def setOverflowSetSequenceUndefined: Self = StObject.set(x, "overflowSetSequence", js.undefined)
      
      inline def setOverflowSetSequenceVarargs(value: String*): Self = StObject.set(x, "overflowSetSequence", js.Array(value :_*))
      
      inline def setStyles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait IKeytipStyleProps extends StObject {
    
    /**
      * Whether the keytip is disabled or not.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The theme for the keytip.
      */
    var theme: ITheme
    
    /**
      * T/F if the keytip is visible
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IKeytipStyleProps {
    
    inline def apply(theme: ITheme): IKeytipStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipStyleProps]
    }
    
    extension [Self <: IKeytipStyleProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait IKeytipStyles extends StObject {
    
    /**
      * Style for the div container surrounding the keytip content.
      */
    var container: IStyle
    
    /**
      * Style for the keytip content element.
      */
    var root: IStyle
  }
  object IKeytipStyles {
    
    inline def apply(): IKeytipStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeytipStyles]
    }
    
    extension [Self <: IKeytipStyles](x: Self) {
      
      inline def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
