package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.OrthoNormalBasis")
@js.native
class OrthoNormalBasis protected ()
  extends typings.openjscad.CSG.OrthoNormalBasis {
  def this(plane: typings.openjscad.CSG.Plane) = this()
  def this(plane: typings.openjscad.CSG.Plane, rightvector: typings.openjscad.CSG.Vector3D) = this()
}
/* static members */
@JSGlobal("CSG.OrthoNormalBasis")
@js.native
object OrthoNormalBasis extends js.Object {
  
  def GetCartesian(xaxisid: String, yaxisid: String): typings.openjscad.CSG.OrthoNormalBasis = js.native
  
  def Z0Plane(): typings.openjscad.CSG.OrthoNormalBasis = js.native
}
