package typings.orderedmap.orderedmapMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedMap[T] extends js.Object {
  val size: Double = js.native
  def addBefore(place: String, key: String, value: T): this.type = js.native
  def addToEnd(key: String, value: T): this.type = js.native
  def addToStart(key: String, value: T): this.type = js.native
  def append(map: StringDictionary[T]): this.type = js.native
  def append(map: OrderedMap[T]): this.type = js.native
  def forEach(f: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = js.native
  def get(key: String): js.UndefOr[T] = js.native
  def prepend(map: StringDictionary[T]): this.type = js.native
  def prepend(map: OrderedMap[T]): this.type = js.native
  def remove(key: String): this.type = js.native
  def subtract(map: StringDictionary[T]): this.type = js.native
  def subtract(map: OrderedMap[T]): this.type = js.native
  def update(key: String, value: T): this.type = js.native
  def update(key: String, value: T, newKey: String): this.type = js.native
}

