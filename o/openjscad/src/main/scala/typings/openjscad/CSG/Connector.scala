package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connector extends CxG {
  
  def axisLine(): Line3D = js.native
  
  var axisvector: Vector3D = js.native
  
  def extend(distance: Double): Connector = js.native
  
  def getTransformationTo(other: Connector, mirror: Boolean, normalrotation: Double): Matrix4x4 = js.native
  
  def normalized(): Connector = js.native
  
  var normalvector: Vector3D = js.native
  
  var point: Vector3D = js.native
}
