package typings.nivoColors.anon

import typings.nivoColors.distTypesSchemesAllMod.ColorSchemeId
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheme extends StObject {
  
  var scheme: Validator[ColorSchemeId]
  
  var size: Requireable[Double]
}
object Scheme {
  
  inline def apply(scheme: Validator[ColorSchemeId], size: Requireable[Double]): Scheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scheme]
  }
  
  extension [Self <: Scheme](x: Self) {
    
    inline def setScheme(value: Validator[ColorSchemeId]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Requireable[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
