package typings.opentelemetryInstrumentation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isWrapped(func: Any): /* is @opentelemetry/instrumentation.@opentelemetry/instrumentation/build/src/types.ShimWrapped */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrapped")(func.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/instrumentation.@opentelemetry/instrumentation/build/src/types.ShimWrapped */ Boolean]
  
  inline def safeExecuteInTheMiddle[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddle")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def safeExecuteInTheMiddle[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit],
    preventThrowingError: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddle")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any], preventThrowingError.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def safeExecuteInTheMiddleAsync[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddleAsync")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def safeExecuteInTheMiddleAsync[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit],
    preventThrowingError: Boolean
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddleAsync")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any], preventThrowingError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
