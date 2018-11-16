package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Request")
@js.native
class Request[D, E] protected ()
  extends awsDashSdkLib.awsDashSdkMod.Request[D, E] {
  /**
       * Creates a request for an operation on a given service with a set of input parameters.
       *
       * @param {AWS.Service} service - The service to perform the operation on.
       * @param {string} operation - The operation to perform on the service.
       * @param {object} params - Parameters to send to the operation.
       */
  def this(service: awsDashSdkLib.libServiceMod.Service, operation: java.lang.String) = this()
  /**
       * Creates a request for an operation on a given service with a set of input parameters.
       *
       * @param {AWS.Service} service - The service to perform the operation on.
       * @param {string} operation - The operation to perform on the service.
       * @param {object} params - Parameters to send to the operation.
       */
  def this(service: awsDashSdkLib.libServiceMod.Service, operation: java.lang.String, params: js.Any) = this()
}

