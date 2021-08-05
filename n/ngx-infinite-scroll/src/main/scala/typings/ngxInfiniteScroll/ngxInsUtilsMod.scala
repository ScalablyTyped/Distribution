package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.SimpleChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngxInsUtilsMod {
  
  @JSImport("ngx-infinite-scroll/src/services/ngx-ins-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findElement(selector: String, customRoot: js.Any, fromRoot: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def findElement(selector: String, customRoot: ElementRef[js.Any], fromRoot: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def findElement(selector: js.Any, customRoot: js.Any, fromRoot: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def findElement(selector: js.Any, customRoot: ElementRef[js.Any], fromRoot: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def hasWindowDefined(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWindowDefined")().asInstanceOf[Boolean]
  
  inline def inputPropChanged(prop: SimpleChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inputPropChanged")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveContainerElement(selector: String, scrollWindow: js.Any, defaultElement: js.Any, fromRoot: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainerElement")(selector.asInstanceOf[js.Any], scrollWindow.asInstanceOf[js.Any], defaultElement.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def resolveContainerElement(selector: js.Any, scrollWindow: js.Any, defaultElement: js.Any, fromRoot: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainerElement")(selector.asInstanceOf[js.Any], scrollWindow.asInstanceOf[js.Any], defaultElement.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
