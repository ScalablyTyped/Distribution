package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAccuracy> */
trait AccuracyParameters extends StObject {
  
  var micros: js.UndefOr[Double] = js.undefined
  
  var millis: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var seconds: js.UndefOr[Double] = js.undefined
}
object AccuracyParameters {
  
  inline def apply(): AccuracyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccuracyParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccuracyParameters] (val x: Self) extends AnyVal {
    
    inline def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    inline def setMicrosUndefined: Self = StObject.set(x, "micros", js.undefined)
    
    inline def setMillis(value: Double): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
    
    inline def setMillisUndefined: Self = StObject.set(x, "millis", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
