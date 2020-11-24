package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemoteworkersV1test2AdminTemp extends js.Object {
  
  /** The argument to the admin action; see `Command` for semantics. */
  var arg: js.UndefOr[String] = js.native
  
  /** The admin action; see `Command` for legal values. */
  var command: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemoteworkersV1test2AdminTemp {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2AdminTempOps[Self <: GoogleDevtoolsRemoteworkersV1test2AdminTemp] (val x: Self) extends AnyVal {
    
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
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
  }
}
