package typings.pathval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pathval", "getPathInfo")
  @js.native
  def getPathInfo(obj: js.Object, path: String): PathInfo = js.native
  
  @JSImport("pathval", "getPathValue")
  @js.native
  def getPathValue(obj: js.Object, path: String): js.UndefOr[js.Object] = js.native
  
  @JSImport("pathval", "hasProperty")
  @js.native
  def hasProperty(obj: js.UndefOr[scala.Nothing], name: Property): Boolean = js.native
  @JSImport("pathval", "hasProperty")
  @js.native
  def hasProperty(obj: js.Object, name: Property): Boolean = js.native
  @JSImport("pathval", "hasProperty")
  @js.native
  def hasProperty(obj: Null, name: Property): Boolean = js.native
  
  @JSImport("pathval", "setPathValue")
  @js.native
  def setPathValue(obj: js.Object, path: String, `val`: js.Any): js.Object = js.native
  
  @js.native
  trait PathInfo extends StObject {
    
    var exists: Boolean = js.native
    
    var name: String = js.native
    
    var parent: js.Object = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object PathInfo {
    
    @scala.inline
    def apply(exists: Boolean, name: String, parent: js.Object): PathInfo = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathInfo]
    }
    
    @scala.inline
    implicit class PathInfoMutableBuilder[Self <: PathInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Property = String | js.Symbol | Double
}
