package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Plane")
@js.native
class Plane protected ()
  extends typings.openjscad.CSG.Plane {
  def this(normal: typings.openjscad.CSG.Vector3D, w: Double) = this()
}
/* static members */
@JSGlobal("CSG.Plane")
@js.native
object Plane extends js.Object {
  
  var EPSILON: Double = js.native
  
  def anyPlaneFromVector3Ds(
    a: typings.openjscad.CSG.Vector3D,
    b: typings.openjscad.CSG.Vector3D,
    c: typings.openjscad.CSG.Vector3D
  ): typings.openjscad.CSG.Plane = js.native
  
  def fromNormalAndPoint(normal: js.Array[Double], point: js.Array[Double]): typings.openjscad.CSG.Plane = js.native
  def fromNormalAndPoint(normal: typings.openjscad.CSG.Vector3D, point: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Plane = js.native
  
  def fromObject(obj: js.Any): typings.openjscad.CSG.Plane = js.native
  
  def fromPoints(
    a: typings.openjscad.CSG.Vector3D,
    b: typings.openjscad.CSG.Vector3D,
    c: typings.openjscad.CSG.Vector3D
  ): typings.openjscad.CSG.Plane = js.native
  
  def fromVector3Ds(
    a: typings.openjscad.CSG.Vector3D,
    b: typings.openjscad.CSG.Vector3D,
    c: typings.openjscad.CSG.Vector3D
  ): typings.openjscad.CSG.Plane = js.native
}
