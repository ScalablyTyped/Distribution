package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Particleoffsettowardsinteractor extends js.Object {
  /**
    * Whether or not the particle will appear closer to who performed the interaction
    * @default false
    */
  var particle_offset_towards_interactor: scala.Boolean
  /**
    * The type of particle that will be spawned
    */
  var particle_type: java.lang.String
  /**
    * Will offset the particle this amount in the y direction
    * @default 0.0
    */
  var particle_y_offset: scala.Double
}

object Anon_Particleoffsettowardsinteractor {
  @scala.inline
  def apply(
    particle_offset_towards_interactor: scala.Boolean,
    particle_type: java.lang.String,
    particle_y_offset: scala.Double
  ): Anon_Particleoffsettowardsinteractor = {
    val __obj = js.Dynamic.literal(particle_offset_towards_interactor = particle_offset_towards_interactor, particle_type = particle_type, particle_y_offset = particle_y_offset)
  
    __obj.asInstanceOf[Anon_Particleoffsettowardsinteractor]
  }
}

