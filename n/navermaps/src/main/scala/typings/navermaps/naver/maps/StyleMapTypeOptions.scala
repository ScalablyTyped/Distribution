package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StyleMapTypeOptions
  */
trait StyleMapTypeOptions
  extends StObject
     with ImageMapTypeOptions {
  
  var hd: js.UndefOr[String] = js.undefined
}
object StyleMapTypeOptions {
  
  inline def apply(): StyleMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleMapTypeOptions]
  }
  
  extension [Self <: StyleMapTypeOptions](x: Self) {
    
    inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
    
    inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
  }
}
