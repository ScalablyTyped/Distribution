package typings.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "OAuth2Server")
@js.native
class OAuth2Server () extends js.Object {
  def authorization(options: AuthorizeOptions, validate: ValidateFunction): MiddlewareFunction = js.native
  def authorization(options: AuthorizeOptions, validate: ValidateFunction, immediate: ImmediateFunction): MiddlewareFunction = js.native
  def authorization(validate: ValidateFunction): MiddlewareFunction = js.native
  def authorization(validate: ValidateFunction, immediate: ImmediateFunction): MiddlewareFunction = js.native
  def authorize(options: AuthorizeOptions, validate: ValidateFunction): MiddlewareFunction = js.native
  def authorize(validate: ValidateFunction): MiddlewareFunction = js.native
  def decision(): MiddlewareFunction = js.native
  def decision(options: DecisionOptions, parse: DecisionParseFunction): MiddlewareFunction = js.native
  def decision(parse: DecisionParseFunction): MiddlewareFunction = js.native
  def deserializeClient(fn: DeserializeClientFunction): Unit = js.native
  def deserializeClient(obj: js.Any, done: DeserializeClientDoneFunction): Unit = js.native
  def errorHandler(): MiddlewareErrorFunction = js.native
  def errorHandler(options: js.Any): MiddlewareErrorFunction = js.native
  def exchange(fn: MiddlewareFunction): OAuth2Server = js.native
  def exchange(`type`: String, fn: MiddlewareFunction): OAuth2Server = js.native
  def grant(fn: MiddlewareFunction): OAuth2Server = js.native
  def grant(`type`: String, fn: MiddlewareFunction): OAuth2Server = js.native
  def serializeClient(client: js.Any, done: SerializeClientDoneFunction): Unit = js.native
  def serializeClient(fn: SerializeClientFunction): Unit = js.native
  def token(): MiddlewareFunction = js.native
  def token(options: js.Any): MiddlewareFunction = js.native
}

