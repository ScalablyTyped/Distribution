package typings.pnpmNpmConf.libTypesMod.types

import typings.pnpmNpmConf.libTypesMod.types.^
import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.strict-ssl")
@js.native
/* standard es5 */
open class strictSsl ()
  extends StObject
     with Boolean {
  def this(value: Any) = this()
}
object strictSsl {
  
  /* standard es5 */
  inline def apply[T](): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("strict-ssl")().asInstanceOf[scala.Boolean]
  inline def apply[T](value: T): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("strict-ssl")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
