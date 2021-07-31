package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scope description.
  */
trait Scope extends StObject {
  
  /**
    * Location in the source code where scope ends
    */
  var endLocation: js.UndefOr[Location] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual object; for the rest of the scopes, it is artificial transient object enumerating scope variables as its properties.
    */
  var `object`: RemoteObject
  
  /**
    * Location in the source code where scope starts
    */
  var startLocation: js.UndefOr[Location] = js.undefined
  
  /**
    * Scope type.
    */
  var `type`: String
}
object Scope {
  
  @scala.inline
  def apply(`object`: RemoteObject, `type`: String): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLocationUndefined: Self = StObject.set(x, "endLocation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
