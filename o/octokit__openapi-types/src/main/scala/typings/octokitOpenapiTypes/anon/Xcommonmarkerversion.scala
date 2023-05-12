package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xcommonmarkerversion extends StObject {
  
  /** @example text/html */
  var `content-type`: String
  
  /** @example <https://api.github.com/resource?page=2>; rel="next", <https://api.github.com/resource?page=5>; rel="last" */
  var link: String
  
  /** @example https://pipelines.actions.githubusercontent.com/OhgS4QRKqmgx7bKC27GKU83jnQjyeqG8oIMTge8eqtheppcmw8/_apis/pipelines/1/runs/176/signedlogcontent?urlExpires=2020-01-24T18%3A10%3A31.5729946Z&urlSigningMethod=HMACV1&urlSignature=agG73JakPYkHrh06seAkvmH7rBR4Ji4c2%2B6a2ejYh3E%3D */
  var location: String
  
  /** @example 0.17.4 */
  var `x-common-marker-version`: String
  
  /** @example 5000 */
  var `x-rate-limit-limit`: Double
  
  /** @example 4999 */
  var `x-rate-limit-remaining`: Double
  
  /** @example 1590701888 */
  var `x-rate-limit-reset`: Double
}
object Xcommonmarkerversion {
  
  inline def apply(
    `content-type`: String,
    link: String,
    location: String,
    `x-common-marker-version`: String,
    `x-rate-limit-limit`: Double,
    `x-rate-limit-remaining`: Double,
    `x-rate-limit-reset`: Double
  ): Xcommonmarkerversion = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-common-marker-version")(`x-common-marker-version`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-rate-limit-limit")(`x-rate-limit-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-rate-limit-remaining")(`x-rate-limit-remaining`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-rate-limit-reset")(`x-rate-limit-reset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xcommonmarkerversion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xcommonmarkerversion] (val x: Self) extends AnyVal {
    
    inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def `setX-common-marker-version`(value: String): Self = StObject.set(x, "x-common-marker-version", value.asInstanceOf[js.Any])
    
    inline def `setX-rate-limit-limit`(value: Double): Self = StObject.set(x, "x-rate-limit-limit", value.asInstanceOf[js.Any])
    
    inline def `setX-rate-limit-remaining`(value: Double): Self = StObject.set(x, "x-rate-limit-remaining", value.asInstanceOf[js.Any])
    
    inline def `setX-rate-limit-reset`(value: Double): Self = StObject.set(x, "x-rate-limit-reset", value.asInstanceOf[js.Any])
  }
}
