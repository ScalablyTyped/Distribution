package typings.novaEditor

import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // WebWorker" library already declare's console, as `var` not `const`
  // declare const console: Console;
  @JSGlobal("console")
  @js.native
  def console: Console = js.native
  inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__dirname")
  @js.native
  val dirname: String = js.native
  
  /* was `typeof module.exports` */
  @JSGlobal("exports")
  @js.native
  def exports: Any = js.native
  inline def exports_=(x: Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  val filename: String = js.native
  
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("module.exports")
    @js.native
    def exports: Any = js.native
    inline def exports_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  inline def require(module: String): Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
}
