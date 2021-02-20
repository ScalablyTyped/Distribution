package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionOptions[C /* <: IClient */] extends StObject {
  
  var direct: js.UndefOr[Boolean] = js.native
  
  var onLost: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ ILostContext[C], Unit]] = js.native
}
object IConnectionOptions {
  
  @scala.inline
  def apply[C /* <: IClient */](): IConnectionOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionOptions[C]]
  }
  
  @scala.inline
  implicit class IConnectionOptionsMutableBuilder[Self <: IConnectionOptions[_], C /* <: IClient */] (val x: Self with IConnectionOptions[C]) extends AnyVal {
    
    @scala.inline
    def setDirect(value: Boolean): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
    
    @scala.inline
    def setOnLost(value: (/* err */ js.Any, /* e */ ILostContext[C]) => Unit): Self = StObject.set(x, "onLost", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLostUndefined: Self = StObject.set(x, "onLost", js.undefined)
  }
}
