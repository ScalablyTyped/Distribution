package typings.pendoIoBrowser

import org.scalablytyped.runtime.Shortcut
import typings.pendoIoBrowser.pendo.Pendo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pendo extends Shortcut {
    
    @JSGlobal("pendo")
    @js.native
    val ^ : Pendo = js.native
    
    type _To = Pendo
    
    /* This means you don't have to write `^`, but can instead just say `pendo.foo` */
    override def _to: Pendo = ^
  }
}
