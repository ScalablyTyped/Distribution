package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTpu.anon.Accesstoken
import typings.maximMazurokGapiClientTpu.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TensorflowVersionsResource extends StObject {
  
  /** Gets TensorFlow Version. */
  def get(): Request[TensorFlowVersion] = js.native
  def get(request: Accesstoken): Request[TensorFlowVersion] = js.native
  
  /** List TensorFlow versions supported by this API. */
  def list(): Request[ListTensorFlowVersionsResponse] = js.native
  def list(request: Alt): Request[ListTensorFlowVersionsResponse] = js.native
}
