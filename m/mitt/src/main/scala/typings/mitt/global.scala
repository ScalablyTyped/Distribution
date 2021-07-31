package typings.mitt

import org.scalablytyped.runtime.Shortcut
import typings.mitt.mitt.MittStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mitt extends Shortcut {
    
    @JSGlobal("mitt")
    @js.native
    val ^ : MittStatic = js.native
    
    type _To = MittStatic
    
    /* This means you don't have to write `^`, but can instead just say `mitt.foo` */
    override def _to: MittStatic = ^
  }
}
