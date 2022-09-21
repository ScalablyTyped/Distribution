package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.KeyNlpService
import typings.maximMazurokGapiClientHealthcare.anon.NlpService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NlpResource extends StObject {
  
  def analyzeEntities(request: KeyNlpService, body: AnalyzeEntitiesRequest): Request[AnalyzeEntitiesResponse] = js.native
  /**
    * Analyze heathcare entity in a document. Its response includes the recognized entity mentions and the relationships between them. AnalyzeEntities uses context aware models to detect
    * entities.
    */
  def analyzeEntities(request: NlpService): Request[AnalyzeEntitiesResponse] = js.native
}
