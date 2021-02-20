package typings.mobx

import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listenUtilsMod {
  
  @JSImport("mobx/lib/types/listen-utils", "hasListeners")
  @js.native
  def hasListeners(listenable: IListenable): Boolean = js.native
  
  @JSImport("mobx/lib/types/listen-utils", "notifyListeners")
  @js.native
  def notifyListeners[T](listenable: IListenable, change: T): Unit = js.native
  
  @JSImport("mobx/lib/types/listen-utils", "registerListener")
  @js.native
  def registerListener(listenable: IListenable, handler: js.Function): Lambda = js.native
  
  @js.native
  trait IListenable extends StObject {
    
    var changeListeners: js.UndefOr[js.Array[js.Function]] = js.native
    
    def observe(handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit]): Lambda = js.native
    def observe(
      handler: js.Function2[/* change */ js.Any, /* oldValue */ js.UndefOr[js.Any], Unit],
      fireImmediately: Boolean
    ): Lambda = js.native
  }
}
