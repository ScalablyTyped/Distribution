package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEmailComposerService extends StObject {
  
  def addAlias(app: String, schema: String): Unit = js.native
  
  def isAvailable(): IPromise[Boolean] = js.native
  
  def open(properties: IEmailComposerOptions): IPromise[_] = js.native
}
object IEmailComposerService {
  
  @scala.inline
  def apply(
    addAlias: (String, String) => Unit,
    isAvailable: () => IPromise[Boolean],
    open: IEmailComposerOptions => IPromise[_]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal(addAlias = js.Any.fromFunction2(addAlias), isAvailable = js.Any.fromFunction0(isAvailable), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IEmailComposerService]
  }
  
  @scala.inline
  implicit class IEmailComposerServiceMutableBuilder[Self <: IEmailComposerService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAlias(value: (String, String) => Unit): Self = StObject.set(x, "addAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsAvailable(value: () => IPromise[Boolean]): Self = StObject.set(x, "isAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: IEmailComposerOptions => IPromise[_]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
