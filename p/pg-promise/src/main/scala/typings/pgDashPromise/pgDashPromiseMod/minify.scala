package typings.pgDashPromise.pgDashPromiseMod

import org.scalablytyped.runtime.Instantiable0
import typings.pgDashMinify.pgDashMinifyMod.IMinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-promise", "minify")
@js.native
object minify extends js.Object {
  @js.native
  class SQLParsingError ()
    extends typings.pgDashMinify.pgDashMinifyMod.SQLParsingError
  
  var SQLParsingError: Instantiable0[typings.pgDashMinify.pgDashMinifyMod.SQLParsingError] = js.native
  def apply(sql: String): String = js.native
  def apply(sql: String, options: IMinifyOptions): String = js.native
}

