package typings.powerRadix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerRadix extends js.Object {
  
  def toArray(targetRadix: js.Array[String]): js.Array[String] = js.native
  /**
    * Convert to target radix, return as Array
    * @param targetRadix - target radix / encoding characters
    * @return  source digits converted to target radix presented in format of Array
    */
  def toArray(targetRadix: Double): js.Array[String] = js.native
  
  def toString(targetRadix: js.Array[String]): String = js.native
  /**
    * Convert to target radix, return as String
    *
    * @param targetRadix - target radix / encoding characters
    * @return - source digits converted to target radix presented in format of Array
    */
  def toString(targetRadix: Double): String = js.native
}
