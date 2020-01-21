package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ResourceLoader
  * @param {pc.Application} app The application
  * @classdesc Load resource data, potentially from remote sources. Caches resource on load to prevent
  * multiple requests. Add ResourceHandlers to handle different types of resources.
  */
@JSImport("playcanvas", "ResourceLoader")
@js.native
class ResourceLoader protected ()
  extends typings.playcanvas.pc.ResourceLoader {
  def this(app: typings.playcanvas.pc.Application) = this()
}

