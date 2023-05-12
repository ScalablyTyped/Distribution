package typings.postcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringifyMod extends Shortcut {
  
  @JSImport("postcss/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : Stringify = js.native
  
  @js.native
  trait Stringify extends Stringifier {
    
    var default: Stringify = js.native
  }
  
  type _To = Stringify
  
  /* This means you don't have to write `^`, but can instead just say `libStringifyMod.foo` */
  override def _to: Stringify = ^
}
