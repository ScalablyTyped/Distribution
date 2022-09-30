package typings.mendixmodelsdk

import typings.mendixmodelsdk.commonMod.common.ICallback
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseOrCallbacksMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/promiseOrCallbacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ T, Unit], 
      /* reject */ js.Function1[/* err */ Any, Unit], 
      Unit
    ]
  ): js.Promise[T] | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseOrCallbacks")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T] | Unit]
  inline def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ T, Unit], 
      /* reject */ js.Function1[/* err */ Any, Unit], 
      Unit
    ],
    callback: Unit,
    errorCallback: IErrorCallback
  ): js.Promise[T] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseOrCallbacks")(action.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T] | Unit]
  inline def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ T, Unit], 
      /* reject */ js.Function1[/* err */ Any, Unit], 
      Unit
    ],
    callback: ICallback[T]
  ): js.Promise[T] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseOrCallbacks")(action.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T] | Unit]
  inline def promiseOrCallbacks[T](
    action: js.Function2[
      /* resolve */ js.Function1[/* result */ T, Unit], 
      /* reject */ js.Function1[/* err */ Any, Unit], 
      Unit
    ],
    callback: ICallback[T],
    errorCallback: IErrorCallback
  ): js.Promise[T] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseOrCallbacks")(action.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T] | Unit]
}
