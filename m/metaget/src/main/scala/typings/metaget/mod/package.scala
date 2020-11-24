package typings.metaget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* error */ typings.std.Error | scala.Null, /* data */ typings.metaget.mod.Result, T]
  
  type Result = typings.std.Record[java.lang.String, java.lang.String]
}
