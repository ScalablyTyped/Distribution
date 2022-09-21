package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KVOArray
  extends StObject
     with KVO {
  
  def clear(): Unit = js.native
  
  def forEach(callback: js.Function2[/* element */ Any, /* index */ Double, Unit]): Unit = js.native
  
  def getArray(): js.Array[Any] = js.native
  
  def getAt(index: Double): Any = js.native
  
  def getIndexOfElement(element: Any): Double = js.native
  
  def getLength(): Double = js.native
  
  def insertAt(index: Double, element: Any): Unit = js.native
  
  def pop(): Any = js.native
  
  def push(element: Any): Double = js.native
  
  def removeAt(index: Double): Any = js.native
  
  def removeElement(element: Any): Unit = js.native
  
  def setAt(index: Double, element: Any): Unit = js.native
  
  def splice(startIndex: Double, deleteCount: Double): js.Array[Any] = js.native
  def splice(startIndex: Double, deleteCount: Double, element: Any): js.Array[Any] = js.native
}
