package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFlatReaddirMod {
  
  @JSImport("next/dist/lib/flat-readdir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatReaddir(dir: String, include: js.RegExp): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatReaddir")(dir.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
