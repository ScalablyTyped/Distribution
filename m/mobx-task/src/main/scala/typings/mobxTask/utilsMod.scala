package typings.mobxTask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx-task/lib/utils", "promiseTry")
  @js.native
  def promiseTry[R](fn: js.Function0[R]): js.Promise[_ | R] = js.native
  
  @JSImport("mobx-task/lib/utils", "proxyGetters")
  @js.native
  def proxyGetters[T, U](target: T, obj: U, keys: js.Array[/* keyof U */ String]): Unit = js.native
}
