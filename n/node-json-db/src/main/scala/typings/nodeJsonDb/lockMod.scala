package typings.nodeJsonDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockMod {
  
  @JSImport("node-json-db/dist/lock/Lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readLockAsync[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLockAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def readLockAsync[T](func: js.Function0[js.Promise[T]], timeout: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLockAsync")(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def writeLockAsync[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeLockAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def writeLockAsync[T](func: js.Function0[js.Promise[T]], timeout: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLockAsync")(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
