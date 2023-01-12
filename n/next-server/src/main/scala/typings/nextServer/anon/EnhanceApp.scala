package typings.nextServer.anon

import typings.nextServer.distLibUtilsMod.AppType
import typings.nextServer.distLibUtilsMod.Enhancer
import typings.nextServer.distLibUtilsMod.NextComponentType
import typings.nextServer.distLibUtilsMod.NextPageContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhanceApp extends StObject {
  
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.undefined
  
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.undefined
}
object EnhanceApp {
  
  inline def apply(): EnhanceApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhanceApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnhanceApp] (val x: Self) extends AnyVal {
    
    inline def setEnhanceApp(value: AppType => AppType): Self = StObject.set(x, "enhanceApp", js.Any.fromFunction1(value))
    
    inline def setEnhanceAppUndefined: Self = StObject.set(x, "enhanceApp", js.undefined)
    
    inline def setEnhanceComponent(
      value: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object]
    ): Self = StObject.set(x, "enhanceComponent", js.Any.fromFunction1(value))
    
    inline def setEnhanceComponentUndefined: Self = StObject.set(x, "enhanceComponent", js.undefined)
  }
}
