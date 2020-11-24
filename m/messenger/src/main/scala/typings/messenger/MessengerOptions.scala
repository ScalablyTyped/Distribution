package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessengerOptions extends js.Object {
  
  /**
    * Extra classes to be appended to the container.
    */
  var extraClasses: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of messages to show at once.
    */
  var maxMessages: js.UndefOr[Double] = js.native
  
  /**
    * Default options for created messages.
    */
  var messageDefaults: js.UndefOr[MessageOptions] = js.native
  
  /**
    * Which locations should be tried when inserting the message container into the page.
    * The default is ['body']. It accepts a list to allow you to try a variety of places
    * when deciding what the optimal location is on any given page. This should generally
    * not need to be changed unless you are inserting the messages into the flow of the
    * document, rather than using messenger-fixed.
    */
  var parentLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * What theme are you using? Some themes have associated javascript, specifing this allows that js to run.
    */
  var theme: js.UndefOr[String] = js.native
}
object MessengerOptions {
  
  @scala.inline
  def apply(): MessengerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessengerOptions]
  }
  
  @scala.inline
  implicit class MessengerOptionsOps[Self <: MessengerOptions] (val x: Self) extends AnyVal {
    
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
    def setExtraClasses(value: String): Self = this.set("extraClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraClasses: Self = this.set("extraClasses", js.undefined)
    
    @scala.inline
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessages: Self = this.set("maxMessages", js.undefined)
    
    @scala.inline
    def setMessageDefaults(value: MessageOptions): Self = this.set("messageDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDefaults: Self = this.set("messageDefaults", js.undefined)
    
    @scala.inline
    def setParentLocationsVarargs(value: String*): Self = this.set("parentLocations", js.Array(value :_*))
    
    @scala.inline
    def setParentLocations(value: js.Array[String]): Self = this.set("parentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLocations: Self = this.set("parentLocations", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
