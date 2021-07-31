package typings.modernizr

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("modernizr", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ModernizrStatic = js.native
  
  type _To = js.Object & ModernizrStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ModernizrStatic = ^
}
