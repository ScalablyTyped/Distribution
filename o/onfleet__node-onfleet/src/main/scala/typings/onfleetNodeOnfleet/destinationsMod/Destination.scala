package typings.onfleetNodeOnfleet.destinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  def create(destination: CreateDestinationProps): js.Promise[OnfleetDestination]
  def get(id: String): js.Promise[OnfleetDestination]
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
}

