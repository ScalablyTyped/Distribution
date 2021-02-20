package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScore extends StObject {
  
  /** The formatted score for this player score. */
  var formattedScore: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScore`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The numerical value for this player score. */
  var score: js.UndefOr[String] = js.native
  
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  
  /** The time span for this player score. */
  var timeSpan: js.UndefOr[String] = js.native
}
object PlayerScore {
  
  @scala.inline
  def apply(): PlayerScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScore]
  }
  
  @scala.inline
  implicit class PlayerScoreMutableBuilder[Self <: PlayerScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedScore(value: String): Self = StObject.set(x, "formattedScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedScoreUndefined: Self = StObject.set(x, "formattedScore", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
  }
}
