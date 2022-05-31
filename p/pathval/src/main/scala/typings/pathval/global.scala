package typings.pathval

import typings.pathval.mod.PathInfo
import typings.pathval.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pathval {
    
    @JSGlobal("pathval")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathInfo(obj: js.Object, path: String): PathInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathInfo")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[PathInfo]
    
    inline def getPathValue(obj: js.Object, path: String): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
    
    inline def hasProperty(obj: js.Object, name: Property): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasProperty(obj: Null, name: Property): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasProperty(obj: Unit, name: Property): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setPathValue(obj: js.Object, path: String, `val`: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setPathValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  }
}
