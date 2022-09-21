package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "GesturePointList")
@js.native
open class GesturePointList protected () extends StObject {
  def this(`type`: String) = this()
  
  def add(gesturePoint: GesturePoint): Double = js.native
  
  def addContact(): Unit = js.native
  
  def asArray(): js.Array[GesturePoint] = js.native
  
  var buttons: js.Array[Button] = js.native
  
  var captureCount: Double = js.native
  
  var clicks: Double = js.native
  
  var contacts: Double = js.native
  
  def getById(id: Double): GesturePoint | Null = js.native
  
  def getByIndex(index: Double): GesturePoint | Null = js.native
  
  def getLength(): Double = js.native
  
  def getPrimary(): GesturePoint | Null = js.native
  
  def removeById(id: Double): Double = js.native
  
  def removeContact(): Unit = js.native
  
  var `type`: String = js.native
}
