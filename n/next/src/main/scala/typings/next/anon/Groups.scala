package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.routeRegexMod.Group
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: StringDictionary[Group]
  
  var namedRegex: js.UndefOr[String] = js.undefined
  
  var re: RegExp
  
  var routeKeys: js.UndefOr[StringDictionary[String]] = js.undefined
}
object Groups {
  
  inline def apply(groups: StringDictionary[Group], re: RegExp): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: StringDictionary[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setNamedRegex(value: String): Self = StObject.set(x, "namedRegex", value.asInstanceOf[js.Any])
    
    inline def setNamedRegexUndefined: Self = StObject.set(x, "namedRegex", js.undefined)
    
    inline def setRe(value: RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    inline def setRouteKeys(value: StringDictionary[String]): Self = StObject.set(x, "routeKeys", value.asInstanceOf[js.Any])
    
    inline def setRouteKeysUndefined: Self = StObject.set(x, "routeKeys", js.undefined)
  }
}
