package typings.novaEditor

import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("console")
  @js.native
  val console: Console = js.native
  
  @JSGlobal("__dirname")
  @js.native
  val dirname: String = js.native
  
  /* was `typeof module.exports` */
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  inline def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  val filename: String = js.native
  
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("module.exports")
    @js.native
    def exports: js.Any = js.native
    inline def exports_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  inline def require(module: String): js.Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
