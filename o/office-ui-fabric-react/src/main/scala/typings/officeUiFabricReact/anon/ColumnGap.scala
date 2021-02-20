package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGap extends StObject {
  
  var columnGap: Unit = js.native
  
  var rowGap: Unit = js.native
}
object ColumnGap {
  
  @scala.inline
  def apply(columnGap: Unit, rowGap: Unit): ColumnGap = {
    val __obj = js.Dynamic.literal(columnGap = columnGap.asInstanceOf[js.Any], rowGap = rowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGap]
  }
  
  @scala.inline
  implicit class ColumnGapMutableBuilder[Self <: ColumnGap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnGap(value: Unit): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGap(value: Unit): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
  }
}
