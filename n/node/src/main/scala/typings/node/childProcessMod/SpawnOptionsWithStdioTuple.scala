package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpawnOptionsWithStdioTuple[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */] extends SpawnOptions {
  
  @JSName("stdio")
  var stdio_SpawnOptionsWithStdioTuple: js.Tuple3[Stdin, Stdout, Stderr] = js.native
}
object SpawnOptionsWithStdioTuple {
  
  @scala.inline
  def apply[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */](stdio: js.Tuple3[Stdin, Stdout, Stderr]): SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr] = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr]]
  }
  
  @scala.inline
  implicit class SpawnOptionsWithStdioTupleMutableBuilder[Self <: SpawnOptionsWithStdioTuple[_, _, _], Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */] (val x: Self with (SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr])) extends AnyVal {
    
    @scala.inline
    def setStdio(value: js.Tuple3[Stdin, Stdout, Stderr]): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
  }
}
