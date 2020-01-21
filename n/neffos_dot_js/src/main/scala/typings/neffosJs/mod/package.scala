package typings.neffosJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Events = typings.std.Map[java.lang.String, typings.neffosJs.mod.MessageHandlerFunc]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MessageHandlerFunc = js.Function2[
    /* c */ typings.neffosJs.mod.NSConn, 
    /* msg */ typings.neffosJs.mod.Message, 
    typings.std.Error
  ]
  type Namespaces = typings.std.Map[java.lang.String, typings.neffosJs.mod.Events]
  type WSData = java.lang.String
}
