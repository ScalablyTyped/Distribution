package typings.postal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postal", JSImport.Namespace)
  @js.native
  val ^ : IPostal = js.native
  
  type _To = IPostal
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IPostal = ^
}
