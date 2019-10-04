package typings.preact.hooksSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/hooks/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def useCallback[T /* <: js.Function */](callback: T, inputs: Inputs): T = js.native
  def useContext[T](
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PreactContext<T> */ js.Any
  ): T = js.native
  def useDebugValue[T](value: T): Unit = js.native
  def useDebugValue[T](value: T, formatter: js.Function1[/* value */ T, String | Double]): Unit = js.native
  def useEffect(effect: EffectCallback): Unit = js.native
  def useEffect(effect: EffectCallback, inputs: Inputs): Unit = js.native
  def useImperativeHandle[T, R /* <: T */](
    ref: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PreactRef<T> */ js.Any,
    create: js.Function0[R]
  ): Unit = js.native
  def useImperativeHandle[T, R /* <: T */](
    ref: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PreactRef<T> */ js.Any,
    create: js.Function0[R],
    inputs: Inputs
  ): Unit = js.native
  def useLayoutEffect(effect: EffectCallback): Unit = js.native
  def useLayoutEffect(effect: EffectCallback, inputs: Inputs): Unit = js.native
  def useMemo[T](factory: js.Function0[T]): T = js.native
  def useMemo[T](factory: js.Function0[T], inputs: Inputs): T = js.native
  def useReducer[S, A](reducer: Reducer[S, A], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useReducer[S, A, I](reducer: Reducer[S, A], initialArg: I, init: js.Function1[/* arg */ I, S]): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useRef[T](): PropRef[T] = js.native
  def useRef[T](initialValue: T): Ref[T] = js.native
  def useState[S](initialState: S): js.Tuple2[S, StateUpdater[S]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, StateUpdater[S]] = js.native
}

