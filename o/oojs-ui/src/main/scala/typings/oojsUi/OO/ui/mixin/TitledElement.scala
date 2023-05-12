package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Deferrable
import typings.oojsUi.OO.ui.mixin.TitledElement.Props
import typings.oojsUi.OO.ui.mixin.TitledElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TitledElement is mixed into other classes to provide a `title` attribute.
  * Titles are rendered by the browser and are made visible when the user moves the mouse over
  * the element. Titles are not visible on touch devices.
  *
  *     // TitledElement provides a `title` attribute to the
  *     // ButtonWidget class.
  *     var button = new OO.ui.ButtonWidget( {
  *         label: 'Button with Title',
  *         title: 'I am a button'
  *     } );
  *     $( document.body ).append( button.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.TitledElement
  */
@js.native
trait TitledElement
  extends StObject
     with Props
     with Prototype
object TitledElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The element to which the `title` attribute is applied.
      * If this config is omitted, the title functionality is applied to
      * {@link Element.Props.$element $element}, the element created by the class.
      */
    @JSName("$titled")
    var $titled: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * The title text or a function that returns text. If this config is omitted, the value
      * of the {@link Static.title static title} property is used. If config for an invisible
      * label ({@link OO.ui.mixin.LabelElement}) is present, and a title is omitted, the label
      * will be used as a fallback for the title.
      */
    var title: js.UndefOr[Deferrable[String]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$titled(value: JQuery[HTMLElement]): Self = StObject.set(x, "$titled", value.asInstanceOf[js.Any])
      
      inline def set$titledUndefined: Self = StObject.set(x, "$titled", js.undefined)
      
      inline def setTitle(value: Deferrable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TitledElement]
       with Instantiable1[/* config */ ConfigOptions, TitledElement] {
    
    var static: Static = js.native
  }
  
  trait Props extends StObject {
    
    @JSName("$titled")
    var $titled: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($titled: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$titled(value: JQuery[HTMLElement]): Self = StObject.set(x, "$titled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Get title.
      *
      * @return Title string
      */
    def getTitle(): String | Null = js.native
    
    /**
      * Set title.
      *
      * @param title Title text, a function that returns text, or `null` for no title
      * @return The element, for chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(title: Deferrable[String]): this.type = js.native
    
    /**
      * Set the titled element.
      *
      * This method is used to retarget a TitledElement mixin so that its functionality
      * applies to the specified element.
      * If an element is already set, the mixin’s effect on that element is removed before
      * the new element is set up.
      *
      * @param $titled Element that should use the 'titled' functionality
      */
    def setTitledElement($titled: JQuery[HTMLElement]): Unit = js.native
  }
  
  trait Static extends StObject {
    
    /**
      * The title text, a function that returns text, or `null` for no title. The value of the
      * static property is overridden if the {@link ConfigOptions.title title} config option
      * is used.
      *
      * If the element has a default title (e.g. `<input type=file>`), `null` will allow that
      * title to be shown. Use empty string to suppress it.
      */
    var title: Deferrable[String] | Null
  }
  object Static {
    
    inline def apply(): Static = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: Deferrable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
    }
  }
}
