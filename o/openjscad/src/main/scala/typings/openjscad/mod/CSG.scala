package typings.openjscad.mod

import typings.openjscad.anon.BoundLen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "CSG")
@js.native
object CSG extends js.Object {
  
  def fromCSG(csg: typings.openjscad.CSG, defaultColor: js.Any): BoundLen = js.native
  
  def getGeometryVertex(geometry: js.Any, vertex_position: js.Any): Double = js.native
}
