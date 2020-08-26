package typings.postmark

import typings.postmark.filteringParametersMod.FilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/server/ServerFilteringParameters", JSImport.Namespace)
@js.native
object serverFilteringParametersMod extends js.Object {
  @js.native
  class ServerFilteringParameters () extends FilteringParameters {
    def this(count: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], name: String) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double, name: String) = this()
    def this(count: Double, offset: js.UndefOr[scala.Nothing], name: String) = this()
    def this(count: Double, offset: Double, name: String) = this()
    var name: js.UndefOr[String] = js.native
  }
  
}

