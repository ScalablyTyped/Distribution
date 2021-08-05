package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenoteEntityBaseModel
  extends StObject
     with Entity {
  
  // The endpoint where you can get details about the page. Read-only.
  var self: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenoteEntityBaseModel {
  
  inline def apply(): OnenoteEntityBaseModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntityBaseModel]
  }
  
  extension [Self <: OnenoteEntityBaseModel](x: Self) {
    
    inline def setSelf(value: NullableOption[String]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfNull: Self = StObject.set(x, "self", null)
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
