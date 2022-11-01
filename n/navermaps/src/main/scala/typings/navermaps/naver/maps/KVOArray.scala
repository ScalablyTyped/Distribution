package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * KVOArray
  */
@js.native
trait KVOArray[T]
  extends StObject
     with KVO {
  
  def clear(): Unit = js.native
  
  def forEach(callback: js.Function2[/* element */ T, /* index */ Double, Unit]): Unit = js.native
  
  def getArray(): js.Array[T] = js.native
  
  def getAt(index: Double): T = js.native
  
  def getIndexOfElement(element: T): Double = js.native
  
  def getLength(): Double = js.native
  
  def insertAt(index: Double, element: T): Unit = js.native
  
  def pop(): T = js.native
  
  def push(element: T): Double = js.native
  
  def removeAt(index: Double): T = js.native
  
  def removeElement(element: T): Unit = js.native
  
  def setAt(index: Double, element: T): Unit = js.native
  
  def splice(startIndex: Double, deleteCount: Double, newElement: T*): js.Array[T] = js.native
}
