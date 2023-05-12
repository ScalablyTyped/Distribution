package typings.memfs.anon

import typings.memfs.libVolumeMod.TMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined memfs.memfs/lib/volume.IMkdirOptions & {  recursive :true} */
trait IMkdirOptionsrecursivetru extends StObject {
  
  var mode: js.UndefOr[TMode] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object IMkdirOptionsrecursivetru {
  
  inline def apply(): IMkdirOptionsrecursivetru = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMkdirOptionsrecursivetru]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMkdirOptionsrecursivetru] (val x: Self) extends AnyVal {
    
    inline def setMode(value: TMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
