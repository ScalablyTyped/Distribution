package typings.milkcocoa.milkcocoa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataStore extends js.Object {
  
  def child(path: String): DataStore = js.native
  
  def get(id: String, callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
  
  def off(event: String): Unit = js.native
  
  // event push, remove, set, send
  def on(event: String, callback: js.Function1[/* data */ DataStoreCallbackData, Unit]): Unit = js.native
  
  def parent(): DataStore = js.native
  
  def push(`object`: js.Object): Unit = js.native
  def push(`object`: js.Object, callback: js.Function1[/* data */ DataStoreCallbackData, Unit]): Unit = js.native
  
  def query(): Query = js.native
  def query(condition: js.Object): Query = js.native
  
  def remove(id: String): Unit = js.native
  
  def root(): DataStore = js.native
  
  def send(`object`: js.Object): Unit = js.native
  
  def set(id: String, data: js.Object): Unit = js.native
}
