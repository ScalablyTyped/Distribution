package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearButtonPressed extends StObject {
  
  /**
    * Indicates if the user pressed the clear icon.
    */
  var clearButtonPressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The search query string.
    */
  var query: js.UndefOr[String] = js.undefined
}
object ClearButtonPressed {
  
  inline def apply(): ClearButtonPressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearButtonPressed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearButtonPressed] (val x: Self) extends AnyVal {
    
    inline def setClearButtonPressed(value: Boolean): Self = StObject.set(x, "clearButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setClearButtonPressedUndefined: Self = StObject.set(x, "clearButtonPressed", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
