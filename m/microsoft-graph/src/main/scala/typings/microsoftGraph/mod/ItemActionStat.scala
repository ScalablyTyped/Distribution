package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemActionStat extends StObject {
  
  // The number of times the action took place. Read-only.
  var actionCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of distinct actors that performed the action. Read-only.
  var actorCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object ItemActionStat {
  
  inline def apply(): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActionStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemActionStat] (val x: Self) extends AnyVal {
    
    inline def setActionCount(value: NullableOption[Double]): Self = StObject.set(x, "actionCount", value.asInstanceOf[js.Any])
    
    inline def setActionCountNull: Self = StObject.set(x, "actionCount", null)
    
    inline def setActionCountUndefined: Self = StObject.set(x, "actionCount", js.undefined)
    
    inline def setActorCount(value: NullableOption[Double]): Self = StObject.set(x, "actorCount", value.asInstanceOf[js.Any])
    
    inline def setActorCountNull: Self = StObject.set(x, "actorCount", null)
    
    inline def setActorCountUndefined: Self = StObject.set(x, "actorCount", js.undefined)
  }
}
