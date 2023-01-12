package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoWait extends StObject {
  
  /**
    * Since 1.53, activates autoWait while the application is starting up. This allows more time for application
    * startup and stabilizes tests for slow-loading applications. This parameter is false by default, regardless
    * of the global autoWait value, to prevent issues in existing tests.
    */
  var autoWait: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Since 1.57, sets a fixed height for the iframe. Setting width and/or height is useful when testing responsive
    * applications on screens of varying sizes. By default, the iframe dimensions are 60% of the outer window
    * dimensions.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The source of the iframe
    */
  var source: String
  
  /**
    * The timeout for loading the iframe in seconds - default is 80
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Since 1.57, sets a fixed width for the iframe.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object AutoWait {
  
  inline def apply(source: String): AutoWait = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoWait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoWait] (val x: Self) extends AnyVal {
    
    inline def setAutoWait(value: Boolean): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
    
    inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
