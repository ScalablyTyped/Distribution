package typings.next.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  router :std.Pick<next.next/dist/shared/lib/router/router.NextRouter, 'pathname' | 'asPath' | 'isReady' | 'isFallback'>,   isAutoExport :boolean}> */
trait PropsWithChildrenrouterPi extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var isAutoExport: Boolean
  
  var router: PickNextRouterpathnameasP
}
object PropsWithChildrenrouterPi {
  
  inline def apply(isAutoExport: Boolean, router: PickNextRouterpathnameasP): PropsWithChildrenrouterPi = {
    val __obj = js.Dynamic.literal(isAutoExport = isAutoExport.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrenrouterPi]
  }
  
  extension [Self <: PropsWithChildrenrouterPi](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIsAutoExport(value: Boolean): Self = StObject.set(x, "isAutoExport", value.asInstanceOf[js.Any])
    
    inline def setRouter(value: PickNextRouterpathnameasP): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
