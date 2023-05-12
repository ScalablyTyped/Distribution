package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'google', boolean> */
trait Recordgoogleboolean extends StObject {
  
  var google: Boolean
}
object Recordgoogleboolean {
  
  inline def apply(google: Boolean): Recordgoogleboolean = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordgoogleboolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recordgoogleboolean] (val x: Self) extends AnyVal {
    
    inline def setGoogle(value: Boolean): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
