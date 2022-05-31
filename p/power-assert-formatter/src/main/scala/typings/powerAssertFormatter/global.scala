package typings.powerAssertFormatter

import typings.powerAssertFormatter.mod.Formatter
import typings.powerAssertFormatter.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object powerAssertFormatter {
    
    inline def apply(): Formatter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Formatter]
    inline def apply(options: Options): Formatter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
    
    @JSGlobal("powerAssertFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[Options]
  }
}
