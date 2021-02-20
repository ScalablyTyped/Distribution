package typings.miniprogram

import typings.miniprogram.anon.Digest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileArgs extends AsyncCallback[Digest] {
  
  var apFilePath: String = js.native
  
  /**
    * Digest algorithm, supporting md5 and sha1, md5 by default.
    */
  var digestAlgorithm: js.UndefOr[String] = js.native
}
object GetFileArgs {
  
  @scala.inline
  def apply(apFilePath: String): GetFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileArgs]
  }
  
  @scala.inline
  implicit class GetFileArgsMutableBuilder[Self <: GetFileArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
  }
}
