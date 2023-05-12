package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ButtonMenuSelectWidget.Props
import typings.oojsUi.OO.ui.ButtonMenuSelectWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ButtonMenuSelectWidgets launch a menu of options created with OO.ui.MenuOptionWidget.
  * The ButtonMenuSelectWidget takes care of opening and displaying the menu so that
  * users can interact with it.
  *
  *     // A ButtonMenuSelectWidget with a menu that contains three options.
  *     var buttonMenu = new OO.ui.ButtonMenuSelectWidget( {
  *         icon: 'menu',
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
  *     $( document.body ).append( buttonMenu.$element );
  *
  *     // When using the `clearOnSelect` option, listen to the `choose` event
  *     // to avoid getting the null select event.
  *     buttonMenu.getMenu().on( 'choose', function ( menuOption ) {
  *         console.log( menuOption.getData() );
  *     } );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ButtonMenuSelectWidget
  */
@js.native
trait ButtonMenuSelectWidget
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
object ButtonMenuSelectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions {
    
    /**
      * Render the menu into a separate layer. This configuration is
      * useful in cases where the expanded menu is larger than its containing `<div>`. The
      * specified overlay layer is usually on top of the containing `<div>` and has a larger
      * area. By default, the menu uses relative positioning. Pass 'true' to use the default
      * overlay. See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement] | Boolean] = js.undefined
    
    /** Clear selection immediately after making it */
    var clearOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration options to pass to {@link OO.ui.MenuSelectWidget menu select widget}.
      */
    var menu: js.UndefOr[typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions] = js.undefined
    
    /**
      * Class for the menu widget. This
      * must be a subclass of {@link OO.ui.MenuSelectWidget menu select widget}.
      */
    var menuClass: js.UndefOr[Instantiable1[/* args (repeated) */ Any, Any]] = js.undefined
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
      
      inline def setClearOnSelect(value: Boolean): Self = StObject.set(x, "clearOnSelect", value.asInstanceOf[js.Any])
      
      inline def setClearOnSelectUndefined: Self = StObject.set(x, "clearOnSelect", js.undefined)
      
      inline def setMenu(value: typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuClass(value: Instantiable1[/* args (repeated) */ Any, Any]): Self = StObject.set(x, "menuClass", value.asInstanceOf[js.Any])
      
      inline def setMenuClassUndefined: Self = StObject.set(x, "menuClass", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ButtonMenuSelectWidget]
       with Instantiable1[/* config */ ConfigOptions, ButtonMenuSelectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.ButtonWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.ButtonWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget.Props {
    
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $button: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $button = $button.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget.Prototype {
    
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
  }
  
  type Static = typings.oojsUi.OO.ui.ButtonWidget.Static
}
