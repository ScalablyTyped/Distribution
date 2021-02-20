package typings.openui5.sap.ui.model.odata

import typings.openui5.sap.ui.core.message.MessageParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataMessageParser extends MessageParser {
  
  /**
    * Returns the name of the header field that is used to parse the server messages
    * @returns The name of the header field
    */
  def getHeaderField(): String = js.native
  
  /**
    * Sets the header field name that should be used for parsing the JSON messages
    * @param sFieldName The name of the header field that should be used as source of the message object
    * @returns Instance reference for method chaining
    */
  def setHeaderField(sFieldName: String): ODataMessageParser = js.native
}
