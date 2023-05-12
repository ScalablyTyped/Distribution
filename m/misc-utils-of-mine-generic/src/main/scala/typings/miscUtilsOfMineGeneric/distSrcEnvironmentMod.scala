package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnvironmentMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobal(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[Any]
  
  inline def inBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inBrowser")().asInstanceOf[Boolean]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/environment", "inDOM")
  @js.native
  val inDOM: js.Function0[Boolean] = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/environment", "inNode")
  @js.native
  val inNode: js.Function0[Boolean] = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/environment", "isBrowser")
  @js.native
  val isBrowser: js.Function0[Boolean] = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/environment", "isDOM")
  @js.native
  val isDOM: js.Function0[Boolean] = js.native
  
  inline def isJSDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDOM")().asInstanceOf[Boolean]
  
  inline def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
  
  inline def isWebWorker(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebWorker")().asInstanceOf[Boolean]
}
