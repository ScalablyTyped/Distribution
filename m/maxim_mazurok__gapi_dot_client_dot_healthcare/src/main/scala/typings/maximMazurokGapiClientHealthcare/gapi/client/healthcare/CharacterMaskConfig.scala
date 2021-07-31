package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterMaskConfig extends StObject {
  
  /** Character to mask the sensitive values. If not supplied, defaults to "*". */
  var maskingCharacter: js.UndefOr[String] = js.undefined
}
object CharacterMaskConfig {
  
  @scala.inline
  def apply(): CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterMaskConfig]
  }
  
  @scala.inline
  implicit class CharacterMaskConfigMutableBuilder[Self <: CharacterMaskConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskingCharacter(value: String): Self = StObject.set(x, "maskingCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskingCharacterUndefined: Self = StObject.set(x, "maskingCharacter", js.undefined)
  }
}
