package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `616` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Bloburl]
}
object `616` {
  
  inline def apply(applicationSlashjson: js.Array[Bloburl]): `616` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`616`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `616`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Bloburl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Bloburl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
