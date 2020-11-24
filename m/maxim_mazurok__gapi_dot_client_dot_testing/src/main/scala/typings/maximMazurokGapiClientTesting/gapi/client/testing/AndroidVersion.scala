package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidVersion extends js.Object {
  
  /** The API level for this Android version. Examples: 18, 19. */
  var apiLevel: js.UndefOr[Double] = js.native
  
  /** The code name for this Android version. Examples: "JellyBean", "KitKat". */
  var codeName: js.UndefOr[String] = js.native
  
  /** Market share for this version. */
  var distribution: js.UndefOr[Distribution] = js.native
  
  /** An opaque id for this Android version. Use this id to invoke the TestExecutionService. */
  var id: js.UndefOr[String] = js.native
  
  /** The date this Android version became available in the market. */
  var releaseDate: js.UndefOr[Date] = js.native
  
  /** Tags for this dimension. Examples: "default", "preview", "deprecated". */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /** A string representing this version of the Android OS. Examples: "4.3", "4.4". */
  var versionString: js.UndefOr[String] = js.native
}
object AndroidVersion {
  
  @scala.inline
  def apply(): AndroidVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidVersion]
  }
  
  @scala.inline
  implicit class AndroidVersionOps[Self <: AndroidVersion] (val x: Self) extends AnyVal {
    
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
    def setApiLevel(value: Double): Self = this.set("apiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiLevel: Self = this.set("apiLevel", js.undefined)
    
    @scala.inline
    def setCodeName(value: String): Self = this.set("codeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeName: Self = this.set("codeName", js.undefined)
    
    @scala.inline
    def setDistribution(value: Distribution): Self = this.set("distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: Date): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDate: Self = this.set("releaseDate", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersionString(value: String): Self = this.set("versionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionString: Self = this.set("versionString", js.undefined)
  }
}
