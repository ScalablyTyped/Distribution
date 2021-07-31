package typings.navigation

import typings.navigation.mod.Crumb
import typings.navigation.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Crumbs extends StObject {
    
    var crumbs: js.Array[Crumb]
    
    var data: js.Any
    
    var state: State
  }
  object Crumbs {
    
    @scala.inline
    def apply(crumbs: js.Array[Crumb], data: js.Any, state: State): Crumbs = {
      val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crumbs]
    }
    
    @scala.inline
    implicit class CrumbsMutableBuilder[Self <: Crumbs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrumbs(value: js.Array[Crumb]): Self = StObject.set(x, "crumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrumbsVarargs(value: Crumb*): Self = StObject.set(x, "crumbs", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
