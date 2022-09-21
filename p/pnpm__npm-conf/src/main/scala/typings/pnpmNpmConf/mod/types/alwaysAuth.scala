package typings.pnpmNpmConf.mod.types

import typings.pnpmNpmConf.mod.types.^
import typings.std.Boolean
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.always-auth")
@js.native
/* standard es5 */
open class alwaysAuth ()
  extends StObject
     with Boolean {
  def this(value: Any) = this()
}
object alwaysAuth {
  
  inline def apply: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("always-auth").asInstanceOf[BooleanConstructor]
}
