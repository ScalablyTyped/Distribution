package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter[T]
  extends StObject
     with NotAPromise {
  
  /**
    * Raw value to serialize
    */
  var raw: T | Null = js.native
  
  /**
    * PostgreSQL OID of the type
    */
  var `type`: Double = js.native
  
  /**
    * Serialized value
    */
  var value: String | Null = js.native
}
