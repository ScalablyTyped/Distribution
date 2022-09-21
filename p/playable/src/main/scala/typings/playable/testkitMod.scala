package typings.playable

import typings.playable.anon.GetModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testkitMod {
  
  @JSImport("playable/dist/src/testkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): GetModule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[GetModule]
  inline def default(config: js.Object): GetModule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[GetModule]
  inline def default(config: js.Object, adapters: Any): GetModule = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[GetModule]
  inline def default(config: Unit, adapters: Any): GetModule = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[GetModule]
  
  inline def resetProperty(target: Any, propertyKey: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setProperty(target: Any, propertyKey: Any, propertyValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], propertyValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
