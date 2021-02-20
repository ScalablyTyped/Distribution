package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountBy extends StObject {
  
  var countBy: String = js.native
}
object CountBy {
  
  @scala.inline
  def apply(countBy: String): CountBy = {
    val __obj = js.Dynamic.literal(countBy = countBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountBy]
  }
  
  @scala.inline
  implicit class CountByMutableBuilder[Self <: CountBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountBy(value: String): Self = StObject.set(x, "countBy", value.asInstanceOf[js.Any])
  }
}
