package typings.physijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Friction extends StObject {
    
    var friction: Double
    
    var id: Double
    
    var restriction: Double
  }
  object Friction {
    
    @scala.inline
    def apply(friction: Double, id: Double, restriction: Double): Friction = {
      val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Friction]
    }
    
    @scala.inline
    implicit class FrictionMutableBuilder[Self <: Friction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestriction(value: Double): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: js.Any
    
    var `type`: String
  }
  object Target {
    
    @scala.inline
    def apply(target: js.Any, `type`: String): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
