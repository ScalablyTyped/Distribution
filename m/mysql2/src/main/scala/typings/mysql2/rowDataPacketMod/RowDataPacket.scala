package typings.mysql2.rowDataPacketMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDataPacket
  extends /* column */ NumberDictionary[js.Any]
     with /* column */ StringDictionary[js.Any] {
  
  var constructor: `3` = js.native
}
object RowDataPacket {
  
  @scala.inline
  def apply(constructor: `3`): RowDataPacket = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDataPacket]
  }
  
  @scala.inline
  implicit class RowDataPacketOps[Self <: RowDataPacket] (val x: Self) extends AnyVal {
    
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
    def setConstructor(value: `3`): Self = this.set("constructor", value.asInstanceOf[js.Any])
  }
}
