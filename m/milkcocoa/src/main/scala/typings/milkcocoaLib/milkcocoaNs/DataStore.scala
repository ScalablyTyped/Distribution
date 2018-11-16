package typings
package milkcocoaLib.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataStore extends js.Object {
  def child(path: java.lang.String): DataStore = js.native
  def get(id: java.lang.String, callback: js.Function1[/* data */ js.Object, scala.Unit]): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  // event push, remove, set, send
  def on(event: java.lang.String, callback: js.Function1[/* data */ DataStoreCallbackData, scala.Unit]): scala.Unit = js.native
  def parent(): DataStore = js.native
  def push(`object`: js.Object): scala.Unit = js.native
  def push(`object`: js.Object, callback: js.Function1[/* data */ DataStoreCallbackData, scala.Unit]): scala.Unit = js.native
  def query(): Query = js.native
  def query(condition: js.Object): Query = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def root(): DataStore = js.native
  def send(`object`: js.Object): scala.Unit = js.native
  def set(id: java.lang.String, data: js.Object): scala.Unit = js.native
}

