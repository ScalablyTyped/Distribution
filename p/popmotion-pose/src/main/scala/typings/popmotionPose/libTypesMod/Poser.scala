package typings.popmotionPose.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poser[V, A, C, P] extends js.Object {
  def _addChild(config: PoserConfig[V], factory: PoserFactory[V, A, C, P]): Poser[V, A, C, P] = js.native
  def clearChildren(): Unit = js.native
  def destroy(): Unit = js.native
  def get(): js.Any = js.native
  def get(key: String): js.Any = js.native
  def has(key: String): Boolean = js.native
  def removeChild(child: Poser[V, A, C, P]): Unit = js.native
  def set(next: String): js.Promise[_] = js.native
  def set(next: String, props: Props): js.Promise[_] = js.native
  def setProps(props: Props): Unit = js.native
  def unset(toUnset: String): js.Promise[_] = js.native
  def unset(toUnset: String, props: Props): js.Promise[_] = js.native
}

