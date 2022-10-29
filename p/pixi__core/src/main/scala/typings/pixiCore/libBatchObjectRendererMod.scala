package typings.pixiCore

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBatchObjectRendererMod {
  
  @JSImport("@pixi/core/lib/batch/ObjectRenderer", "ObjectRenderer")
  @js.native
  open class ObjectRenderer protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this manager works for.
      */
    def this(renderer: Renderer) = this()
    
    /** Generic destruction method that frees all resources. This should be called by subclasses. */
    @JSName("destroy")
    def destroy_MObjectRenderer(): Unit = js.native
    
    /** Stub method that should be used to empty the current batch by rendering objects now. */
    def flush(): Unit = js.native
    
    /**
      * Keeps the object to render. It doesn't have to be
      * rendered immediately.
      * @param {PIXI.DisplayObject} _object - The object to render.
      */
    def render(_object: Any): Unit = js.native
    
    /** The renderer this manager works for. */
    /* protected */ var renderer: Renderer = js.native
    
    /**
      * Stub method that initializes any state required before
      * rendering starts. It is different from the `prerender`
      * signal, which occurs every frame, in that it is called
      * whenever an object requests _this_ renderer specifically.
      */
    def start(): Unit = js.native
    
    /** Stops the renderer. It should free up any state and become dormant. */
    def stop(): Unit = js.native
  }
}
