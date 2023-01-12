package typings.openui5.anon

import typings.openui5.sapUiCoreMvcViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * Whether the ExtensionPoint content should be loaded asynchronously
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view or fragment containing the extension point
    */
  var container: default | typings.openui5.sapUiCoreFragmentMod.default
  
  /**
    * Optional callback function creating default content, returning an array of controls. It is executed when
    * there's no customizing, if not provided, no default content will be rendered. `mOptions.createDefaultContent`
    * might also return a Promise, which resolves with an array of controls.
    */
  var createDefaultContent: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The `mOptions.name` is used to identify the extension point in the customizing
    */
  var name: String
}
object Container {
  
  inline def apply(container: default | typings.openui5.sapUiCoreFragmentMod.default, name: String): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setContainer(value: default | typings.openui5.sapUiCoreFragmentMod.default): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCreateDefaultContent(value: js.Function): Self = StObject.set(x, "createDefaultContent", value.asInstanceOf[js.Any])
    
    inline def setCreateDefaultContentUndefined: Self = StObject.set(x, "createDefaultContent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
