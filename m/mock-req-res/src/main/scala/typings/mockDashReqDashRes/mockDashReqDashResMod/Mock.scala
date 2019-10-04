package typings.mockDashReqDashRes.mockDashReqDashResMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock extends js.Object {
  def mockRequest(): RequestOutput = js.native
  def mockRequest(options: RequestPayload): RequestOutput = js.native
  def mockResponse(): ResponseOutput = js.native
  def mockResponse(options: ResponsePayload): ResponseOutput = js.native
}

