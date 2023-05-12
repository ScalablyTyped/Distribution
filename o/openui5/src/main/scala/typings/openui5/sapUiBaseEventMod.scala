package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseObjectPoolMod.Poolable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseEventMod {
  
  @JSImport("sap/ui/base/Event", JSImport.Default)
  @js.native
  open class default protected () extends Event {
    /**
      * Creates an event with the given `sId`, linked to the provided `oSource` and enriched with the `mParameters`.
      */
    def this(
      /**
      * The ID of the event
      */
    sId: String,
      /**
      * Source of the event
      */
    oSource: typings.openui5.sapUiBaseEventProviderMod.default,
      /**
      * Parameters for this event
      */
    oParameters: js.Object
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_base_Poolable: Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Called by the `ObjectPool` when this instance will be activated for a caller.
      *
      * The same method will be called after a new instance has been created by an otherwise exhausted pool.
      *
      * If the caller provided any arguments to {@link sap.ui.base.ObjectPool#borrowObject}, all arguments will
      * be propagated to this method.
      */
    /* CompleteClass */
    override def init(
      /**
      * the arguments which were given to {@link sap.ui.base.ObjectPool#borrowObject}
      */
    args: Any*
    ): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Called by the object pool when an instance is returned to the pool.
      *
      * While no specific implementation is required, poolable objects in general should clean all caller specific
      * state (set to null) in this method to avoid memory leaks and to enforce garbage collection of the caller
      * state.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/Event", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.base.Event with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Event]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Event],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.base.Event.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Event
    extends typings.openui5.sapUiBaseObjectMod.default
       with Poolable {
    
    /**
      * Cancel bubbling of the event.
      *
      * **Note:** This function only has an effect if the bubbling of the event is supported by the event source.
      */
    def cancelBubble(): Unit = js.native
    
    /**
      * Returns the id of the event.
      *
      * @returns The ID of the event
      */
    def getId(): String = js.native
    
    /**
      * Returns the value of the parameter with the given name.
      *
      * @returns Value of the named parameter
      */
    def getParameter(/**
      * Name of the parameter to return
      */
    sName: String): Any = js.native
    
    /**
      * Returns an object with all parameter values of the event.
      *
      * @returns All parameters of the event
      */
    def getParameters(): Record[String, Any] = js.native
    
    /**
      * Returns the event provider on which the event was fired.
      *
      * @returns The source of the event
      */
    def getSource(): typings.openui5.sapUiBaseEventProviderMod.default = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Init this event with its data.
      *
      * The `init` method is called by an object pool when the object is (re-)activated for a new caller.
      *
      * When no `oParameters` are given, an empty object is used instead.
      * See:
      * 	sap.ui.base.Poolable.prototype#init
      */
    def init(
      /**
      * ID of the event
      */
    sId: String,
      /**
      * Source of the event
      */
    oSource: typings.openui5.sapUiBaseEventProviderMod.default
    ): Unit = js.native
    def init(
      /**
      * ID of the event
      */
    sId: String,
      /**
      * Source of the event
      */
    oSource: typings.openui5.sapUiBaseEventProviderMod.default,
      /**
      * The event parameters
      */
    oParameters: js.Object
    ): Unit = js.native
    
    /**
      * Prevent the default action of this event.
      *
      * **Note:** This function only has an effect if preventing the default action of the event is supported
      * by the event source.
      */
    def preventDefault(): Unit = js.native
  }
}
