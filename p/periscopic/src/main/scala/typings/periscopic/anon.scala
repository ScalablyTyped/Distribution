package typings.periscopic

import typings.estree.mod.Node
import typings.periscopic.mod.Scope
import typings.std.Map
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Globals extends StObject {
    
    var globals: Map[String, Node]
    
    var map: WeakMap[Node, Scope]
    
    var scope: Scope
  }
  object Globals {
    
    inline def apply(globals: Map[String, Node], map: WeakMap[Node, Scope], scope: Scope): Globals = {
      val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Globals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Globals] (val x: Self) extends AnyVal {
      
      inline def setGlobals(value: Map[String, Node]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setMap(value: WeakMap[Node, Scope]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
