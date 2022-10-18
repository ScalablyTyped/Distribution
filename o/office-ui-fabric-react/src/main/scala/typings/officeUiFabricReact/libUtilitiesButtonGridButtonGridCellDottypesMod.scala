package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsButtonBaseButtonDotclassNamesMod.IButtonClassNames
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesButtonGridButtonGridCellDottypesMod {
  
  trait IButtonGridCellProps[T] extends StObject {
    
    /**
      * Optional, the CSS class used for when the cell is disabled
      */
    var cellDisabledStyle: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional, the CSS class used for when the cell is selected
      */
    var cellIsSelectedStyle: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional, className(s) to apply
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional, if the this option should be diabled
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Method to provide the classnames to style a button.
      * The default value for this prop is the getClassnames func
      * defined in BaseButton.classnames.
      */
    var getClassNames: js.UndefOr[
        js.Function9[
          /* theme */ ITheme, 
          /* className */ String, 
          /* variantClassName */ String, 
          /* iconClassName */ js.UndefOr[String], 
          /* menuIconClassName */ js.UndefOr[String], 
          /* disabled */ Boolean, 
          /* checked */ Boolean, 
          /* expanded */ Boolean, 
          /* isSplit */ js.UndefOr[Boolean], 
          IButtonClassNames
        ]
      ] = js.undefined
    
    /**
      * Arbitrary unique string associated with this option
      */
    var id: String
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * The option that will be made available to the user
      */
    var item: T
    
    /**
      * The label for this item.
      * Visible text if this item is a header,
      * tooltip if is this item is normal
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * The on click handler
      */
    var onClick: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
    
    /**
      * Optional, the onFocus handler
      */
    var onFocus: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
    
    /**
      * Optional, the onHover handler
      */
    var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], Unit]] = js.undefined
    
    /**
      * Optional, onkeydown handler
      */
    var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], Unit]] = js.undefined
    
    /**
      * Optional, mouseEnter handler.
      * @returns true if the event should be processed, false otherwise
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
    
    /**
      * Optional, mouseLeave handler
      */
    var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Optional, mouseMove handler
      * @returns true if the event should be processed, false otherwise
      */
    var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
    
    /**
      * The render callback to handle rendering the item
      */
    def onRenderItem(item: T): Element
    
    /**
      * Optional, onWheel handler
      */
    var onWheel: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * The accessible role for this option
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Optional, if the cell is currently selected
      */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object IButtonGridCellProps {
    
    inline def apply[T](id: String, item: T, onRenderItem: T => Element): IButtonGridCellProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction1(onRenderItem))
      __obj.asInstanceOf[IButtonGridCellProps[T]]
    }
    
    extension [Self <: IButtonGridCellProps[?], T](x: Self & IButtonGridCellProps[T]) {
      
      inline def setCellDisabledStyle(value: js.Array[String]): Self = StObject.set(x, "cellDisabledStyle", value.asInstanceOf[js.Any])
      
      inline def setCellDisabledStyleUndefined: Self = StObject.set(x, "cellDisabledStyle", js.undefined)
      
      inline def setCellDisabledStyleVarargs(value: String*): Self = StObject.set(x, "cellDisabledStyle", js.Array(value*))
      
      inline def setCellIsSelectedStyle(value: js.Array[String]): Self = StObject.set(x, "cellIsSelectedStyle", value.asInstanceOf[js.Any])
      
      inline def setCellIsSelectedStyleUndefined: Self = StObject.set(x, "cellIsSelectedStyle", js.undefined)
      
      inline def setCellIsSelectedStyleVarargs(value: String*): Self = StObject.set(x, "cellIsSelectedStyle", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGetClassNames(
        value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean]) => IButtonClassNames
      ): Self = StObject.set(x, "getClassNames", js.Any.fromFunction9(value))
      
      inline def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: /* item */ T => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* item */ T => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHover(value: /* item */ js.UndefOr[T] => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnKeyDown(value: /* ev */ KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnRenderItem(value: T => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
      
      inline def setOnWheel(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  type IGridCellProps[T] = IButtonGridCellProps[T]
}
