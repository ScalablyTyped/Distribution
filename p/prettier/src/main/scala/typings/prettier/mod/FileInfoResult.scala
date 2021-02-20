package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileInfoResult extends StObject {
  
  var ignored: Boolean = js.native
  
  var inferredParser: String | Null = js.native
}
object FileInfoResult {
  
  @scala.inline
  def apply(ignored: Boolean): FileInfoResult = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfoResult]
  }
  
  @scala.inline
  implicit class FileInfoResultMutableBuilder[Self <: FileInfoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredParser(value: String): Self = StObject.set(x, "inferredParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredParserNull: Self = StObject.set(x, "inferredParser", null)
  }
}
