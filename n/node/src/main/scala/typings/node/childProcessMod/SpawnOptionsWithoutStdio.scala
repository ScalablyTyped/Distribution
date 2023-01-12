package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnOptionsWithoutStdio
  extends StObject
     with SpawnOptions {
  
  @JSName("stdio")
  var stdio_SpawnOptionsWithoutStdio: js.UndefOr[StdioPipeNamed | js.Array[StdioPipe]] = js.undefined
}
object SpawnOptionsWithoutStdio {
  
  inline def apply(): SpawnOptionsWithoutStdio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptionsWithoutStdio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpawnOptionsWithoutStdio] (val x: Self) extends AnyVal {
    
    inline def setStdio(value: StdioPipeNamed | js.Array[StdioPipe]): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: StdioPipe*): Self = StObject.set(x, "stdio", js.Array(value*))
  }
}
