package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Csg extends js.Object {
  def fromCSG(csg: CSG, defaultColor: js.Any): Anon_BoundLen
  def getGeometryVertex(geometry: js.Any, vertex_position: js.Any): scala.Double
}

object Anon_Csg {
  @scala.inline
  def apply(
    fromCSG: js.Function2[CSG, js.Any, Anon_BoundLen],
    getGeometryVertex: js.Function2[js.Any, js.Any, scala.Double]
  ): Anon_Csg = {
    val __obj = js.Dynamic.literal(fromCSG = fromCSG, getGeometryVertex = getGeometryVertex)
  
    __obj.asInstanceOf[Anon_Csg]
  }
}

