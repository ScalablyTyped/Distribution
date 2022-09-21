package typings.nthCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("nth-check/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(formula: String): js.Function1[/* index */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(formula.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* index */ Double, Boolean]]
  
  inline def compile(parsed: js.Tuple2[/* a */ Double, /* b */ Double]): js.Function1[/* index */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* index */ Double, Boolean]]
  
  inline def generate(parsed: js.Tuple2[/* a */ Double, /* b */ Double]): js.Function0[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double | Null]]
  
  inline def parse(formula: String): js.Tuple2[/* a */ Double, /* b */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(formula.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[/* a */ Double, /* b */ Double]]
  
  inline def sequence(formula: String): js.Function0[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(formula.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double | Null]]
}
