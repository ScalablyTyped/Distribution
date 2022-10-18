package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelBindingModeMod.BindingMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelPropertyBindingMod {
  
  @JSImport("sap/ui/model/PropertyBinding", JSImport.Default)
  @js.native
  open class default protected () extends PropertyBinding {
    /**
      * Constructor for PropertyBinding
      */
    def this(
      oModel: typings.openui5.sapUiModelModelMod.default,
      sPath: String,
      oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      oModel: typings.openui5.sapUiModelModelMod.default,
      sPath: String,
      oContext: typings.openui5.sapUiModelContextMod.default,
      mParameters: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/PropertyBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.PropertyBinding with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Binding.extend}.
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
    oClassInfo: ClassInfo[T, PropertyBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PropertyBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.PropertyBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait PropertyBinding
    extends typings.openui5.sapUiModelBindingMod.default {
    
    /**
      * Returns the binding mode.
      *
      * @returns The binding mode
      */
    def getBindingMode(): BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String) = js.native
    
    /**
      * Returns the current external value of the bound target which is formatted via a type or formatter function.
      *
      * @returns the current value of the bound target
      */
    def getExternalValue(): Any = js.native
    
    /**
      * Returns the formatter function.
      *
      * @returns The formatter function
      */
    def getFormatter(): js.Function = js.native
    
    /**
      * Returns the related JavaScript primitive value of the bound target which is parsed by the {@link sap.ui.model.SimpleType#getModelFormat
      * model format} of this binding's type. If this binding doesn't have a type, the original value which is
      * stored in the model is returned.
      *
      * This method will be used when targetType is set to "internal" or when it's included in a {@link sap.ui.model.CompositeBinding
      * CompositeBinding} and the CompositeBinding needs to have the related JavaScript primitive values for
      * its type or formatter.
      *
      * @returns The value which is parsed by the model format of the bound target, or the original value in
      * case of no type.
      */
    def getInternalValue(): Any = js.native
    
    /**
      * Returns the raw model value, as it exists in the model dataset.
      *
      * This method will be used when targetType of a binding is set to "raw" or when it's include in a {@link
      * sap.ui.model.CompositeBinding CompositeBinding} and the CompositeBinding needs to have the related JavaScript
      * primitive values for its type or formatter.
      *
      * @returns The value which is parsed by the model format of the bound target, or the original value in
      * case of no type.
      */
    def getRawValue(): Any = js.native
    
    /**
      * Returns the type (if any) for the binding.
      *
      * @returns The binding type
      */
    def getType(): typings.openui5.sapUiModelTypeMod.default = js.native
    
    /**
      * Returns the current value of the bound target
      *
      * @returns the current value of the bound target
      */
    def getValue(): Any = js.native
    
    def setBindingMode(
      /**
      * The binding mode
      */
    sBindingMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String
    ): Unit = js.native
    /**
      * Sets the binding mode.
      */
    def setBindingMode(/**
      * The binding mode
      */
    sBindingMode: BindingMode): Unit = js.native
    
    /**
      * Sets the value for this binding. The value is parsed and validated against its type and then set to the
      * binding. A model implementation should check if the current default binding mode permits setting the
      * binding value, and if so, set the new value in the model, too.
      *
      * @returns A promise in case of asynchronous type parsing or validation
      */
    def setExternalValue(/**
      * The value to set for this binding
      */
    vValue: Any): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the optional formatter function for the binding.
      */
    def setFormatter(/**
      * The formatter function for the binding
      */
    fnFormatter: js.Function): Unit = js.native
    
    /**
      * Sets the value for this binding with the related JavaScript primitive type. The value is formatted with
      * the {@link sap.ui.model.SimpleType#getModelFormat model format} and validated against its type and then
      * set to the model.
      *
      * @returns A promise to set the value; `undefined` if the binding has no type
      */
    def setInternalValue(/**
      * The value to set for this binding
      */
    vValue: Any): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the value for this binding with the raw model value. This setter will perform type validation, in
      * case a type is defined on the binding.
      *
      * @returns A promise to set the value; `undefined` if the binding has no type
      */
    def setRawValue(/**
      * The value to set for this binding
      */
    vValue: Any): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the optional type and internal type for the binding. The type and internal type are used to do the
      * parsing/formatting correctly. The internal type is the property type of the element which the value is
      * formatted to.
      */
    def setType(
      /**
      * The type for the binding
      */
    oType: typings.openui5.sapUiModelTypeMod.default,
      /**
      * The internal type of the element property which this binding is bound against.
      */
    sInternalType: String
    ): Unit = js.native
    
    /**
      * Sets the value for this binding. A model implementation should check if the current default binding mode
      * permits setting the binding value, and if so, set the new value in the model, too.
      */
    def setValue(/**
      * the value to set for this binding
      */
    vValue: Any): Unit = js.native
  }
}
