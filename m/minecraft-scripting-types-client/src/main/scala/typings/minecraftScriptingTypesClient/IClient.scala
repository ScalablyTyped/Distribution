package typings.minecraftScriptingTypesClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClient extends StObject {
  
  def log(message: String): Unit
  
  def registerSystem[TSystem /* <: IClientSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem
}
object IClient {
  
  inline def apply(log: String => Unit, registerSystem: (Double, Double) => js.Any): IClient = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
    __obj.asInstanceOf[IClient]
  }
  
  extension [Self <: IClient](x: Self) {
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setRegisterSystem(value: (Double, Double) => js.Any): Self = StObject.set(x, "registerSystem", js.Any.fromFunction2(value))
  }
}
