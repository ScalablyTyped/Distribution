package typings.openui5

import typings.openui5.anon.ContainerData
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingTargetMod {
  
  @JSImport("sap/ui/core/routing/Target", JSImport.Default)
  @js.native
  open class default protected () extends Target {
    /**
      * **Don't call this constructor directly**, use {@link sap.ui.core.routing.Targets} instead, it will create
      * instances of a Target.
      *  If you are using the mobile library, please use the {@link sap.m.routing.Targets} constructor, please
      * read the documentation there.
      */
    def this(
      /**
      * all of the parameters defined in {@link sap.m.routing.Targets#constructor} are accepted here, except
      * for children you need to specify the parent.
      */
    oOptions: js.Object,
      /**
      * All views required by this target will get created by the views instance using {@link sap.ui.core.routing.Views#getView}
      */
    oCache: /* was: sap.ui.core.routing.TargetCache */ Any
    ) = this()
    def this(
      /**
      * all of the parameters defined in {@link sap.m.routing.Targets#constructor} are accepted here, except
      * for children you need to specify the parent.
      */
    oOptions: js.Object,
      /**
      * All views required by this target will get created by the views instance using {@link sap.ui.core.routing.Views#getView}
      */
    oCache: /* was: sap.ui.core.routing.TargetCache */ Any,
      /**
      * the parent of this target. Will also get displayed, if you display this target. In the config you have
      * the fill the children property {@link sap.m.routing.Targets#constructor}
      */
    oParent: Target
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/Target", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.routing.Target with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, Target]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Target],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.routing.Target.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Target
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * @SINCE 1.46.1
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This function is called between the target view is loaded and the view is added to the container.
      *
      * This function can be used for applying modification on the view or the container to make the rerendering
      * occur together with the later aggregation change.
      */
    def _beforePlacingViewIntoContainer(/**
      * the object containing the arguments
      */
    mArguments: ContainerData): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:display display} event of this `sap.ui.core.routing.Target`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Target` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplay(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Target` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:display display} event of this `sap.ui.core.routing.Target`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Target` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplay(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachDisplay(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Target` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:display display} event of this `sap.ui.core.routing.Target`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDisplay(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Creates a view and puts it in an aggregation of a control that has been defined in the {@link sap.ui.core.routing.Target#constructor}.
      *
      * @returns resolves with {name: *, view: *, control: *} if the target can be successfully displayed otherwise
      * it resolves with {name: *, error: *}
      */
    def display(): js.Promise[Any] = js.native
    def display(
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    vData: Any
    ): js.Promise[Any] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:created created} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDisplay(): this.type = js.native
    def fireDisplay(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Suspends the object which is loaded by the target.
      *
      * Currently this function stops the router of the component when the object which is loaded by this target
      * is an instance of UIComponent. This is done only when the target is already loaded. When the target is
      * not loaded yet or still being loaded, the router of the component isn't stopped.
      *
      * @returns The 'this' to chain the call
      */
    def suspend(): Target = js.native
  }
}
