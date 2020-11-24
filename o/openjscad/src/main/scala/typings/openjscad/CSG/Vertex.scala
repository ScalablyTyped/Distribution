package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertex extends CxG {
  
  def flipped(): Vertex = js.native
  
  def getTag(): Double = js.native
  
  def interpolate(other: Vertex, t: Double): Vertex = js.native
  
  var pos: Vector3D = js.native
  
  var tag: Double = js.native
}
