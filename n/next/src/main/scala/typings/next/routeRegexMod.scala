package typings.next

import typings.next.anon.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeRegexMod {
  
  @JSImport("next/dist/next-server/lib/router/utils/route-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRouteRegex(normalizedRoute: String): Groups = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteRegex")(normalizedRoute.asInstanceOf[js.Any]).asInstanceOf[Groups]
  
  trait Group extends StObject {
    
    var optional: Boolean
    
    var pos: Double
    
    var repeat: Boolean
  }
  object Group {
    
    @scala.inline
    def apply(optional: Boolean, pos: Double, repeat: Boolean): Group = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    }
  }
}
