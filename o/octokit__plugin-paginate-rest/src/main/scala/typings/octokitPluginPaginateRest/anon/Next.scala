package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Next extends StObject {
  
  def next(): js.Promise[Done | Value] = js.native
}
object Next {
  
  @scala.inline
  def apply(next: () => js.Promise[Done | Value]): Next = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: () => js.Promise[Done | Value]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
