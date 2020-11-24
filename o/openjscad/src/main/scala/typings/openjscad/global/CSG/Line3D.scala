package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Line3D")
@js.native
class Line3D protected ()
  extends typings.openjscad.CSG.Line3D {
  def this(point: typings.openjscad.CSG.Vector3D, direction: typings.openjscad.CSG.Vector3D) = this()
}
/* static members */
@JSGlobal("CSG.Line3D")
@js.native
object Line3D extends js.Object {
  
  def fromPlanes(p1: typings.openjscad.CSG.Plane, p2: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Line3D = js.native
  
  def fromPoints(p1: typings.openjscad.CSG.Vector3D, p2: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Line3D = js.native
}
