package typings.phaser.global.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Math.CatmullRom")
@js.native
object CatmullRom extends js.Object {
  
  /**
    * Calculates a Catmull-Rom value from the given points, based on an alpha of 0.5.
    * @param t The amount to interpolate by.
    * @param p0 The first control point.
    * @param p1 The second control point.
    * @param p2 The third control point.
    * @param p3 The fourth control point.
    */
  def apply(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
}
