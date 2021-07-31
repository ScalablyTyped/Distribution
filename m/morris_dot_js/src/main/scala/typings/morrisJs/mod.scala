package typings.morrisJs

import org.scalablytyped.runtime.Shortcut
import typings.morrisJs.morris.MorrisStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("morris", JSImport.Namespace)
  @js.native
  val ^ : MorrisStatic = js.native
  
  type _To = MorrisStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MorrisStatic = ^
}
