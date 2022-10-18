package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibEscapeRegexpMod {
  
  @JSImport("next/dist/shared/lib/escape-regexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeStringRegexp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeStringRegexp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
