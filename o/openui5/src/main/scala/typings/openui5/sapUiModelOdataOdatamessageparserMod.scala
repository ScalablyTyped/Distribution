package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdatamessageparserMod {
  
  @JSImport("sap/ui/model/odata/ODataMessageParser", JSImport.Default)
  @js.native
  open class default protected () extends ODataMessageParser {
    /**
      * OData implementation of the sap.ui.core.message.MessageParser class. Parses message responses from the
      * back end.
      */
    def this(
      /**
      * Base URI of the service used for the calculation of message targets
      */
    sServiceUrl: String,
      /**
      * The ODataMetadata object
      */
    oMetadata: typings.openui5.sapUiModelOdataOdatametadataMod.default,
      /**
      * Whether technical messages should always be treated as persistent, since 1.83.0
      */
    bPersistTechnicalMessages: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/ODataMessageParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.ODataMessageParser with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.message.MessageParser.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
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
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMessageParser]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMessageParser],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.ODataMessageParser.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataMessageParser
    extends typings.openui5.sapUiCoreMessageMessageParserMod.default {
    
    /**
      * Returns the name of the header field that is used to parse the server messages
      *
      * @returns The name of the header field
      */
    def getHeaderField(): String = js.native
    
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: js.Object
    ): Unit = js.native
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: js.Object,
      /**
      * A map with the keys of the entities changed in the back-end mapped to true
      */
    mChangeEntities: js.Object
    ): Unit = js.native
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: js.Object,
      /**
      * A map with the keys of the entities changed in the back-end mapped to true
      */
    mChangeEntities: js.Object,
      /**
      * Whether the used OData service supports the message scope {@link sap.ui.model.odata.MessageScope.BusinessObject}
      */
    bMessageScopeSupported: Boolean
    ): Unit = js.native
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: js.Object,
      /**
      * A map with the keys of the entities changed in the back-end mapped to true
      */
    mChangeEntities: Unit,
      /**
      * Whether the used OData service supports the message scope {@link sap.ui.model.odata.MessageScope.BusinessObject}
      */
    bMessageScopeSupported: Boolean
    ): Unit = js.native
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: Unit,
      /**
      * A map with the keys of the entities changed in the back-end mapped to true
      */
    mChangeEntities: js.Object
    ): Unit = js.native
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: Unit,
      /**
      * A map with the keys of the entities changed in the back-end mapped to true
      */
    mChangeEntities: js.Object,
      /**
      * Whether the used OData service supports the message scope {@link sap.ui.model.odata.MessageScope.BusinessObject}
      */
    bMessageScopeSupported: Boolean
    ): Unit = js.native
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object,
      /**
      * A map with the keys of the entities requested from the back-end mapped to true
      */
    mGetEntities: Unit,
      /**
      * A map with the keys of the entities changed in the back-end mapped to true
      */
    mChangeEntities: Unit,
      /**
      * Whether the used OData service supports the message scope {@link sap.ui.model.odata.MessageScope.BusinessObject}
      */
    bMessageScopeSupported: Boolean
    ): Unit = js.native
    
    /**
      * Sets the header field name that should be used for parsing the JSON messages
      *
      * @returns Instance reference for method chaining
      */
    def setHeaderField(
      /**
      * The name of the header field that should be used as source of the message object
      */
    sFieldName: String
    ): this.type = js.native
  }
}
