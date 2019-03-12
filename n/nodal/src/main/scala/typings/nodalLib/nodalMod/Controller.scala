package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "Controller")
@js.native
class Controller ()
  extends fxnLib.fxnMod.Controller {
  /**
    * Using API formatting, send an http.ServerResponse indicating there was a Bad Request (400)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def badRequest(msg: java.lang.String, details: js.Any): scala.Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating there was an Internal Server Error (500)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def error(msg: java.lang.String, details: js.Any): scala.Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating the requested resource was Not Found (404)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def notFound(msg: java.lang.String, details: js.Any): scala.Boolean = js.native
  /**
    * Endpoint not implemented
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def notImplemented(msg: java.lang.String, details: js.Any): scala.Boolean = js.native
  def respond(data: js.Array[_]): scala.Boolean = js.native
  def respond(data: js.Array[_], arrInterface: js.Array[java.lang.String]): scala.Boolean = js.native
  def respond(data: js.Object): scala.Boolean = js.native
  def respond(data: js.Object, arrInterface: js.Array[java.lang.String]): scala.Boolean = js.native
  def respond(data: Model): scala.Boolean = js.native
  def respond(data: ModelArray[Model]): scala.Boolean = js.native
  def respond(data: ModelArray[Model], arrInterface: js.Array[java.lang.String]): scala.Boolean = js.native
  def respond(data: Model, arrInterface: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Using API formatting, generate an error or respond with model / object data.
    * @param {Error|Object|Array|Nodal.Model|Nodal.ModelArray} data Object to be formatted for API response
    * @param {optional Array} The interface to use for the data being returned, if not an error.
    * @return {boolean}
    */
  def respond(data: stdLib.Error): scala.Boolean = js.native
  def respond(data: stdLib.Error, arrInterface: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating there were Too Many Requests (429) (i.e. the client is being rate limited)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def tooManyRequests(msg: java.lang.String, details: js.Any): scala.Boolean = js.native
  /**
    * Using API formatting, send an http.ServerResponse indicating there was an Unauthorized request (401)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def unauthorized(msg: java.lang.String, details: js.Any): scala.Boolean = js.native
}

