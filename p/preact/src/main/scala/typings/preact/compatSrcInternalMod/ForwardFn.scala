package typings.preact.compatSrcInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardFn[P, T] extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  def apply(
    props: P,
    ref: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Ref<T> */ js.Any
  ): js.Any = js.native
}

