package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeMod {
  
  @JSImport("popmotion/lib/utils/pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pipe(transformers: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(transformers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
}
