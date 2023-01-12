package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ORawExpression
  extends StObject
     with _OSqlExpression {
  
  def as(alias: String): ORawExpression
  
  var db: ODB
  
  var value: String
}
object ORawExpression {
  
  inline def apply(as: String => ORawExpression, db: ODB, value: String): ORawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ORawExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ORawExpression] (val x: Self) extends AnyVal {
    
    inline def setAs(value: String => ORawExpression): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
    
    inline def setDb(value: ODB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
