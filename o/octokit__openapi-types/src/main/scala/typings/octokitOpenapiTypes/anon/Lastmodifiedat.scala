package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastmodifiedat extends StObject {
  
  var file_size: js.UndefOr[Double] = js.undefined
  
  /** Format: uri */
  var git_url: String
  
  /** Format: uri */
  var html_url: String
  
  var language: js.UndefOr[String | Null] = js.undefined
  
  /** Format: date-time */
  var last_modified_at: js.UndefOr[String] = js.undefined
  
  /**
    * @example [
    *   "73..77",
    *   "77..78"
    * ]
    */
  var line_numbers: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var path: String
  
  var repository: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['minimal-repository'] */ js.Any
  
  var score: Double
  
  var sha: String
  
  var text_matches: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['search-result-text-matches'] */ js.Any
  ] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Lastmodifiedat {
  
  inline def apply(
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    repository: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['minimal-repository'] */ js.Any,
    score: Double,
    sha: String,
    url: String
  ): Lastmodifiedat = {
    val __obj = js.Dynamic.literal(git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastmodifiedat]
  }
  
  extension [Self <: Lastmodifiedat](x: Self) {
    
    inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
    
    inline def setFile_sizeUndefined: Self = StObject.set(x, "file_size", js.undefined)
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLast_modified_at(value: String): Self = StObject.set(x, "last_modified_at", value.asInstanceOf[js.Any])
    
    inline def setLast_modified_atUndefined: Self = StObject.set(x, "last_modified_at", js.undefined)
    
    inline def setLine_numbers(value: js.Array[String]): Self = StObject.set(x, "line_numbers", value.asInstanceOf[js.Any])
    
    inline def setLine_numbersUndefined: Self = StObject.set(x, "line_numbers", js.undefined)
    
    inline def setLine_numbersVarargs(value: String*): Self = StObject.set(x, "line_numbers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepository(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['minimal-repository'] */ js.Any
    ): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setText_matches(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['search-result-text-matches'] */ js.Any
    ): Self = StObject.set(x, "text_matches", value.asInstanceOf[js.Any])
    
    inline def setText_matchesUndefined: Self = StObject.set(x, "text_matches", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
