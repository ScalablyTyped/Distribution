package typings.next.routeLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteLoader extends js.Object {
  
  def loadRoute(route: String): js.Promise[RouteLoaderEntry] = js.native
  
  def onEntrypoint(route: String, execute: js.Function0[_]): Unit = js.native
  
  def prefetch(route: String): js.Promise[Unit] = js.native
  
  def whenEntrypoint(route: String): js.Promise[RouteEntrypoint] = js.native
}
object RouteLoader {
  
  @scala.inline
  def apply(
    loadRoute: String => js.Promise[RouteLoaderEntry],
    onEntrypoint: (String, js.Function0[_]) => Unit,
    prefetch: String => js.Promise[Unit],
    whenEntrypoint: String => js.Promise[RouteEntrypoint]
  ): RouteLoader = {
    val __obj = js.Dynamic.literal(loadRoute = js.Any.fromFunction1(loadRoute), onEntrypoint = js.Any.fromFunction2(onEntrypoint), prefetch = js.Any.fromFunction1(prefetch), whenEntrypoint = js.Any.fromFunction1(whenEntrypoint))
    __obj.asInstanceOf[RouteLoader]
  }
  
  @scala.inline
  implicit class RouteLoaderOps[Self <: RouteLoader] (val x: Self) extends AnyVal {
    
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
    def setLoadRoute(value: String => js.Promise[RouteLoaderEntry]): Self = this.set("loadRoute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEntrypoint(value: (String, js.Function0[_]) => Unit): Self = this.set("onEntrypoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrefetch(value: String => js.Promise[Unit]): Self = this.set("prefetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhenEntrypoint(value: String => js.Promise[RouteEntrypoint]): Self = this.set("whenEntrypoint", js.Any.fromFunction1(value))
  }
}
