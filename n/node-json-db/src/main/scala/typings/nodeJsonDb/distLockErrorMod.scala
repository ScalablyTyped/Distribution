package typings.nodeJsonDb

import typings.nodeJsonDb.distLibErrorsMod.NestedError
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLockErrorMod {
  
  @JSImport("node-json-db/dist/lock/Error", "TimeoutError")
  @js.native
  open class TimeoutError protected () extends NestedError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
  }
}
