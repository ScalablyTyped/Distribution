package typings.maximMazurokGapiClientLanguage.gapi.client.language

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLanguage.anon.Accesstoken
import typings.maximMazurokGapiClientLanguage.anon.Alt
import typings.maximMazurokGapiClientLanguage.anon.Callback
import typings.maximMazurokGapiClientLanguage.anon.Fields
import typings.maximMazurokGapiClientLanguage.anon.Key
import typings.maximMazurokGapiClientLanguage.anon.Oauthtoken
import typings.maximMazurokGapiClientLanguage.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentsResource extends StObject {
  
  /** Finds named entities (currently proper names and common nouns) in the text along with entity types, salience, mentions for each entity, and other properties. */
  def analyzeEntities(request: Accesstoken): Request[AnalyzeEntitiesResponse] = js.native
  def analyzeEntities(request: Alt, body: AnalyzeEntitiesRequest): Request[AnalyzeEntitiesResponse] = js.native
  
  def analyzeEntitySentiment(request: Alt, body: AnalyzeEntitySentimentRequest): Request[AnalyzeEntitySentimentResponse] = js.native
  /** Finds entities, similar to AnalyzeEntities in the text and analyzes sentiment associated with each entity and its mentions. */
  def analyzeEntitySentiment(request: Callback): Request[AnalyzeEntitySentimentResponse] = js.native
  
  def analyzeSentiment(request: Alt, body: AnalyzeSentimentRequest): Request[AnalyzeSentimentResponse] = js.native
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: Fields): Request[AnalyzeSentimentResponse] = js.native
  
  def analyzeSyntax(request: Alt, body: AnalyzeSyntaxRequest): Request[AnalyzeSyntaxResponse] = js.native
  /** Analyzes the syntax of the text and provides sentence boundaries and tokenization along with part of speech tags, dependency trees, and other properties. */
  def analyzeSyntax(request: Key): Request[AnalyzeSyntaxResponse] = js.native
  
  def annotateText(request: Alt, body: AnnotateTextRequest): Request[AnnotateTextResponse] = js.native
  /** A convenience method that provides all the features that analyzeSentiment, analyzeEntities, and analyzeSyntax provide in one call. */
  def annotateText(request: Oauthtoken): Request[AnnotateTextResponse] = js.native
  
  def classifyText(request: Alt, body: ClassifyTextRequest): Request[ClassifyTextResponse] = js.native
  /** Classifies a document into categories. */
  def classifyText(request: PrettyPrint): Request[ClassifyTextResponse] = js.native
}
