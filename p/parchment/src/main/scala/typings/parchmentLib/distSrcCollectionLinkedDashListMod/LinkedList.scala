package typings
package parchmentLib.distSrcCollectionLinkedDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedList[T /* <: parchmentLib.distSrcCollectionLinkedDashNodeMod.LinkedNode */] extends js.Object {
  var head: T | scala.Null = js.native
  var length: scala.Double = js.native
  var tail: T | scala.Null = js.native
  def append(nodes: T*): scala.Unit = js.native
  def contains(node: T): scala.Boolean = js.native
  def find(index: scala.Double): js.Tuple2[T | scala.Null, scala.Double] = js.native
  def find(index: scala.Double, inclusive: scala.Boolean): js.Tuple2[T | scala.Null, scala.Double] = js.native
  def forEach(callback: js.Function1[/* cur */ T, scala.Unit]): scala.Unit = js.native
  def forEachAt(
    index: scala.Double,
    length: scala.Double,
    callback: js.Function3[/* cur */ T, /* offset */ scala.Double, /* length */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def insertBefore(): scala.Unit = js.native
  def insertBefore(node: T): scala.Unit = js.native
  def insertBefore(node: T, refNode: T): scala.Unit = js.native
  def insertBefore(node: scala.Null, refNode: T): scala.Unit = js.native
  def iterator(): js.Function0[T | scala.Null] = js.native
  def iterator(curNode: T): js.Function0[T | scala.Null] = js.native
  def map(callback: js.Function1[/* cur */ T | scala.Null, _]): js.Array[_] = js.native
  def offset(target: T): scala.Double = js.native
  def reduce[M](callback: js.Function2[/* memo */ M, /* cur */ T, M], memo: M): M = js.native
  def remove(node: T): scala.Unit = js.native
}

