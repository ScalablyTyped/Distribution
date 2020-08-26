package typings.mnemonist.mod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "set")
@js.native
object set extends js.Object {
  def add[T](a: Set[T], b: Set[T]): Unit = js.native
  def difference[T](a: Set[T], b: Set[T]): Set[T] = js.native
  def disjunct[T](a: Set[T], b: Set[T]): Unit = js.native
  def intersect[T](a: Set[T], b: Set[T]): Unit = js.native
  def intersection[T](set: Set[T]*): Set[T] = js.native
  def isSubset[T](a: Set[T], b: Set[T]): Boolean = js.native
  def isSuperset[T](a: Set[T], b: Set[T]): Boolean = js.native
  def subtract[T](a: Set[T], b: Set[T]): Unit = js.native
  def symmetricDifference[T](a: Set[T], b: Set[T]): Set[T] = js.native
  def union[T](set: Set[T]*): Set[T] = js.native
}

