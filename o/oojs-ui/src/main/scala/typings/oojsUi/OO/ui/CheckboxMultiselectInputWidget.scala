package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.CheckboxMultiselectInputWidget.Prototype
import typings.oojsUi.OO.ui.InputWidget.Props
import typings.oojsUi.anon.PickConfigOptionsdatalabe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckboxMultiselectInputWidget is a
  * {@link OO.ui.CheckboxMultiselectWidget CheckboxMultiselectWidget} intended to be used within a
  * HTML form, such as a OO.ui.FormLayout. The selected values are synchronized with the value of
  * HTML `<input type=checkbox>` tags. Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs)
  * for
  * more information about input widgets.
  *
  *     // A CheckboxMultiselectInputWidget with three options.
  *     var multiselectInput = new OO.ui.CheckboxMultiselectInputWidget( {
  *         options: [
  *             { data: 'a', label: 'First' },
  *             { data: 'b', label: 'Second' },
  *             { data: 'c', label: 'Third' }
  *         ]
  *     } );
  *     $( document.body ).append( multiselectInput.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.CheckboxMultiselectInputWidget
  */
@js.native
trait CheckboxMultiselectInputWidget
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
object CheckboxMultiselectInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions {
    
    /** Array of menu options in the format `{ data: …, label: …, disabled: … }` */
    var options: js.UndefOr[js.Array[PickConfigOptionsdatalabe]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: js.Array[PickConfigOptionsdatalabe]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: PickConfigOptionsdatalabe*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[CheckboxMultiselectInputWidget]
       with Instantiable1[/* config */ ConfigOptions, CheckboxMultiselectInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.InputWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Prototype {
    
    /**
      * Clean up incoming value.
      *
      * @param value Original value
      * @return Cleaned up value
      */
    def cleanUpValue(value: js.Array[String]): js.Array[String] = js.native
    
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
      * @param options Array of menu options in the format
      *  `{ data: …, label: …, disabled: … }`
      * @return The widget, for chaining
      */
    def setOptions(options: js.Array[PickConfigOptionsdatalabe]): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.InputWidget.Static
}
