package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Item to be stored in the {@link pc.SceneRegistry}.
  * @property name - The name of the scene.
  * @property url - The url of the scene file.
  * @param name - The name of the scene.
  * @param url - The url of the scene file.
  */
trait SceneRegistryItem extends StObject {
  
  /**
    * The name of the scene.
    */
  var name: String
  
  /**
    * The url of the scene file.
    */
  var url: String
}
object SceneRegistryItem {
  
  @scala.inline
  def apply(name: String, url: String): SceneRegistryItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneRegistryItem]
  }
  
  @scala.inline
  implicit class SceneRegistryItemMutableBuilder[Self <: SceneRegistryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
