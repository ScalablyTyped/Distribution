package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionDueon extends StObject {
  
  /** @description A description of the milestone. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @description The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.undefined
  
  /**
    * @description The state of the milestone. Either `open` or `closed`.
    * @default open
    * @enum {string}
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  /** @description The title of the milestone. */
  var title: js.UndefOr[String] = js.undefined
}
object DescriptionDueon {
  
  inline def apply(): DescriptionDueon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionDueon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionDueon] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
