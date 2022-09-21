package typings.nivoColors.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datum extends StObject {
  
  var datum: Validator[String]
}
object Datum {
  
  inline def apply(datum: Validator[String]): Datum = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
  
  extension [Self <: Datum](x: Self) {
    
    inline def setDatum(value: Validator[String]): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
  }
}
