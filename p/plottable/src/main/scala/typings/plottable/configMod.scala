package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("plottable/build/src/core/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/core/config", "ADD_TITLE_ELEMENTS")
  @js.native
  def ADD_TITLE_ELEMENTS: Boolean = js.native
  inline def ADD_TITLE_ELEMENTS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD_TITLE_ELEMENTS")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable/build/src/core/config", "SHOW_WARNINGS")
  @js.native
  def SHOW_WARNINGS: Boolean = js.native
  inline def SHOW_WARNINGS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_WARNINGS")(x.asInstanceOf[js.Any])
}
