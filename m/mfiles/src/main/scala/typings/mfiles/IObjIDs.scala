package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjIDs extends js.Object {
  
  def Add(Index: Double, ObjID: IObjID): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjID = js.native
  def Item(Index: Double, value: IObjID): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def ToJSON(): String = js.native
}
