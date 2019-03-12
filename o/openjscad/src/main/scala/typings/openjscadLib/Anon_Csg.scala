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
  def apply(fromCSG: (CSG, js.Any) => Anon_BoundLen, getGeometryVertex: (js.Any, js.Any) => scala.Double): Anon_Csg = {
    val __obj = js.Dynamic.literal(fromCSG = js.Any.fromFunction2(fromCSG), getGeometryVertex = js.Any.fromFunction2(getGeometryVertex))
  
    __obj.asInstanceOf[Anon_Csg]
  }
}

