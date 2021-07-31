package typings.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.JavaScriptLoader")
@js.native
class JavaScriptLoader protected ()
  extends StObject
     with typings.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}
/* static members */
object JavaScriptLoader {
  
  @JSGlobal("createjs.JavaScriptLoader")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
