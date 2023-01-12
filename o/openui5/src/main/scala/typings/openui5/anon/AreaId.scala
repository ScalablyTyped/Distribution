package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaId extends StObject {
  
  /**
    * Id of clicked Area.
    */
  var areaId: js.UndefOr[String] = js.undefined
}
object AreaId {
  
  inline def apply(): AreaId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaId] (val x: Self) extends AnyVal {
    
    inline def setAreaId(value: String): Self = StObject.set(x, "areaId", value.asInstanceOf[js.Any])
    
    inline def setAreaIdUndefined: Self = StObject.set(x, "areaId", js.undefined)
  }
}
