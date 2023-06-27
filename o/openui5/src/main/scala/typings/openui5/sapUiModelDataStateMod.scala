package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelDataStateMod {
  
  @JSImport("sap/ui/model/DataState", JSImport.Default)
  @js.native
  open class default () extends DataState
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/DataState", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.DataState with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DataState]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DataState],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.DataState.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DataState
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns whether the data state is changed, or resets the data state in case the parameter `bNewState`
      * is false; reset data state means that the data state properties are replaced with the changed properties.
      * As long as there was no call to this method with `bNewState` set to false, the data state is dirty, and
      * the corresponding binding will fire data state change events.
      *
      * @returns Whether the data state was changed
      */
    def changed(): Boolean = js.native
    def changed(/**
      * Whether the data state is to be reset
      */
    bNewState: Boolean): Boolean = js.native
    
    /**
      * @since 1.98.0
      *
      * Returns an array of all model and control messages, regardless of whether they are old or new.
      *
      * @returns The array of all messages
      */
    def getAllMessages(): js.Array[typings.openui5.sapUiCoreMessageMod.default] = js.native
    
    /**
      * Returns the changes of the data state in a map that the control can use in the `refreshDataState` method.
      * The changed property's name is the key in the map. Each element in the map contains an object with the
      * properties `oldValue` with the old property value and `value` with the new value of the property. The
      * map only contains the changed properties.
      *
      * @returns The changed properties of the data state
      */
    def getChanges(): js.Object = js.native
    
    /**
      * Returns the array of this data state's current control messages.
      *
      * @returns The array of control messages
      */
    def getControlMessages(): js.Array[typings.openui5.sapUiCoreMessageMod.default] = js.native
    
    /**
      * Returns the dirty value of a binding that was rejected by a type validation so that it could not be applied
      * to the model. If the value was not rejected it returns `undefined`. In this case the current model value
      * can be accessed using the {@link #getValue} method.
      *
      * @returns The value that was rejected or `undefined`
      */
    def getInvalidValue(): js.UndefOr[Any] = js.native
    
    /**
      * Returns the array of this data state's current messages combining the model and control messages. The
      * array is sorted descendingly by message severity.
      *
      * @returns The sorted array of all messages
      */
    def getMessages(): js.Array[typings.openui5.sapUiCoreMessageMod.default] = js.native
    
    /**
      * Returns the array of this data state's current model messages.
      *
      * @returns The array of messages of the model
      */
    def getModelMessages(): js.Array[typings.openui5.sapUiCoreMessageMod.default] = js.native
    
    /**
      * Returns the formatted original value of the data. The original value is the last confirmed value.
      *
      * @returns The original confirmed value of the server
      */
    def getOriginalValue(): Any = js.native
    
    /**
      * Returns the formatted value of the data state.
      *
      * @returns The value of the data.
      */
    def getValue(): Any = js.native
    
    /**
      * Returns whether the data state is dirty in the UI control. A data state is dirty in the UI control if
      * the entered value did not yet pass the type validation.
      *
      * @returns Whether the data state is dirty
      */
    def isControlDirty(): Boolean = js.native
    
    /**
      * Returns whether the data state is dirty. A data state is dirty if the value was changed but is not yet
      * confirmed by a server or the entered value did not yet pass the type validation.
      *
      * @returns Whether the data state is dirty
      */
    def isDirty(): Boolean = js.native
    
    /**
      * Returns whether the data state is in laundering. If data is sent to the server, the data state becomes
      * laundering until the data was accepted or rejected.
      *
      * @returns Whether the data state is laundering
      */
    def isLaundering(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets an array of control state messages.
      *
      * @returns `this` to allow method chaining
      */
    def setControlMessages(/**
      * The control messages
      */
    aMessages: js.Array[typings.openui5.sapUiCoreMessageMod.default]): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the dirty value that was rejected by the type validation.
      *
      * @returns `this` to allow method chaining
      */
    def setInvalidValue(
      /**
      * The value that was rejected by the type validation or `undefined` if the value was valid
      */
    vInvalidValue: Any
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the laundering state of the data state.
      *
      * @returns `this` to allow method chaining
      */
    def setLaundering(/**
      * Whether the state is laundering
      */
    bLaundering: Boolean): this.type = js.native
    
    /**
      * Sets an array of model state messages.
      *
      * @returns `this` to allow method chaining
      */
    def setModelMessages(): this.type = js.native
    def setModelMessages(
      /**
      * The model messages for this data state.
      */
    aMessages: js.Array[typings.openui5.sapUiCoreMessageMod.default]
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the formatted original value of the data.
      *
      * @returns `this` to allow method chaining
      */
    def setOriginalValue(/**
      * The original value
      */
    vOriginalValue: Boolean): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the formatted value of the data state,
      *
      * @returns `this` to allow method chaining
      */
    def setValue(/**
      * the value
      */
    vValue: Any): this.type = js.native
  }
}
