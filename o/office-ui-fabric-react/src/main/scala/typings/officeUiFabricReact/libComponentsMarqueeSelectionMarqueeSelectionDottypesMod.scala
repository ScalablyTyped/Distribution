package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunction
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMarqueeSelectionMarqueeSelectionDottypesMod {
  
  trait IMarqueeSelection extends StObject
  
  trait IMarqueeSelectionProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Optional callback to access the IMarqueeSelection interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IMarqueeSelection]] = js.undefined
    
    /**
      * Optional flag to restrict the drag rect to the root element, instead of allowing the drag
      * rect to start outside of the root element boundaries.
      * @defaultvalue false
      */
    var isDraggingConstrainedToRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional flag to control the enabled state of marquee selection. This allows you to render
      * it and have events all ready to go, but conditionally disable it. That way transitioning
      * between enabled/disabled generate no difference in the DOM.
      * @defaultvalue true
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional callback that is called, when the mouse down event occurs, in order to determine
      * if we should start a marquee selection. If true is returned, we will cancel the mousedown
      * event to prevent upstream mousedown handlers from executing.
      */
    var onShouldStartSelection: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean]] = js.undefined
    
    /**
      * Optional props to mix into the root DIV element.
      */
    var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * The selection object to interact with when updating selection changes.
      */
    var selection: ISelection[IObjectWithKey]
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunction[IMarqueeSelectionStyleProps, IMarqueeSelectionStyles]] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IMarqueeSelectionProps {
    
    inline def apply(selection: ISelection[IObjectWithKey]): IMarqueeSelectionProps = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarqueeSelectionProps]
    }
    
    extension [Self <: IMarqueeSelectionProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[IMarqueeSelection]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IMarqueeSelection | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setIsDraggingConstrainedToRoot(value: Boolean): Self = StObject.set(x, "isDraggingConstrainedToRoot", value.asInstanceOf[js.Any])
      
      inline def setIsDraggingConstrainedToRootUndefined: Self = StObject.set(x, "isDraggingConstrainedToRoot", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setOnShouldStartSelection(value: /* ev */ MouseEvent => Boolean): Self = StObject.set(x, "onShouldStartSelection", js.Any.fromFunction1(value))
      
      inline def setOnShouldStartSelectionUndefined: Self = StObject.set(x, "onShouldStartSelection", js.undefined)
      
      inline def setRootProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
      
      inline def setRootPropsUndefined: Self = StObject.set(x, "rootProps", js.undefined)
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: IMarqueeSelectionStyleProps => DeepPartial[IMarqueeSelectionStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IMarqueeSelectionStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object IMarqueeSelectionStyleProps {
    
    inline def apply(theme: ITheme): IMarqueeSelectionStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarqueeSelectionStyleProps]
    }
    
    extension [Self <: IMarqueeSelectionStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMarqueeSelectionStyles extends StObject {
    
    var box: js.UndefOr[IStyle] = js.undefined
    
    var boxFill: js.UndefOr[IStyle] = js.undefined
    
    var dragMask: js.UndefOr[IStyle] = js.undefined
    
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IMarqueeSelectionStyles {
    
    inline def apply(): IMarqueeSelectionStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarqueeSelectionStyles]
    }
    
    extension [Self <: IMarqueeSelectionStyles](x: Self) {
      
      inline def setBox(value: IStyle): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxFill(value: IStyle): Self = StObject.set(x, "boxFill", value.asInstanceOf[js.Any])
      
      inline def setBoxFillNull: Self = StObject.set(x, "boxFill", null)
      
      inline def setBoxFillUndefined: Self = StObject.set(x, "boxFill", js.undefined)
      
      inline def setBoxNull: Self = StObject.set(x, "box", null)
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setDragMask(value: IStyle): Self = StObject.set(x, "dragMask", value.asInstanceOf[js.Any])
      
      inline def setDragMaskNull: Self = StObject.set(x, "dragMask", null)
      
      inline def setDragMaskUndefined: Self = StObject.set(x, "dragMask", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
