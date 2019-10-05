package typings.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Snap")
@js.native
object Snap extends js.Object {
  /**
    * Snap a value to nearest grid slice, using ceil.
    * 
    * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `15`.
    * As will `14` snap to `15`... but `16` will snap to `20`.
    * @param value The value to snap.
    * @param gap The interval gap of the grid.
    * @param start Optional starting offset for gap. Default 0.
    * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
    */
  def Ceil(value: Double, gap: Double): Double = js.native
  def Ceil(value: Double, gap: Double, start: Double): Double = js.native
  def Ceil(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
  /**
    * Snap a value to nearest grid slice, using floor.
    * 
    * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `10`.
    * As will `14` snap to `10`... but `16` will snap to `15`.
    * @param value The value to snap.
    * @param gap The interval gap of the grid.
    * @param start Optional starting offset for gap. Default 0.
    * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
    */
  def Floor(value: Double, gap: Double): Double = js.native
  def Floor(value: Double, gap: Double, start: Double): Double = js.native
  def Floor(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
  /**
    * Snap a value to nearest grid slice, using rounding.
    * 
    * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `10` whereas `14` will snap to `15`.
    * @param value The value to snap.
    * @param gap The interval gap of the grid.
    * @param start Optional starting offset for gap. Default 0.
    * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
    */
  def To(value: Double, gap: Double): Double = js.native
  def To(value: Double, gap: Double, start: Double): Double = js.native
  def To(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
}

