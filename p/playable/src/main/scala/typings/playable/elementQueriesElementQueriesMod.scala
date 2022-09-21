package typings.playable

import typings.playable.anon.Prefix
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementQueriesElementQueriesMod {
  
  @JSImport("playable/dist/src/modules/ui/core/element-queries/element-queries", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ElementQueries {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, hasPrefix: Prefix) = this()
    
    /* private */ /* CompleteClass */
    var _element: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getQueryAttributeValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var _queries: Any = js.native
    
    /* private */ /* CompleteClass */
    var _queryPrefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var _setQueryAttribute: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getQueries(): Unit = js.native
    
    /* CompleteClass */
    override def setWidth(width: Double): Unit = js.native
  }
  
  trait ElementQueries extends StObject {
    
    /* private */ var _element: Any
    
    /* private */ var _getQueryAttributeValue: Any
    
    /* private */ var _queries: Any
    
    /* private */ var _queryPrefix: Any
    
    /* private */ var _setQueryAttribute: Any
    
    def destroy(): Unit
    
    def getQueries(): Unit
    
    def setWidth(width: Double): Unit
  }
  object ElementQueries {
    
    inline def apply(
      _element: Any,
      _getQueryAttributeValue: Any,
      _queries: Any,
      _queryPrefix: Any,
      _setQueryAttribute: Any,
      destroy: () => Unit,
      getQueries: () => Unit,
      setWidth: Double => Unit
    ): ElementQueries = {
      val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _getQueryAttributeValue = _getQueryAttributeValue.asInstanceOf[js.Any], _queries = _queries.asInstanceOf[js.Any], _queryPrefix = _queryPrefix.asInstanceOf[js.Any], _setQueryAttribute = _setQueryAttribute.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getQueries = js.Any.fromFunction0(getQueries), setWidth = js.Any.fromFunction1(setWidth))
      __obj.asInstanceOf[ElementQueries]
    }
    
    extension [Self <: ElementQueries](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetQueries(value: () => Unit): Self = StObject.set(x, "getQueries", js.Any.fromFunction0(value))
      
      inline def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
      
      inline def set_getQueryAttributeValue(value: Any): Self = StObject.set(x, "_getQueryAttributeValue", value.asInstanceOf[js.Any])
      
      inline def set_queries(value: Any): Self = StObject.set(x, "_queries", value.asInstanceOf[js.Any])
      
      inline def set_queryPrefix(value: Any): Self = StObject.set(x, "_queryPrefix", value.asInstanceOf[js.Any])
      
      inline def set_setQueryAttribute(value: Any): Self = StObject.set(x, "_setQueryAttribute", value.asInstanceOf[js.Any])
    }
  }
}
