package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RequestManager is a mixin that manages the lifecycle of a promise-backed request for a widget,
  * such as the {@link OO.ui.mixin.LookupElement}.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.RequestManager
  */
trait RequestManager extends StObject {
  
  /**
    * Get request results for the current query.
    *
    * @return Promise object which will be passed response data as the first argument
    *  of the done event. If the request was aborted to make way for a subsequent request, this
    *  promise may not be rejected, depending on what jQuery feels like doing.
    */
  def getRequestData(): Promise[Any, Any, Any]
}
object RequestManager {
  
  inline def apply(getRequestData: () => Promise[Any, Any, Any]): RequestManager = {
    val __obj = js.Dynamic.literal(getRequestData = js.Any.fromFunction0(getRequestData))
    __obj.asInstanceOf[RequestManager]
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * Show pending state while request data is being fetched.
      * Requires widget to have also mixed in {@link OO.ui.mixin.PendingElement}.
      */
    var showPendingRequest: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setShowPendingRequest(value: Boolean): Self = StObject.set(x, "showPendingRequest", value.asInstanceOf[js.Any])
      
      inline def setShowPendingRequestUndefined: Self = StObject.set(x, "showPendingRequest", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[RequestManager]
       with Instantiable1[/* config */ ConfigOptions, RequestManager]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestManager] (val x: Self) extends AnyVal {
    
    inline def setGetRequestData(value: () => Promise[Any, Any, Any]): Self = StObject.set(x, "getRequestData", js.Any.fromFunction0(value))
  }
}
