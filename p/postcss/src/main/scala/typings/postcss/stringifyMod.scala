package typings.postcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod extends Shortcut {
  
  @JSImport("postcss/lib/stringify", JSImport.Default)
  @js.native
  val default: Stringifier = js.native
  
  type _To = Stringifier
  
  /* This means you don't have to write `default`, but can instead just say `stringifyMod.foo` */
  override def _to: Stringifier = default
}
