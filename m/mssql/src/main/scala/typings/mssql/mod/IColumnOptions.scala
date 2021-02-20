package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnOptions extends StObject {
  
  var identity: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var nullable: js.UndefOr[Boolean] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
}
object IColumnOptions {
  
  @scala.inline
  def apply(): IColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnOptions]
  }
  
  @scala.inline
  implicit class IColumnOptionsMutableBuilder[Self <: IColumnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
