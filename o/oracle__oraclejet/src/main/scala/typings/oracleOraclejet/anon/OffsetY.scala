package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetY extends StObject {
  
  var offsetY: js.UndefOr[Double] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object OffsetY {
  
  @scala.inline
  def apply(): OffsetY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetY]
  }
  
  @scala.inline
  implicit class OffsetYMutableBuilder[Self <: OffsetY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
