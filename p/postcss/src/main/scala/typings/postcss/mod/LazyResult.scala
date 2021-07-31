package typings.postcss.mod

import typings.postcss.anon.FnCall
import typings.postcss.anon.FnCallOnrejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A promise proxy for the result of PostCSS transformations.
  */
trait LazyResult extends StObject {
  
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `catch`[TResult](): js.Promise[Result | TResult]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Result | TResult]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  @JSName("catch")
  var catch_Original: FnCallOnrejected
  
  /**
    * Alias for css property to use when syntaxes generate non-CSS output.
    */
  var content: String
  
  /**
    * Processes input CSS through synchronous plugins and converts Root to
    * CSS string. This property will only work with synchronous plugins. If
    * the processor contains any asynchronous plugins it will throw an error.
    * In this case, you should use LazyResult#then() instead.
    * @returns Result#css.
    */
  var css: String
  
  /**
    * Processes input CSS through synchronous plugins. This property will
    * work only with synchronous plugins. If processor contains any
    * asynchronous plugins it will throw an error. You should use
    * LazyResult#then() instead.
    */
  var map: ResultMap
  
  /**
    * Processes input CSS through synchronous plugins. This property will work
    * only with synchronous plugins. If processor contains any asynchronous
    * plugins it will throw an error. You should use LazyResult#then() instead.
    */
  var messages: js.Array[ResultMessage]
  
  /**
    * @returns Options from the Processor#process(css, opts) call that produced
    * this Result instance.
    */
  var opts: ResultOptions
  
  /**
    * @returns A processor used for CSS transformations.
    */
  var processor: Processor
  
  /**
    * Processes input CSS through synchronous plugins. This property will work
    * only with synchronous plugins. If processor contains any asynchronous
    * plugins it will throw an error. You should use LazyResult#then() instead.
    */
  var root: Root_
  
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Result, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Result, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2]
  /**
    * Processes input CSS through synchronous and asynchronous plugins.
    * @param onRejected Called if any plugin throws an error.
    */
  @JSName("then")
  var then_Original: FnCall
  
  /**
    * Processes input CSS through synchronous plugins and calls Result#warnings().
    * This property will only work with synchronous plugins. If the processor
    * contains any asynchronous plugins it will throw an error. In this case,
    * you should use LazyResult#then() instead.
    */
  def warnings(): js.Array[Warning]
}
object LazyResult {
  
  @scala.inline
  def apply(
    `catch`: FnCallOnrejected,
    content: String,
    css: String,
    map: ResultMap,
    messages: js.Array[ResultMessage],
    opts: ResultOptions,
    processor: Processor,
    root: Root_,
    `then`: FnCall,
    warnings: () => js.Array[Warning]
  ): LazyResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], warnings = js.Any.fromFunction0(warnings))
    __obj.updateDynamic("catch")(`catch`.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyResult]
  }
  
  @scala.inline
  implicit class LazyResultMutableBuilder[Self <: LazyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: FnCallOnrejected): Self = StObject.set(x, "catch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: ResultMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: js.Array[ResultMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: ResultMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setOpts(value: ResultOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessor(value: Processor): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Root_): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThen(value: FnCall): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: () => js.Array[Warning]): Self = StObject.set(x, "warnings", js.Any.fromFunction0(value))
  }
}
