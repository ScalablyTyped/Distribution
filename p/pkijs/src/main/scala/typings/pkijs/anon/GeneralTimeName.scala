package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralTimeName extends StObject {
  
  var generalTimeName: js.UndefOr[String] = js.undefined
  
  var utcTimeName: js.UndefOr[String] = js.undefined
}
object GeneralTimeName {
  
  inline def apply(): GeneralTimeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralTimeName]
  }
  
  extension [Self <: GeneralTimeName](x: Self) {
    
    inline def setGeneralTimeName(value: String): Self = StObject.set(x, "generalTimeName", value.asInstanceOf[js.Any])
    
    inline def setGeneralTimeNameUndefined: Self = StObject.set(x, "generalTimeName", js.undefined)
    
    inline def setUtcTimeName(value: String): Self = StObject.set(x, "utcTimeName", value.asInstanceOf[js.Any])
    
    inline def setUtcTimeNameUndefined: Self = StObject.set(x, "utcTimeName", js.undefined)
  }
}
