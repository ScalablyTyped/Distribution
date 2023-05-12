package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Deferrable
import typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Props
import typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AccessKeyedElement is mixed into other classes to provide an `accesskey` HTML attribute.
  * Access keys allow an user to go to a specific element by using a shortcut combination of a
  * browser specific keys + the key set to the field.
  *
  *     // AccessKeyedElement provides an `accesskey` attribute to the
  *     // ButtonWidget class.
  *     var button = new OO.ui.ButtonWidget( {
  *         label: 'Button with access key',
  *         accessKey: 'k'
  *     } );
  *     $( document.body ).append( button.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.AccessKeyedElement
  */
@js.native
trait AccessKeyedElement
  extends StObject
     with Props
     with Prototype
object AccessKeyedElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The element to which the `accesskey` attribute is applied.
      * If this config is omitted, the access key functionality is applied to
      * {@link Element.Props.$element $element}, the element created by the class.
      */
    @JSName("$accessKeyed")
    var $accessKeyed: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * The key or a function that returns the key. If this config is omitted, no access key
      * will be added.
      */
    var accessKey: js.UndefOr[Deferrable[String] | Null] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$accessKeyed(value: JQuery[HTMLElement]): Self = StObject.set(x, "$accessKeyed", value.asInstanceOf[js.Any])
      
      inline def set$accessKeyedUndefined: Self = StObject.set(x, "$accessKeyed", js.undefined)
      
      inline def setAccessKey(value: Deferrable[String]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyFunction0(value: () => String): Self = StObject.set(x, "accessKey", js.Any.fromFunction0(value))
      
      inline def setAccessKeyNull: Self = StObject.set(x, "accessKey", null)
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[AccessKeyedElement]
       with Instantiable1[/* config */ ConfigOptions, AccessKeyedElement] {
    
    var static: Static = js.native
  }
  
  trait Props extends StObject {
    
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($accessKeyed: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$accessKeyed(value: JQuery[HTMLElement]): Self = StObject.set(x, "$accessKeyed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Add information about the access key to the element's tooltip label.
      * (This is only public for hacky usage in {@link FieldLayout}.)
      *
      * @param title Tooltip label for `title` attribute
      * @return
      */
    def formatTitleWithAccessKey(title: String): String = js.native
    
    /**
      * Get access key.
      *
      * @return accessKey string
      */
    def getAccessKey(): String = js.native
    
    /**
      * Set access key.
      *
      * @param accessKey Key, a function that returns a key, or `null` for no access key
      * @return The element, for chaining
      */
    def setAccessKey(): this.type = js.native
    def setAccessKey(accessKey: Deferrable[String]): this.type = js.native
    
    /**
      * Set the access keyed element.
      *
      * This method is used to retarget a AccessKeyedElement mixin so that its functionality
      * applies to the specified element.
      * If an element is already set, the mixin's effect on that element is removed before
      * the new element is set up.
      *
      * @param $accessKeyed Element that should use the 'access keyed' functionality
      */
    def setAccessKeyedElement($accessKeyed: JQuery[HTMLElement]): Unit = js.native
  }
  
  trait Static extends StObject {
    
    /**
      * The access key, a function that returns a key, or `null` for no access key.
      */
    var accessKey: Deferrable[String] | Null
  }
  object Static {
    
    inline def apply(): Static = {
      val __obj = js.Dynamic.literal(accessKey = null)
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setAccessKey(value: Deferrable[String]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyFunction0(value: () => String): Self = StObject.set(x, "accessKey", js.Any.fromFunction0(value))
      
      inline def setAccessKeyNull: Self = StObject.set(x, "accessKey", null)
    }
  }
}
