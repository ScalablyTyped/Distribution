package typings.mobxStateTree

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  @JSImport("mobx-state-tree/dist/core/flow", "castFlowReturn")
  @js.native
  def castFlowReturn[T](`val`: T): T = js.native
  
  @JSImport("mobx-state-tree/dist/core/flow", "flow")
  @js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, Generator[js.Promise[_], R, _]]): js.Function1[/* args */ Args, js.Promise[FlowReturn[R]]] = js.native
  
  @JSImport("mobx-state-tree/dist/core/flow", "toGenerator")
  @js.native
  def toGenerator[R](p: js.Promise[R]): Generator[js.Promise[R], R, R] = js.native
  
  @JSImport("mobx-state-tree/dist/core/flow", "toGeneratorFunction")
  @js.native
  def toGeneratorFunction[R, Args /* <: js.Array[_] */](p: js.Function1[/* args */ Args, js.Promise[R]]): js.Function1[/* args */ Args, Generator[js.Promise[R], R, R]] = js.native
  
  type FlowReturn[R] = R
}
