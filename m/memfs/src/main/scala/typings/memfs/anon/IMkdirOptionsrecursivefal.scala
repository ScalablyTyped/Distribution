package typings.memfs.anon

import typings.memfs.libVolumeMod.TMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined memfs.memfs/lib/volume.IMkdirOptions & {  recursive :false | undefined} */
trait IMkdirOptionsrecursivefal extends StObject {
  
  var mode: js.UndefOr[TMode] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object IMkdirOptionsrecursivefal {
  
  inline def apply(): IMkdirOptionsrecursivefal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMkdirOptionsrecursivefal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMkdirOptionsrecursivefal] (val x: Self) extends AnyVal {
    
    inline def setMode(value: TMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
