package typings.mysql2.fieldPacketMod

import typings.mysql2.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldPacket extends js.Object {
  
  var catalog: String = js.native
  
  var charsetNr: Double = js.native
  
  var constructor: `0` = js.native
  
  var db: String = js.native
  
  var decimals: Double = js.native
  
  var default: js.Any = js.native
  
  var flags: Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var orgName: String = js.native
  
  var orgTable: String = js.native
  
  var protocol41: Boolean = js.native
  
  var table: String = js.native
  
  var `type`: Double = js.native
  
  var zerofill: Boolean = js.native
}
object FieldPacket {
  
  @scala.inline
  def apply(
    catalog: String,
    charsetNr: Double,
    constructor: `0`,
    db: String,
    decimals: Double,
    default: js.Any,
    flags: Double,
    length: Double,
    name: String,
    orgName: String,
    orgTable: String,
    protocol41: Boolean,
    table: String,
    `type`: Double,
    zerofill: Boolean
  ): FieldPacket = {
    val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], zerofill = zerofill.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPacket]
  }
  
  @scala.inline
  implicit class FieldPacketOps[Self <: FieldPacket] (val x: Self) extends AnyVal {
    
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
    def setConstructor(value: `0`): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
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
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerofill(value: Boolean): Self = this.set("zerofill", value.asInstanceOf[js.Any])
  }
}
