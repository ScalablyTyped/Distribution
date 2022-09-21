package typings.pnpmNpmConf.mod.types

import typings.pnpmNpmConf.mod.types.^
import typings.std.String
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.message")
@js.native
/* standard es5 */
open class message ()
  extends StObject
     with String {
  def this(value: Any) = this()
}
object message {
  
  inline def apply: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("message").asInstanceOf[StringConstructor]
}
