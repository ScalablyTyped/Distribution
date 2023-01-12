package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementProperties
  extends StObject
     with _Definition {
  
  /**
    * used to overwrite this setting when using waitForElement* commands.
    */
  var abortOnFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * used to target a specific element in a query that results in multiple elements returned. Normally,
    * only the first element is used (index = 0) but using the index property, you can specify any element within the result.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * locator strategy can be one of
    *  - css selector
    *  - link text
    *  - partial link text
    *  - tag name
    *  - xpath
    *
    * @example
    * 'css selector'
    */
  var locateStrategy: js.UndefOr[LocateStrategy] = js.undefined
  
  /**
    * used to overwrite the default retry interval for when using waitForElement* commands or assertions.
    */
  var retryInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * the element selector name
    *
    * @example
    * '@searchBar'
    */
  var selector: String
  
  /**
    * Some element commands like .click() or .getText() will throw a NoSuchElement error if the element cannot be located, causing the test to fail.
    * If this option is set to true then this error is ignored.
    */
  var suppressNotFoundErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * used to overwrite the default timeout for when using waitForElement* commands or assertions.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object ElementProperties {
  
  inline def apply(selector: String): ElementProperties = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementProperties] (val x: Self) extends AnyVal {
    
    inline def setAbortOnFailure(value: Boolean): Self = StObject.set(x, "abortOnFailure", value.asInstanceOf[js.Any])
    
    inline def setAbortOnFailureUndefined: Self = StObject.set(x, "abortOnFailure", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLocateStrategy(value: LocateStrategy): Self = StObject.set(x, "locateStrategy", value.asInstanceOf[js.Any])
    
    inline def setLocateStrategyUndefined: Self = StObject.set(x, "locateStrategy", js.undefined)
    
    inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSuppressNotFoundErrors(value: Boolean): Self = StObject.set(x, "suppressNotFoundErrors", value.asInstanceOf[js.Any])
    
    inline def setSuppressNotFoundErrorsUndefined: Self = StObject.set(x, "suppressNotFoundErrors", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
