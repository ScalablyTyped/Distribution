package typings.postcss

import typings.postcss.anon.FnCall
import typings.postcss.anon.FnCallOnfinally
import typings.postcss.anon.FnCallOnrejected
import typings.postcss.libResultMod.Message
import typings.postcss.libResultMod.ResultOptions
import typings.postcss.mod.SourceMap
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLazyResultMod {
  
  @JSImport("postcss/lib/lazy-result", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LazyResult {
    /**
      * @param processor Processor used for this transformation.
      * @param css       CSS to parse and transform.
      * @param opts      Options from the `Processor#process` or `Root#toResult`.
      */
    def this(processor: typings.postcss.libProcessorMod.default, css: String, opts: ResultOptions) = this()
  }
  
  @js.native
  trait LazyResult
    extends StObject
       with PromiseLike[typings.postcss.libResultMod.default] {
    
    /**
      * Run plugin in async way and return `Result`.
      *
      * @return Result with output content.
      */
    def async(): js.Promise[typings.postcss.libResultMod.default] = js.native
    
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls onRejected for each error thrown in any plugin.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css).then(result => {
      *   console.log(result.css)
      * }).catch(error => {
      *   console.error(error)
      * })
      * ```
      */
    def `catch`[TResult](): js.Promise[typings.postcss.libResultMod.default | TResult] = js.native
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls onRejected for each error thrown in any plugin.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css).then(result => {
      *   console.log(result.css)
      * }).catch(error => {
      *   console.error(error)
      * })
      * ```
      */
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[typings.postcss.libResultMod.default | TResult] = js.native
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls onRejected for each error thrown in any plugin.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css).then(result => {
      *   console.log(result.css)
      * }).catch(error => {
      *   console.error(error)
      * })
      * ```
      */
    @JSName("catch")
    var catch_Original: FnCallOnrejected = js.native
    
    /**
      * An alias for the `css` property. Use it with syntaxes
      * that generate non-CSS output.
      *
      * This property will only work with synchronous plugins.
      * If the processor contains any asynchronous plugins
      * it will throw an error.
      *
      * PostCSS runners should always use `LazyResult#then`.
      */
    def content: String = js.native
    
    /**
      * Processes input CSS through synchronous plugins, converts `Root`
      * to a CSS string and returns `Result#css`.
      *
      * This property will only work with synchronous plugins.
      * If the processor contains any asynchronous plugins
      * it will throw an error.
      *
      * PostCSS runners should always use `LazyResult#then`.
      */
    def css: String = js.native
    
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls onFinally on any error or when all plugins will finish work.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css).finally(() => {
      *   console.log('processing ended')
      * })
      * ```
      */
    def `finally`(): js.Promise[typings.postcss.libResultMod.default] = js.native
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls onFinally on any error or when all plugins will finish work.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css).finally(() => {
      *   console.log('processing ended')
      * })
      * ```
      */
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[typings.postcss.libResultMod.default] = js.native
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls onFinally on any error or when all plugins will finish work.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css).finally(() => {
      *   console.log('processing ended')
      * })
      * ```
      */
    @JSName("finally")
    var finally_Original: FnCallOnfinally = js.native
    
    /**
      * Returns the default string description of an object.
      * Required to implement the Promise interface.
      */
    var get: Any = js.native
    
    /**
      * Processes input CSS through synchronous plugins
      * and returns `Result#map`.
      *
      * This property will only work with synchronous plugins.
      * If the processor contains any asynchronous plugins
      * it will throw an error.
      *
      * PostCSS runners should always use `LazyResult#then`.
      */
    def map: SourceMap = js.native
    
    /**
      * Processes input CSS through synchronous plugins
      * and returns `Result#messages`.
      *
      * This property will only work with synchronous plugins. If the processor
      * contains any asynchronous plugins it will throw an error.
      *
      * PostCSS runners should always use `LazyResult#then`.
      */
    def messages: js.Array[Message] = js.native
    
    /**
      * Options from the `Processor#process` call.
      */
    def opts: ResultOptions = js.native
    
    /**
      * Returns a `Processor` instance, which will be used
      * for CSS transformations.
      */
    def processor: typings.postcss.libProcessorMod.default = js.native
    
    /**
      * Processes input CSS through synchronous plugins
      * and returns `Result#root`.
      *
      * This property will only work with synchronous plugins. If the processor
      * contains any asynchronous plugins it will throw an error.
      *
      * PostCSS runners should always use `LazyResult#then`.
      */
    def root: typings.postcss.libRootMod.default = js.native
    
    /**
      * Run plugin in sync way and return `Result`.
      *
      * @return Result with output content.
      */
    def sync(): typings.postcss.libResultMod.default = js.native
    
    /**
      * Processes input CSS through synchronous and asynchronous plugins
      * and calls `onFulfilled` with a Result instance. If a plugin throws
      * an error, the `onRejected` callback will be executed.
      *
      * It implements standard Promise API.
      *
      * ```js
      * postcss([autoprefixer]).process(css, { from: cssPath }).then(result => {
      *   console.log(result.css)
      * })
      * ```
      */
    @JSName("then")
    var then_Original: FnCall = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * Processes input CSS through synchronous plugins
      * and calls `Result#warnings`.
      *
      * @return Warnings from plugins.
      */
    def warnings(): js.Array[typings.postcss.libWarningMod.default] = js.native
  }
}
