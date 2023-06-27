package typings.openui5

import typings.openui5.anon.AdditionalInfo
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiMdcEnumsOperatorOverwriteMod.OperatorOverwrite
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcConditionOperatorMod {
  
  @JSImport("sap/ui/mdc/condition/Operator", JSImport.Default)
  @js.native
  open class default protected () extends Operator {
    def this(/**
      * Properties of the operator
      */
    oConfiguration: AdditionalInfo) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/condition/Operator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.condition.Operator with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
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
    oClassInfo: ClassInfo[T, Operator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Operator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.condition.Operator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Operator
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    def overwrite(
      /**
      * name of the function which will be overwritten
      */
    sMethodName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperatorOverwrite * / any */ String,
      /**
      * new callback function
      */
    fnOverwrite: js.Function
    ): js.Function = js.native
    /**
      * Sets an overwrite function for some of the `operator` functions.
      *
      * @returns the original function
      */
    def overwrite(
      /**
      * name of the function which will be overwritten
      */
    sMethodName: OperatorOverwrite,
      /**
      * new callback function
      */
    fnOverwrite: js.Function
    ): js.Function = js.native
  }
  
  trait ValueType extends StObject {
    
    /**
      * `constraints` of the data type
      */
    var constraints: js.Object
    
    /**
      * `formatOptions` of the data type
      */
    var formatOptions: js.Object
    
    /**
      * name of the data type
      */
    var name: String
  }
  object ValueType {
    
    inline def apply(constraints: js.Object, formatOptions: js.Object, name: String): ValueType = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], formatOptions = formatOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueType] (val x: Self) extends AnyVal {
      
      inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: js.Object): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
