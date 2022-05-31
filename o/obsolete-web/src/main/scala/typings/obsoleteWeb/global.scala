package typings.obsoleteWeb

import typings.obsoleteWeb.mod.Options
import typings.obsoleteWeb.obsoleteWebStrings.afterbeing
import typings.obsoleteWeb.obsoleteWebStrings.beforened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Obsolete {
    
    @JSGlobal("Obsolete")
    @js.native
    class ^ ()
      extends typings.obsoleteWeb.mod.^ {
      def this(options: Options) = this()
    }
    
    /* static member */
    /* Inlined std.Readonly<std.Required<obsolete-web.obsolete-web.Options>> */
    object defaultOptions {
      
      @JSGlobal("Obsolete.defaultOptions.position")
      @js.native
      val position: afterbeing | beforened = js.native
      
      @JSGlobal("Obsolete.defaultOptions.promptOnNonTargetBrowser")
      @js.native
      val promptOnNonTargetBrowser: Boolean = js.native
      
      @JSGlobal("Obsolete.defaultOptions.promptOnUnknownBrowser")
      @js.native
      val promptOnUnknownBrowser: Boolean = js.native
      
      @JSGlobal("Obsolete.defaultOptions.template")
      @js.native
      val template: String = js.native
    }
  }
}
