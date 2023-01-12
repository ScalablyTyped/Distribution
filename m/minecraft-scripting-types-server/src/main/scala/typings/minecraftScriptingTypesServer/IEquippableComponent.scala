package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Accepteditems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines how many and what items the entity can be equipped with.
  */
trait IEquippableComponent extends StObject {
  
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var slots: js.Array[Accepteditems]
}
object IEquippableComponent {
  
  inline def apply(slots: js.Array[Accepteditems]): IEquippableComponent = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEquippableComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEquippableComponent] (val x: Self) extends AnyVal {
    
    inline def setSlots(value: js.Array[Accepteditems]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: Accepteditems*): Self = StObject.set(x, "slots", js.Array(value*))
  }
}
