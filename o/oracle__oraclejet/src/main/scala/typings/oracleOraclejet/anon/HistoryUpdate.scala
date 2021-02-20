package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryUpdate extends StObject {
  
  var historyUpdate: String = js.native
}
object HistoryUpdate {
  
  @scala.inline
  def apply(historyUpdate: String): HistoryUpdate = {
    val __obj = js.Dynamic.literal(historyUpdate = historyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryUpdate]
  }
  
  @scala.inline
  implicit class HistoryUpdateMutableBuilder[Self <: HistoryUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistoryUpdate(value: String): Self = StObject.set(x, "historyUpdate", value.asInstanceOf[js.Any])
  }
}
