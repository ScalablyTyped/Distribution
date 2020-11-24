package typings.mockdate

import typings.mockdate.anon.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mockdate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def reset(): Unit = js.native
  
  def set(date: String): Unit = js.native
  def set(date: String, timezoneOffset: Double): Unit = js.native
  def set(date: Double): Unit = js.native
  def set(date: Double, timezoneOffset: Double): Unit = js.native
  def set(date: ValueOf): Unit = js.native
  def set(date: ValueOf, timezoneOffset: Double): Unit = js.native
}
