package typings.msRest.mod

import typings.msRest.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest", "ServiceClient")
@js.native
/**
  * Initializes a new instance of the ServiceClient class.
  *
  * @param {ServiceClientCredentials} [credentials]    - BasicAuthenticationCredentials or
  * TokenCredentials object used for authentication.
  * @param {ServiceClientOptions} [options] The parameter options
  */
class ServiceClient () extends StObject {
  def this(credentials: ServiceClientCredentials) = this()
  def this(credentials: js.UndefOr[scala.Nothing], options: ServiceClientOptions) = this()
  def this(credentials: ServiceClientCredentials, options: ServiceClientOptions) = this()
  
  /**
    * Adds custom information to user agent header
    * @param {any} additionalUserAgentInfo - information to be added to user agent header, as string.
    */
  def addUserAgentInfo(additionalUserAgentInfo: js.Any): Unit = js.native
  
  /**
    * Attempts to find package.json for the given azure nodejs package.
    * If found, returns the name and version of the package by reading the package.json
    * If package.json is not found, returns a default value.
    * @param {string} managementClientDir - pass the directory of the specific azure management client.
    * @returns {object} packageJsonInfo - "name" and "version" of the desired package.
    */
  def getPackageJsonInfo(managementClientDir: String): Name = js.native
  
  def sendRequest[TResult](options: PathTemplateBasedRequestPrepareOptions): js.Promise[TResult] = js.native
  def sendRequest[TResult](options: PathTemplateBasedRequestPrepareOptions, callback: ServiceCallback[TResult]): Unit = js.native
  def sendRequest[TResult](options: UrlBasedRequestPrepareOptions): js.Promise[TResult] = js.native
  def sendRequest[TResult](options: UrlBasedRequestPrepareOptions, callback: ServiceCallback[TResult]): Unit = js.native
  
  def sendRequestWithHttpOperationResponse[TResult](options: PathTemplateBasedRequestPrepareOptions): js.Promise[HttpOperationResponse[TResult]] = js.native
  def sendRequestWithHttpOperationResponse[TResult](options: UrlBasedRequestPrepareOptions): js.Promise[HttpOperationResponse[TResult]] = js.native
}
