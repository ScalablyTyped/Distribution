package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ORawExpression extends _OSqlExpression {
  
  def as(alias: String): ORawExpression = js.native
  
  var db: ODB = js.native
  
  var value: String = js.native
}
object ORawExpression {
  
  @scala.inline
  def apply(as: String => ORawExpression, db: ODB, value: String): ORawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ORawExpression]
  }
  
  @scala.inline
  implicit class ORawExpressionMutableBuilder[Self <: ORawExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String => ORawExpression): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDb(value: ODB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
