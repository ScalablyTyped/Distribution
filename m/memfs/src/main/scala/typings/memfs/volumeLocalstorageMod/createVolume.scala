package typings.memfs.volumeLocalstorageMod

import org.scalablytyped.runtime.Instantiable1
import typings.memfs.volumeMod.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/volume-localstorage", "createVolume")
@js.native
object createVolume extends js.Object {
  def apply(namespace: String): Instantiable1[/* args (repeated) */ js.Any, Volume] = js.native
  def apply(namespace: String, LS: js.Object): Instantiable1[/* args (repeated) */ js.Any, Volume] = js.native
  def apply(namespace: String, LS: IStore): Instantiable1[/* args (repeated) */ js.Any, Volume] = js.native
}

