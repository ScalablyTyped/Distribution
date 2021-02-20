package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.Full
import typings.nodemailer.nodemailerStrings.HDRS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNOptions extends StObject {
  
  /** sender’s ‘envelope identifier’ for tracking */
  var envid: js.UndefOr[String] = js.native
  
  /** when to send a DSN. Multiple options are OK - array or comma delimited. NEVER must appear by itself. */
  @JSName("notify")
  var notify_FDSNOptions: js.UndefOr[DSNOption | js.Array[DSNOption]] = js.native
  
  /** original recipient */
  var orcpt: js.UndefOr[String] = js.native
  
  /** return either the full message ‘FULL’ or only headers ‘HDRS’ */
  var ret: js.UndefOr[Full | HDRS] = js.native
}
object DSNOptions {
  
  @scala.inline
  def apply(): DSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSNOptions]
  }
  
  @scala.inline
  implicit class DSNOptionsMutableBuilder[Self <: DSNOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvid(value: String): Self = StObject.set(x, "envid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvidUndefined: Self = StObject.set(x, "envid", js.undefined)
    
    @scala.inline
    def setNotify_(value: DSNOption | js.Array[DSNOption]): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    @scala.inline
    def setNotify_Varargs(value: DSNOption*): Self = StObject.set(x, "notify", js.Array(value :_*))
    
    @scala.inline
    def setOrcpt(value: String): Self = StObject.set(x, "orcpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrcptUndefined: Self = StObject.set(x, "orcpt", js.undefined)
    
    @scala.inline
    def setRet(value: Full | HDRS): Self = StObject.set(x, "ret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetUndefined: Self = StObject.set(x, "ret", js.undefined)
  }
}
