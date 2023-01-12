package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IBasicConstraints> */
trait BasicConstraintsParameters extends StObject {
  
  var cA: js.UndefOr[Boolean] = js.undefined
  
  var pathLenConstraint: js.UndefOr[Double | Integer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object BasicConstraintsParameters {
  
  inline def apply(): BasicConstraintsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicConstraintsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicConstraintsParameters] (val x: Self) extends AnyVal {
    
    inline def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    inline def setCAUndefined: Self = StObject.set(x, "cA", js.undefined)
    
    inline def setPathLenConstraint(value: Double | Integer): Self = StObject.set(x, "pathLenConstraint", value.asInstanceOf[js.Any])
    
    inline def setPathLenConstraintUndefined: Self = StObject.set(x, "pathLenConstraint", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
