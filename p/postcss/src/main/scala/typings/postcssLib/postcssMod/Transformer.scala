package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformer
  extends TransformCallback
     with _AcceptedPlugin {
  var postcssPlugin: js.UndefOr[java.lang.String] = js.native
  var postcssVersion: js.UndefOr[java.lang.String] = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* root */ Root, T1: /* result */ Result): js.Promise[js.Any] | js.Any = js.native
}

