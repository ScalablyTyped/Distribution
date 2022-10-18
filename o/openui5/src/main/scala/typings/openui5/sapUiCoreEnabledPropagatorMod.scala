package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreEnabledPropagatorMod {
  
  @JSImport("sap/ui/core/EnabledPropagator", JSImport.Default)
  @js.native
  /**
    * Mixin for enhancement of a control prototype with propagation of the `enabled` property.
    *
    * Controls that apply this mixin calculate their effective `enabled` state on read access as the logical
    * OR of their own `enabled` property and the `enabled` state of the nearest ancestor control which has
    * either an `enabled` property or a `getEnabled` method.
    *
    * Applying this mixin adds the `enabled` property, if it not already exists, to the control metadata.
    *
    * Also adds the `useEnabledPropagator(boolean)` helper method to the prototype of the given control. `myControlInstance.useEnabledPropagator(false)`
    * can be used to prevent a single instance from using `EnabledPropagator`. In this case, the effective
    * `enabled` state does not take any ancestors `enabled` state into account, only the control's own `enabled`
    * property.
    */
  open class default ()
    extends StObject
       with EnabledPropagator {
    def this(/**
      * Value that should be used as default value for the enhancement of the control.
      */
    bDefault: Boolean) = this()
    def this(
      /**
      * Value that should be used as default value for the enhancement of the control.
      */
    bDefault: Boolean,
      /**
      * Whether the introduced property should use the old name `Enabled`.
      */
    bLegacy: Boolean
    ) = this()
    def this(
      /**
      * Value that should be used as default value for the enhancement of the control.
      */
    bDefault: Unit,
      /**
      * Whether the introduced property should use the old name `Enabled`.
      */
    bLegacy: Boolean
    ) = this()
  }
  
  trait EnabledPropagator extends StObject
}
