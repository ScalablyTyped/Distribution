package typings
package mobservableLib.libSimpleeventemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/simpleeventemitter", JSImport.Default)
@js.native
class default () extends SimpleEventEmitter {
  /* CompleteClass */
  override var listeners: js.Array[mobservableLib.Fn_Data] = js.native
  /* CompleteClass */
  override def emit(data: js.Any*): js.Any = js.native
  /* CompleteClass */
  override def on(listener: js.Function1[/* repeated */ js.Any, scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  /* CompleteClass */
  override def once(listener: js.Function1[/* repeated */ js.Any, scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
}

