package typings
package poseDashCoreLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poser[V, A, C, P] extends js.Object {
  def _addChild(config: PoserConfig[V], factory: PoserFactory[V, A, C, P]): Poser[V, A, C, P] = js.native
  def clearChildren(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def get(): js.Any = js.native
  def get(key: java.lang.String): js.Any = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def removeChild(child: Poser[V, A, C, P]): scala.Unit = js.native
  def set(next: java.lang.String): js.Promise[_] = js.native
  def set(next: java.lang.String, props: Props): js.Promise[_] = js.native
  def setProps(props: Props): scala.Unit = js.native
  def unset(toUnset: java.lang.String): js.Promise[_] = js.native
  def unset(toUnset: java.lang.String, props: Props): js.Promise[_] = js.native
}

