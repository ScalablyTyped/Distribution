package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Syncedat extends StObject {
  
  /** @description The IdP groups you want to connect to a GitHub team. When updating, the new `groups` object will replace the original one. You must include any existing groups that you don't want to remove. */
  var groups: js.Array[Groupname]
  
  /** @example "I am not a timestamp" */
  var synced_at: js.UndefOr[String] = js.undefined
}
object Syncedat {
  
  inline def apply(groups: js.Array[Groupname]): Syncedat = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Syncedat]
  }
  
  extension [Self <: Syncedat](x: Self) {
    
    inline def setGroups(value: js.Array[Groupname]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Groupname*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setSynced_at(value: String): Self = StObject.set(x, "synced_at", value.asInstanceOf[js.Any])
    
    inline def setSynced_atUndefined: Self = StObject.set(x, "synced_at", js.undefined)
  }
}
