package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemActionStat extends StObject {
  
  // The number of times the action took place. Read-only.
  var actionCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of distinct actors that performed the action. Read-only.
  var actorCount: js.UndefOr[NullableOption[Double]] = js.native
}
object ItemActionStat {
  
  @scala.inline
  def apply(): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActionStat]
  }
  
  @scala.inline
  implicit class ItemActionStatMutableBuilder[Self <: ItemActionStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionCount(value: NullableOption[Double]): Self = StObject.set(x, "actionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionCountNull: Self = StObject.set(x, "actionCount", null)
    
    @scala.inline
    def setActionCountUndefined: Self = StObject.set(x, "actionCount", js.undefined)
    
    @scala.inline
    def setActorCount(value: NullableOption[Double]): Self = StObject.set(x, "actorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorCountNull: Self = StObject.set(x, "actorCount", null)
    
    @scala.inline
    def setActorCountUndefined: Self = StObject.set(x, "actorCount", js.undefined)
  }
}
