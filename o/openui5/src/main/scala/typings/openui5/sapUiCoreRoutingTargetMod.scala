package typings.openui5

import typings.openui5.anon.ControlName
import typings.openui5.anon.View
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
      * @since 1.46.1
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This function is called between the target view is loaded and the view is added to the container.
      *
      * This function can be used for applying modification on the view or the container to make the rerendering
      * occur together with the later aggregation change.
      */
    def _beforePlacingViewIntoContainer(/**
      * the object containing the arguments
      */
    mArguments: View): Unit = js.native
    
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
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ TargetDisplayEvent, Unit]
    ): this.type = js.native
    def attachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ TargetDisplayEvent, Unit],
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
    fnFunction: js.Function1[/* evt */ TargetDisplayEvent, Unit]
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
    fnFunction: js.Function1[/* evt */ TargetDisplayEvent, Unit],
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
    def detachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ TargetDisplayEvent, Unit]
    ): this.type = js.native
    def detachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ TargetDisplayEvent, Unit],
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
    def display(): js.Promise[ControlName] = js.native
    def display(
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    vData: js.Object
    ): js.Promise[ControlName] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:created created} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDisplay(): this.type = js.native
    def fireDisplay(/**
      * Parameters to pass along with the event
      */
    oParameters: Target$DisplayEventParameters): this.type = js.native
    
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
  
  trait Target$DisplayEventParameters extends StObject {
    
    /**
      * The options object passed to the constructor {@link sap.ui.core.routing.Target#constructor}
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The control that now contains the view in the controlAggregation
      */
    var control: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The data passed into the {@link sap.ui.core.routing.Target#display} function
      */
    var data: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Whether the target is relevant to the matched route or not
      */
    var routeRelevant: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The view that got displayed.
      */
    var view: js.UndefOr[js.Object] = js.undefined
  }
  object Target$DisplayEventParameters {
    
    inline def apply(): Target$DisplayEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target$DisplayEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Target$DisplayEventParameters] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setControl(value: js.Object): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setRouteRelevant(value: js.Object): Self = StObject.set(x, "routeRelevant", value.asInstanceOf[js.Any])
      
      inline def setRouteRelevantUndefined: Self = StObject.set(x, "routeRelevant", js.undefined)
      
      inline def setView(value: js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type TargetDisplayEvent = typings.openui5.sapUiBaseEventMod.default[Target$DisplayEventParameters]
  
  type TargetDisplayEventParameters = Target$DisplayEventParameters
  
  trait TargetSettings extends StObject {
    
    /**
      * Defines a boolean that can be passed to specify if the aggregation should be cleared - all items will
      * be removed - before adding the View to it. When using a {@link sap.ui.ux3.Shell} this should be true.
      * For a {@link sap.m.NavContainer} it should be false. When you use the {@link sap.m.routing.Router} the
      * default will be false.
      */
    var clearControlAggregation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of an aggregation of the controlId, where the created instance from the target will be added.
      * Eg: a {@link sap.m.NavContainer} has an aggregation 'pages', another Example is the {@link sap.ui.ux3.Shell }
      * it has 'content'.
      */
    var controlAggregation: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the control where you want to place the instance created by this target. You also need to set
      * "controlAggregation" property to specify to which aggregation of the control should the created instance
      * be added. An example for containers are {@link sap.ui.ux3.Shell} with the aggregation 'content' or a
      * {@link sap.m.NavContainer} with the aggregation 'pages'.
      */
    var controlId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the created instance. This is will be prefixed with the ID of the component set to the views
      * instance provided in oOptions.views. For details see {@link sap.ui.core.routing.Views#getView}.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the name of the View or Component that will be created. For type 'Component', use option 'usage'
      * instead if an owner component exists. To place the view or component into a Control, use the options
      * `controlAggregation` and `controlId`. Instance of View or Component will only be created once per `name`
      * or `usage` combined with `id`.
      * ```javascript
      *
      *
      * {
      *     targets: {
      *         // If display("masterWelcome") is called, the master view will be placed in the 'MasterPages' of a control with the id splitContainter
      *         masterWelcome: {
      *             type: "View",
      *             name: "Welcome",
      *             controlId: "splitContainer",
      *             controlAggregation: "masterPages"
      *         },
      *         // If display("detailWelcome") is called after the masterWelcome, the view will be removed from the master pages and added to the detail pages, since the same instance is used. Also the controls inside of the view will have the same state.
      *         detailWelcome: {
      *             // same view here, that's why the same instance is used
      *             type: "View",
      *             name: "Welcome",
      *             controlId: "splitContainer",
      *             controlAggregation: "detailPages"
      *         }
      *     }
      * }
      *
      * ```
      *
      *
      * If you want to have a second instance of the 'welcome' view you can set different 'id' to the targets:
      *
      *
      * ```javascript
      *
      *
      * {
      *     targets: {
      *         // If display("masterWelcome") is called, the view with name "Welcome" will be placed in the 'MasterPages' of a control with the ID splitContainter
      *         masterWelcome: {
      *             type: "View",
      *             name: "Welcome",
      *             id: "masterWelcome",
      *             controlId: "splitContainer",
      *             controlAggregation: "masterPages"
      *         },
      *         // If display("detailWelcome") is called after the "masterWelcome" target, a second instance of the same view with its own controller instance will be added in the detail pages.
      *         detailWelcome: {
      *             type: "View",
      *             name: "Welcome",
      *             // another instance will be created because a different ID is used
      *             id: "detailWelcome",
      *             controlId: "splitContainer",
      *             controlAggregation: "detailPages"
      *         }
      *     }
      * }
      *
      * ```
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A reference to another target, using the name of the target. If you display a target that has a parent,
      * the parent will also be displayed. Also the control you specify with the controlId parameter, will be
      * searched inside of the created instance of the parent not in the rootView, provided in the config. The
      * control will be searched using the byId function of a view. When it is not found, the global ID is checked.
      *
      *  The main use case for the parent property is placing a view or component inside a smaller container
      * of an instance, which is also created by targets. This is useful for lazy loading views or components,
      * only if the user really navigates to this part of your application.
      *  **Example:** Our aim is to lazy load a tab of an IconTabBar (a control that displays a view initially
      * and when a user clicks on it the view changes). It's a perfect candidate to lazy load something inside
      * of it.
      *  **Example app structure:**
      *  We have a rootView that is returned by the createContent function of our UIComponent. This view contains
      * an sap.m.App control with the ID 'myApp'
      * ```javascript
      *
      *
      * <View xmlns="sap.m">
      *     <App id="myApp"/>
      * </View>
      *
      * ```
      *  an xml view called 'Detail'
      * ```javascript
      *
      *
      * <View xmlns="sap.m">
      *     <IconTabBar>
      *         <items>
      *             <IconTabFilter>
      *                 <!-- content of our first tab -->
      *             <IconTabFilter>
      *             <IconTabFilter id="mySecondTab">
      *                 <!-- nothing here, since we will lazy load this one with a target -->
      *             <IconTabFilter>
      *         </items>
      *     </IconTabBar>
      * </View>
      *
      * ```
      *  and a view called 'SecondTabContent', this one contains our content we want to have lazy loaded. Now
      * we need to define the routing config within "sap.ui5/routing" section in manifest.json of a Component:
      *
      * ```javascript
      *
      *
      *     {
      *         "config": {
      *             // all of our views have that type
      *             "viewType": "XML",
      *             // a reference to the app control in the rootView created by our UIComponent
      *             "controlId": "myApp",
      *             // An app has a pages aggregation where the views need to be put into
      *             "controlAggregation": "pages"
      *         },
      *         "targets": {
      *             "detail": {
      *                 "type": "View",
      *                 "name": "Detail"
      *             },
      *             "secondTabContent": {
      *                 // A reference to the detail target defined above
      *                 "parent": "detail",
      *                 // A reference to the second Tab container in the Detail view. Here the target does not look in the rootView, it looks in the Parent view (Detail).
      *                 "controlId": "mySecondTab",
      *                 // An IconTabFilter has an aggregation called content so we need to overwrite the pages set in the config as default.
      *                 "controlAggregation": "content",
      *                 // A view containing the content
      *                 "type": "View",
      *                 "name": "SecondTabContent"
      *             }
      *         }
      *     }
      *
      * ```
      *
      *
      * Now if the target with name "secondTabContent" is displayed, 2 views will be created: Detail and SecondTabContent.
      * The 'Detail' view will be put into the pages aggregation of the App. And afterwards the 'SecondTabContent'
      * view will be put into the content Aggregation of the second IconTabFilter. So a parent will always be
      * created before the target referencing it.
      */
    var parent: js.UndefOr[String] = js.undefined
    
    /**
      * A prefix that will be prepended in front of the `name`.
      *  **Example:** `name` is set to "myView" and `path` is set to "myApp" - the created view's name will be
      * "myApp.myView".
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the parent of the controlId - This should be the ID of the view that contains your controlId,
      * since the target control will be retrieved by calling the {@link sap.ui.core.mvc.View#byId} function
      * of the targetParent. By default, this will be the view created by a component, so you do not have to
      * provide this parameter. If you are using children, the view created by the parent of the child is taken.
      * You only need to specify this, if you are not using a Targets instance created by a component and you
      * should give the ID of root view of your application to this property.
      */
    var targetParent: js.UndefOr[String] = js.undefined
    
    /**
      * Defines whether the target creates an instance of 'View' or 'Component'.
      */
    var `type`: String
    
    /**
      * Defines the 'usage' name for 'Component' target which refers to the '/sap.ui5/componentUsages' entry
      * in the owner component's manifest.
      */
    var usage: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the view that is going to be created. These are the supported types: {@link sap.ui.core.mvc.ViewType}.
      * You always have to provide a viewType except it's defined in the shared `config` or when using {@link sap.ui.core.routing.Views#setView}.
      */
    var viewType: js.UndefOr[String] = js.undefined
  }
  object TargetSettings {
    
    inline def apply(`type`: String): TargetSettings = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetSettings] (val x: Self) extends AnyVal {
      
      inline def setClearControlAggregation(value: Boolean): Self = StObject.set(x, "clearControlAggregation", value.asInstanceOf[js.Any])
      
      inline def setClearControlAggregationUndefined: Self = StObject.set(x, "clearControlAggregation", js.undefined)
      
      inline def setControlAggregation(value: String): Self = StObject.set(x, "controlAggregation", value.asInstanceOf[js.Any])
      
      inline def setControlAggregationUndefined: Self = StObject.set(x, "controlAggregation", js.undefined)
      
      inline def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
      
      inline def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTargetParent(value: String): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
      
      inline def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
}
