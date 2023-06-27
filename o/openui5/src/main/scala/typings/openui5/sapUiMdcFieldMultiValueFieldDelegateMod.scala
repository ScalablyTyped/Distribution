package typings.openui5

import typings.openui5.sapUiMdcConditionConditionMod.ConditionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldMultiValueFieldDelegateMod {
  
  @JSImport("sap/ui/mdc/field/MultiValueFieldDelegate", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MultiValueFieldDelegate
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/field/MultiValueFieldDelegate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Implements the model-specific logic to update items after conditions have been updated.
      *
      * Items can be removed, updated, or added. Use the binding information of the `MultiValueField` control
      * to update the data in the model.
      */
    inline def updateItems(
      /**
      * Payload for delegate
      */
    oPayload: js.Object,
      /**
      * Current conditions of the `MultiValueField` control
      */
    aConditions: js.Array[ConditionObject],
      /**
      * Current `MultiValueField` control to determine binding information to update the values of the corresponding
      * model
      */
    oMultiValueField: typings.openui5.sapUiMdcMultiValueFieldMod.default
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItems")(oPayload.asInstanceOf[js.Any], aConditions.asInstanceOf[js.Any], oMultiValueField.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait MultiValueFieldDelegate extends StObject
}
