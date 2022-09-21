package typings.naja

import org.scalablytyped.runtime.Shortcut
import typings.naja.najaMod.Naja
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod extends Shortcut {
  
  @JSImport("naja/dist", JSImport.Default)
  @js.native
  val default: Naja = js.native
  
  type _To = Naja
  
  /* This means you don't have to write `default`, but can instead just say `distMod.foo` */
  override def _to: Naja = default
}
