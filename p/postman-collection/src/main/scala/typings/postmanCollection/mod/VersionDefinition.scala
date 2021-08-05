package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionDefinition
  extends StObject
     with PropertyBaseDefinition {
  
  var build: js.UndefOr[String] = js.undefined
  
  var major: js.UndefOr[String] = js.undefined
  
  var minor: js.UndefOr[String] = js.undefined
  
  var patch: js.UndefOr[String] = js.undefined
  
  var prerelease: js.UndefOr[String] = js.undefined
  
  var raw: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object VersionDefinition {
  
  inline def apply(): VersionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionDefinition]
  }
  
  extension [Self <: VersionDefinition](x: Self) {
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
