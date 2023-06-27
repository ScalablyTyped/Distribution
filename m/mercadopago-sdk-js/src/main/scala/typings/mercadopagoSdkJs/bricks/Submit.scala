package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Submit[BrickType] extends StObject {
  
  def onSubmit(formData: CardFormData): /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? std.Promise<string> : std.Promise<void> */ js.Any = js.native
  def onSubmit(formData: CardFormData, additionalData: AdditionalCardFormData): /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? std.Promise<string> : std.Promise<void> */ js.Any = js.native
  def onSubmit(formData: CardFormData, additionalData: AdditionalPaymentFormData): /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? std.Promise<string> : std.Promise<void> */ js.Any = js.native
  def onSubmit(formData: PaymentFormData): /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? std.Promise<string> : std.Promise<void> */ js.Any = js.native
  def onSubmit(formData: PaymentFormData, additionalData: AdditionalCardFormData): /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? std.Promise<string> : std.Promise<void> */ js.Any = js.native
  def onSubmit(formData: PaymentFormData, additionalData: AdditionalPaymentFormData): /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? std.Promise<string> : std.Promise<void> */ js.Any = js.native
}
