package typings.openGraph.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata
  extends /* key */ StringDictionary[js.UndefOr[String | js.Array[String]]] {
  
  /** An alternate url to use if the webpage requires HTTPS. */
  var secure_url: js.UndefOr[String | js.Array[String]] = js.native
  
  /** A MIME type for this image. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSecure_urlVarargs(value: String*): Self = this.set("secure_url", js.Array(value :_*))
    
    @scala.inline
    def setSecure_url(value: String | js.Array[String]): Self = this.set("secure_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure_url: Self = this.set("secure_url", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
