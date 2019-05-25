package typings
package neffosDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neffosDotJsMod {
  type Events = org.scalablytyped.runtime.StringDictionary[MessageHandlerFunc]
  type MessageHandlerFunc = js.Function2[/* c */ NSConn, /* msg */ Message, stdLib.Error]
  type Namespaces = org.scalablytyped.runtime.StringDictionary[Events]
  type WSData = java.lang.String
}
