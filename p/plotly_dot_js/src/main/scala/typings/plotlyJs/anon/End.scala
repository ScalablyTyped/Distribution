package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: Double | String
  
  var size: Double | String
  
  var start: Double | String
}
object End {
  
  @scala.inline
  def apply(end: Double | String, size: Double | String, start: Double | String): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
