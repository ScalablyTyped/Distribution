package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "Controller")
@js.native
open class Controller protected ()
  extends typings.fxn.mod.Controller {
  def this(path: String, method: String, requestHeaders: js.Object, params: js.Object, responder: js.Function) = this()
  
  /**
    * Using API formatting, send an http.ServerResponse indicating there was a Bad Request (400)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def badRequest(msg: String, details: Any): Boolean = js.native
  
  /**
    * Using API formatting, send an http.ServerResponse indicating there was an Internal Server Error (500)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def error(msg: String, details: Any): Boolean = js.native
  
  /**
    * Using API formatting, send an http.ServerResponse indicating the requested resource was Not Found (404)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def notFound(msg: String, details: Any): Boolean = js.native
  
  /**
    * Endpoint not implemented
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def notImplemented(msg: String, details: Any): Boolean = js.native
  
  def respond(data: js.Array[Any]): Boolean = js.native
  def respond(data: js.Array[Any], arrInterface: js.Array[String]): Boolean = js.native
  /**
    * Using API formatting, generate an error or respond with model / object data.
    * @param {Error|Object|Array|Nodal.Model|Nodal.ModelArray} data Object to be formatted for API response
    * @param {optional Array} The interface to use for the data being returned, if not an error.
    * @return {boolean}
    */
  def respond(data: js.Error): Boolean = js.native
  def respond(data: js.Error, arrInterface: js.Array[String]): Boolean = js.native
  def respond(data: js.Object): Boolean = js.native
  def respond(data: js.Object, arrInterface: js.Array[String]): Boolean = js.native
  def respond(data: Model): Boolean = js.native
  def respond(data: ModelArray[Model]): Boolean = js.native
  def respond(data: ModelArray[Model], arrInterface: js.Array[String]): Boolean = js.native
  def respond(data: Model, arrInterface: js.Array[String]): Boolean = js.native
  
  /**
    * Using API formatting, send an http.ServerResponse indicating there were Too Many Requests (429) (i.e. the client is being rate limited)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def tooManyRequests(msg: String, details: Any): Boolean = js.native
  
  /**
    * Using API formatting, send an http.ServerResponse indicating there was an Unauthorized request (401)
    * @param {string} msg Error message to send
    * @param {Object} details Any additional details for the error (must be serializable)
    * @return {boolean}
    */
  def unauthorized(msg: String, details: Any): Boolean = js.native
}
