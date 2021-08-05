package typings.node.childProcessMod

import typings.node.nodeStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnOptionsWithoutStdio
  extends StObject
     with SpawnOptions {
  
  @JSName("stdio")
  var stdio_SpawnOptionsWithoutStdio: js.UndefOr[pipe | (js.Array[js.UndefOr[Null | pipe]])] = js.undefined
}
object SpawnOptionsWithoutStdio {
  
  inline def apply(): SpawnOptionsWithoutStdio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptionsWithoutStdio]
  }
  
  extension [Self <: SpawnOptionsWithoutStdio](x: Self) {
    
    inline def setStdio(value: pipe | (js.Array[js.UndefOr[Null | pipe]])): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (js.UndefOr[Null | pipe])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
  }
}
