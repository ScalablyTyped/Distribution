package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletedTeam
  extends StObject
     with Entity {
  
  // The channels that are either shared with this deleted team or created in this deleted team.
  var channels: js.UndefOr[NullableOption[js.Array[Channel]]] = js.undefined
}
object DeletedTeam {
  
  inline def apply(): DeletedTeam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletedTeam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletedTeam] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: NullableOption[js.Array[Channel]]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsNull: Self = StObject.set(x, "channels", null)
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value*))
  }
}
