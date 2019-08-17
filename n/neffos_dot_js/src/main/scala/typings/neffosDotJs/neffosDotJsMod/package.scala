package typings.neffosDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neffosDotJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.std.Map

  type Events = Map[String, MessageHandlerFunc]
  type Headers = StringDictionary[js.Any]
  type MessageHandlerFunc = js.Function2[/* c */ NSConn, /* msg */ Message, Error]
  type Namespaces = Map[String, Events]
  type WSData = String
}
