package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoTypeTransformation extends StObject {
  
  /** Config for character mask. */
  var characterMaskConfig: js.UndefOr[CharacterMaskConfig] = js.native
  
  /** Config for crypto hash. */
  var cryptoHashConfig: js.UndefOr[CryptoHashConfig] = js.native
  
  /** Config for date shift. */
  var dateShiftConfig: js.UndefOr[DateShiftConfig] = js.native
  
  /** InfoTypes to apply this transformation to. If this is not specified, the transformation applies to any info_type. */
  var infoTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Config for text redaction. */
  var redactConfig: js.UndefOr[js.Any] = js.native
  
  /** Config for replace with InfoType. */
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.native
}
object InfoTypeTransformation {
  
  @scala.inline
  def apply(): InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoTypeTransformation]
  }
  
  @scala.inline
  implicit class InfoTypeTransformationMutableBuilder[Self <: InfoTypeTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacterMaskConfig(value: CharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    @scala.inline
    def setCryptoHashConfig(value: CryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    @scala.inline
    def setDateShiftConfig(value: DateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    @scala.inline
    def setInfoTypes(value: js.Array[String]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: String*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setRedactConfig(value: js.Any): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: js.Any): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
  }
}
