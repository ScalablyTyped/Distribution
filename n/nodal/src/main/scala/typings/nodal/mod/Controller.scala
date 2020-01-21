package typings.nodal.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "Controller")
@js.native
class Controller ()
  extends typings.fxn.mod.Controller {
  /**
    * Using API formatting, send an http.ServerResponse indicating there was a Bad Request (400)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def badRequest(msg: String, details: js.Any): Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating there was an Internal Server Error (500)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def error(msg: String, details: js.Any): Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating the requested resource was Not Found (404)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def notFound(msg: String, details: js.Any): Boolean = js.native
  /**
    * Endpoint not implemented
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def notImplemented(msg: String, details: js.Any): Boolean = js.native
  def respond(data: js.Array[_]): Boolean = js.native
  def respond(data: js.Array[_], arrInterface: js.Array[String]): Boolean = js.native
  def respond(data: js.Object): Boolean = js.native
  def respond(data: js.Object, arrInterface: js.Array[String]): Boolean = js.native
  def respond(data: Model): Boolean = js.native
  def respond(data: ModelArray[Model]): Boolean = js.native
  def respond(data: ModelArray[Model], arrInterface: js.Array[String]): Boolean = js.native
  def respond(data: Model, arrInterface: js.Array[String]): Boolean = js.native
  /**
    * Using API formatting, generate an error or respond with model / object data.
    * @param {Error|Object|Array|Nodal.Model|Nodal.ModelArray} data Object to be formatted for API response
    * @param {optional Array} The interface to use for the data being returned, if not an error.
    * @return {boolean}
    */
  def respond(data: Error): Boolean = js.native
  def respond(data: Error, arrInterface: js.Array[String]): Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating there were Too Many Requests (429) (i.e. the client is being rate limited)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def tooManyRequests(msg: String, details: js.Any): Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating there was an Unauthorized request (401)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def unauthorized(msg: String, details: js.Any): Boolean = js.native
}

