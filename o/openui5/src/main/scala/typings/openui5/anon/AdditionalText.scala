package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCoreLibraryMod.MessageType
import typings.openui5.sapUiCoreMessageMessageProcessorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalText extends StObject {
  
  /**
    * The message additionalText
    */
  var additionalText: js.UndefOr[String] = js.undefined
  
  /**
    * The message code
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Sets message date which can be used to remove old messages. Number of milliseconds elapsed since 1 January
    * 1970 00:00:00 UTC
    */
  var date: js.UndefOr[int] = js.undefined
  
  /**
    * The message description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The message description url to get a more detailed message
    */
  var descriptionUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Defines more detailed information about the message target or (since 1.79) the message targets in case
    * the message has multiple targets. This property is currently only used by the ODataMessageParser.
    */
  var fullTarget: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The message id: will be generated if no id is set
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The message text
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Sets message persistent: If persistent is set `true` the message lifecycle is controlled by the application
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var processor: js.UndefOr[default] = js.undefined
  
  /**
    * The single message target or (since 1.79) an array of message targets in case the message has multiple
    * targets. The syntax is MessageProcessor dependent. Read the documentation of the respective MessageProcessor.
    */
  var target: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * If the message is set as technical message
    */
  var technical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object containing technical details for a message
    */
  var technicalDetails: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The message type
    */
  var `type`: js.UndefOr[
    MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String)
  ] = js.undefined
}
object AdditionalText {
  
  inline def apply(): AdditionalText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalText] (val x: Self) extends AnyVal {
    
    inline def setAdditionalText(value: String): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDate(value: int): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDescriptionUrl(value: String): Self = StObject.set(x, "descriptionUrl", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUrlUndefined: Self = StObject.set(x, "descriptionUrl", js.undefined)
    
    inline def setFullTarget(value: String | js.Array[String]): Self = StObject.set(x, "fullTarget", value.asInstanceOf[js.Any])
    
    inline def setFullTargetUndefined: Self = StObject.set(x, "fullTarget", js.undefined)
    
    inline def setFullTargetVarargs(value: String*): Self = StObject.set(x, "fullTarget", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setProcessor(value: default): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTechnical(value: Boolean): Self = StObject.set(x, "technical", value.asInstanceOf[js.Any])
    
    inline def setTechnicalDetails(value: js.Object): Self = StObject.set(x, "technicalDetails", value.asInstanceOf[js.Any])
    
    inline def setTechnicalDetailsUndefined: Self = StObject.set(x, "technicalDetails", js.undefined)
    
    inline def setTechnicalUndefined: Self = StObject.set(x, "technical", js.undefined)
    
    inline def setType(
      value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
