package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/server/base-server.default<next.next/dist/server/base-server.Options>['renderOpts'], 'buildId'> */
trait PickdefaultOptionsrenderO extends StObject {
  
  var buildId: js.UndefOr[Any] = js.undefined
}
object PickdefaultOptionsrenderO {
  
  inline def apply(): PickdefaultOptionsrenderO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickdefaultOptionsrenderO]
  }
  
  extension [Self <: PickdefaultOptionsrenderO](x: Self) {
    
    inline def setBuildId(value: Any): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
  }
}
