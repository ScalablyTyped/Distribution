package typings.ot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Anchor extends StObject {
    
    var anchor: Double
    
    var head: Double
  }
  object Anchor {
    
    inline def apply(anchor: Double, head: Double): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    extension [Self <: Anchor](x: Self) {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
