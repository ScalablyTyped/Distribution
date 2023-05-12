package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.CheckboxInputWidget.Props
import typings.oojsUi.OO.ui.CheckboxInputWidget.Prototype
import typings.oojsUi.oojsUiStrings.change
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckboxInputWidgets, like HTML checkboxes, can be selected and/or configured with a value.
  * Note that these {@link OO.ui.InputWidget input widgets} are best laid out
  * in {@link OO.ui.FieldLayout field layouts} that use the {@link OO.ui.FieldLayout.ConfigOptions.align inline}
  * alignment.For more information, please see the[OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs).
  *
  * This widget can be used inside an HTML form, such as a OO.ui.FormLayout.
  *
  *     // An example of selected, unselected, and disabled checkbox inputs.
  *     var checkbox1 = new OO.ui.CheckboxInputWidget( {
  *             value: 'a',
  *              selected: true
  *         } ),
  *         checkbox2 = new OO.ui.CheckboxInputWidget( {
  *             value: 'b'
  *         } ),
  *         checkbox3 = new OO.ui.CheckboxInputWidget( {
  *             value:'c',
  *             disabled: true
  *         } ),
  *         // Create a fieldset layout with fields for each checkbox.
  *         fieldset = new OO.ui.FieldsetLayout( {
  *             label: 'Checkboxes'
  *         } );
  *     fieldset.addItems( [
  *         new OO.ui.FieldLayout( checkbox1, { label: 'Selected checkbox', align: 'inline' } ),
  *         new OO.ui.FieldLayout( checkbox2, { label: 'Unselected checkbox', align: 'inline' } ),
  *         new OO.ui.FieldLayout( checkbox3, { label: 'Disabled checkbox', align: 'inline' } ),
  *     ] );
  *     $( document.body ).append( fieldset.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.CheckboxInputWidget
  */
@js.native
trait CheckboxInputWidget
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
object CheckboxInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.RequiredElement.ConfigOptions {
    
    /** Whether the checkbox is in the indeterminate state. */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** Select the checkbox initially. By default, the checkbox is not selected. */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[CheckboxInputWidget]
       with Instantiable1[/* config */ ConfigOptions, CheckboxInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
  }
  
  // HACK: See SelectWidget.d.ts
  trait EventMap extends StObject {
    
    var change: js.Tuple2[/* selected */ Boolean | String, /* indeterminate */ js.UndefOr[Boolean]]
    
    var disable: js.Array[/* disabled */ Boolean]
    
    var toggle: js.Array[/* visible */ Boolean]
  }
  object EventMap {
    
    inline def apply(
      change: js.Tuple2[/* selected */ Boolean | String, /* indeterminate */ js.UndefOr[Boolean]],
      disable: js.Array[/* disabled */ Boolean],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setChange(value: js.Tuple2[/* selected */ Boolean | String, /* indeterminate */ js.UndefOr[Boolean]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: js.Array[/* disabled */ Boolean]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableVarargs(value: (/* disabled */ Boolean)*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setToggle(value: js.Array[/* visible */ Boolean]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleVarargs(value: (/* visible */ Boolean)*): Self = StObject.set(x, "toggle", js.Array(value*))
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
    
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* selected */ Boolean | String, /* indeterminate */ js.UndefOr[Boolean]]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* selected */ Boolean | String, /* indeterminate */ js.UndefOr[Boolean]]
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
      * Check if this checkbox is selected.
      *
      * @return Checkbox is selected
      */
    def isIndeterminate(): Boolean = js.native
    
    /**
      * Check if this checkbox is selected.
      *
      * @return Checkbox is selected
      */
    def isSelected(): Boolean = js.native
    
    /**
      * Set indeterminate state of this checkbox.
      *
      * @param state Indeterminate state
      * @return The widget, for chaining
      */
    def setIndeterminate(state: Boolean): this.type = js.native
    
    /**
      * Set selection state of this checkbox.
      *
      * @param state Selected state
      * @return The widget, for chaining
      */
    def setSelected(state: Boolean): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.InputWidget.Static
}
