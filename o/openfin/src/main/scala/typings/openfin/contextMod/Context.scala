package typings.openfin.contextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context
  extends /**
  * @hidden
  * Custom properties and metadata. This can be extended in specific context object.
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * An optional map of any equivalent identifiers for the context type, e.g. ISIN, CUSIP, etc. for an instrument.
    */
  var id: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  /**
    * The name of the context data (optional). This is a text string that describes the data being sent.
    * Implementors of context may choose to make the name mandatory.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of the context that uniquely identifies it, e.g. "fdc3.instrument".
    * This is used to refer to the accepted context(s) when declaring intents. See [[AppDirIntent]].
    */
  var `type`: String = js.native
}
object Context {
  
  @scala.inline
  def apply(`type`: String): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StringDictionary[js.UndefOr[String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
