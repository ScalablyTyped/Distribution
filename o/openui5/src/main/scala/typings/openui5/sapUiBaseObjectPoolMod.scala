package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseObjectPoolMod {
  
  @JSImport("sap/ui/base/ObjectPool", JSImport.Default)
  @js.native
  open class default protected () extends ObjectPool {
    /**
      * Creates an `ObjectPool` for maintaining instances of the given class `oObjectClass`.
      *
      * `oObjectClass` must implement the {@link sap.ui.base.Poolable} interface.
      */
    def this(/**
      * Constructor for the class of objects that this pool should manage
      */
    oObjectClass: js.Function1[/* p1 */ js.Object, Unit]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/ObjectPool", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.base.ObjectPool with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ObjectPool]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPool],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.base.ObjectPool.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ObjectPool
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Borrows a free object from the pool. Any arguments to this method are forwarded to the init method of
      * the borrowed object.
      *
      * @returns The borrowed object of the same type that has been specified for this pool
      */
    def borrowObject(/**
      * optional initialization parameters for the borrowed object
      */
    args: Any*): js.Object = js.native
    
    /**
      * Returns an object to the pool. The object must have been borrowed from this pool beforehand. The reset
      * method is called on the object before it is added to the set of free objects.
      */
    def returnObject(/**
      * The object to return to the pool
      */
    oObject: js.Object): Unit = js.native
  }
  
  trait Poolable extends StObject {
    
    var __implements__sap_ui_base_Poolable: Boolean
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Called by the `ObjectPool` when this instance will be activated for a caller.
      *
      * The same method will be called after a new instance has been created by an otherwise exhausted pool.
      *
      * If the caller provided any arguments to {@link sap.ui.base.ObjectPool#borrowObject}, all arguments will
      * be propagated to this method.
      */
    def init(
      /**
      * the arguments which were given to {@link sap.ui.base.ObjectPool#borrowObject}
      */
    args: Any*
    ): Unit
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Called by the object pool when an instance is returned to the pool.
      *
      * While no specific implementation is required, poolable objects in general should clean all caller specific
      * state (set to null) in this method to avoid memory leaks and to enforce garbage collection of the caller
      * state.
      */
    def reset(): Unit
  }
  object Poolable {
    
    inline def apply(__implements__sap_ui_base_Poolable: Boolean, init: /* repeated */ Any => Unit, reset: () => Unit): Poolable = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_base_Poolable = __implements__sap_ui_base_Poolable.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Poolable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Poolable] (val x: Self) extends AnyVal {
      
      inline def setInit(value: /* repeated */ Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def set__implements__sap_ui_base_Poolable(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_base_Poolable", value.asInstanceOf[js.Any])
    }
  }
}
