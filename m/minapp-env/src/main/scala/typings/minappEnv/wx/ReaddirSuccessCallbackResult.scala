package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaddirSuccessCallbackResult extends StObject {
  
  /** 指定目录下的文件名数组。 */
  var files: Array[String] = js.native
}
object ReaddirSuccessCallbackResult {
  
  @scala.inline
  def apply(files: Array[String]): ReaddirSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ReaddirSuccessCallbackResultMutableBuilder[Self <: ReaddirSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
