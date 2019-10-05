package typings.playcanvas.playcanvasMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Http
  * @classdesc Used to send and receive HTTP requests.
  * @description Create a new Http instance. By default, a PlayCanvas application creates an instance of this
  * object at `pc.http`.
  */
@JSImport("playcanvas", "Http")
@js.native
class Http ()
  extends typings.playcanvas.pc.Http

/**
  * @static
  * @readonly
  * @type {pc.Http}
  * @name pc.http
  * @description Default instance of {@link pc.Http}.
  */
@JSImport("playcanvas", "http")
@js.native
object http
  extends TopLevel[typings.playcanvas.pc.Http]

