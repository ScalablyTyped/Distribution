package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.SimpleChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngx-infinite-scroll/src/services/ngx-ins-utils", JSImport.Namespace)
@js.native
object ngxInsUtilsMod extends js.Object {
  
  def findElement(selector: String, customRoot: js.Any, fromRoot: Boolean): js.Any = js.native
  def findElement(selector: String, customRoot: ElementRef[_], fromRoot: Boolean): js.Any = js.native
  def findElement(selector: js.Any, customRoot: js.Any, fromRoot: Boolean): js.Any = js.native
  def findElement(selector: js.Any, customRoot: ElementRef[_], fromRoot: Boolean): js.Any = js.native
  
  def hasWindowDefined(): Boolean = js.native
  
  def inputPropChanged(prop: SimpleChange): Boolean = js.native
  
  def resolveContainerElement(selector: String, scrollWindow: js.Any, defaultElement: js.Any, fromRoot: Boolean): js.Any = js.native
  def resolveContainerElement(selector: js.Any, scrollWindow: js.Any, defaultElement: js.Any, fromRoot: Boolean): js.Any = js.native
}
