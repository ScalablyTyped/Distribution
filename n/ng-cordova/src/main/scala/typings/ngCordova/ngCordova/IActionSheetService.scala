package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionSheetService extends StObject {
  
  def hide(): IPromise[Unit] = js.native
  
  def show(options: ShowOptions): IPromise[Double] = js.native
}
object IActionSheetService {
  
  @scala.inline
  def apply(hide: () => IPromise[Unit], show: ShowOptions => IPromise[Double]): IActionSheetService = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IActionSheetService]
  }
  
  @scala.inline
  implicit class IActionSheetServiceMutableBuilder[Self <: IActionSheetService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => IPromise[Unit]): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: ShowOptions => IPromise[Double]): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
