package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webkitappearance extends StObject {
  
  var `-webkit-appearance`: String
}
object Webkitappearance {
  
  inline def apply(`-webkit-appearance`: String): Webkitappearance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-webkit-appearance")(`-webkit-appearance`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webkitappearance]
  }
  
  extension [Self <: Webkitappearance](x: Self) {
    
    inline def `set-webkit-appearance`(value: String): Self = StObject.set(x, "-webkit-appearance", value.asInstanceOf[js.Any])
  }
}
