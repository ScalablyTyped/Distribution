package typings.mitt

import org.scalablytyped.runtime.StringDictionary
import typings.mitt.mittNs.Emitter
import typings.mitt.mittNs.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mitt")
@js.native
class mitt () extends Emitter {
  def this(all: StringDictionary[Handler]) = this()
}

