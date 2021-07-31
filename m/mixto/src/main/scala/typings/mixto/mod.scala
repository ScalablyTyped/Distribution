package typings.mixto

import org.scalablytyped.runtime.Shortcut
import typings.mixto.Mixto.IMixinStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mixto", JSImport.Namespace)
  @js.native
  val ^ : IMixinStatic = js.native
  
  type _To = IMixinStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IMixinStatic = ^
}
