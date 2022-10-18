package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/shared/lib/utils.AppInitialProps<any> & {[name: string] : any} */
trait AppInitialPropsanynamestr
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var pageProps: Any
}
object AppInitialPropsanynamestr {
  
  inline def apply(pageProps: Any): AppInitialPropsanynamestr = {
    val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInitialPropsanynamestr]
  }
  
  extension [Self <: AppInitialPropsanynamestr](x: Self) {
    
    inline def setPageProps(value: Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
  }
}
