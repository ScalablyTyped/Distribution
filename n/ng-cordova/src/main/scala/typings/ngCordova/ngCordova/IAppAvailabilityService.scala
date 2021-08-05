package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAppAvailabilityService extends StObject {
  
  def check(urlScheme: String): IPromise[js.Any]
}
object IAppAvailabilityService {
  
  inline def apply(check: String => IPromise[js.Any]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.asInstanceOf[IAppAvailabilityService]
  }
  
  extension [Self <: IAppAvailabilityService](x: Self) {
    
    inline def setCheck(value: String => IPromise[js.Any]): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
  }
}
