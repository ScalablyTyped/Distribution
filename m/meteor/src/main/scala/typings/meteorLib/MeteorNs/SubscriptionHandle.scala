package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** utils **/

/** Pub/Sub **/

trait SubscriptionHandle extends js.Object {
  def ready(): scala.Boolean
  def stop(): scala.Unit
}

