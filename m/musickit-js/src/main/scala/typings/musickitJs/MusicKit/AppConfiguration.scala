package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configuration for an app.
  */
trait AppConfiguration extends StObject {
  
  /**
    * The build number of your app.
    */
  var build: js.UndefOr[String] = js.undefined
  
  /**
    * A URL for your app icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The name of your app.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The version of your app.
    */
  var version: js.UndefOr[String] = js.undefined
}
object AppConfiguration {
  
  inline def apply(): AppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfiguration]
  }
  
  extension [Self <: AppConfiguration](x: Self) {
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
