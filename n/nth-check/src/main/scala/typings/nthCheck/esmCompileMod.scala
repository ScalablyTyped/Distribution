package typings.nthCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCompileMod {
  
  @JSImport("nth-check/lib/esm/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(parsed: js.Tuple2[/* a */ Double, /* b */ Double]): js.Function1[/* index */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* index */ Double, Boolean]]
  
  inline def generate(parsed: js.Tuple2[/* a */ Double, /* b */ Double]): js.Function0[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double | Null]]
}
