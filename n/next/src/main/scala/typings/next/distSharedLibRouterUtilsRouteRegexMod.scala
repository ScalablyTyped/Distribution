package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.CatchAll
import typings.next.anon.Groups
import typings.next.anon.NamedRegex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsRouteRegexMod {
  
  @JSImport("next/dist/shared/lib/router/utils/route-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNamedMiddlewareRegex(normalizedRoute: String, options: CatchAll): NamedRegex = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedMiddlewareRegex")(normalizedRoute.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NamedRegex]
  
  inline def getNamedRouteRegex(normalizedRoute: String): Groups = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamedRouteRegex")(normalizedRoute.asInstanceOf[js.Any]).asInstanceOf[Groups]
  
  inline def getRouteRegex(normalizedRoute: String): RouteRegex = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteRegex")(normalizedRoute.asInstanceOf[js.Any]).asInstanceOf[RouteRegex]
  
  trait Group extends StObject {
    
    var optional: Boolean
    
    var pos: Double
    
    var repeat: Boolean
  }
  object Group {
    
    inline def apply(optional: Boolean, pos: Double, repeat: Boolean): Group = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteRegex extends StObject {
    
    var groups: StringDictionary[Group]
    
    var re: js.RegExp
  }
  object RouteRegex {
    
    inline def apply(groups: StringDictionary[Group], re: js.RegExp): RouteRegex = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteRegex]
    }
    
    extension [Self <: RouteRegex](x: Self) {
      
      inline def setGroups(value: StringDictionary[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setRe(value: js.RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    }
  }
}
