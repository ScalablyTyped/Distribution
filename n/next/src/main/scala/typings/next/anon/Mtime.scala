package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mtime extends StObject {
  
  var mtime: js.Date
}
object Mtime {
  
  inline def apply(mtime: js.Date): Mtime = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mtime]
  }
  
  extension [Self <: Mtime](x: Self) {
    
    inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
  }
}
