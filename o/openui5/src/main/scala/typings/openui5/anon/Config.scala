package typings.openui5.anon

import typings.openui5.sapUiCoreRoutingViewsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /**
    * this config allows all the values oOptions.targets.anyName allows, these will be the default values for
    * properties used in the target.
    *  For example if you are only using xmlViews in your app you can specify viewType="XML" so you don't have
    * to repeat this in every target.
    *  If a target specifies viewType="JS", the JS will be stronger than the XML here is an example.
    *
    *
    * ```javascript
    *
    *
    * {
    *     config: {
    *         viewType : "XML"
    *     }
    *     targets : {
    *         xmlTarget : {
    *             ...
    *         },
    *         jsTarget : {
    *             viewType : "JS"
    *             ...
    *         }
    *     }
    * }
    *
    * ```
    *  Then the effective config that will be used looks like this:
    * ```javascript
    *
    *
    * {
    *     xmlTarget : {
    *         // coming from the defaults
    *         viewType : "XML"
    *         ...
    *     },
    *     jsTarget : {
    *        // XML is overwritten by the "JS" of the targets property
    *        viewType : "JS"
    *       ...
    *     }
    * }
    *
    * ```
    */
  var config: js.UndefOr[Async] = js.undefined
  
  /**
    * One or multiple targets in a map.
    */
  var targets: AnyName
  
  /**
    * the views instance will create the views of all the targets defined, so if 2 targets have the same name,
    * the same instance of the view will be displayed.
    */
  var views: default
}
object Config {
  
  inline def apply(targets: AnyName, views: default): Config = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: Async): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setTargets(value: AnyName): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setViews(value: default): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
