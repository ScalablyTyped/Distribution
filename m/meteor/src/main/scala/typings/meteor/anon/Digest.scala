package typings.meteor.anon

import typings.meteor.meteorStrings.`sha-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Digest extends StObject {
  
  var algorithm: `sha-256` = js.native
  
  var digest: String = js.native
}
object Digest {
  
  @scala.inline
  def apply(algorithm: `sha-256`, digest: String): Digest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  
  @scala.inline
  implicit class DigestMutableBuilder[Self <: Digest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: `sha-256`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
  }
}
