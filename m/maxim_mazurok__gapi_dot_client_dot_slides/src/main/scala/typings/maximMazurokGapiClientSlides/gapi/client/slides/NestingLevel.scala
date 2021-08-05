package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestingLevel extends StObject {
  
  /** The style of a bullet at this level of nesting. */
  var bulletStyle: js.UndefOr[TextStyle] = js.undefined
}
object NestingLevel {
  
  inline def apply(): NestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevel]
  }
  
  extension [Self <: NestingLevel](x: Self) {
    
    inline def setBulletStyle(value: TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
    
    inline def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
  }
}
