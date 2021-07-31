package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingSource extends StObject {
  
  // Not yet documented
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var id: js.UndefOr[NullableOption[String]] = js.undefined
}
object SettingSource {
  
  @scala.inline
  def apply(): SettingSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingSource]
  }
  
  @scala.inline
  implicit class SettingSourceMutableBuilder[Self <: SettingSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
