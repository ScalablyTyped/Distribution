package typings.npmDependants

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Get dependants of a module on npm. */
  inline def apply(name: String): AsyncIterable[String] = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[String]]
  
  @JSImport("npm-dependants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
