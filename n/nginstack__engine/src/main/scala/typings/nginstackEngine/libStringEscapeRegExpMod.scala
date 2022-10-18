package typings.nginstackEngine

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringEscapeRegExpMod extends Shortcut {
  
  @JSImport("@nginstack/engine/lib/string/escapeRegExp", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[(/* str */ Any) | (/* str */ String), Any | String] = js.native
  
  type _To = js.Function1[(/* str */ Any) | (/* str */ String), Any | String]
  
  /* This means you don't have to write `^`, but can instead just say `libStringEscapeRegExpMod.foo` */
  override def _to: js.Function1[(/* str */ Any) | (/* str */ String), Any | String] = ^
}
