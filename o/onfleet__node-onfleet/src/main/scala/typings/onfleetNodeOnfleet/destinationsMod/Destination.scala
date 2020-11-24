package typings.onfleetNodeOnfleet.destinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends js.Object {
  
  def create(destination: CreateDestinationProps): js.Promise[OnfleetDestination] = js.native
  
  def get(id: String): js.Promise[OnfleetDestination] = js.native
}
object Destination {
  
  @scala.inline
  def apply(
    create: CreateDestinationProps => js.Promise[OnfleetDestination],
    get: String => js.Promise[OnfleetDestination]
  ): Destination = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: CreateDestinationProps => js.Promise[OnfleetDestination]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Promise[OnfleetDestination]): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
