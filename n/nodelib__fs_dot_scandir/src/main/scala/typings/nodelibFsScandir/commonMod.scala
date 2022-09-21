package typings.nodelibFsScandir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@nodelib/fs.scandir/out/providers/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def joinPathSegments(a: String, b: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("joinPathSegments")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
}
