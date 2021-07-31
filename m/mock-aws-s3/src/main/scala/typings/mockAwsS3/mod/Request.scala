package typings.mockAwsS3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "Request")
@js.native
class Request[D, E] protected ()
  extends typings.awsSdk.mod.Request[D, E] {
  /**
    * Creates a request for an operation on a given service with a set of input parameters.
    *
    * @param {AWS.Service} service - The service to perform the operation on.
    * @param {string} operation - The operation to perform on the service.
    * @param {object} params - Parameters to send to the operation.
    */
  def this(service: typings.awsSdk.serviceMod.Service, operation: String) = this()
  def this(service: typings.awsSdk.serviceMod.Service, operation: String, params: js.Any) = this()
}
