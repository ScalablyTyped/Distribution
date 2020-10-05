package typings.mobx

import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/listen-utils", JSImport.Namespace)
@js.native
object listenUtilsMod extends js.Object {
  @js.native
  trait IListenable extends js.Object {
    var changeListeners: js.UndefOr[js.Array[js.Function]] = js.native
    def observe(handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit]): Lambda = js.native
    def observe(
      handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit],
      fireImmediately: Boolean
    ): Lambda = js.native
  }
  
  def hasListeners(listenable: IListenable): Boolean = js.native
  def notifyListeners[T](listenable: IListenable, change: T): Unit = js.native
  def registerListener(listenable: IListenable, handler: js.Function): Lambda = js.native
}

