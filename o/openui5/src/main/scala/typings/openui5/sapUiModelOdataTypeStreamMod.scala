package typings.openui5

import typings.openui5.anon.`10`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeStreamMod {
  
  @JSImport("sap/ui/model/odata/type/Stream", JSImport.Default)
  @js.native
  /**
    * Constructor for an OData primitive type `Edm.Stream`.
    */
  open class default () extends Stream {
    def this(/**
      * Must be `undefined`
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Must be `undefined`
      */
    oFormatOptions: js.Object,
      /**
      * constraints; they are only stored for documentation purpose, since no validation can occur
      */
    oConstraints: `10`
    ) = this()
    def this(
      /**
      * Must be `undefined`
      */
    oFormatOptions: Unit,
      /**
      * constraints; they are only stored for documentation purpose, since no validation can occur
      */
    oConstraints: `10`
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Stream", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Stream with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.ODataType.extend}.
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
    oClassInfo: ClassInfo[T, Stream]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Stream],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Stream.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Stream
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * @since 1.51.0
      *
      * Returns the input value unchanged.
      * See:
      * 	sap.ui.model.SimpleType#formatValue
      *
      * @returns The property's read URL
      */
    def formatValue(
      /**
      * the read URL
      */
    sValue: String,
      /**
      * The target type; must be "any" or "string"
      */
    sTargetType: String
    ): String = js.native
    
    /**
      * @since 1.51.0
      *
      * Method not supported
      * See:
      * 	sap.ui.model.SimpleType#parseValue
      */
    def parseValue(): Unit = js.native
    
    /**
      * @since 1.51.0
      *
      * Method not supported
      * See:
      * 	sap.ui.model.SimpleType#validateValue
      */
    def validateValue(): Unit = js.native
  }
}
