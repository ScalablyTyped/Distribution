package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * Current default options
    */
  var DEFAULTS: EndpointOptions = js.native
  def apply(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def apply(Route: String): RequestOptions = js.native
  def apply(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
  /**
    * Merges existing defaults with passed options and returns new endpoint() method with new defaults
    */
  def defaults(EndpointOptions: EndpointOptions): Endpoint = js.native
  def merge(EndpointOptions: EndpointOptions): RequestOptions = js.native
  /**
    * Get the defaulted endpoint options, but without parsing them into request options:
    */
  def merge(Route: String): RequestOptions = js.native
  def merge(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
  /**
    * Stateless method to turn endpoint options into request options. Calling endpoint(options) is the same as calling endpoint.parse(endpoint.merge(options)).
    */
  def parse(EndpointOptions: EndpointOptions): RequestOptions = js.native
}

