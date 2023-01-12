package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlAggregation extends StObject {
  
  /**
    * Defines a boolean that can be passed to specify if the aggregation should be cleared - all items will
    * be removed - before adding the View to it. When using a {@link sap.ui.ux3.Shell} this should be true.
    * For a {@link sap.m.NavContainer} it should be false. When you use the {@link sap.m.routing.Router} the
    * default will be false.
    */
  var clearControlAggregation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of an aggregation of the controlId, where the created instance from the target will be added.
    * Eg: a {@link sap.m.NavContainer} has an aggregation 'pages', another Example is the {@link sap.ui.ux3.Shell}
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
    * The ID of the created instance. This is will be prefixed with the id of the component set to the views
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
    *         // If display("masterWelcome") is called, the view with name "Welcome" will be placed in the 'MasterPages' of a control with the id splitContainter
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
    *             // another instance will be created because a different id is used
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
    * control will be searched using the byId function of a view. When it is not found, the global id is checked.
    *
    *  The main usecase for the parent property is placing a view or component inside a smaller container of
    * an instance, which is also created by targets. This is useful for lazy loading views or components, only
    * if the user really navigates to this part of your application.
    *  **Example:** Our aim is to lazy load a tab of an IconTabBar (a control that displays a view initially
    * and when a user clicks on it the view changes). It's a perfect candidate to lazy load something inside
    * of it.
    *  **Example app structure:**
    *  We have a rootView that is returned by the createContent function of our UIComponent. This view contains
    * an sap.m.App control with the id 'myApp'
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
    * we need to create our Targets instance with a config matching our app:
    * ```javascript
    *
    *
    *     new Targets({
    *         //Creates our views except for root, we created this one before - when using a component you
    *         views: new Views(),
    *         config: {
    *             // all of our views have that type
    *             viewType: 'XML',
    *             // a reference to the app control in the rootView created by our UIComponent
    *             controlId: 'myApp',
    *             // An app has a pages aggregation where the views need to be put into
    *             controlAggregation: 'pages'
    *         },
    *         targets: {
    *             detail: {
    *                 type: "View",
    *                 name: 'Detail'
    *             },
    *             secondTabContent: {
    *                 // A reference to the detail target defined above
    *                 parent: 'detail',
    *                 // A reference to the second Tab container in the Detail view. Here the target does not look in the rootView, it looks in the Parent view (Detail).
    *                 controlId: 'mySecondTab',
    *                 // An IconTabFilter has an aggregation called content so we need to overwrite the pages set in the config as default.
    *                 controlAggregation: 'content',
    *                 // A view containing the content
    *                 type: "View",
    *                 name: 'SecondTabContent'
    *             }
    *         }
    *     });
    *
    * ```
    *
    *
    * Now if we call ` oTargets.display("secondTabContent") `, 2 views will be created: Detail and SecondTabContent.
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
    * The id of the parent of the controlId - This should be the id of the view that contains your controlId,
    * since the target control will be retrieved by calling the {@link sap.ui.core.mvc.View#byId} function
    * of the targetParent. By default, this will be the view created by a component, so you do not have to
    * provide this parameter. If you are using children, the view created by the parent of the child is taken.
    * You only need to specify this, if you are not using a Targets instance created by a component and you
    * should give the id of root view of your application to this property.
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
    * You always have to provide a viewType except if `oOptions.config.viewType` is set or when using {@link
    * sap.ui.core.routing.Views#setView}.
    */
  var viewType: js.UndefOr[String] = js.undefined
}
object ControlAggregation {
  
  inline def apply(`type`: String): ControlAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlAggregation] (val x: Self) extends AnyVal {
    
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
