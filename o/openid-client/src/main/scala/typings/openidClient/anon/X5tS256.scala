package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X5tS256
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
object X5tS256 {
  
  @scala.inline
  def apply(): X5tS256 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X5tS256]
  }
  
  @scala.inline
  implicit class X5tS256Ops[Self <: X5tS256] (val x: Self) extends AnyVal {
    
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
    def setX5tNumbersignS256(value: String): Self = this.set("x5t#S256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX5tNumbersignS256: Self = this.set("x5t#S256", js.undefined)
  }
}
