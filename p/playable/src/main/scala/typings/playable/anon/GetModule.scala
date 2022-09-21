package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModule extends StObject {
  
  def getModule(name: String): Any
  
  def registerModule(name: String, fn: js.Function): Unit
  
  def registerModuleAsSingleton(name: String, fn: js.Function): Unit
  
  def setConfig(newConfig: js.Object): Unit
  
  def setPlaybackAdapters(newAdapters: Any): Unit
}
object GetModule {
  
  inline def apply(
    getModule: String => Any,
    registerModule: (String, js.Function) => Unit,
    registerModuleAsSingleton: (String, js.Function) => Unit,
    setConfig: js.Object => Unit,
    setPlaybackAdapters: Any => Unit
  ): GetModule = {
    val __obj = js.Dynamic.literal(getModule = js.Any.fromFunction1(getModule), registerModule = js.Any.fromFunction2(registerModule), registerModuleAsSingleton = js.Any.fromFunction2(registerModuleAsSingleton), setConfig = js.Any.fromFunction1(setConfig), setPlaybackAdapters = js.Any.fromFunction1(setPlaybackAdapters))
    __obj.asInstanceOf[GetModule]
  }
  
  extension [Self <: GetModule](x: Self) {
    
    inline def setGetModule(value: String => Any): Self = StObject.set(x, "getModule", js.Any.fromFunction1(value))
    
    inline def setRegisterModule(value: (String, js.Function) => Unit): Self = StObject.set(x, "registerModule", js.Any.fromFunction2(value))
    
    inline def setRegisterModuleAsSingleton(value: (String, js.Function) => Unit): Self = StObject.set(x, "registerModuleAsSingleton", js.Any.fromFunction2(value))
    
    inline def setSetConfig(value: js.Object => Unit): Self = StObject.set(x, "setConfig", js.Any.fromFunction1(value))
    
    inline def setSetPlaybackAdapters(value: Any => Unit): Self = StObject.set(x, "setPlaybackAdapters", js.Any.fromFunction1(value))
  }
}
