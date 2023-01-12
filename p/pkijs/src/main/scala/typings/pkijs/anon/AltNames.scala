package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AltNames extends StObject {
  
  var altNames: js.UndefOr[String] = js.undefined
}
object AltNames {
  
  inline def apply(): AltNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AltNames] (val x: Self) extends AnyVal {
    
    inline def setAltNames(value: String): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
    
    inline def setAltNamesUndefined: Self = StObject.set(x, "altNames", js.undefined)
  }
}
