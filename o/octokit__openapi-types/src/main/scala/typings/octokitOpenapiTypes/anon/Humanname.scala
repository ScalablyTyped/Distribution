package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Humanname extends StObject {
  
  var human_name: js.UndefOr[String] = js.undefined
  
  var tfvc_project: js.UndefOr[String] = js.undefined
  
  var vcs: js.UndefOr[String] = js.undefined
}
object Humanname {
  
  inline def apply(): Humanname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Humanname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Humanname] (val x: Self) extends AnyVal {
    
    inline def setHuman_name(value: String): Self = StObject.set(x, "human_name", value.asInstanceOf[js.Any])
    
    inline def setHuman_nameUndefined: Self = StObject.set(x, "human_name", js.undefined)
    
    inline def setTfvc_project(value: String): Self = StObject.set(x, "tfvc_project", value.asInstanceOf[js.Any])
    
    inline def setTfvc_projectUndefined: Self = StObject.set(x, "tfvc_project", js.undefined)
    
    inline def setVcs(value: String): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    inline def setVcsUndefined: Self = StObject.set(x, "vcs", js.undefined)
  }
}
