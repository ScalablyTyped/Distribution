package typings.playable

import typings.playable.anon.Prefix
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementQueriesElementQueriesMod {
  
  @JSImport("playable/dist/src/modules/ui/core/element-queries/element-queries", JSImport.Default)
  @js.native
  class default protected () extends ElementQueries {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, hasPrefix: Prefix) = this()
  }
  
  @js.native
  trait ElementQueries extends StObject {
    
    var _element: js.Any = js.native
    
    var _getQueryAttributeValue: js.Any = js.native
    
    var _queries: js.Any = js.native
    
    var _queryPrefix: js.Any = js.native
    
    var _setQueryAttribute: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getQueries(): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
  }
  object ElementQueries {
    
    @scala.inline
    def apply(
      _element: js.Any,
      _getQueryAttributeValue: js.Any,
      _queries: js.Any,
      _queryPrefix: js.Any,
      _setQueryAttribute: js.Any,
      destroy: () => Unit,
      getQueries: () => Unit,
      setWidth: Double => Unit
    ): ElementQueries = {
      val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _getQueryAttributeValue = _getQueryAttributeValue.asInstanceOf[js.Any], _queries = _queries.asInstanceOf[js.Any], _queryPrefix = _queryPrefix.asInstanceOf[js.Any], _setQueryAttribute = _setQueryAttribute.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getQueries = js.Any.fromFunction0(getQueries), setWidth = js.Any.fromFunction1(setWidth))
      __obj.asInstanceOf[ElementQueries]
    }
    
    @scala.inline
    implicit class ElementQueriesMutableBuilder[Self <: ElementQueries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetQueries(value: () => Unit): Self = StObject.set(x, "getQueries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_element(value: js.Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getQueryAttributeValue(value: js.Any): Self = StObject.set(x, "_getQueryAttributeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_queries(value: js.Any): Self = StObject.set(x, "_queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_queryPrefix(value: js.Any): Self = StObject.set(x, "_queryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_setQueryAttribute(value: js.Any): Self = StObject.set(x, "_setQueryAttribute", value.asInstanceOf[js.Any])
    }
  }
}
