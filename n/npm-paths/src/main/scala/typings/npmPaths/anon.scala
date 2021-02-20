package typings.npmPaths

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cwd extends StObject {
    
    var cwd: String = js.native
  }
  object Cwd {
    
    @scala.inline
    def apply(cwd: String): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit class CwdMutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    }
  }
}
