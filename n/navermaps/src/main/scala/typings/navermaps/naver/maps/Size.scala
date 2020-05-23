package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  def add(size: Size): Size = js.native
  def add(size: SizeLiteral): Size = js.native
  def add(width: Double, height: Double): Size = js.native
  def ceil(): Size = js.native
  def div(size: Size): Size = js.native
  def div(size: SizeLiteral): Size = js.native
  def div(width: Double, height: Double): Size = js.native
  def equals(size: Size): Boolean = js.native
  def equals(size: SizeLiteral): Boolean = js.native
  def floor(): Size = js.native
  def mul(size: Size): Size = js.native
  def mul(size: SizeLiteral): Size = js.native
  def mul(width: Double, height: Double): Size = js.native
  def round(): Size = js.native
  def sub(size: Size): Size = js.native
  def sub(size: SizeLiteral): Size = js.native
  def sub(width: Double, height: Double): Size = js.native
}

