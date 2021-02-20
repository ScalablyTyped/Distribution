package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidVersion extends StObject {
  
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
  implicit class AndroidVersionMutableBuilder[Self <: AndroidVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiLevel(value: Double): Self = StObject.set(x, "apiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiLevelUndefined: Self = StObject.set(x, "apiLevel", js.undefined)
    
    @scala.inline
    def setCodeName(value: String): Self = StObject.set(x, "codeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNameUndefined: Self = StObject.set(x, "codeName", js.undefined)
    
    @scala.inline
    def setDistribution(value: Distribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: Date): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersionString(value: String): Self = StObject.set(x, "versionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStringUndefined: Self = StObject.set(x, "versionString", js.undefined)
  }
}
