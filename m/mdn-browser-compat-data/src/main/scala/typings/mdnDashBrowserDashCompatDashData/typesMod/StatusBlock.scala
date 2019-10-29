package typings.mdnDashBrowserDashCompatDashData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBlock extends js.Object {
  /**
    * `boolean` value that indicates if the feature is no longer recommended.
    *
    * It might be removed in the future or might only be kept for compatibility purposes.
    * Avoid using this functionality.
    */
  var deprecated: Boolean
  /**
    * `boolean` value that indicates this functionality is
    * intended to be an addition to the Web platform. Some features are added to
    * conduct tests.
    *
    * Set to `false`, it means the functionality is mature, and no
    * significant incompatible changes are expected in the future.
    */
  var experimental: Boolean
  /**
    * `boolean` value indicating if the feature is part
    * of an active specification or specification process.
    */
  var standard_track: Boolean
}

object StatusBlock {
  @scala.inline
  def apply(deprecated: Boolean, experimental: Boolean, standard_track: Boolean): StatusBlock = {
    val __obj = js.Dynamic.literal(deprecated = deprecated, experimental = experimental, standard_track = standard_track)
  
    __obj.asInstanceOf[StatusBlock]
  }
}

