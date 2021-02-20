package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionDefinition extends PropertyBaseDefinition {
  
  var build: js.UndefOr[String] = js.native
  
  var major: js.UndefOr[String] = js.native
  
  var minor: js.UndefOr[String] = js.native
  
  var patch: js.UndefOr[String] = js.native
  
  var prerelease: js.UndefOr[String] = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object VersionDefinition {
  
  @scala.inline
  def apply(): VersionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionDefinition]
  }
  
  @scala.inline
  implicit class VersionDefinitionMutableBuilder[Self <: VersionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    @scala.inline
    def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    @scala.inline
    def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
