package typings.mobx

import typings.mobx.distApiAnnotationMod.Annotation
import typings.std.AsyncGenerator
import typings.std.Generator
import typings.std.Promise
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiFlowMod {
  
  @JSImport("mobx/dist/api/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/api/flow", "FLOW")
  @js.native
  val FLOW__ : /* "flow" */ String = js.native
  
  object FlowCancellationError {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("mobx/dist/api/flow", "FlowCancellationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/dist/api/flow", "FlowCancellationError.prototype")
    @js.native
    def prototype: Any = js.native
    inline def prototype_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx/dist/api/flow", "flow")
  @js.native
  val flow: Flow_ = js.native
  
  inline def flowResult[T](result: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Generator<any, infer R, any> ? mobx.mobx/dist/api/flow.CancellablePromise<R> : T extends mobx.mobx/dist/api/flow.CancellablePromise<any> ? T : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flowResult")(result.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Generator<any, infer R, any> ? mobx.mobx/dist/api/flow.CancellablePromise<R> : T extends mobx.mobx/dist/api/flow.CancellablePromise<any> ? T : never */ js.Any]
  
  inline def isFlow(fn: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFlowCancellationError(error: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowCancellationError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait CancellablePromise[T]
    extends StObject
       with Promise[T] {
    
    def cancel(): Unit = js.native
  }
  
  @js.native
  trait Flow_
    extends PropertyDecorator
       with Annotation {
    
    def apply[R, Args /* <: js.Array[Any] */](generator: js.Function1[/* args */ Args, (Generator[Any, R, Any]) | (AsyncGenerator[Any, R, Any])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    
    def bound(target: js.Object, propertyKey: String): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    @JSName("bound")
    var bound_Original: Annotation & PropertyDecorator = js.native
  }
}
