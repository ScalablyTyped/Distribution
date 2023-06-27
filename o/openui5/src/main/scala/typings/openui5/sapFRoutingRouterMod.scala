package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFRoutingRouterMod {
  
  @JSImport("sap/f/routing/Router", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.f.routing.Router`.
    */
  open class default () extends Router {
    def this(/**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Array[js.Object]) = this()
    def this(/**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Object) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Array[js.Object],
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Object,
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: Unit,
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Array[js.Object],
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.f.routing.Targets#constructor} documentation (the options object).
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Array[js.Object],
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.f.routing.Targets#constructor} documentation (the options object).
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Object,
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.f.routing.Targets#constructor} documentation (the options object).
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: js.Object,
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.f.routing.Targets#constructor} documentation (the options object).
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: Unit,
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.f.routing.Targets#constructor} documentation (the options object).
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      */
    oRoutes: Unit,
      /**
      * the Component of all the views that will be created by this Router, will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      * If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.f.routing.Targets#constructor} documentation (the options object).
      */
    oTargetsConfig: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/routing/Router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.routing.Router with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.routing.Router.extend}.
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
    oClassInfo: ClassInfo[T, Router]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Router],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.routing.Router.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Router
    extends typings.openui5.sapUiCoreRoutingRouterMod.default {
    
    /**
      * Returns the `TargetHandler` instance.
      *
      * @returns The `TargetHandler` instance
      */
    def getTargetHandler(): typings.openui5.sapFRoutingTargetHandlerMod.default = js.native
  }
}
