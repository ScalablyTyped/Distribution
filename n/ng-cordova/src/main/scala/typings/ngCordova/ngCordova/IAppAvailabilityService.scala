package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAppAvailabilityService extends StObject {
  
  def check(urlScheme: String): IPromise[_] = js.native
}
object IAppAvailabilityService {
  
  @scala.inline
  def apply(check: String => IPromise[_]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.asInstanceOf[IAppAvailabilityService]
  }
  
  @scala.inline
  implicit class IAppAvailabilityServiceMutableBuilder[Self <: IAppAvailabilityService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck(value: String => IPromise[_]): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
  }
}
