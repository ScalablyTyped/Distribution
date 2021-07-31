package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Load resource data, potentially from remote sources. Caches resource on load to prevent
  * multiple requests. Add ResourceHandlers to handle different types of resources.
  * @param app - The application.
  */
@JSGlobal("pc.ResourceLoader")
@js.native
class ResourceLoader protected ()
  extends StObject
     with typings.playcanvas.pc.ResourceLoader {
  def this(app: typings.playcanvas.pc.Application) = this()
}
