package typings.pagerJackrabbit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amqplib.amqplib.Options.AssertExchange & {  noReply :boolean | undefined} */
@js.native
trait ExchangeOptions extends js.Object {
  
  var alternateExchange: js.UndefOr[String] = js.native
  
  var arguments: js.UndefOr[js.Any] = js.native
  
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  var durable: js.UndefOr[Boolean] = js.native
  
  var internal: js.UndefOr[Boolean] = js.native
  
  var noReply: js.UndefOr[Boolean] = js.native
}
object ExchangeOptions {
  
  @scala.inline
  def apply(): ExchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeOptions]
  }
  
  @scala.inline
  implicit class ExchangeOptionsOps[Self <: ExchangeOptions] (val x: Self) extends AnyVal {
    
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
    def setAlternateExchange(value: String): Self = this.set("alternateExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateExchange: Self = this.set("alternateExchange", js.undefined)
    
    @scala.inline
    def setArguments(value: js.Any): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setDurable(value: Boolean): Self = this.set("durable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurable: Self = this.set("durable", js.undefined)
    
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    
    @scala.inline
    def setNoReply(value: Boolean): Self = this.set("noReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoReply: Self = this.set("noReply", js.undefined)
  }
}
