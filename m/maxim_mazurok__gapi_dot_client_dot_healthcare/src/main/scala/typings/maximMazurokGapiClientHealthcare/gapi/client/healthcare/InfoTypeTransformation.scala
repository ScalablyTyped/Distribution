package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoTypeTransformation extends StObject {
  
  /** Config for character mask. */
  var characterMaskConfig: js.UndefOr[CharacterMaskConfig] = js.undefined
  
  /** Config for crypto hash. */
  var cryptoHashConfig: js.UndefOr[CryptoHashConfig] = js.undefined
  
  /** Config for date shift. */
  var dateShiftConfig: js.UndefOr[DateShiftConfig] = js.undefined
  
  /** InfoTypes to apply this transformation to. If this is not specified, the transformation applies to any info_type. */
  var infoTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Config for text redaction. */
  var redactConfig: js.UndefOr[js.Any] = js.undefined
  
  /** Config for replace with InfoType. */
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.undefined
}
object InfoTypeTransformation {
  
  inline def apply(): InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoTypeTransformation]
  }
  
  extension [Self <: InfoTypeTransformation](x: Self) {
    
    inline def setCharacterMaskConfig(value: CharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    inline def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    inline def setCryptoHashConfig(value: CryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    inline def setDateShiftConfig(value: DateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    inline def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    inline def setInfoTypes(value: js.Array[String]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: String*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    inline def setRedactConfig(value: js.Any): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    inline def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    inline def setReplaceWithInfoTypeConfig(value: js.Any): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
  }
}
