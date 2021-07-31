package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAppVersionService extends StObject {
  
  def getVersionCode(): IPromise[String]
  
  def getVersionNumber(): IPromise[String]
}
object IAppVersionService {
  
  @scala.inline
  def apply(getVersionCode: () => IPromise[String], getVersionNumber: () => IPromise[String]): IAppVersionService = {
    val __obj = js.Dynamic.literal(getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
    __obj.asInstanceOf[IAppVersionService]
  }
  
  @scala.inline
  implicit class IAppVersionServiceMutableBuilder[Self <: IAppVersionService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVersionCode(value: () => IPromise[String]): Self = StObject.set(x, "getVersionCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVersionNumber(value: () => IPromise[String]): Self = StObject.set(x, "getVersionNumber", js.Any.fromFunction0(value))
  }
}
