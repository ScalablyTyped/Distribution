package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiFlWriteInternalFieldExtensibilityAbapextensibilityvariantMod extends Shortcut {
  
  @JSImport("sap/ui/fl/write/_internal/fieldExtensibility/ABAPExtensibilityVariant", JSImport.Default)
  @js.native
  val default: ABAPExtensibilityVariant = js.native
  
  /**
    * @since 1.87
    *
    * Abstraction providing an API to handle an ABAP extension variant. Serves also as base class and dummy
    * implementation.
    */
  @js.native
  trait ABAPExtensibilityVariant extends StObject {
    
    /**
      * Creates a new subclass of class sap.ui.fl.write._internal.fieldExtensibility.ABAPExtensibilityVariant
      * with name `sClassName` and enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    def extend(/**
      * Name of the class being created
      */
    sClassName: String): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    
    /**
      * Returns a metadata object for class sap.ui.fl.write._internal.fieldExtensibility.ABAPExtensibilityVariant.
      *
      * @returns Metadata object describing this class
      */
    def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = js.native
  }
  
  type _To = ABAPExtensibilityVariant
  
  /* This means you don't have to write `default`, but can instead just say `sapUiFlWriteInternalFieldExtensibilityAbapextensibilityvariantMod.foo` */
  override def _to: ABAPExtensibilityVariant = default
}
