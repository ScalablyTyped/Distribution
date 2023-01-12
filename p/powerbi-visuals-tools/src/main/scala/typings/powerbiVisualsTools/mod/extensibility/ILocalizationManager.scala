package typings.powerbiVisualsTools.mod.extensibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalizationManager extends StObject {
  
  def getDisplayName(key: String): String
}
object ILocalizationManager {
  
  inline def apply(getDisplayName: String => String): ILocalizationManager = {
    val __obj = js.Dynamic.literal(getDisplayName = js.Any.fromFunction1(getDisplayName))
    __obj.asInstanceOf[ILocalizationManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocalizationManager] (val x: Self) extends AnyVal {
    
    inline def setGetDisplayName(value: String => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction1(value))
  }
}
