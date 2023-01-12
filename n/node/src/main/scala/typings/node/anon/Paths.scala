package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths extends StObject {
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object Paths {
  
  inline def apply(): Paths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
