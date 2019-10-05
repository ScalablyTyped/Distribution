package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base
@JSGlobal("naver.maps.Point")
@js.native
class Point protected () extends Coord {
  def this(x: Double, y: Double) = this()
  def add(point: Coord): Point = js.native
  def add(point: PointLiteral): Point = js.native
  def add(x: Double, y: Double): Point = js.native
  def ceil(): Point = js.native
  def div(point: Coord): Unit = js.native
  def div(point: PointLiteral): Unit = js.native
  def div(x: Double, y: Double): Point = js.native
  def equals(point: Point): Boolean = js.native
  def floor(): Point = js.native
  def mul(point: Coord): Point = js.native
  def mul(point: PointLiteral): Point = js.native
  def mul(x: Double, y: Double): Point = js.native
  def round(): Point = js.native
  def sub(point: Coord): Point = js.native
  def sub(point: PointLiteral): Point = js.native
  def sub(x: Double, y: Double): Point = js.native
}

