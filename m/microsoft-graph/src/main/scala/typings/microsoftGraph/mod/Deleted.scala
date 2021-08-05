package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deleted extends StObject {
  
  // Represents the state of the deleted item.
  var state: js.UndefOr[NullableOption[String]] = js.undefined
}
object Deleted {
  
  inline def apply(): Deleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deleted]
  }
  
  extension [Self <: Deleted](x: Self) {
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
