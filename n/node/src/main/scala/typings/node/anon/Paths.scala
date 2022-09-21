package typings.node.anon

import typings.node.globalsMod.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths extends StObject {
  
  var paths: js.UndefOr[Array[String]] = js.undefined
}
object Paths {
  
  inline def apply(): Paths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paths]
  }
  
  extension [Self <: Paths](x: Self) {
    
    inline def setPaths(value: Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
  }
}
