package typings.payuEmeaSdk.payu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayU extends StObject {
  
  def extractRefReqId(input: String): String = js.native
  
  def secureForms(): SecureForms = js.native
  def secureForms(options: SecureFormsOptions): SecureForms = js.native
  
  def sendCvv(refReqId: String): js.Promise[SendCvvResultSuccess | SendCvvResultError] = js.native
  
  def tokenize(): js.Promise[TokenizeResultSuccess | TokenizeResultError] = js.native
  def tokenize(`type`: tokenType): js.Promise[TokenizeResultSuccess | TokenizeResultError] = js.native
}
