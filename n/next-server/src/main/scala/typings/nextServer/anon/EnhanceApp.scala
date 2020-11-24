package typings.nextServer.anon

import typings.nextServer.libUtilsMod.AppType
import typings.nextServer.libUtilsMod.Enhancer
import typings.nextServer.libUtilsMod.NextComponentType
import typings.nextServer.libUtilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhanceApp extends js.Object {
  
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
  implicit class EnhanceAppOps[Self <: EnhanceApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnhanceApp(value: AppType => AppType): Self = this.set("enhanceApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnhanceApp: Self = this.set("enhanceApp", js.undefined)
    
    @scala.inline
    def setEnhanceComponent(
      value: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object]
    ): Self = this.set("enhanceComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnhanceComponent: Self = this.set("enhanceComponent", js.undefined)
  }
}
