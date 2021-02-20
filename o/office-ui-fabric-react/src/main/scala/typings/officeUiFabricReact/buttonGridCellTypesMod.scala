package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGridCellTypesMod {
  
  @js.native
  trait IButtonGridCellProps[T] extends StObject {
    
    /**
      * Optional, the CSS class used for when the cell is disabled
      */
    var cellDisabledStyle: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Optional, the CSS class used for when the cell is selected
      */
    var cellIsSelectedStyle: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Optional, className(s) to apply
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional, if the this option should be diabled
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
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
      ] = js.native
    
    /**
      * Arbitrary unique string associated with this option
      */
    var id: String = js.native
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * The option that will be made available to the user
      */
    var item: T = js.native
    
    /**
      * The label for this item.
      * Visible text if this item is a header,
      * tooltip if is this item is normal
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * The on click handler
      */
    var onClick: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
    
    /**
      * Optional, the onFocus handler
      */
    var onFocus: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
    
    /**
      * Optional, the onHover handler
      */
    var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], Unit]] = js.native
    
    /**
      * Optional, onkeydown handler
      */
    var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], Unit]] = js.native
    
    /**
      * Optional, mouseEnter handler.
      * @returns true if the event should be processed, false otherwise
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.native
    
    /**
      * Optional, mouseLeave handler
      */
    var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.native
    
    /**
      * Optional, mouseMove handler
      * @returns true if the event should be processed, false otherwise
      */
    var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.native
    
    /**
      * The render callback to handle rendering the item
      */
    def onRenderItem(item: T): Element = js.native
    
    /**
      * Optional, onWheel handler
      */
    var onWheel: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.native
    
    /**
      * The accessible role for this option
      */
    var role: js.UndefOr[String] = js.native
    
    /**
      * Optional, if the cell is currently selected
      */
    var selected: js.UndefOr[Boolean] = js.native
  }
  object IButtonGridCellProps {
    
    @scala.inline
    def apply[T](id: String, item: T, onRenderItem: T => Element): IButtonGridCellProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction1(onRenderItem))
      __obj.asInstanceOf[IButtonGridCellProps[T]]
    }
    
    @scala.inline
    implicit class IButtonGridCellPropsMutableBuilder[Self <: IButtonGridCellProps[_], T] (val x: Self with IButtonGridCellProps[T]) extends AnyVal {
      
      @scala.inline
      def setCellDisabledStyle(value: js.Array[String]): Self = StObject.set(x, "cellDisabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellDisabledStyleUndefined: Self = StObject.set(x, "cellDisabledStyle", js.undefined)
      
      @scala.inline
      def setCellDisabledStyleVarargs(value: String*): Self = StObject.set(x, "cellDisabledStyle", js.Array(value :_*))
      
      @scala.inline
      def setCellIsSelectedStyle(value: js.Array[String]): Self = StObject.set(x, "cellIsSelectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIsSelectedStyleUndefined: Self = StObject.set(x, "cellIsSelectedStyle", js.undefined)
      
      @scala.inline
      def setCellIsSelectedStyleVarargs(value: String*): Self = StObject.set(x, "cellIsSelectedStyle", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGetClassNames(
        value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean]) => IButtonClassNames
      ): Self = StObject.set(x, "getClassNames", js.Any.fromFunction9(value))
      
      @scala.inline
      def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* item */ T => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* item */ T => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHover(value: /* item */ js.UndefOr[T] => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* ev */ KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnRenderItem(value: T => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheel(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  type IGridCellProps[T] = IButtonGridCellProps[T]
}
