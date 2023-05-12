package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.MenuTagMultiselectWidget.Prototype
import typings.oojsUi.OO.ui.TagMultiselectWidget.Props
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MenuTagMultiselectWidget is a {@link OO.ui.TagMultiselectWidget OO.ui.TagMultiselectWidget}
  * intended to use a menu of selectable options.
  *
  *     // A basic MenuTagMultiselectWidget.
  *     var widget = new OO.ui.MenuTagMultiselectWidget( {
  *         inputPosition: 'outline',
  *         options: [
  *            { data: 'option1', label: 'Option 1', icon: 'tag' },
  *            { data: 'option2', label: 'Option 2' },
  *            { data: 'option3', label: 'Option 3' },
  *         ],
  *         selected: [ 'option1', 'option2' ]
  *     } );
  *     $( document.body ).append( widget.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MenuTagMultiselectWidget
  */
@js.native
trait MenuTagMultiselectWidget
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
object MenuTagMultiselectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.TagMultiselectWidget.ConfigOptions {
    
    /**
      * An overlay for the menu.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Clear the text input value when a menu option is chosen */
    var clearInputOnChoose: js.UndefOr[Boolean] = js.undefined
    
    /** Configuration object for the menu widget */
    var menu: js.UndefOr[typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions] = js.undefined
    
    /** Array of menu options in the format `{ data: …, label: … }` */
    var options: js.UndefOr[js.Array[Option]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
      
      inline def set$overlayUndefined: Self = StObject.set(x, "$overlay", js.undefined)
      
      inline def setClearInputOnChoose(value: Boolean): Self = StObject.set(x, "clearInputOnChoose", value.asInstanceOf[js.Any])
      
      inline def setClearInputOnChooseUndefined: Self = StObject.set(x, "clearInputOnChoose", js.undefined)
      
      inline def setMenu(value: typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MenuTagMultiselectWidget]
       with Instantiable1[/* config */ ConfigOptions, MenuTagMultiselectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.TagMultiselectWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.TagMultiselectWidget.Constructor = js.native
  }
  
  /* Inlined std.Required<std.Pick<oojs-ui.OO.ui.MenuOptionWidget.ConfigOptions, 'data'>> & std.Pick<oojs-ui.OO.ui.MenuOptionWidget.ConfigOptions, 'label' | 'icon'> */
  trait Option extends StObject {
    
    var data: Any
    
    var icon: js.UndefOr[Icon | (Record[String, Icon])] = js.undefined
    
    var label: js.UndefOr[Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet] = js.undefined
  }
  object Option {
    
    inline def apply(data: Any): Option = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon | (Record[String, Icon])): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction0(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  type Props = typings.oojsUi.OO.ui.TagMultiselectWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.TagMultiselectWidget.Prototype {
    
    /**
      * Add options to the menu, ensuring that they are unique by data.
      *
      * @param menuOptions Object defining options
      */
    def addOptions(menuOptions: js.Array[Option]): Unit = js.native
    
    /**
      * Create a menu option widget.
      *
      * @param data Item data
      * @param label Item label
      * @param icon Symbolic icon name
      * @return Option widget
      */
    def createMenuOptionWidget(data: String): OptionWidget = js.native
    def createMenuOptionWidget(data: String, label: String): OptionWidget = js.native
    def createMenuOptionWidget(data: String, label: String, icon: Icon): OptionWidget = js.native
    def createMenuOptionWidget(data: String, label: Unit, icon: Icon): OptionWidget = js.native
    
    /**
      * Create the menu for this widget. This is in a separate method so that
      * child classes can override this without polluting the constructor with
      * unnecessary extra objects that will be overridden.
      *
      * @param menuConfig Configuration options
      * @return Menu widget
      */
    def createMenuWidget(menuConfig: typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions): MenuSelectWidget = js.native
    
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
      * Get the menu
      *
      * @return Menu
      */
    def getMenu(): MenuSelectWidget = js.native
    
    /**
      * Respond to input change event
      */
    def onInputChange(): Unit = js.native
    
    /**
      * Respond to menu choose event, which is intentional by the user.
      *
      * @param menuItem Selected menu items
      * @param selected Item is selected
      */
    def onMenuChoose(menuItem: OptionWidget, selected: Boolean): Unit = js.native
    
    /**
      * Respond to menu toggle event. Reset item highlights on hide.
      *
      * @param isVisible The menu is visible
      */
    def onMenuToggle(isVisible: Boolean): Unit = js.native
    
    /**
      * Respond to resize event
      */
    def onResize(): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.TagMultiselectWidget.Static
}
