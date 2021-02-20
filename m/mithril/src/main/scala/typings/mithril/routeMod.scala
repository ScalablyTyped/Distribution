package typings.mithril

import org.scalablytyped.runtime.Shortcut
import typings.mithril.mod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod extends Shortcut {
  
  @JSImport("mithril/route", JSImport.Namespace)
  @js.native
  val ^ : Route = js.native
  
  type _To = Route
  
  /* This means you don't have to write `^`, but can instead just say `routeMod.foo` */
  override def _to: Route = ^
}
