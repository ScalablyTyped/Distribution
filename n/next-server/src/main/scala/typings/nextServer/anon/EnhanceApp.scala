package typings.nextServer.anon

import typings.nextServer.libUtilsMod.AppType
import typings.nextServer.libUtilsMod.Enhancer
import typings.nextServer.libUtilsMod.NextComponentType
import typings.nextServer.libUtilsMod.NextPageContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhanceApp extends StObject {
  
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.native
  
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.native
}
object EnhanceApp {
  
  @scala.inline
  def apply(): EnhanceApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhanceApp]
  }
  
  @scala.inline
  implicit class EnhanceAppMutableBuilder[Self <: EnhanceApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnhanceApp(value: AppType => AppType): Self = StObject.set(x, "enhanceApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnhanceAppUndefined: Self = StObject.set(x, "enhanceApp", js.undefined)
    
    @scala.inline
    def setEnhanceComponent(
      value: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object]
    ): Self = StObject.set(x, "enhanceComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnhanceComponentUndefined: Self = StObject.set(x, "enhanceComponent", js.undefined)
  }
}
