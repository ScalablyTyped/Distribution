package typings.preact.mod.h.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttributes extends StObject {
  
  var d: String
}
object PathAttributes {
  
  @scala.inline
  def apply(d: String): PathAttributes = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttributes]
  }
  
  @scala.inline
  implicit class PathAttributesMutableBuilder[Self <: PathAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
