package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollationDocument extends StObject {
  
  var alternate: js.UndefOr[String] = js.undefined
  
  var backwards: js.UndefOr[Boolean] = js.undefined
  
  var caseFirst: js.UndefOr[String] = js.undefined
  
  var caseLevel: js.UndefOr[Boolean] = js.undefined
  
  var locale: String
  
  var maxVariable: js.UndefOr[String] = js.undefined
  
  var normalization: js.UndefOr[Boolean] = js.undefined
  
  var numericOrdering: js.UndefOr[Boolean] = js.undefined
  
  var strength: js.UndefOr[scala.Double] = js.undefined
}
object CollationDocument {
  
  inline def apply(locale: String): CollationDocument = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollationDocument]
  }
  
  extension [Self <: CollationDocument](x: Self) {
    
    inline def setAlternate(value: String): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    inline def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
    
    inline def setCaseFirst(value: String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setCaseLevel(value: Boolean): Self = StObject.set(x, "caseLevel", value.asInstanceOf[js.Any])
    
    inline def setCaseLevelUndefined: Self = StObject.set(x, "caseLevel", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaxVariable(value: String): Self = StObject.set(x, "maxVariable", value.asInstanceOf[js.Any])
    
    inline def setMaxVariableUndefined: Self = StObject.set(x, "maxVariable", js.undefined)
    
    inline def setNormalization(value: Boolean): Self = StObject.set(x, "normalization", value.asInstanceOf[js.Any])
    
    inline def setNormalizationUndefined: Self = StObject.set(x, "normalization", js.undefined)
    
    inline def setNumericOrdering(value: Boolean): Self = StObject.set(x, "numericOrdering", value.asInstanceOf[js.Any])
    
    inline def setNumericOrderingUndefined: Self = StObject.set(x, "numericOrdering", js.undefined)
    
    inline def setStrength(value: scala.Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
  }
}
