package typings.openui5

import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiAppMockServerMod {
  
  @JSImport("sap/ui/app/MockServer", JSImport.Default)
  @js.native
  /**
    * Creates a mocked server. This helps to mock all or some backend calls, e.g. for OData/JSON Models or
    * simple XHR calls, without changing the application code. This class can also be used for qunit tests.
    */
  open class default ()
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    def this(/**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings) = this()
    def this(/**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: Unit,
      /**
      * scope object for resolving string based type and formatter references in bindings
      */
    oScope: js.Object
    ) = this()
    def this(
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings,
      /**
      * scope object for resolving string based type and formatter references in bindings
      */
    oScope: js.Object
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: Unit,
      /**
      * scope object for resolving string based type and formatter references in bindings
      */
    oScope: js.Object
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings,
      /**
      * scope object for resolving string based type and formatter references in bindings
      */
    oScope: js.Object
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: Unit,
      /**
      * scope object for resolving string based type and formatter references in bindings
      */
    oScope: js.Object
    ) = this()
    def this(
      /**
      * id for the new server object; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new object
      */
    mSettings: MockServerSettings,
      /**
      * scope object for resolving string based type and formatter references in bindings
      */
    oScope: js.Object
    ) = this()
  }
  
  type MockServer = typings.openui5.sapUiBaseManagedObjectMod.default
  
  type MockServerSettings = ManagedObjectSettings
}
