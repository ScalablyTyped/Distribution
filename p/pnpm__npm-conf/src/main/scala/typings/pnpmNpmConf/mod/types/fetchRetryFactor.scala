package typings.pnpmNpmConf.mod.types

import typings.pnpmNpmConf.mod.types.^
import typings.std.Number
import typings.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.fetch-retry-factor")
@js.native
/* standard es5 */
open class fetchRetryFactor ()
  extends StObject
     with Number {
  def this(value: Any) = this()
}
object fetchRetryFactor {
  
  inline def apply: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("fetch-retry-factor").asInstanceOf[NumberConstructor]
}
