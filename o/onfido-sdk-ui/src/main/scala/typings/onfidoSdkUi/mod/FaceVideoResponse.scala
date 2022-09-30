package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceVideoResponse
  extends StObject
     with UploadFileResponse {
  
  var challenge: js.Array[ChallengePayload]
  
  var languages: js.Array[VideoChallengeLanguage]
}
object FaceVideoResponse {
  
  inline def apply(
    challenge: js.Array[ChallengePayload],
    created_at: String,
    download_href: String,
    file_name: String,
    file_size: Double,
    file_type: String,
    href: String,
    id: String,
    languages: js.Array[VideoChallengeLanguage]
  ): FaceVideoResponse = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_href = download_href.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], file_type = file_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceVideoResponse]
  }
  
  extension [Self <: FaceVideoResponse](x: Self) {
    
    inline def setChallenge(value: js.Array[ChallengePayload]): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeVarargs(value: ChallengePayload*): Self = StObject.set(x, "challenge", js.Array(value*))
    
    inline def setLanguages(value: js.Array[VideoChallengeLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: VideoChallengeLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
