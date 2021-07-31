package typings.perfectScrollbar

import typings.perfectScrollbar.perfectScrollbarStrings.end
import typings.perfectScrollbar.perfectScrollbarStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait X extends StObject {
    
    var x: start | end | Null
    
    var y: start | end | Null
  }
  object X {
    
    @scala.inline
    def apply(): X = {
      val __obj = js.Dynamic.literal(x = null, y = null)
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: start | end): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNull: Self = StObject.set(x, "x", null)
      
      @scala.inline
      def setY(value: start | end): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNull: Self = StObject.set(x, "y", null)
    }
  }
}
