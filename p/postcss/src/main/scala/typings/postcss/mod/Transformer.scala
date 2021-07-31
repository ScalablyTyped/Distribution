package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer
  extends TransformCallback
     with _AcceptedPlugin {
  
  /* InferMemberOverrides */
  override def apply(arg1: /* root */ Root_, arg2: /* result */ Result): js.Promise[js.Any] | js.Any = js.native
  
  var postcssPlugin: js.UndefOr[String] = js.native
  
  var postcssVersion: js.UndefOr[String] = js.native
}
