package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base
@JSGlobal("naver.maps.Point")
@js.native
class Point protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  def add(point: Coord | PointLiteral): Point = js.native
  def add(x: scala.Double, y: scala.Double): Point = js.native
  def ceil(): Point = js.native
  def div(point: Coord | PointLiteral): scala.Unit = js.native
  def div(x: scala.Double, y: scala.Double): Point = js.native
  def equals(point: Point): scala.Boolean = js.native
  def floor(): Point = js.native
  def mul(point: Coord | PointLiteral): Point = js.native
  def mul(x: scala.Double, y: scala.Double): Point = js.native
  def round(): Point = js.native
  def sub(point: Coord | PointLiteral): Point = js.native
  def sub(x: scala.Double, y: scala.Double): Point = js.native
}

