package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XcodeVersion extends StObject {
  
  /** Tags for this Xcode version. Example: "default". */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /** The id for this version. Example: "9.2". */
  var version: js.UndefOr[String] = js.native
}
object XcodeVersion {
  
  @scala.inline
  def apply(): XcodeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XcodeVersion]
  }
  
  @scala.inline
  implicit class XcodeVersionMutableBuilder[Self <: XcodeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
