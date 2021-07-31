package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebaserules.anon.Alt
import typings.maximMazurokGapiClientFirebaserules.anon.Fields
import typings.maximMazurokGapiClientFirebaserules.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesetsResource extends StObject {
  
  def create(request: Alt, body: Ruleset): Request[Ruleset] = js.native
  /**
    * Create a `Ruleset` from `Source`. The `Ruleset` is given a unique generated name which is returned to the caller. `Source` containing syntactic or semantics errors will result in an
    * error response indicating the first error encountered. For a detailed view of `Source` issues, use TestRuleset.
    */
  def create(request: Name): Request[Ruleset] = js.native
  
  /** Delete a `Ruleset` by resource name. If the `Ruleset` is referenced by a `Release` the operation will fail. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(): Request[Ruleset] = js.native
  def get(request: Alt): Request[Ruleset] = js.native
  
  /** List `Ruleset` metadata only and optionally filter the results by `Ruleset` name. The full `Source` contents of a `Ruleset` may be retrieved with GetRuleset. */
  def list(): Request[ListRulesetsResponse] = js.native
  def list(request: Fields): Request[ListRulesetsResponse] = js.native
}
