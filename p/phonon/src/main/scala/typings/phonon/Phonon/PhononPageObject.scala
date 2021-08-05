package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononPageObject extends StObject {
  
  var content: js.UndefOr[String | Null] = js.undefined
  
  var page: String
  
  var preventClose: js.UndefOr[Boolean] = js.undefined
  
  var readyDelay: js.UndefOr[Double] = js.undefined
}
object PhononPageObject {
  
  inline def apply(page: String): PhononPageObject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPageObject]
  }
  
  extension [Self <: PhononPageObject](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setReadyDelay(value: Double): Self = StObject.set(x, "readyDelay", value.asInstanceOf[js.Any])
    
    inline def setReadyDelayUndefined: Self = StObject.set(x, "readyDelay", js.undefined)
  }
}
