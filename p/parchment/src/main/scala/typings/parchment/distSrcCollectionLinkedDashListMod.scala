package typings.parchment

import typings.parchment.distSrcCollectionLinkedDashListMod.LinkedList
import typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/collection/linked-list", JSImport.Namespace)
@js.native
object distSrcCollectionLinkedDashListMod extends js.Object {
  @js.native
  trait LinkedList[T /* <: LinkedNode */] extends js.Object {
    var head: T | Null = js.native
    var length: Double = js.native
    var tail: T | Null = js.native
    def append(nodes: T*): Unit = js.native
    def contains(node: T): Boolean = js.native
    def find(index: Double): js.Tuple2[T | Null, Double] = js.native
    def find(index: Double, inclusive: Boolean): js.Tuple2[T | Null, Double] = js.native
    def forEach(callback: js.Function1[/* cur */ T, Unit]): Unit = js.native
    def forEachAt(
      index: Double,
      length: Double,
      callback: js.Function3[/* cur */ T, /* offset */ Double, /* length */ Double, Unit]
    ): Unit = js.native
    def insertBefore(): Unit = js.native
    def insertBefore(node: T): Unit = js.native
    def insertBefore(node: T, refNode: T): Unit = js.native
    def insertBefore(node: Null, refNode: T): Unit = js.native
    def iterator(): js.Function0[T | Null] = js.native
    def iterator(curNode: T): js.Function0[T | Null] = js.native
    def map(callback: js.Function1[/* cur */ T | Null, _]): js.Array[_] = js.native
    def offset(target: T): Double = js.native
    def reduce[M](callback: js.Function2[/* memo */ M, /* cur */ T, M], memo: M): M = js.native
    def remove(node: T): Unit = js.native
  }
  
  @js.native
  class default[T /* <: LinkedNode */] () extends LinkedList[T]
  
}

