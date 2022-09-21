package typings.parcelFs

import typings.parcelFs.typesMod.FileSystem
import typings.parcelWorkers.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/fs", "MemoryFS")
  @js.native
  open class MemoryFS protected ()
    extends StObject
       with FileSystem {
    def this(farm: default) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/fs", "NodeFS")
  @js.native
  open class NodeFS ()
    extends StObject
       with FileSystem
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/fs", "OverlayFS")
  @js.native
  open class OverlayFS protected ()
    extends StObject
       with FileSystem {
    def this(writable: FileSystem, readable: FileSystem) = this()
  }
}
