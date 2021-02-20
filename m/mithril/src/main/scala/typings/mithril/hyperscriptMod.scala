package typings.mithril

import org.scalablytyped.runtime.Shortcut
import typings.mithril.mod.Hyperscript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hyperscriptMod extends Shortcut {
  
  @JSImport("mithril/hyperscript", JSImport.Namespace)
  @js.native
  val ^ : Hyperscript = js.native
  
  type _To = Hyperscript
  
  /* This means you don't have to write `^`, but can instead just say `hyperscriptMod.foo` */
  override def _to: Hyperscript = ^
}
