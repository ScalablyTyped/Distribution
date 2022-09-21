package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headsha extends StObject {
  
  /** @description The sha of the head commit. */
  var head_sha: String
}
object Headsha {
  
  inline def apply(head_sha: String): Headsha = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headsha]
  }
  
  extension [Self <: Headsha](x: Self) {
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
  }
}
