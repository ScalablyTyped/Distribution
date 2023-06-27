package typings.observ

import typings.observ.mod.ObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computedMod {
  
  inline def apply[O1 /* <: ObservableValue[Any] */, R](
    // eslint-disable-next-line no-single-element-tuple-type
  observables: js.Array[O1],
    compute: js.Function1[/* observable1 */ ValueOfObservable[O1], R]
  ): ObservableValue[R] = (^.asInstanceOf[js.Dynamic].apply(observables.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[ObservableValue[R]]
  inline def apply[O1 /* <: ObservableValue[Any] */, O2 /* <: ObservableValue[Any] */, R](
    observables: js.Tuple2[O1, O2],
    compute: js.Function2[/* observable1 */ ValueOfObservable[O1], /* observable2 */ ValueOfObservable[O2], R]
  ): ObservableValue[R] = (^.asInstanceOf[js.Dynamic].apply(observables.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[ObservableValue[R]]
  inline def apply[O1 /* <: ObservableValue[Any] */, O2 /* <: ObservableValue[Any] */, O3 /* <: ObservableValue[Any] */, R](
    observables: js.Tuple3[O1, O2, O3],
    compute: js.Function3[
      /* observable1 */ ValueOfObservable[O1], 
      /* observable2 */ ValueOfObservable[O2], 
      /* observable3 */ ValueOfObservable[O3], 
      R
    ]
  ): ObservableValue[R] = (^.asInstanceOf[js.Dynamic].apply(observables.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[ObservableValue[R]]
  inline def apply[O1 /* <: ObservableValue[Any] */, O2 /* <: ObservableValue[Any] */, O3 /* <: ObservableValue[Any] */, O4 /* <: ObservableValue[Any] */, R](
    observables: js.Tuple4[O1, O2, O3, O4],
    compute: js.Function4[
      /* observable1 */ ValueOfObservable[O1], 
      /* observable2 */ ValueOfObservable[O2], 
      /* observable3 */ ValueOfObservable[O3], 
      /* observable4 */ ValueOfObservable[O4], 
      R
    ]
  ): ObservableValue[R] = (^.asInstanceOf[js.Dynamic].apply(observables.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[ObservableValue[R]]
  inline def apply[O1 /* <: ObservableValue[Any] */, O2 /* <: ObservableValue[Any] */, O3 /* <: ObservableValue[Any] */, O4 /* <: ObservableValue[Any] */, O5 /* <: ObservableValue[Any] */, R](
    observables: js.Tuple5[O1, O2, O3, O4, O5],
    compute: js.Function5[
      /* observable1 */ ValueOfObservable[O1], 
      /* observable2 */ ValueOfObservable[O2], 
      /* observable3 */ ValueOfObservable[O3], 
      /* observable4 */ ValueOfObservable[O4], 
      /* observable5 */ ValueOfObservable[O5], 
      R
    ]
  ): ObservableValue[R] = (^.asInstanceOf[js.Dynamic].apply(observables.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[ObservableValue[R]]
  
  @JSImport("observ/computed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends observ.observ.ObservableValue<infer U> ? U : never
    }}}
    */
  @js.native
  trait ValueOfObservable[T] extends StObject
}
