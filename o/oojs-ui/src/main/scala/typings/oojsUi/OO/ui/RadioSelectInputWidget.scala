package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.InputWidget.Props
import typings.oojsUi.OO.ui.RadioSelectInputWidget.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RadioSelectInputWidget is a {@link OO.ui.RadioSelectWidget RadioSelectWidget} intended to be
  * used within an HTML form, such as a OO.ui.FormLayout. The selected value is synchronized with
  * the value of a hidden HTML `input` tag. Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs)
  * for more information about input widgets.
  *
  * This and OO.ui.DropdownInputWidget support similar configuration options.
  *
  *     // A RadioSelectInputWidget with three options
  *     var radioSelectInput = new OO.ui.RadioSelectInputWidget( {
  *         options: [
  *             { data: 'a', label: 'First' },
  *             { data: 'b', label: 'Second'},
  *             { data: 'c', label: 'Third' }
  *         ]
  *     } );
  *     $( document.body ).append( radioSelectInput.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.RadioSelectInputWidget
  */
@js.native
trait RadioSelectInputWidget
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
object RadioSelectInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions {
    
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
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[RadioSelectInputWidget]
       with Instantiable1[/* config */ ConfigOptions, RadioSelectInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
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
  
  type Props = typings.oojsUi.OO.ui.InputWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Prototype {
    
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
