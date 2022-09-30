package typings.ow

import typings.ow.predicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ofTypeDeepMod {
  
  @JSImport("ow/dist/utils/of-type-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Test all the values in the object against a provided predicate.
  @hidden
  @param predicate - Predicate to test every value in the given object against.
  */
  inline def default(`object`: Any, predicate: Predicate[Any]): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
}
