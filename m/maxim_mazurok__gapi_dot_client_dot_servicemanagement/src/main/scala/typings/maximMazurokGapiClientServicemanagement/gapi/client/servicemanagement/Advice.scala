package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advice extends StObject {
  
  /** Useful description for why this advice was applied and what actions should be taken to mitigate any implied risks. */
  var description: js.UndefOr[String] = js.native
}
object Advice {
  
  @scala.inline
  def apply(): Advice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advice]
  }
  
  @scala.inline
  implicit class AdviceMutableBuilder[Self <: Advice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
