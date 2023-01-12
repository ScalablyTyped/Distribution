package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnLink
  extends StObject
     with Entity {
  
  // The name of the column in this content type.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object ColumnLink {
  
  inline def apply(): ColumnLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnLink] (val x: Self) extends AnyVal {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
