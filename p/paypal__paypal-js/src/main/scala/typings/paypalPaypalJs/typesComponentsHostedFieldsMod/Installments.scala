package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Installments extends StObject {
  
  /**
    * Handle and use installments options
    */
  def onInstallmentsAvailable(installments: AvailableInstallments): Unit
  
  /**
    * Handle fetching installments errors
    */
  var onInstallmentsError: js.UndefOr[js.Function1[/* error */ Record[String, Any], Unit]] = js.undefined
  
  /**
    * Defines the installments configuration
    */
  def onInstallmentsRequested(): js.Promise[InstallmentsConfiguration] | InstallmentsConfiguration
}
object Installments {
  
  inline def apply(
    onInstallmentsAvailable: AvailableInstallments => Unit,
    onInstallmentsRequested: () => js.Promise[InstallmentsConfiguration] | InstallmentsConfiguration
  ): Installments = {
    val __obj = js.Dynamic.literal(onInstallmentsAvailable = js.Any.fromFunction1(onInstallmentsAvailable), onInstallmentsRequested = js.Any.fromFunction0(onInstallmentsRequested))
    __obj.asInstanceOf[Installments]
  }
  
  extension [Self <: Installments](x: Self) {
    
    inline def setOnInstallmentsAvailable(value: AvailableInstallments => Unit): Self = StObject.set(x, "onInstallmentsAvailable", js.Any.fromFunction1(value))
    
    inline def setOnInstallmentsError(value: /* error */ Record[String, Any] => Unit): Self = StObject.set(x, "onInstallmentsError", js.Any.fromFunction1(value))
    
    inline def setOnInstallmentsErrorUndefined: Self = StObject.set(x, "onInstallmentsError", js.undefined)
    
    inline def setOnInstallmentsRequested(value: () => js.Promise[InstallmentsConfiguration] | InstallmentsConfiguration): Self = StObject.set(x, "onInstallmentsRequested", js.Any.fromFunction0(value))
  }
}
