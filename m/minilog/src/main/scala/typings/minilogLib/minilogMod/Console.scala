package typings
package minilogLib.minilogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minilog", "Console")
@js.native
class Console ()
  extends minilogLib.minilogMod.MinilogNs.Console {
  //Only available on client
  /* CompleteClass */
  override var color: minilogLib.minilogMod.MinilogNs.Transform = js.native
  //Only available on backend
  /* CompleteClass */
  override var formatClean: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override var formatColor: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override var formatLearnboost: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override var formatMinilog: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override var formatNpm: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override var formatWithStack: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /**
    * List of available formatters
    */
  /* CompleteClass */
  override var formatters: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override var minilog: minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override def mixin(dest: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def pipe(dest: js.Any): js.Any = js.native
  /* CompleteClass */
  override def unpipe(from: js.Any): minilogLib.minilogMod.MinilogNs.Transform = js.native
  /* CompleteClass */
  override def write(name: js.Any, level: js.Any, args: js.Any): scala.Unit = js.native
}

