package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDateTimeRule extends StObject {
  
  /** The type of date-time grouping to apply. */
  var `type`: js.UndefOr[String] = js.native
}
object ChartDateTimeRule {
  
  @scala.inline
  def apply(): ChartDateTimeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDateTimeRule]
  }
  
  @scala.inline
  implicit class ChartDateTimeRuleMutableBuilder[Self <: ChartDateTimeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
