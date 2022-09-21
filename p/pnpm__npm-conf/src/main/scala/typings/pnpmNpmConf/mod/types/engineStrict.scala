package typings.pnpmNpmConf.mod.types

import typings.pnpmNpmConf.mod.types.^
import typings.std.Boolean
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.engine-strict")
@js.native
/* standard es5 */
open class engineStrict ()
  extends StObject
     with Boolean {
  def this(value: Any) = this()
}
object engineStrict {
  
  inline def apply: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("engine-strict").asInstanceOf[BooleanConstructor]
}
