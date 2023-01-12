package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicConstraintsJson extends StObject {
  
  var cA: js.UndefOr[Boolean] = js.undefined
  
  var pathLenConstraint: js.UndefOr[IntegerJson | Double] = js.undefined
}
object BasicConstraintsJson {
  
  inline def apply(): BasicConstraintsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicConstraintsJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicConstraintsJson] (val x: Self) extends AnyVal {
    
    inline def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    inline def setCAUndefined: Self = StObject.set(x, "cA", js.undefined)
    
    inline def setPathLenConstraint(value: IntegerJson | Double): Self = StObject.set(x, "pathLenConstraint", value.asInstanceOf[js.Any])
    
    inline def setPathLenConstraintUndefined: Self = StObject.set(x, "pathLenConstraint", js.undefined)
  }
}
