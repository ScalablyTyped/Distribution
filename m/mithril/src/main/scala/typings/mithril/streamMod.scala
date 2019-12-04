package typings.mithril

import typings.mithril.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mithril/stream", JSImport.Namespace)
@js.native
object streamMod extends js.Object {
  @js.native
  trait Stream[T] extends js.Object {
    /** A co-dependent stream that unregisters dependent streams when set to true. */
    @JSName("end")
    var end_Original: Stream[Boolean] = js.native
    /** Returns the value of the stream. */
    def apply(): T = js.native
    /** Sets the value of the stream. */
    def apply(value: T): this.type = js.native
    /** Apply. */
    def ap[U](f: Stream[js.Function1[/* value */ T, U]]): Stream[U] = js.native
    /** Returns the value of the stream. */
    /** A co-dependent stream that unregisters dependent streams when set to true. */
    def end(): Boolean = js.native
    /** Sets the value of the stream. */
    /** A co-dependent stream that unregisters dependent streams when set to true. */
    def end(value: Boolean): this.type = js.native
    /** Creates a dependent stream whose value is set to the result of the callback function. */
    def map[U](
      f: js.Function1[
          /* current */ T, 
          U | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stream.SKIP */ _)
        ]
    ): Stream[U] = js.native
    /** This method is functionally identical to stream. It exists to conform to Fantasy Land's Applicative specification. */
    def of(`val`: T): Stream[T] = js.native
    /** When a stream is passed as the argument to JSON.stringify(), the value of the stream is serialized. */
    def toJSON(): String = js.native
  }
  
  val SKIP: js.Symbol = js.native
  def apply[T](): Stream[T] = js.native
  /** Creates a stream with an initial value. */
  def apply[T](value: T): Stream[T] = js.native
  def combine[T](combiner: js.Function1[/* repeated */ js.Any, T], streams: js.Array[Stream[_]]): Stream[T] = js.native
  def lift[S /* <: js.Array[_] */, T](
    fn: js.Function1[/* values */ S, T],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param streams because its type {[ I in keyof S ]: Stream<S[I]>} is not an array type */ streams: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}
    */ typings.mithril.mithrilStrings.lift with S
  ): Stream[T] = js.native
  def merge[S /* <: js.Array[_] */](
    streams: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}
    */ typings.mithril.mithrilStrings.merge with S
  ): Stream[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ I in keyof S ]: S[I]}
    */ typings.mithril.mithrilStrings.merge with S
  ] = js.native
  def scan[T, U](fn: js.Function2[/* acc */ U, /* value */ T, U], acc: U, stream: Stream[T]): Stream[U] = js.native
  def scanMerge[U](pairs: js.Array[js.Tuple2[Stream[_], js.Function2[/* acc */ U, /* value */ _, U]]], acc: U): Stream[U] = js.native
  @JSName("scanMerge")
  def scanMerge_TU[T, U](pairs: js.Array[js.Tuple2[Stream[T], js.Function2[/* acc */ U, /* value */ T, U]]], acc: U): Stream[U] = js.native
}

