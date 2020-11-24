package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memcached", JSImport.Namespace)
@js.native
class ^ protected () extends Memcached {
  /**
    * Connect to a single Memcached server or cluster
    * @param location Server locations
    * @param options options
    */
  def this(location: Location) = this()
  def this(location: Location, options: typings.memcached.mod.options) = this()
}
@JSImport("memcached", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var config: options = js.native
}
