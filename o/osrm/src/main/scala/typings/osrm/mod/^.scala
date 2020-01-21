package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The OSRM method is the main constructor for creating an OSRM instance.
  * An OSRM instance requires a .osrm network, which is prepared by the OSRM Backend C++ library.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md
  */
@JSImport("osrm", JSImport.Namespace)
@js.native
class ^ protected () extends OSRM {
  def this(name: String) = this()
}

