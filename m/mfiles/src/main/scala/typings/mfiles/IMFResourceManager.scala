package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMFResourceManager extends StObject {
  
  def GetLocaleSpecificDateFormat(): String = js.native
  
  def GetUICultures(): IStrings = js.native
  
  def LoadResourceString(LanguageID: Double, ResourceID: Double): String = js.native
}
object IMFResourceManager {
  
  @scala.inline
  def apply(
    GetLocaleSpecificDateFormat: () => String,
    GetUICultures: () => IStrings,
    LoadResourceString: (Double, Double) => String
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal(GetLocaleSpecificDateFormat = js.Any.fromFunction0(GetLocaleSpecificDateFormat), GetUICultures = js.Any.fromFunction0(GetUICultures), LoadResourceString = js.Any.fromFunction2(LoadResourceString))
    __obj.asInstanceOf[IMFResourceManager]
  }
  
  @scala.inline
  implicit class IMFResourceManagerMutableBuilder[Self <: IMFResourceManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLocaleSpecificDateFormat(value: () => String): Self = StObject.set(x, "GetLocaleSpecificDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUICultures(value: () => IStrings): Self = StObject.set(x, "GetUICultures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadResourceString(value: (Double, Double) => String): Self = StObject.set(x, "LoadResourceString", js.Any.fromFunction2(value))
  }
}
