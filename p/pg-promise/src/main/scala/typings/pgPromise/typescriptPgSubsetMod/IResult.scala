package typings.pgPromise.typescriptPgSubsetMod

import typings.pgPromise.anon.Binary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResult[T]
  extends StObject
     with Iterable[T] {
  
  var _parsers: js.Array[js.Function] = js.native
  
  var _types: Binary = js.native
  
  var command: String = js.native
  
  var fields: js.Array[IColumn] = js.native
  
  // properties below are not available within Native Bindings:
  var rowAsArray: Boolean = js.native
  
  var rowCount: Double = js.native
  
  var rows: js.Array[T] = js.native
}
