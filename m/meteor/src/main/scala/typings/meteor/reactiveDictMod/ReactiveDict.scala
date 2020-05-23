package typings.meteor.reactiveDictMod

import org.scalablytyped.runtime.TopLevel
import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactiveDict extends js.Object {
  def all(): EJSONable = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def equals(key: String): Boolean = js.native
  def equals(key: String, value: String): Boolean = js.native
  def equals(key: String, value: Boolean): Boolean = js.native
  def equals(key: String, value: Double): Boolean = js.native
  def get(key: String): EJSONableProperty = js.native
  def set(key: String): Unit = js.native
  def set(key: String, value: EJSONableProperty): Unit = js.native
  def set(`object`: EJSONable): Unit = js.native
  def setDefault(key: String): Unit = js.native
  def setDefault(key: String, value: EJSONableProperty): Unit = js.native
  def setDefault(`object`: EJSONable): Unit = js.native
}

@JSImport("meteor/reactive-dict", "ReactiveDict")
@js.native
object ReactiveDict extends TopLevel[ReactiveDictStatic]

