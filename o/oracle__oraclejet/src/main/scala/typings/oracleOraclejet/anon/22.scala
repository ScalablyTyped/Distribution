package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `22`[K] extends StObject {
  
  var column: K = js.native
}
object `22` {
  
  @scala.inline
  def apply[K](column: K): `22`[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`[K]]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`[_], K] (val x: Self with `22`[K]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: K): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
