package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/endpoint/dist-types/merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  def merge(): EndpointDefaults = js.native
  def merge(defaults: Null, route: js.UndefOr[scala.Nothing], options: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: Null, route: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: Null, route: RequestParameters, options: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: Null, route: Route): EndpointDefaults = js.native
  def merge(defaults: Null, route: Route, options: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: EndpointDefaults): EndpointDefaults = js.native
  def merge(defaults: EndpointDefaults, route: js.UndefOr[scala.Nothing], options: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: EndpointDefaults, route: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: EndpointDefaults, route: RequestParameters, options: RequestParameters): EndpointDefaults = js.native
  def merge(defaults: EndpointDefaults, route: Route): EndpointDefaults = js.native
  def merge(defaults: EndpointDefaults, route: Route, options: RequestParameters): EndpointDefaults = js.native
}

