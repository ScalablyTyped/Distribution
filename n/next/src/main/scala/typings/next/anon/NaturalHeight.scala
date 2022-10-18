package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NaturalHeight extends StObject {
  
  var naturalHeight: Double
  
  var naturalWidth: Double
}
object NaturalHeight {
  
  inline def apply(naturalHeight: Double, naturalWidth: Double): NaturalHeight = {
    val __obj = js.Dynamic.literal(naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NaturalHeight]
  }
  
  extension [Self <: NaturalHeight](x: Self) {
    
    inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
    
    inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
  }
}
