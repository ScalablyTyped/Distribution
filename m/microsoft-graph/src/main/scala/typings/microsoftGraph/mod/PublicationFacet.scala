package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicationFacet extends js.Object {
  
  // The state of publication for this document. Either published or checkout. Read-only.
  var level: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the version that is visible to the current caller. Read-only.
  var versionId: js.UndefOr[NullableOption[String]] = js.native
}
object PublicationFacet {
  
  @scala.inline
  def apply(): PublicationFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicationFacet]
  }
  
  @scala.inline
  implicit class PublicationFacetOps[Self <: PublicationFacet] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: NullableOption[String]): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLevelNull: Self = this.set("level", null)
    
    @scala.inline
    def setVersionId(value: NullableOption[String]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
    
    @scala.inline
    def setVersionIdNull: Self = this.set("versionId", null)
  }
}
