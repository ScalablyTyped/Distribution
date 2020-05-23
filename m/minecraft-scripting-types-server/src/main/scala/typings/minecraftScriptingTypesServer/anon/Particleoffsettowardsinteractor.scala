package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Particleoffsettowardsinteractor extends js.Object {
  /**
    * Whether or not the particle will appear closer to who performed the interaction
    * @default false
    */
  var particle_offset_towards_interactor: Boolean
  /**
    * The type of particle that will be spawned
    */
  var particle_type: String
  /**
    * Will offset the particle this amount in the y direction
    * @default 0.0
    */
  var particle_y_offset: Double
}

object Particleoffsettowardsinteractor {
  @scala.inline
  def apply(particle_offset_towards_interactor: Boolean, particle_type: String, particle_y_offset: Double): Particleoffsettowardsinteractor = {
    val __obj = js.Dynamic.literal(particle_offset_towards_interactor = particle_offset_towards_interactor.asInstanceOf[js.Any], particle_type = particle_type.asInstanceOf[js.Any], particle_y_offset = particle_y_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Particleoffsettowardsinteractor]
  }
}

