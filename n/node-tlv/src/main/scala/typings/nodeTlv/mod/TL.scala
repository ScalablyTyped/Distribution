package typings.nodeTlv.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TL extends js.Object {
  
  var bLength: Buffer = js.native
  
  var bTag: Buffer = js.native
  
  /**
    * @param flag When true measures the length of the value, when false measures the length of the buffer value
    */
  def getL(): String = js.native
  def getL(flag: Boolean): String = js.native
  
  def getLength(): Double = js.native
  
  def getName(): String = js.native
  
  def getSize(): Double = js.native
  
  def getTL(): String = js.native
  
  /**
    * Return the value of the tag field of the TL.
    */
  def getTag(): String = js.native
  def getTag(tag: String): String = js.native
  def getTag(tag: Double): Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  def print(): Unit = js.native
  def print(indent: Double): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  var size: Double = js.native
  
  var tag: String = js.native
  
  def toTLV(str: String): TLV = js.native
}
