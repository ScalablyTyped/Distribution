package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnOptionsWithStdioTuple[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */]
  extends StObject
     with SpawnOptions {
  
  @JSName("stdio")
  var stdio_SpawnOptionsWithStdioTuple: js.Tuple3[Stdin, Stdout, Stderr]
}
object SpawnOptionsWithStdioTuple {
  
  inline def apply[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */](stdio: js.Tuple3[Stdin, Stdout, Stderr]): SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr] = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr]]
  }
  
  extension [Self <: SpawnOptionsWithStdioTuple[?, ?, ?], Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */](x: Self & (SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr])) {
    
    inline def setStdio(value: js.Tuple3[Stdin, Stdout, Stderr]): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
  }
}
