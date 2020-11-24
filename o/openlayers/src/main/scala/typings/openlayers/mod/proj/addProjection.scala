package typings.openlayers.mod.proj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "proj.addProjection")
@js.native
object addProjection extends js.Object {
  
  /**
    * Add a Projection object to the list of supported projections that can be
    * looked up by their code.
    *
    * @param projection Projection instance.
    * @api stable
    */
  def apply(projection: Projection): Unit = js.native
}
