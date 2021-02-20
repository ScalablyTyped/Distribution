package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetState extends StObject {
  
  /** Details about Agones fleets. */
  var details: js.UndefOr[js.Array[TargetDetails]] = js.native
}
object TargetState {
  
  @scala.inline
  def apply(): TargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetState]
  }
  
  @scala.inline
  implicit class TargetStateMutableBuilder[Self <: TargetState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Array[TargetDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: TargetDetails*): Self = StObject.set(x, "details", js.Array(value :_*))
  }
}
