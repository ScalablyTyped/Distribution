package typings.minimatchAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String, patterns: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    path: String,
    patterns: js.Array[String],
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOptions */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("minimatch-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
