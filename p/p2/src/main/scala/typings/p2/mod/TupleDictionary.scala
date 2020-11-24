package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "TupleDictionary")
@js.native
class TupleDictionary () extends js.Object {
  
  def copy(dict: TupleDictionary): Unit = js.native
  
  var data: js.Any = js.native
  
  def get(i: Double, j: Double): Double = js.native
  
  def getByKey(key: Double): js.Any = js.native
  
  def getKey(id1: Double, id2: Double): String = js.native
  
  var keys: js.Array[Double] = js.native
  
  def reset(): Unit = js.native
  
  def set(i: Double, j: Double, value: Double): Double = js.native
}
