package typings.nestedProperty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Own extends StObject {
    
    var own: Boolean = js.native
  }
  object Own {
    
    @scala.inline
    def apply(own: Boolean): Own = {
      val __obj = js.Dynamic.literal(own = own.asInstanceOf[js.Any])
      __obj.asInstanceOf[Own]
    }
    
    @scala.inline
    implicit class OwnMutableBuilder[Self <: Own] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwn(value: Boolean): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidPath extends StObject {
    
    var validPath: Boolean = js.native
  }
  object ValidPath {
    
    @scala.inline
    def apply(validPath: Boolean): ValidPath = {
      val __obj = js.Dynamic.literal(validPath = validPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidPath]
    }
    
    @scala.inline
    implicit class ValidPathMutableBuilder[Self <: ValidPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidPath(value: Boolean): Self = StObject.set(x, "validPath", value.asInstanceOf[js.Any])
    }
  }
}
