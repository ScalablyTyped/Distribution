package typings.minappEnv.Intl

import typings.minappEnv.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat extends js.Object {
  
  def format(): String = js.native
  def format(date: Double): String = js.native
  def format(date: Date): String = js.native
  
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}
