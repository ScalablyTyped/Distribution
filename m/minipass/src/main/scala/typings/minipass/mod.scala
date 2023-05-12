package typings.minipass

import typings.minipass.minipassBooleans.`true`
import typings.minipass.minipassStrings.buffer
import typings.minipass.minipassStrings.close
import typings.minipass.minipassStrings.data
import typings.minipass.minipassStrings.drain
import typings.minipass.minipassStrings.end
import typings.minipass.minipassStrings.error
import typings.minipass.minipassStrings.finish
import typings.minipass.minipassStrings.prefinish
import typings.minipass.minipassStrings.resume
import typings.minipass.mod.Minipass.DualIterable
import typings.minipass.mod.Minipass.Encoding
import typings.minipass.mod.Minipass.PipeOptions
import typings.minipass.mod.Minipass.Writable
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import typings.std.AbortSignal
import typings.std.ArrayBufferLike
import typings.std.AsyncIterable
import typings.std.Generator
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minipass", "Minipass")
  @js.native
  open class Minipass[RType /* <: Any */, WType /* <: Any */] protected ()
    extends Stream
       with DualIterable[RType] {
    // setEncoding(encoding: Encoding): void
    // Options required if not reading buffers
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type RType extends Buffer ? [] | [Minipass.Options<RType>] : [Minipass.Options<RType>] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: RType extends node.buffer.<global>.Buffer ? [] | [minipass.minipass.Minipass.Options<RType>] : [minipass.minipass.Minipass.Options<RType>] */ js.Any) = this()
    
    val aborted: Boolean = js.native
    
    /**
      * alias for on()
      */
    def addEventHandler(event: String, listener: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    
    var async: Boolean = js.native
    
    val bufferLength: Double = js.native
    
    def collect(): js.Promise[js.Array[RType]] = js.native
    
    def concat(): /* import warning: importer.ImportType#apply Failed type conversion: RType extends minipass.minipass.Minipass.BufferOrString ? std.Promise<RType> : never */ js.Any = js.native
    
    def destroy(): Unit = js.native
    def destroy(er: Any): Unit = js.native
    
    val destroyed: Boolean = js.native
    
    val emittedEnd: Boolean = js.native
    
    /**
      * Note: encoding is not actually read-only, and setEncoding(enc)
      * exists. However, this type definition will insist that TypeScript
      * programs declare the type of a Minipass stream up front, and if
      * that type is string, then an encoding MUST be set in the ctor. If
      * the type is Buffer, then the encoding must be missing, or set to
      * 'buffer' or null. If the type is anything else, then objectMode
      * must be set in the constructor options.  So there is effectively
      * no allowed way that a TS program can set the encoding after
      * construction, as doing so will destroy any hope of type safety.
      * TypeScript does not provide many options for changing the type of
      * an object at run-time, which is what changing the encoding does.
      */
    val encoding: Encoding = js.native
    
    def end(): this.type = js.native
    def end(cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any): this.type = js.native
    def end(chunk: Any, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: Encoding): this.type = js.native
    def end(chunk: Any, encoding: Encoding, cb: js.Function0[Unit]): this.type = js.native
    
    val flowing: Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Minipass: js.Function0[Generator[RType, Unit, Unit]] = js.native
    
    /**
      * Technically writable, but mutating it can change the type,
      * so is not safe to do in TypeScript.
      */
    val objectMode: Boolean = js.native
    
    def on(
      event: typings.minipass.minipassStrings.readable | drain | resume | end | prefinish | finish | close,
      listener: js.Function0[Any]
    ): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ RType, Any]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Any, Any]): this.type = js.native
    
    def pause(): Unit = js.native
    
    val paused: Boolean = js.native
    
    def pipe[W /* <: Writable */](dest: W): W = js.native
    def pipe[W /* <: Writable */](dest: W, opts: PipeOptions): W = js.native
    
    def promise(): js.Promise[Unit] = js.native
    
    def read(): RType = js.native
    def read(size: Double): RType = js.native
    
    val readable: Boolean = js.native
    
    def resume(): Unit = js.native
    
    def unpipe[W /* <: Writable */](dest: W): Unit = js.native
    
    val writable: Boolean = js.native
    
    def write(chunk: WType): Boolean = js.native
    def write(chunk: WType, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: WType, encoding: Unit, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: WType, encoding: Encoding): Boolean = js.native
    def write(chunk: WType, encoding: Encoding, cb: js.Function0[Unit]): Boolean = js.native
  }
  /* static members */
  object Minipass {
    
    @JSImport("minipass", "Minipass")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isStream(stream: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    trait BufferOptions
      extends StObject
         with SharedOptions {
      
      var encoding: js.UndefOr[Null | buffer] = js.undefined
      
      var objectMode: js.UndefOr[Boolean] = js.undefined
    }
    object BufferOptions {
      
      inline def apply(): BufferOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BufferOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BufferOptions] (val x: Self) extends AnyVal {
        
        inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
        
        inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      }
    }
    
    type BufferOrString = Buffer | String
    
    type ContiguousData = Buffer | ArrayBufferLike | js.typedarray.ArrayBufferView | String
    
    @js.native
    trait DualIterable[T]
      extends StObject
         with Iterable[T]
         with AsyncIterable[T]
    
    type Encoding = BufferEncoding | buffer | Null
    
    trait ObjectModeOptions
      extends StObject
         with SharedOptions {
      
      var objectMode: `true`
    }
    object ObjectModeOptions {
      
      inline def apply(): ObjectModeOptions = {
        val __obj = js.Dynamic.literal(objectMode = true)
        __obj.asInstanceOf[ObjectModeOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ObjectModeOptions] (val x: Self) extends AnyVal {
        
        inline def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      }
    }
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      T extends string ? minipass.minipass.Minipass.StringOptions : T extends node.buffer.<global>.Buffer ? minipass.minipass.Minipass.BufferOptions : minipass.minipass.Minipass.ObjectModeOptions
      }}}
      */
    type Options[T] = StringOptions
    
    trait PipeOptions extends StObject {
      
      var end: js.UndefOr[Boolean] = js.undefined
      
      var proxyErrors: js.UndefOr[Boolean] = js.undefined
    }
    object PipeOptions {
      
      inline def apply(): PipeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PipeOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PipeOptions] (val x: Self) extends AnyVal {
        
        inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setProxyErrors(value: Boolean): Self = StObject.set(x, "proxyErrors", value.asInstanceOf[js.Any])
        
        inline def setProxyErrorsUndefined: Self = StObject.set(x, "proxyErrors", js.undefined)
      }
    }
    
    @js.native
    trait Readable extends EventEmitter {
      
      def pause(): Any = js.native
      
      def pipe(): Any = js.native
      
      def resume(): Any = js.native
    }
    
    trait SharedOptions extends StObject {
      
      var async: js.UndefOr[Boolean] = js.undefined
      
      var signal: js.UndefOr[AbortSignal] = js.undefined
    }
    object SharedOptions {
      
      inline def apply(): SharedOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SharedOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SharedOptions] (val x: Self) extends AnyVal {
        
        inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
        
        inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      }
    }
    
    trait StringOptions
      extends StObject
         with SharedOptions {
      
      var encoding: BufferEncoding
      
      var objectMode: js.UndefOr[Boolean] = js.undefined
    }
    object StringOptions {
      
      inline def apply(encoding: BufferEncoding): StringOptions = {
        val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
        __obj.asInstanceOf[StringOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StringOptions] (val x: Self) extends AnyVal {
        
        inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
        
        inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      }
    }
    
    @js.native
    trait Writable extends EventEmitter {
      
      def end(): Any = js.native
      
      def write(chunk: Any, args: Any*): Any = js.native
    }
  }
}
