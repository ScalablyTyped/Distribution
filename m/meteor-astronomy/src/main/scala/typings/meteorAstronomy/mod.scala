package typings.meteorAstronomy

import typings.meteorAstronomy.MeteorAstronomy.ClassModel
import typings.meteorAstronomy.MeteorAstronomy.EnumModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/jagi:astronomy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  // tslint:disable-line:no-single-declare-module
  @js.native
  object Class extends js.Object {
    
    def create[T /* <: js.Object */](model: ClassModel[T]): typings.meteorAstronomy.MeteorAstronomy.Class[T] = js.native
  }
  
  @js.native
  object Enum extends js.Object {
    
    def create[T](model: EnumModel[T]): typings.meteorAstronomy.MeteorAstronomy.Enum[T] = js.native
  }
}
