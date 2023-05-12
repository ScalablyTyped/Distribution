package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  /**
    * Additional set of options used to create a second `DateFormat` object for conversions between string
    * values in the data source (e.g. model) and `Date`. This second format object is used to convert both
    * of the interval parts from a model `string` to `Date` before converting both of the `Date`(s) to `string`
    * with the primary format object. Vice versa, this 'source' format is also used to format the already parsed
    * external value (e.g. user input) into the string format that is expected by the data source. For a list
    * of all available options, see {@link sap.ui.core.format.DateFormat.getTimeInstance DateFormat}.
    */
  var source: js.UndefOr[js.Object] = js.undefined
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setSource(value: js.Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
