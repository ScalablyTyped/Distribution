package typings.playcanvas.anon

import typings.playcanvas.pc.Application
import typings.playcanvas.pc.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: Application
  
  var entity: Entity
}
object App {
  
  inline def apply(app: Application, entity: Entity): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setApp(value: Application): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
