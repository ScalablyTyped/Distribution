package typings
package neffosDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neffosDotJsMod {
  type Events = stdLib.Map[java.lang.String, MessageHandlerFunc]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MessageHandlerFunc = js.Function2[/* c */ NSConn, /* msg */ Message, stdLib.Error]
  type Namespaces = stdLib.Map[java.lang.String, Events]
  type WSData = java.lang.String
}
