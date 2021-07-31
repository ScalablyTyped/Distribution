package typings.obeliskJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "Point3D")
@js.native
class Point3D () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  
  def toGlobalCoordinates(): Point = js.native
  def toGlobalCoordinates(offset: Point): Point = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
