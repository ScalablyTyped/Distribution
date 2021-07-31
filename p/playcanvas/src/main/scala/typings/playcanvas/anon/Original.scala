package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Original extends StObject {
  
  var load: String
  
  var original: String
}
object Original {
  
  @scala.inline
  def apply(load: String, original: String): Original = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
  
  @scala.inline
  implicit class OriginalMutableBuilder[Self <: Original] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
  }
}
