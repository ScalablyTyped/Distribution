package typings.mfiles.global.MFiles

import typings.mfiles.ISignaturePromptInfo
import typings.mfiles.ISignaturePromptInfoMetadataBased
import typings.mfiles.ISignaturePromptInfoSelectable
import typings.mfiles.ISignatureSettings
import typings.mfiles.MFiles.MFSignaturePromptInfoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SignatureSettings")
@js.native
class SignatureSettings ()
  extends StObject
     with ISignatureSettings {
  
  /* CompleteClass */
  var AdditionalInfo: String = js.native
  
  /* CompleteClass */
  override def Clone(): ISignatureSettings = js.native
  
  /* CompleteClass */
  var FreeFormTextPropertyID: Double = js.native
  
  /* CompleteClass */
  var IsFreeFormTextPrompted: Boolean = js.native
  
  /* CompleteClass */
  var IsRequired: Boolean = js.native
  
  /* CompleteClass */
  var IsSeparateSignatureObject: Boolean = js.native
  
  /* CompleteClass */
  var ManifestationPropertyID: Double = js.native
  
  /* CompleteClass */
  override val PromptInfoType: MFSignaturePromptInfoType = js.native
  
  /* CompleteClass */
  var SignatureIdentifier: String = js.native
  
  /* CompleteClass */
  var SignaturePromptInfoFixed: ISignaturePromptInfo = js.native
  
  /* CompleteClass */
  var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased = js.native
  
  /* CompleteClass */
  var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable = js.native
}
