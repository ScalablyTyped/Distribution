package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23`[K, D] extends StObject {
  
  var datasource: (DataProvider[K, D]) | Null = js.native
}
object `23` {
  
  @scala.inline
  def apply[K, D](): `23`[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`23`[K, D]]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`[_, _], K, D] (val x: Self with (`23`[K, D])) extends AnyVal {
    
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasourceNull: Self = StObject.set(x, "datasource", null)
  }
}
