package typings.pixiDisplay

import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/display", "Bounds")
  @js.native
  open class Bounds ()
    extends typings.pixiDisplay.libBoundsMod.Bounds
  
  @JSImport("@pixi/display", "Container")
  @js.native
  open class Container[T /* <: typings.pixiDisplay.libDisplayObjectMod.DisplayObject */] ()
    extends typings.pixiDisplay.libContainerMod.Container[T]
  
  /* note: abstract class */ @JSImport("@pixi/display", "DisplayObject")
  @js.native
  open class DisplayObject ()
    extends typings.pixiDisplay.libDisplayObjectMod.DisplayObject
  /* static members */
  object DisplayObject {
    
    @JSImport("@pixi/display", "DisplayObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Mixes all enumerable properties and methods from a source object to DisplayObject.
      * @param source - The source of properties and methods to mix in.
      */
    inline def mixin(source: Dict[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@pixi/display", "TemporaryDisplayObject")
  @js.native
  open class TemporaryDisplayObject ()
    extends typings.pixiDisplay.libDisplayObjectMod.TemporaryDisplayObject
}
