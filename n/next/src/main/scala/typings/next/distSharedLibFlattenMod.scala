package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibFlattenMod {
  
  @JSImport("next/dist/shared/lib/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten[T /* <: js.Array[Any] */](list: T): js.Array[Flattened[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[Flattened[T]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer U> ? next.next/dist/shared/lib/flatten.Flattened<U> : T
    }}}
    */
  @js.native
  trait Flattened[T] extends StObject
}
