package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `25`[K] extends StObject {
  
  var row: K = js.native
}
object `25` {
  
  @scala.inline
  def apply[K](row: K): `25`[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`[K]]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`[_], K] (val x: Self with `25`[K]) extends AnyVal {
    
    @scala.inline
    def setRow(value: K): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
