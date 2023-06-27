package typings.mergeRefs

import typings.react.mod.Ref
import typings.react.mod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](inputRefs: js.UndefOr[Ref[T]]*): Ref[T] | RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(inputRefs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Ref[T] | RefCallback[T]]
}
