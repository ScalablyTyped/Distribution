package typings.pnpmNpmConf.libTypesMod.types

import typings.pnpmNpmConf.libTypesMod.types.^
import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.user-agent")
@js.native
/* standard es5 */
open class userAgent ()
  extends StObject
     with String {
  def this(value: Any) = this()
}
object userAgent {
  
  /* standard es5 */
  inline def apply(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("user-agent")().asInstanceOf[java.lang.String]
  inline def apply(value: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("user-agent")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
