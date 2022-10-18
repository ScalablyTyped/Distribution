package typings.playcanvas.global.pc

import typings.playcanvas.mod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An infinite plane.
  *
  * @ignore
  */
@JSGlobal("pc.Plane")
@js.native
/**
  * Create a new Plane instance.
  *
  * @param {Vec3} [point] - Point position on the plane. The constructor takes a reference of
  * this parameter.
  * @param {Vec3} [normal] - Normal of the plane. The constructor takes a reference of this
  * parameter.
  */
open class Plane ()
  extends typings.playcanvas.mod.Plane {
  def this(point: Vec3) = this()
  def this(point: Unit, normal: Vec3) = this()
  def this(point: Vec3, normal: Vec3) = this()
}
