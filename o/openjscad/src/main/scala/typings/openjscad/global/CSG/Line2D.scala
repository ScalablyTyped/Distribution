package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Line2D")
@js.native
class Line2D protected ()
  extends typings.openjscad.CSG.Line2D {
  def this(normal: typings.openjscad.CSG.Vector2D, w: Double) = this()
}
/* static members */
@JSGlobal("CSG.Line2D")
@js.native
object Line2D extends js.Object {
  
  def fromPoints(p1: typings.openjscad.CSG.Vector2D, p2: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Line2D = js.native
}
