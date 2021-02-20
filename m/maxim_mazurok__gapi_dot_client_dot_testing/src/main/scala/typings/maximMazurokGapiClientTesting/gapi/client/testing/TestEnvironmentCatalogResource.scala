package typings.maximMazurokGapiClientTesting.gapi.client.testing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTesting.anon.EnvironmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEnvironmentCatalogResource extends StObject {
  
  /**
    * Gets the catalog of supported test environments. May return any of the following canonical error codes: - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * environment type does not exist - INTERNAL - if an internal error occurred
    */
  def get(): Request[TestEnvironmentCatalog] = js.native
  def get(request: EnvironmentType): Request[TestEnvironmentCatalog] = js.native
}
