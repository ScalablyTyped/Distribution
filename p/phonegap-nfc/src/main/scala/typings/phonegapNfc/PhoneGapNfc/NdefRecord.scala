package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NdefRecord extends js.Object {
  
  /**
    * byte array, containing zero to 255 bytes, must not be null
    */
  var id: js.Array[Double] = js.native
  
  /**
    * byte array, containing zero to (2 ** 32 - 1) bytes, must not be null
    */
  var payload: js.Array[Double] = js.native
  
  /**
    * 3-bit TNF (Type Name Format) - use one of the TNF_* constants
    */
  var tnf: Double = js.native
  
  /**
    * byte array, containing zero to 255 bytes, must not be null
    */
  var `type`: js.Array[Double] = js.native
}
object NdefRecord {
  
  @scala.inline
  def apply(id: js.Array[Double], payload: js.Array[Double], tnf: Double, `type`: js.Array[Double]): NdefRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tnf = tnf.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NdefRecord]
  }
  
  @scala.inline
  implicit class NdefRecordOps[Self <: NdefRecord] (val x: Self) extends AnyVal {
    
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
    def setIdVarargs(value: Double*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: js.Array[Double]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadVarargs(value: Double*): Self = this.set("payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: js.Array[Double]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTnf(value: Double): Self = this.set("tnf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: Double*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[Double]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
