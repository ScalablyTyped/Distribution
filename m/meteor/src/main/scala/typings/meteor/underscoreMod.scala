package typings.meteor

import org.scalablytyped.runtime.Shortcut
import typings.underscore.mod.UnderscoreStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object underscoreMod {
  
  object _underscore extends Shortcut {
    
    @JSImport("meteor/underscore", "_")
    @js.native
    val ^ : UnderscoreStatic = js.native
    
    type _To = UnderscoreStatic
    
    /* This means you don't have to write `^`, but can instead just say `_underscore.foo` */
    override def _to: UnderscoreStatic = ^
  }
}
