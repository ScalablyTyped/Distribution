package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dir extends StObject {
  
  var dir: js.UndefOr[String] = js.undefined
}
object Dir {
  
  inline def apply(): Dir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dir]
  }
  
  extension [Self <: Dir](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
  }
}
