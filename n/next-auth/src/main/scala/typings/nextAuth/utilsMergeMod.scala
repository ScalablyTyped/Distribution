package typings.nextAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMergeMod {
  
  @JSImport("next-auth/utils/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
