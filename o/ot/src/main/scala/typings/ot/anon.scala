package typings.ot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Anchor extends StObject {
    
    var anchor: Double = js.native
    
    var head: Double = js.native
  }
  object Anchor {
    
    @scala.inline
    def apply(anchor: Double, head: Double): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    @scala.inline
    implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
