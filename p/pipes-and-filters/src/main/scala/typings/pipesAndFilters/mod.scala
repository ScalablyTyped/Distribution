package typings.pipesAndFilters

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pipes-and-filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pipes-and-filters", "Pipeline")
  @js.native
  open class Pipeline[TInput, TOutput] () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def breakIf(predicate: Predicate[Any]): Pipeline[TInput, TOutput] = js.native
    
    def execute(input: TInput, done: NextFunction[TOutput]): Unit = js.native
    
    def use(filter: Filter[Any, Any]): Pipeline[TInput, TOutput] = js.native
    def use(filter: Filter[Any, Any], context: Any): Pipeline[TInput, TOutput] = js.native
    
    def wireupEvents(done: NextFunction[TOutput]): Unit = js.native
  }
  /* static members */
  object Pipeline {
    
    @JSImport("pipes-and-filters", "Pipeline")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pipes-and-filters", "Pipeline.break")
    @js.native
    def break: Any = js.native
    
    inline def breakIf(predicate: Predicate[Any]): Filter[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("breakIf")(predicate.asInstanceOf[js.Any]).asInstanceOf[Filter[Any, Any]]
    
    inline def break_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("break")(x.asInstanceOf[js.Any])
  }
  
  inline def breakIf(predicate: Predicate[Any]): Filter[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("breakIf")(predicate.asInstanceOf[js.Any]).asInstanceOf[Filter[Any, Any]]
  
  inline def create[TInput, TOutput](name: String): Pipeline[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Pipeline[TInput, TOutput]]
  
  type Filter[TInput, TOutput] = js.Function2[/* input */ TInput, /* next */ NextFunction[TOutput], Unit]
  
  type NextFunction[TOutput] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[TOutput], Unit]
  
  type Predicate[TInput] = js.Function1[/* input */ TInput, Boolean]
}
