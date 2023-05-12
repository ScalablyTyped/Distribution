package typings.minimatch

import typings.minimatch.anon.PickMinimatchOptionswindo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsEscapeMod {
  
  @JSImport("minimatch/dist/cjs/escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
}
