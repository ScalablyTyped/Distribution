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
  /* static members */
  object Container {
    
    @JSImport("@pixi/display", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Sets the default value for the container property `sortableChildren`.
      * If set to true, the container will sort its children by zIndex value
      * when `updateTransform()` is called, or manually if `sortChildren()` is called.
      *
      * This actually changes the order of elements in the array, so should be treated
      * as a basic solution that is not performant compared to other solutions,
      * such as {@link https://github.com/pixijs/layers PixiJS Layers}.
      *
      * Also be aware of that this may not work nicely with the `addChildAt()` function,
      * as the `zIndex` sorting may cause the child to automatically sorted to another position.
      * @static
      */
    @JSImport("@pixi/display", "Container.defaultSortableChildren")
    @js.native
    def defaultSortableChildren: Boolean = js.native
    inline def defaultSortableChildren_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSortableChildren")(x.asInstanceOf[js.Any])
  }
  
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
