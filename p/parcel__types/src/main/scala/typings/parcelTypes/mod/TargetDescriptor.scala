package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetDescriptor
  extends StObject
     with PackageTargetDescriptor {
  
  @JSName("distDir")
  val distDir_TargetDescriptor: FilePath
  
  val distEntry: js.UndefOr[FilePath] = js.undefined
}
object TargetDescriptor {
  
  inline def apply(distDir: FilePath): TargetDescriptor = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetDescriptor]
  }
  
  extension [Self <: TargetDescriptor](x: Self) {
    
    inline def setDistDir(value: FilePath): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setDistEntry(value: FilePath): Self = StObject.set(x, "distEntry", value.asInstanceOf[js.Any])
    
    inline def setDistEntryUndefined: Self = StObject.set(x, "distEntry", js.undefined)
  }
}
