package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfiguration extends js.Object {
  var DEFAULT_CHANNEL: java.lang.String
  var SYSTEM_CHANNEL: java.lang.String
  var resolver: IResolver
}

object IConfiguration {
  @scala.inline
  def apply(DEFAULT_CHANNEL: java.lang.String, SYSTEM_CHANNEL: java.lang.String, resolver: IResolver): IConfiguration = {
    val __obj = js.Dynamic.literal(DEFAULT_CHANNEL = DEFAULT_CHANNEL, SYSTEM_CHANNEL = SYSTEM_CHANNEL, resolver = resolver)
  
    __obj.asInstanceOf[IConfiguration]
  }
}

