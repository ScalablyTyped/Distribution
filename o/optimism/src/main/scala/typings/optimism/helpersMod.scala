package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("optimism/lib/helpers", "maybeUnsubscribe")
  @js.native
  def maybeUnsubscribe(entryOrDep: Unsubscribable): Unit = js.native
  
  @js.native
  trait Unsubscribable extends StObject {
    
    var unsubscribe: js.UndefOr[Unit | js.Function0[_]] = js.native
  }
  object Unsubscribable {
    
    @scala.inline
    def apply(): Unsubscribable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Unsubscribable]
    }
    
    @scala.inline
    implicit class UnsubscribableMutableBuilder[Self <: Unsubscribable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: Unit | js.Function0[_]): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribeFunction0(value: () => _): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnsubscribeUndefined: Self = StObject.set(x, "unsubscribe", js.undefined)
    }
  }
}
