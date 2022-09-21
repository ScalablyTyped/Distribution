package typings.pnpmNpmConf.mod.types

import typings.pnpmNpmConf.mod.types.^
import typings.std.Number
import typings.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.cache-lock-retries")
@js.native
/* standard es5 */
open class cacheLockRetries ()
  extends StObject
     with Number {
  def this(value: Any) = this()
}
object cacheLockRetries {
  
  inline def apply: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("cache-lock-retries").asInstanceOf[NumberConstructor]
}
