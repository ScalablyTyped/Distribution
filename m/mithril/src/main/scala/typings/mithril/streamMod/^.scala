package typings.mithril.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mithril/stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SKIP: js.Symbol = js.native
  def apply[T](): Stream[T] = js.native
  /** Creates a stream with an initial value. */
  def apply[T](value: T): Stream[T] = js.native
  def combine[T](combiner: js.Function1[/* repeated */ js.Any, T], streams: js.Array[Stream[_]]): Stream[T] = js.native
  def lift[S /* <: js.Array[_] */, T](
    fn: js.Function1[/* values */ S, T],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param streams because its type {[ I in keyof S ]: Stream<S[I]>} is not an array type */ streams: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}
    */ typings.mithril.mithrilStrings.lift with S
  ): Stream[T] = js.native
  def merge[S /* <: js.Array[_] */](
    streams: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}
    */ typings.mithril.mithrilStrings.merge with S
  ): Stream[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ I in keyof S ]: S[I]}
    */ typings.mithril.mithrilStrings.merge with S
  ] = js.native
  def scan[T, U](fn: js.Function2[/* acc */ U, /* value */ T, U], acc: U, stream: Stream[T]): Stream[U] = js.native
  def scanMerge[U](pairs: js.Array[js.Tuple2[Stream[_], js.Function2[/* acc */ U, /* value */ _, U]]], acc: U): Stream[U] = js.native
  @JSName("scanMerge")
  def scanMerge_TU[T, U](pairs: js.Array[js.Tuple2[Stream[T], js.Function2[/* acc */ U, /* value */ T, U]]], acc: U): Stream[U] = js.native
}

