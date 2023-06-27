package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoConflict extends StObject {
  
  var amd: Boolean
  
  var async: Boolean
  
  var noConflict: Boolean
}
object NoConflict {
  
  inline def apply(amd: Boolean, async: Boolean, noConflict: Boolean): NoConflict = {
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], noConflict = noConflict.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoConflict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoConflict] (val x: Self) extends AnyVal {
    
    inline def setAmd(value: Boolean): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setNoConflict(value: Boolean): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
  }
}
