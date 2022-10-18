package typings.mithril

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  inline def apply[T](): Stream[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Stream[T]]
  // tslint:disable-line no-unnecessary-generics
  /** Creates a stream with an initial value. */
  inline def apply[T](value: T): Stream[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
  
  @JSImport("mithril/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mithril/stream", "SKIP")
  @js.native
  val SKIP: js.Symbol = js.native
  
  inline def combine[T](combiner: js.Function1[/* repeated */ Any, T], streams: js.Array[Stream[Any]]): Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(combiner.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[Stream[T]]
  
  inline def lift[S /* <: js.Array[Any] */, T](
    fn: js.Function1[/* values */ S, T],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param streams because its type {[ I in keyof S ]: Stream<S[I]>} is not an array type */ streams: /* import warning: importer.ImportType#apply Failed type conversion: {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>} */ js.Any
  ): Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[Stream[T]]
  
  inline def merge[S /* <: js.Array[Any] */](
    streams: /* import warning: importer.ImportType#apply Failed type conversion: {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>} */ js.Any
  ): Stream[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ I in keyof S ]: S[I]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(streams.asInstanceOf[js.Any]).asInstanceOf[Stream[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ I in keyof S ]: S[I]} */ js.Any
  ]]
  
  inline def scan[T, U](fn: js.Function2[/* acc */ U, /* value */ T, U], acc: U, stream: Stream[T]): Stream[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(fn.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Stream[U]]
  
  inline def scanMerge[U](pairs: js.Array[js.Tuple2[Stream[Any], js.Function2[/* acc */ U, /* value */ Any, U]]], acc: U): Stream[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanMerge")(pairs.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Stream[U]]
  
  inline def scanMerge_TU[T, U](pairs: js.Array[js.Tuple2[Stream[T], js.Function2[/* acc */ U, /* value */ T, U]]], acc: U): Stream[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanMerge")(pairs.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Stream[U]]
  
  // tslint:disable-line unified-signatures
  @js.native
  trait Stream[T] extends StObject {
    
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
    /** A co-dependent stream that unregisters dependent streams when set to true. */
    @JSName("end")
    var end_Original: Stream[Boolean] = js.native
    
    /** Creates a dependent stream whose value is set to the result of the callback function. */
    def map[U](
      f: js.Function1[
          /* current */ T, 
          U | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stream.SKIP */ Any)
        ]
    ): Stream[U] = js.native
    
    /** This method is functionally identical to stream. It exists to conform to Fantasy Land's Applicative specification. */
    def of(`val`: T): Stream[T] = js.native
    
    /** When a stream is passed as the argument to JSON.stringify(), the value of the stream is serialized. */
    def toJSON(): String = js.native
  }
}
