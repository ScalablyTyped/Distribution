package typings.next.anon

import typings.next.distBuildUtilsMod.ComputeFilesManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: js.UndefOr[ComputeFilesManifest] = js.undefined
  
  var pages: ComputeFilesManifest
}
object App {
  
  inline def apply(pages: ComputeFilesManifest): App = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setApp(value: ComputeFilesManifest): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setPages(value: ComputeFilesManifest): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
  }
}
