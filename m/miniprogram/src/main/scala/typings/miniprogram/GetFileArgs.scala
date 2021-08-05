package typings.miniprogram

import typings.miniprogram.anon.Digest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileArgs
  extends StObject
     with AsyncCallback[Digest] {
  
  var apFilePath: String
  
  /**
    * Digest algorithm, supporting md5 and sha1, md5 by default.
    */
  var digestAlgorithm: js.UndefOr[String] = js.undefined
}
object GetFileArgs {
  
  inline def apply(apFilePath: String): GetFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileArgs]
  }
  
  extension [Self <: GetFileArgs](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
  }
}
