package typings.openlayers.mod.proj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "proj.addEquivalentProjections")
@js.native
object addEquivalentProjections extends js.Object {
  
  /**
    * Registers transformation functions that don't alter coordinates. Those allow
    * to transform between projections with equal meaning.
    *
    * @param projections Projections.
    * @api
    */
  def apply(projections: js.Array[Projection]): Unit = js.native
}
