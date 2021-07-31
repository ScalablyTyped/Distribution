package typings.pathval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pathval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPathInfo(obj: js.Object, path: String): PathInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathInfo")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[PathInfo]
  
  @scala.inline
  def getPathValue(obj: js.Object, path: String): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
  
  @scala.inline
  def hasProperty(obj: js.Object, name: Property): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasProperty(obj: Null, name: Property): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasProperty(obj: Unit, name: Property): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def setPathValue(obj: js.Object, path: String, `val`: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setPathValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait PathInfo extends StObject {
    
    var exists: Boolean
    
    var name: String
    
    var parent: js.Object
    
    var value: js.UndefOr[js.Any] = js.undefined
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
