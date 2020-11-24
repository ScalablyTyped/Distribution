package typings.pgPromise.anon

import org.scalablytyped.runtime.Instantiable0
import typings.pgMinify.mod.IMinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(sql: String): String = js.native
  def apply(sql: String, options: IMinifyOptions): String = js.native
  
  var SQLParsingError: Instantiable0[typings.pgMinify.mod.SQLParsingError] = js.native
}
