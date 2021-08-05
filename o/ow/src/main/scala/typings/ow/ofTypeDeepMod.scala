package typings.ow

import typings.ow.predicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ofTypeDeepMod {
  
  @JSImport("ow/dist/source/utils/of-type-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`object`: js.Any, predicate: Predicate[js.Any]): String | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[String | Boolean]
}
