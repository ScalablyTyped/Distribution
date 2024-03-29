package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMFResourceManager extends StObject {
  
  def GetLocaleSpecificDateFormat(): String
  
  def GetUICultures(): IStrings
  
  def LoadResourceString(LanguageID: Double, ResourceID: Double): String
}
object IMFResourceManager {
  
  inline def apply(
    GetLocaleSpecificDateFormat: () => String,
    GetUICultures: () => IStrings,
    LoadResourceString: (Double, Double) => String
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal(GetLocaleSpecificDateFormat = js.Any.fromFunction0(GetLocaleSpecificDateFormat), GetUICultures = js.Any.fromFunction0(GetUICultures), LoadResourceString = js.Any.fromFunction2(LoadResourceString))
    __obj.asInstanceOf[IMFResourceManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMFResourceManager] (val x: Self) extends AnyVal {
    
    inline def setGetLocaleSpecificDateFormat(value: () => String): Self = StObject.set(x, "GetLocaleSpecificDateFormat", js.Any.fromFunction0(value))
    
    inline def setGetUICultures(value: () => IStrings): Self = StObject.set(x, "GetUICultures", js.Any.fromFunction0(value))
    
    inline def setLoadResourceString(value: (Double, Double) => String): Self = StObject.set(x, "LoadResourceString", js.Any.fromFunction2(value))
  }
}
