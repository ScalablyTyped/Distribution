package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.DropdownInputWidget.Props
import typings.oojsUi.OO.ui.DropdownInputWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DropdownInputWidget is a {@link OO.ui.DropdownWidget DropdownWidget} intended to be used
  * within an HTML form, such as a OO.ui.FormLayout. The selected value is synchronized with the
  * value of a hidden HTML `input` tag. Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs)
  * for more information about input widgets.
  *
  * A DropdownInputWidget always has a value (one of the options is always selected), unless there
  * are no options. If no `value` configuration option is provided, the first option is selected.
  * If you need a state representing no value (no option being selected), use a DropdownWidget.
  *
  * This and OO.ui.RadioSelectInputWidget support similar configuration options.
  *
  *     // A DropdownInputWidget with three options.
  *     var dropdownInput = new OO.ui.DropdownInputWidget( {
  *         options: [
  *             { data: 'a', label: 'First' },
  *             { data: 'b', label: 'Second', disabled: true },
  *             { optgroup: 'Group label' },
  *             { data: 'c', label: 'First sub-item)' }
  *         ]
  *     } );
  *     $( document.body ).append( dropdownInput.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.DropdownInputWidget
  */
@js.native
trait DropdownInputWidget
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
object DropdownInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.RequiredElement.ConfigOptions {
    
    /**
      * Render the menu into a separate layer. This configuration is
      * useful in cases where the expanded menu is larger than its containing `<div>`. The
      * specified overlay layer is usually on top of the containing `<div>` and has a larger
      * area. By default, the menu uses relative positioning. Pass 'true' to use the default
      * overlay. See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement] | Boolean] = js.undefined
    
    /** Configuration options for {@link OO.ui.DropdownWidget DropdownWidget} */
    var dropdown: js.UndefOr[typings.oojsUi.OO.ui.DropdownWidget.ConfigOptions] = js.undefined
    
    /** Array of menu options in the format described above. */
    var options: js.UndefOr[js.Array[Option]] = js.undefined
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
      
      inline def setDropdown(value: typings.oojsUi.OO.ui.DropdownWidget.ConfigOptions): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[DropdownInputWidget]
       with Instantiable1[/* config */ ConfigOptions, DropdownInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
  }
  
  trait Option extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var optgroup: js.UndefOr[String] = js.undefined
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
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOptgroup(value: String): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
      
      inline def setOptgroupUndefined: Self = StObject.set(x, "optgroup", js.undefined)
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Props
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $required: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Prototype {
    
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
      * Set the options available for this input.
      *
      * @param options Array of menu options in the format `{ data: …, label: … }`
      * @return The widget, for chaining
      */
    def setOptions(options: js.Array[Option]): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.InputWidget.Static
}
