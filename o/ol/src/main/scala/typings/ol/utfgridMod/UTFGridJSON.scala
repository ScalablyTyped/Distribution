package typings.ol.utfgridMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UTFGridJSON extends js.Object {
  
  var data: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var grid: js.Array[String] = js.native
  
  var keys: js.Array[String] = js.native
}
object UTFGridJSON {
  
  @scala.inline
  def apply(grid: js.Array[String], keys: js.Array[String]): UTFGridJSON = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UTFGridJSON]
  }
  
  @scala.inline
  implicit class UTFGridJSONOps[Self <: UTFGridJSON] (val x: Self) extends AnyVal {
    
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
    def setGridVarargs(value: String*): Self = this.set("grid", js.Array(value :_*))
    
    @scala.inline
    def setGrid(value: js.Array[String]): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
