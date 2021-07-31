package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFormattingOptions extends StObject {
  
  var capSQL: js.UndefOr[Boolean] = js.undefined
  
  var `def`: js.UndefOr[js.Any] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
}
object IFormattingOptions {
  
  @scala.inline
  def apply(): IFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormattingOptions]
  }
  
  @scala.inline
  implicit class IFormattingOptionsMutableBuilder[Self <: IFormattingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapSQL(value: Boolean): Self = StObject.set(x, "capSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapSQLUndefined: Self = StObject.set(x, "capSQL", js.undefined)
    
    @scala.inline
    def setDef(value: js.Any): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
  }
}
