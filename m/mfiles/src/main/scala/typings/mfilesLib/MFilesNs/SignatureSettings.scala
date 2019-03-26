package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SignatureSettings")
@js.native
class SignatureSettings ()
  extends mfilesLib.ISignatureSettings {
  /* CompleteClass */
  override var AdditionalInfo: java.lang.String = js.native
  /* CompleteClass */
  override var FreeFormTextPropertyID: scala.Double = js.native
  /* CompleteClass */
  override var IsFreeFormTextPrompted: scala.Boolean = js.native
  /* CompleteClass */
  override var IsRequired: scala.Boolean = js.native
  /* CompleteClass */
  override var IsSeparateSignatureObject: scala.Boolean = js.native
  /* CompleteClass */
  override var ManifestationPropertyID: scala.Double = js.native
  /* CompleteClass */
  override val PromptInfoType: MFSignaturePromptInfoType = js.native
  /* CompleteClass */
  override var SignatureIdentifier: java.lang.String = js.native
  /* CompleteClass */
  override var SignaturePromptInfoFixed: mfilesLib.ISignaturePromptInfo = js.native
  /* CompleteClass */
  override var SignaturePromptInfoMetadataBased: mfilesLib.ISignaturePromptInfoMetadataBased = js.native
  /* CompleteClass */
  override var SignaturePromptInfoSelectable: mfilesLib.ISignaturePromptInfoSelectable = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISignatureSettings = js.native
}

