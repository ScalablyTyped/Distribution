package typings.parchment

import typings.parchment.linkedNodeMod.LinkedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedListMod {
  
  @JSImport("parchment/dist/typings/collection/linked-list", JSImport.Default)
  @js.native
  open class default[T /* <: LinkedNode */] ()
    extends StObject
       with LinkedList[T]
  
  @js.native
  trait LinkedList[T /* <: LinkedNode */] extends StObject {
    
    def append(nodes: T*): Unit = js.native
    
    def at(index: Double): T | Null = js.native
    
    def contains(node: T): Boolean = js.native
    
    def find(index: Double): js.Tuple2[T | Null, Double] = js.native
    def find(index: Double, inclusive: Boolean): js.Tuple2[T | Null, Double] = js.native
    
    def forEach(callback: js.Function1[/* cur */ T, Unit]): Unit = js.native
    
    def forEachAt(
      index: Double,
      length: Double,
      callback: js.Function3[/* cur */ T, /* offset */ Double, /* length */ Double, Unit]
    ): Unit = js.native
    
    var head: T | Null = js.native
    
    def indexOf(node: T): Double = js.native
    
    def insertBefore(): Unit = js.native
    def insertBefore(node: T): Unit = js.native
    def insertBefore(node: T, refNode: T): Unit = js.native
    def insertBefore(node: Null, refNode: T): Unit = js.native
    
    def iterator(): js.Function0[T | Null] = js.native
    def iterator(curNode: T): js.Function0[T | Null] = js.native
    
    var length: Double = js.native
    
    def map(callback: js.Function1[/* cur */ T, Any]): js.Array[Any] = js.native
    
    def offset(target: T): Double = js.native
    
    def reduce[M](callback: js.Function2[/* memo */ M, /* cur */ T, M], memo: M): M = js.native
    
    def remove(node: T): Unit = js.native
    
    var tail: T | Null = js.native
  }
}
