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
    * @param {AppBase} app - The application.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
