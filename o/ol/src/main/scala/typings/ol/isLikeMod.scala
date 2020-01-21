package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/IsLike", JSImport.Namespace)
@js.native
object isLikeMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.comparisonMod.default {
    def this(propertyName: String, pattern: String) = this()
    def this(propertyName: String, pattern: String, opt_wildCard: String) = this()
    def this(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
  }
  
  type IsLike = typings.ol.comparisonMod.default
}

