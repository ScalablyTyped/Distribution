package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignatureSettings extends js.Object {
  var AdditionalInfo: java.lang.String
  var FreeFormTextPropertyID: scala.Double
  var IsFreeFormTextPrompted: scala.Boolean
  var IsRequired: scala.Boolean
  var IsSeparateSignatureObject: scala.Boolean
  var ManifestationPropertyID: scala.Double
  val PromptInfoType: mfilesLib.MFilesNs.MFSignaturePromptInfoType
  var SignatureIdentifier: java.lang.String
  var SignaturePromptInfoFixed: ISignaturePromptInfo
  var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased
  var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable
  def Clone(): ISignatureSettings
}

