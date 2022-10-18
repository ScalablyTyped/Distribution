package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreIntervalTriggerMod {
  
  @JSImport("sap/ui/core/IntervalTrigger", JSImport.Default)
  @js.native
  open class default protected () extends IntervalTrigger {
    /**
      * Creates an instance of EventBus.
      */
    def this(/**
      * is the interval the trigger should be used. If the trigger is >0 triggering starts/runs and if the interval
      * is set to <=0 triggering stops.
      */
    iInterval: int) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/IntervalTrigger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.61
      *
      * Adds a listener to the list that should be triggered.
      */
    inline def addListener(
      /**
      * is the called function that should be called when the trigger want to trigger the listener.
      */
    fnFunction: js.Function
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addListener(
      /**
      * is the called function that should be called when the trigger want to trigger the listener.
      */
    fnFunction: js.Function,
      /**
      * that should be triggered.
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a new subclass of class sap.ui.core.IntervalTrigger with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, IntervalTrigger]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IntervalTrigger],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.IntervalTrigger.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * @SINCE 1.61
      *
      * Removes corresponding listener from list.
      */
    inline def removeListener(/**
      * is the previously registered function
      */
    fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(
      /**
      * is the previously registered function
      */
    fnFunction: js.Function,
      /**
      * that should be removed
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait IntervalTrigger
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Adds a listener to the list that should be triggered.
      */
    def addListener(
      /**
      * is the called function that should be called when the trigger want to trigger the listener.
      */
    fnFunction: js.Function
    ): Unit = js.native
    def addListener(
      /**
      * is the called function that should be called when the trigger want to trigger the listener.
      */
    fnFunction: js.Function,
      /**
      * that should be triggered.
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Removes corresponding listener from list.
      */
    def removeListener(/**
      * is the previously registered function
      */
    fnFunction: js.Function): Unit = js.native
    def removeListener(
      /**
      * is the previously registered function
      */
    fnFunction: js.Function,
      /**
      * that should be removed
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Sets the trigger interval. If the value is >0 triggering will start if there are any registered listeners.
      * If the interval is set to <=0 triggering will stop.
      */
    def setInterval(/**
      * sets the interval in milliseconds when a new triggering should occur.
      */
    iInterval: int): Unit = js.native
  }
}
