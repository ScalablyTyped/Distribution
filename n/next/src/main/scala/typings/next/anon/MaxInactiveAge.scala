package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxInactiveAge extends StObject {
  
  /** period (in ms) where the server will keep pages in the buffer */
  var maxInactiveAge: js.UndefOr[Double] = js.undefined
  
  /** number of pages that should be kept simultaneously without being disposed */
  var pagesBufferLength: js.UndefOr[Double] = js.undefined
}
object MaxInactiveAge {
  
  inline def apply(): MaxInactiveAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxInactiveAge]
  }
  
  extension [Self <: MaxInactiveAge](x: Self) {
    
    inline def setMaxInactiveAge(value: Double): Self = StObject.set(x, "maxInactiveAge", value.asInstanceOf[js.Any])
    
    inline def setMaxInactiveAgeUndefined: Self = StObject.set(x, "maxInactiveAge", js.undefined)
    
    inline def setPagesBufferLength(value: Double): Self = StObject.set(x, "pagesBufferLength", value.asInstanceOf[js.Any])
    
    inline def setPagesBufferLengthUndefined: Self = StObject.set(x, "pagesBufferLength", js.undefined)
  }
}
