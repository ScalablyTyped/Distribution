package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TechnicallyGroupable extends StObject {
  
  /**
    * If `groupable` is set to `false` to exclude it from group personalization on the UI, the UI still needs
    * to know that this property is groupable for data requests.
    */
  var technicallyGroupable: js.UndefOr[Boolean] = js.undefined
}
object TechnicallyGroupable {
  
  inline def apply(): TechnicallyGroupable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnicallyGroupable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TechnicallyGroupable] (val x: Self) extends AnyVal {
    
    inline def setTechnicallyGroupable(value: Boolean): Self = StObject.set(x, "technicallyGroupable", value.asInstanceOf[js.Any])
    
    inline def setTechnicallyGroupableUndefined: Self = StObject.set(x, "technicallyGroupable", js.undefined)
  }
}
