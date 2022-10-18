package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildManifest extends StObject {
  
  var App: Any
  
  var Component: Any
  
  var ComponentMod: Any
  
  var Document: Any
  
  var buildManifest: Any
  
  var pathname: String
}
object BuildManifest {
  
  inline def apply(App: Any, Component: Any, ComponentMod: Any, Document: Any, buildManifest: Any, pathname: String): BuildManifest = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ComponentMod = ComponentMod.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildManifest]
  }
  
  extension [Self <: BuildManifest](x: Self) {
    
    inline def setApp(value: Any): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    inline def setBuildManifest(value: Any): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: Any): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentMod(value: Any): Self = StObject.set(x, "ComponentMod", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Any): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
