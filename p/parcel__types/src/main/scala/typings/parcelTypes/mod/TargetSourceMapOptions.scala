package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSourceMapOptions extends StObject {
  
  val `inline`: js.UndefOr[Boolean] = js.undefined
  
  val inlineSources: js.UndefOr[Boolean] = js.undefined
  
  val sourceRoot: js.UndefOr[String] = js.undefined
}
object TargetSourceMapOptions {
  
  inline def apply(): TargetSourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSourceMapOptions]
  }
  
  extension [Self <: TargetSourceMapOptions](x: Self) {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineSources(value: Boolean): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
    
    inline def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
  }
}
