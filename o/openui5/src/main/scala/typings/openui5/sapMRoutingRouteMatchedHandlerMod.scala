package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMRoutingRouteMatchedHandlerMod {
  
  @JSImport("sap/m/routing/RouteMatchedHandler", JSImport.Default)
  @js.native
  open class default protected () extends RouteMatchedHandler {
    /**
      * Instantiates a RouteMatchedHandler.
      * See:
      * 	sap.m.NavContainer
      */
    def this(/**
      * A router that creates views
      */
    router: typings.openui5.sapUiCoreRoutingRouterMod.default) = this()
    def this(
      /**
      * A router that creates views
      */
    router: typings.openui5.sapUiCoreRoutingRouterMod.default,
      /**
      * If set to `true` it will close all open dialogs before navigating. If set to `false` it will just navigate
      * without closing dialogs.
      */
    closeDialogs: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/routing/RouteMatchedHandler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.routing.RouteMatchedHandler with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, RouteMatchedHandler]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RouteMatchedHandler],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.routing.RouteMatchedHandler.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait RouteMatchedHandler
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Gets if a navigation should close dialogs
      *
      * @returns a flag indication if dialogs will be closed
      */
    def getCloseDialogs(): Boolean = js.native
    
    /**
      * Sets if a navigation should close dialogs
      *
      * @returns for chaining
      */
    def setCloseDialogs(/**
      * close dialogs if true
      */
    bCloseDialogs: Boolean): this.type = js.native
  }
}
