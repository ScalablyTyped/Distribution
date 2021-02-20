package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformedMonkeyActions extends StObject {
  
  /** The total number of monkey actions performed during the crawl. */
  var totalActions: js.UndefOr[Double] = js.native
}
object PerformedMonkeyActions {
  
  @scala.inline
  def apply(): PerformedMonkeyActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformedMonkeyActions]
  }
  
  @scala.inline
  implicit class PerformedMonkeyActionsMutableBuilder[Self <: PerformedMonkeyActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalActions(value: Double): Self = StObject.set(x, "totalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalActionsUndefined: Self = StObject.set(x, "totalActions", js.undefined)
  }
}
