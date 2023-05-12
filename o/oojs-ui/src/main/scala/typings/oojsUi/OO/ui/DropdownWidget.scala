package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.DropdownWidget.Props
import typings.oojsUi.OO.ui.DropdownWidget.Prototype
import typings.oojsUi.oojsUiStrings.labelChange
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DropdownWidgets are not menus themselves, rather they contain a menu of options created with
  * OO.ui.MenuOptionWidget. The DropdownWidget takes care of opening and displaying the menu so that
  * users can interact with it.
  *
  * If you want to use this within an HTML form, such as a OO.ui.FormLayout, use
  * OO.ui.DropdownInputWidget instead.
  *
  *     // A DropdownWidget with a menu that contains three options.
  *     var dropDown = new OO.ui.DropdownWidget( {
  *         label: 'Dropdown menu: Select a menu option',
  *         menu: {
  *             items: [
  *                 new OO.ui.MenuOptionWidget( {
  *                     data: 'a',
  *                     label: 'First'
  *                 } ),
  *                 new OO.ui.MenuOptionWidget( {
  *                     data: 'b',
  *                     label: 'Second'
  *                 } ),
  *                 new OO.ui.MenuOptionWidget( {
  *                     data: 'c',
  *                     label: 'Third'
  *                 } )
  *             ]
  *         }
  *     } );
  *
  *     $( document.body ).append( dropDown.$element );
  *
  *     dropDown.getMenu().selectItemByData( 'b' );
  *
  *     dropDown.getMenu().findSelectedItem().getData(); // Returns 'b'.
  *
  * For more information, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options#Menu_selects_and_options).
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.DropdownWidget
  */
@js.native
trait DropdownWidget
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object DropdownWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions {
    
    /**
      * Render the menu into a separate layer. This configuration is
      * useful in cases where the expanded menu is larger than its containing `<div>`.
      * The specified overlay layer is usually on top of the containing `<div>` and has a
      * larger area. By default, the menu uses relative positioning. Pass 'true' to use the
      * default overlay. See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement] | Boolean] = js.undefined
    
    /** Configuration options to pass to {@link OO.ui.MenuSelectWidget menu select widget}. */
    var menu: js.UndefOr[typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$overlay(value: JQuery[HTMLElement] | Boolean): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
      
      inline def set$overlayUndefined: Self = StObject.set(x, "$overlay", js.undefined)
      
      inline def setMenu(value: typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[DropdownWidget]
       with Instantiable1[/* config */ ConfigOptions, DropdownWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
  object EventMap {
    
    inline def apply(
      disable: js.Array[/* disabled */ Boolean],
      labelChange: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props {
    
    @JSName("$handle")
    var $handle: JQuery[HTMLElement]
    
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $element: JQuery[HTMLElement],
      $handle: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $handle = $handle.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$handle(value: JQuery[HTMLElement]): Self = StObject.set(x, "$handle", value.asInstanceOf[js.Any])
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Get the menu.
      *
      * @return Menu of widget
      */
    def getMenu(): MenuSelectWidget = js.native
    
    @JSName("off")
    def off_labelChange[C](event: labelChange): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
}
