package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryQuerySpec extends js.Object {
  
  /** The raw query string. */
  var rawQuery: js.UndefOr[String] = js.native
}
object BigQueryQuerySpec {
  
  @scala.inline
  def apply(): BigQueryQuerySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryQuerySpec]
  }
  
  @scala.inline
  implicit class BigQueryQuerySpecOps[Self <: BigQueryQuerySpec] (val x: Self) extends AnyVal {
    
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
    def setRawQuery(value: String): Self = this.set("rawQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawQuery: Self = this.set("rawQuery", js.undefined)
  }
}
