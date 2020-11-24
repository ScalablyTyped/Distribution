package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer
  extends TransformCallback
     with _AcceptedPlugin {
  
  /* InferMemberOverrides */
  override def apply(T0: /* root */ Root_, T1: /* result */ Result): js.Promise[js.Any] | js.Any = js.native
  
  var postcssPlugin: js.UndefOr[String] = js.native
  
  var postcssVersion: js.UndefOr[String] = js.native
}
