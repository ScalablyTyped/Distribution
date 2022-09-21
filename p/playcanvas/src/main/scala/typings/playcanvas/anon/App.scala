package typings.playcanvas.anon

import typings.playcanvas.mod.AppBase
import typings.playcanvas.mod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: AppBase
  
  var entity: Entity
}
object App {
  
  inline def apply(app: AppBase, entity: Entity): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setApp(value: AppBase): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
