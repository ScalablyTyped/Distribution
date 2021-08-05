package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {[name: string] : any} */
trait AppInitialPropsnamestring
  extends StObject
     with /* k */ StringDictionary[js.Any] {
  
  var pageProps: js.Any
}
object AppInitialPropsnamestring {
  
  inline def apply(pageProps: js.Any): AppInitialPropsnamestring = {
    val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInitialPropsnamestring]
  }
  
  extension [Self <: AppInitialPropsnamestring](x: Self) {
    
    inline def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
  }
}
