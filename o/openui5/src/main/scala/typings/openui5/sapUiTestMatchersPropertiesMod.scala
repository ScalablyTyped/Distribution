package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersPropertiesMod {
  
  @JSImport("sap/ui/test/matchers/Properties", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Properties {
    def this(/**
      * the object with the properties to be checked. Example:
      * ```javascript
      *
      * // Would filter for an enabled control with the text "Accept".
      * new Properties({
      *     // The property text has the exact value "Accept"
      *     text: "Accept",
      *     // The property enabled also has to be true
      *     enabled: true
      * })
      * ```
      *  If the value is a RegExp, it tests the RegExp with the value. RegExp only works with string properties.
      */
    oProperties: js.Object) = this()
  }
  
  trait Properties extends StObject
}
