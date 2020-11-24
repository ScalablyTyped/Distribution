package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntypedFieldInfo extends js.Object {
  
  var catalog: String = js.native
  
  var charsetNr: Double = js.native
  
  var db: String = js.native
  
  var decimals: Double = js.native
  
  var default: js.UndefOr[String] = js.native
  
  var flags: Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var orgName: String = js.native
  
  var orgTable: String = js.native
  
  var protocol41: Boolean = js.native
  
  var table: String = js.native
  
  var zeroFill: Boolean = js.native
}
object UntypedFieldInfo {
  
  @scala.inline
  def apply(
    catalog: String,
    charsetNr: Double,
    db: String,
    decimals: Double,
    flags: Double,
    length: Double,
    name: String,
    orgName: String,
    orgTable: String,
    protocol41: Boolean,
    table: String,
    zeroFill: Boolean
  ): UntypedFieldInfo = {
    val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], zeroFill = zeroFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntypedFieldInfo]
  }
  
  @scala.inline
  implicit class UntypedFieldInfoOps[Self <: UntypedFieldInfo] (val x: Self) extends AnyVal {
    
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
    def setCatalog(value: String): Self = this.set("catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetNr(value: Double): Self = this.set("charsetNr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgName(value: String): Self = this.set("orgName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgTable(value: String): Self = this.set("orgTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol41(value: Boolean): Self = this.set("protocol41", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroFill(value: Boolean): Self = this.set("zeroFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
