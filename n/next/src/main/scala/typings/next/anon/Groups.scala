package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.distSharedLibRouterUtilsRouteRegexMod.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: StringDictionary[Group]
  
  var namedRegex: String
  
  var re: js.RegExp
  
  var routeKeys: StringDictionary[String]
}
object Groups {
  
  inline def apply(
    groups: StringDictionary[Group],
    namedRegex: String,
    re: js.RegExp,
    routeKeys: StringDictionary[String]
  ): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], namedRegex = namedRegex.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], routeKeys = routeKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: StringDictionary[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setNamedRegex(value: String): Self = StObject.set(x, "namedRegex", value.asInstanceOf[js.Any])
    
    inline def setRe(value: js.RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    inline def setRouteKeys(value: StringDictionary[String]): Self = StObject.set(x, "routeKeys", value.asInstanceOf[js.Any])
  }
}
