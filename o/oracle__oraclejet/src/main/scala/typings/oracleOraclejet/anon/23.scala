package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23`[K, D] extends js.Object {
  
  var datasource: (DataProvider[K, D]) | Null = js.native
}
object `23` {
  
  @scala.inline
  def apply[K, D](): `23`[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`23`[K, D]]
  }
  
  @scala.inline
  implicit class `23Ops`[Self <: `23`[_, _], K, D] (val x: Self with (`23`[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = this.set("datasource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasourceNull: Self = this.set("datasource", null)
  }
}
