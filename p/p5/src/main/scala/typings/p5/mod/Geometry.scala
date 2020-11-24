package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends js.Object {
  
  /**
    *   Averages the vertex normals. Used in curved
    *   surfaces
    *   @chainable
    */
  def averageNormals(): Geometry = js.native
  
  /**
    *   Averages pole normals. Used in spherical
    *   primitives
    *   @chainable
    */
  def averagePoleNormals(): Geometry = js.native
  
  def computeFaces(): Geometry = js.native
  
  /**
    *   computes smooth normals per vertex as an average
    *   of each face.
    *   @chainable
    */
  def computeNormals(): Geometry = js.native
  
  /**
    *   Modifies all vertices to be centered within the
    *   range -100 to 100.
    *   @chainable
    */
  def normalize(): Geometry = js.native
}
object Geometry {
  
  @scala.inline
  def apply(
    averageNormals: () => Geometry,
    averagePoleNormals: () => Geometry,
    computeFaces: () => Geometry,
    computeNormals: () => Geometry,
    normalize: () => Geometry
  ): Geometry = {
    val __obj = js.Dynamic.literal(averageNormals = js.Any.fromFunction0(averageNormals), averagePoleNormals = js.Any.fromFunction0(averagePoleNormals), computeFaces = js.Any.fromFunction0(computeFaces), computeNormals = js.Any.fromFunction0(computeNormals), normalize = js.Any.fromFunction0(normalize))
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAverageNormals(value: () => Geometry): Self = this.set("averageNormals", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAveragePoleNormals(value: () => Geometry): Self = this.set("averagePoleNormals", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeFaces(value: () => Geometry): Self = this.set("computeFaces", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeNormals(value: () => Geometry): Self = this.set("computeNormals", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalize(value: () => Geometry): Self = this.set("normalize", js.Any.fromFunction0(value))
  }
}
