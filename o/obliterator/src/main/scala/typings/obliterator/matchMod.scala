package typings.obliterator

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMod {
  
  @JSImport("obliterator/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pattern: js.RegExp, string: String): IterableIterator[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[String]]
}
