package typings
package orderedmapLib.orderedmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedMap[T] extends js.Object {
  val size: scala.Double = js.native
  def addBefore(place: java.lang.String, key: java.lang.String, value: T): this.type = js.native
  def addToEnd(key: java.lang.String, value: T): this.type = js.native
  def addToStart(key: java.lang.String, value: T): this.type = js.native
  def append(map: ScalablyTyped.runtime.StringDictionary[T]): this.type = js.native
  def append(map: OrderedMap[T]): this.type = js.native
  def forEach(f: js.Function2[/* key */ java.lang.String, /* value */ T, scala.Unit]): scala.Unit = js.native
  def get(key: java.lang.String): js.UndefOr[T] = js.native
  def prepend(map: ScalablyTyped.runtime.StringDictionary[T]): this.type = js.native
  def prepend(map: OrderedMap[T]): this.type = js.native
  def remove(key: java.lang.String): this.type = js.native
  def subtract(map: ScalablyTyped.runtime.StringDictionary[T]): this.type = js.native
  def subtract(map: OrderedMap[T]): this.type = js.native
  def update(key: java.lang.String, value: T): this.type = js.native
  def update(key: java.lang.String, value: T, newKey: java.lang.String): this.type = js.native
}

