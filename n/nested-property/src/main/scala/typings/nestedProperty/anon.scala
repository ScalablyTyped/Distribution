package typings.nestedProperty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Own extends StObject {
    
    var own: Boolean
  }
  object Own {
    
    inline def apply(own: Boolean): Own = {
      val __obj = js.Dynamic.literal(own = own.asInstanceOf[js.Any])
      __obj.asInstanceOf[Own]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Own] (val x: Self) extends AnyVal {
      
      inline def setOwn(value: Boolean): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidPath extends StObject {
    
    var validPath: Boolean
  }
  object ValidPath {
    
    inline def apply(validPath: Boolean): ValidPath = {
      val __obj = js.Dynamic.literal(validPath = validPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidPath] (val x: Self) extends AnyVal {
      
      inline def setValidPath(value: Boolean): Self = StObject.set(x, "validPath", value.asInstanceOf[js.Any])
    }
  }
}
