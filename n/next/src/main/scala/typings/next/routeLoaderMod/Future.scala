package typings.next.routeLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Future[V] extends js.Object {
  
  var future: js.Promise[V] = js.native
  
  def resolve(entrypoint: V): Unit = js.native
}
object Future {
  
  @scala.inline
  def apply[V](future: js.Promise[V], resolve: V => Unit): Future[V] = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Future[V]]
  }
  
  @scala.inline
  implicit class FutureOps[Self <: Future[_], V] (val x: Self with Future[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFuture(value: js.Promise[V]): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: V => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
}
