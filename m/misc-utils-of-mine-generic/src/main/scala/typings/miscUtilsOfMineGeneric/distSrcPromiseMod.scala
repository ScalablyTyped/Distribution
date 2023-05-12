package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.pending
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.rejected
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPromiseMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/promise", "Deferred")
  @js.native
  open class Deferred[R, J] () extends StObject {
    def this(callback: js.ThisFunction2[
            /* this */ Deferred[R, J], 
            /* resolve */ js.Function1[/* r */ R, Unit], 
            /* reject */ js.UndefOr[js.Function1[/* r */ J, Unit]], 
            Unit
          ]) = this()
    
    def `catch`(r: js.Function1[/* reject */ J, Unit]): js.Promise[Unit | R] = js.native
    
    /* private */ var promise: Any = js.native
    
    def reject(r: J): Unit = js.native
    
    def resolve(r: R): Unit = js.native
    
    var status: resolved | pending | rejected = js.native
    
    def `then`(resolve: js.Function1[/* r */ R, Unit]): js.Promise[Unit] = js.native
  }
  
  inline def asyncForEach(array: js.Array[Any], callback: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncForEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def asyncMap[T, R](
    array: js.Array[T],
    callback: js.Function3[/* t */ T, /* i */ Double, /* a */ js.Array[T], js.Promise[R]]
  ): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncMap")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  
  inline def serial[T](p: js.Array[js.Function0[js.Promise[T]]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("serial")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
}
