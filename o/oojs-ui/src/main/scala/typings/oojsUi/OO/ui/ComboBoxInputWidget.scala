package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ComboBoxInputWidget.Props
import typings.oojsUi.OO.ui.ComboBoxInputWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ComboBoxInputWidgets combine a {@link OO.ui.TextInputWidget text input} (where a value
  * can be entered manually) and a {@link OO.ui.MenuSelectWidget menu of options} (from which
  * a value can be chosen instead). Users can choose options from the combo box in one of two ways:
  *
  * - by typing a value in the text input field. If the value exactly matches the value of a menu
  *   option, that option will appear to be selected.
  * - by choosing a value from the menu. The value of the chosen option will then appear in the text
  *   input field.
  *
  * After the user chooses an option, its `data` will be used as a new value for the widget.
  * A `label` also can be specified for each option: if given, it will be shown instead of the
  * `data` in the dropdown menu.
  *
  * This widget can be used inside an HTML form, such as a OO.ui.FormLayout.
  *
  * For more information about menus and options, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options#Menu_selects_and_options).
  *
  *     // A ComboBoxInputWidget.
  *     var comboBox = new OO.ui.ComboBoxInputWidget( {
  *         value: 'Option 1',
  *         options: [
  *             { data: 'Option 1' },
  *             { data: 'Option 2' },
  *             { data: 'Option 3' }
  *         ]
  *     } );
  *     $( document.body ).append( comboBox.$element );
  *
  *     // Example: A ComboBoxInputWidget with additional option labels.
  *     var comboBox = new OO.ui.ComboBoxInputWidget( {
  *         value: 'Option 1',
  *         options: [
  *             {
  *                 data: 'Option 1',
  *                 label: 'Option One'
  *             },
  *             {
  *                 data: 'Option 2',
  *                 label: 'Option Two'
  *             },
  *             {
  *                 data: 'Option 3',
  *                 label: 'Option Three'
  *             }
  *         ]
  *     } );
  *     $( document.body ).append( comboBox.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ComboBoxInputWidget
  */
@js.native
trait ComboBoxInputWidget
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
object ComboBoxInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions {
    
    /**
      * Render the menu into a separate layer. This configuration is
      * useful in cases where the expanded menu is larger than its containing `<div>`. The
      * specified overlay layer is usually on top of the containing `<div>` and has a larger
      * area. By default, the menu uses relative positioning.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Configuration options to pass to the {@link OO.ui.MenuSelectWidget menu select widget}. */
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
  Instantiable0[ComboBoxInputWidget]
       with Instantiable1[/* config */ ConfigOptions, ComboBoxInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
  }
  
  trait Option extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.Props {
    
    @JSName("$field")
    var $field: JQuery[HTMLElement]
    
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $field: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement],
      $pending: JQuery[HTMLElement],
      $required: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $field = $field.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$field(value: JQuery[HTMLElement]): Self = StObject.set(x, "$field", value.asInstanceOf[js.Any])
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.Prototype {
    
    /**
      * Get the combobox's text input widget.
      *
      * @return Text input widget
      */
    def getInput(): TextInputWidget = js.native
    
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
      * Get the combobox's menu.
      *
      * @return Menu widget
      */
    def getMenu(): MenuSelectWidget = js.native
    
    /**
      * Set the options available for this input.
      *
      * @param options Array of menu options in the format `{ data: …, label: … }`
      * @return The widget, for chaining
      */
    def setOptions(options: js.Array[Option]): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.TextInputWidget.Static
}
