package typings.mobxStateTree

import typings.std.Generator
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreFlowMod {
  
  @JSImport("mobx-state-tree/dist/core/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castFlowReturn[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("castFlowReturn")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def flow[R, Args /* <: js.Array[Any] */](generator: js.Function1[/* args */ Args, Generator[PromiseLike[Any], R, Any]]): js.Function1[/* args */ Args, js.Promise[FlowReturn[R]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, js.Promise[FlowReturn[R]]]]
  
  inline def toGenerator[R](p: js.Promise[R]): Generator[js.Promise[R], R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGenerator")(p.asInstanceOf[js.Any]).asInstanceOf[Generator[js.Promise[R], R, R]]
  
  inline def toGeneratorFunction[R, Args /* <: js.Array[Any] */](p: js.Function1[/* args */ Args, js.Promise[R]]): js.Function1[/* args */ Args, Generator[js.Promise[R], R, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneratorFunction")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Generator[js.Promise[R], R, R]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    R extends std.Promise<infer T> ? T : R
    }}}
    */
  @js.native
  trait FlowReturn[R] extends StObject
}
