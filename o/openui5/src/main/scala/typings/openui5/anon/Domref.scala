package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domref extends StObject {
  
  /**
    * the context for the renderer/templating
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * the fully qualified name of the control to declare (experimental!)
    */
  var control: String
  
  /**
    * the DOM element containing the source of the Template
    */
  var domref: typings.std.Element
  
  /**
    * the ID of the Template / the ID of the DOM element containing the source of the Template
    */
  var id: String
  
  /**
    * the URL to lookup the template (experimental!)
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * the type of the Template
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Domref {
  
  inline def apply(control: String, domref: typings.std.Element, id: String): Domref = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], domref = domref.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Domref] (val x: Self) extends AnyVal {
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setDomref(value: typings.std.Element): Self = StObject.set(x, "domref", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
