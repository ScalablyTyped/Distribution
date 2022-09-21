package typings.nthCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  @JSImport("nth-check/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(formula: String): js.Tuple2[/* a */ Double, /* b */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(formula.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[/* a */ Double, /* b */ Double]]
}
