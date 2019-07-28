package typings.mobservable.libSimpleeventemitterMod

import typings.mobservable.Fn_Data
import typings.mobservable.libInterfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/simpleeventemitter", JSImport.Default)
@js.native
class default () extends SimpleEventEmitter {
  /* CompleteClass */
  override var listeners: js.Array[Fn_Data] = js.native
  /* CompleteClass */
  override def emit(data: js.Any*): js.Any = js.native
  /* CompleteClass */
  override def on(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
  /* CompleteClass */
  override def once(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
}

