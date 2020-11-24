package typings.numbro.mod.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Numbro extends js.Object {
  
  def add(value: Double): this.type = js.native
  
  def binaryByteUnits(): String = js.native
  
  def byteUnits(): String = js.native
  
  def decimalByteUnits(): String = js.native
  
  def difference(value: Double): Double = js.native
  
  def divide(value: Double): this.type = js.native
  
  def format(): String = js.native
  def format(format: String): String = js.native
  def format(format: Format): String = js.native
  
  def formatCurrency(): String = js.native
  def formatCurrency(format: String): String = js.native
  def formatCurrency(format: Format): String = js.native
  
  def formatTime(): String = js.native
  def formatTime(format: String): String = js.native
  def formatTime(format: Format): String = js.native
  
  def multiply(value: Double): this.type = js.native
  
  def set(value: Double): this.type = js.native
  
  def subtract(value: Double): this.type = js.native
  
  def value(): Double = js.native
}
