package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameId
  extends /* key */ StringDictionary[js.Any] {
  
  var id: js.Any = js.native
}
object DictpropNameId {
  
  @scala.inline
  def apply(id: js.Any): DictpropNameId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameId]
  }
  
  @scala.inline
  implicit class DictpropNameIdMutableBuilder[Self <: DictpropNameId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
