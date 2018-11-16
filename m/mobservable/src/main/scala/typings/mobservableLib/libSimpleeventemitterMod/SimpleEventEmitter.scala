package typings
package mobservableLib.libSimpleeventemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SimpleEventEmitter extends js.Object {
  var listeners: js.Array[mobservableLib.Anon_Data]
  def emit(data: js.Any*): js.Any
  def on(listener: js.Function1[/* repeated */js.Any, scala.Unit]): mobservableLib.libInterfacesMod.Lambda
  def once(listener: js.Function1[/* repeated */js.Any, scala.Unit]): mobservableLib.libInterfacesMod.Lambda
}

