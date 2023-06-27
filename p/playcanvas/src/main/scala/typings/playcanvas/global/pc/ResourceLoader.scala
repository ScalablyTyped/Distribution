package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link ResourceLoader#load} when a resource is loaded (or an error occurs).
  *
  * @callback ResourceLoaderCallback
  * @param {string|null} err - The error message in the case where the load fails.
  * @param {*} [resource] - The resource that has been successfully loaded.
  */
/**
  * Load resource data, potentially from remote sources. Caches resource on load to prevent multiple
  * requests. Add ResourceHandlers to handle different types of resources.
  */
@JSGlobal("pc.ResourceLoader")
@js.native
open class ResourceLoader protected ()
  extends typings.playcanvas.mod.ResourceLoader {
  /**
    * Create a new ResourceLoader instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
object ResourceLoader {
  
  @JSGlobal("pc.ResourceLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def makeKey(url: Any, `type`: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeKey")(url.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
}
