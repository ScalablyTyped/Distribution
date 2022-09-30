package typings.pkijs.anon

import typings.pkijs.mod.SchemaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatedSequence extends StObject {
  
  var repeatedSequence: js.UndefOr[String] = js.undefined
  
  var repeatedSet: js.UndefOr[String] = js.undefined
  
  var typeAndValue: js.UndefOr[SchemaType] = js.undefined
}
object RepeatedSequence {
  
  inline def apply(): RepeatedSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatedSequence]
  }
  
  extension [Self <: RepeatedSequence](x: Self) {
    
    inline def setRepeatedSequence(value: String): Self = StObject.set(x, "repeatedSequence", value.asInstanceOf[js.Any])
    
    inline def setRepeatedSequenceUndefined: Self = StObject.set(x, "repeatedSequence", js.undefined)
    
    inline def setRepeatedSet(value: String): Self = StObject.set(x, "repeatedSet", value.asInstanceOf[js.Any])
    
    inline def setRepeatedSetUndefined: Self = StObject.set(x, "repeatedSet", js.undefined)
    
    inline def setTypeAndValue(value: SchemaType): Self = StObject.set(x, "typeAndValue", value.asInstanceOf[js.Any])
    
    inline def setTypeAndValueUndefined: Self = StObject.set(x, "typeAndValue", js.undefined)
  }
}
