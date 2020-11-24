package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global object NFC.
  */
@js.native
trait Window extends js.Object {
  
  def fireNfcTagEvent(event: TagEvent, tagAsJson: String): Unit = js.native
  
  var ndef: Ndef = js.native
  
  var nfc: Nfc = js.native
  
  var util: Util = js.native
}
object Window {
  
  @scala.inline
  def apply(fireNfcTagEvent: (TagEvent, String) => Unit, ndef: Ndef, nfc: Nfc, util: Util): Window = {
    val __obj = js.Dynamic.literal(fireNfcTagEvent = js.Any.fromFunction2(fireNfcTagEvent), ndef = ndef.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setFireNfcTagEvent(value: (TagEvent, String) => Unit): Self = this.set("fireNfcTagEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNdef(value: Ndef): Self = this.set("ndef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfc(value: Nfc): Self = this.set("nfc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Util): Self = this.set("util", value.asInstanceOf[js.Any])
  }
}
