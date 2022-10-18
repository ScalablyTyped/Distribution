package typings.next.anon

import typings.next.nextStrings.flow
import typings.next.nextStrings.typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactDirectory extends StObject {
  
  var artifactDirectory: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[typescript | flow] = js.undefined
  
  var src: String
}
object ArtifactDirectory {
  
  inline def apply(src: String): ArtifactDirectory = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDirectory]
  }
  
  extension [Self <: ArtifactDirectory](x: Self) {
    
    inline def setArtifactDirectory(value: String): Self = StObject.set(x, "artifactDirectory", value.asInstanceOf[js.Any])
    
    inline def setArtifactDirectoryUndefined: Self = StObject.set(x, "artifactDirectory", js.undefined)
    
    inline def setLanguage(value: typescript | flow): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
