package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundsFactory extends js.Object {
  
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {IBound} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  def contains(bounds: IBound, point: Vector): Boolean = js.native
  
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {IBound} A new bounds object
    */
  def create(vertices: Vertices): IBound = js.native
  
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {IBound} boundsA
    * @param {IBound} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  def overlaps(boundsA: IBound, boundsB: IBound): Boolean = js.native
  
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {IBound} bounds
    * @param {vector} position
    */
  def shift(bounds: IBound, position: Vector): Unit = js.native
  
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {IBound} bounds
    * @param {vector} vector
    */
  def translate(bounds: IBound, vector: Vector): Unit = js.native
  
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {IBound} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  def update(bounds: IBound, vertices: Vertices, velocity: Vector): Unit = js.native
}
object BoundsFactory {
  
  @scala.inline
  def apply(
    contains: (IBound, Vector) => Boolean,
    create: Vertices => IBound,
    overlaps: (IBound, IBound) => Boolean,
    shift: (IBound, Vector) => Unit,
    translate: (IBound, Vector) => Unit,
    update: (IBound, Vertices, Vector) => Unit
  ): BoundsFactory = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), create = js.Any.fromFunction1(create), overlaps = js.Any.fromFunction2(overlaps), shift = js.Any.fromFunction2(shift), translate = js.Any.fromFunction2(translate), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[BoundsFactory]
  }
  
  @scala.inline
  implicit class BoundsFactoryOps[Self <: BoundsFactory] (val x: Self) extends AnyVal {
    
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
    def setContains(value: (IBound, Vector) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreate(value: Vertices => IBound): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverlaps(value: (IBound, IBound) => Boolean): Self = this.set("overlaps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShift(value: (IBound, Vector) => Unit): Self = this.set("shift", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTranslate(value: (IBound, Vector) => Unit): Self = this.set("translate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (IBound, Vertices, Vector) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
  }
}
